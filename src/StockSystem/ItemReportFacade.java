package StockSystem;

import DatabaseManagement.ItemMapper;
import DatabaseManagement.ManufacturerMapper;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class ItemReportFacade extends UnicastRemoteObject implements ItemReportFacadeRemoteInterface {

    ItemReportFacade() throws RemoteException {

    }

    @Override
    public ArrayList<ItemReportDTO> getReportData() throws RemoteException {
        //Mappers

        ItemMapper IM = new ItemMapper();

        ManufacturerMapper MM = new ManufacturerMapper();
        //Get All the Items from DB
        ArrayList<Item> items = IM.getItem();
        //ArrayList of DTO's 
        ArrayList<ItemReportDTO> Dto = new ArrayList<>();

        ItemReportDTO dto;
        for (int i = 0; i < items.size(); i++) {
            dto = new ItemReportDTO(items.get(i).getName(),
                    items.get(i).calculateItemNetProfit(),
                    items.get(i).getPrice(), items.get(i).getManufacturerName(),
                    MM.getManufacturer(items.get(i).getManufacturerName()).getTelephone());
            Dto.add(dto);
        }
        return Dto;

    }

}
