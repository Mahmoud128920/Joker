package StockSystem;

import DatabaseManagement.ItemMapper;
import DatabaseManagement.ManufacturerMapper;
import java.util.ArrayList;

public class ItemReportFacade {

    private ArrayList<ItemReportDTO> getReportData() {
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
