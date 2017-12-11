package StaffManagementSystem;

import DatabaseManagement.BranchMapper;
import DatabaseManagement.StaffMapper;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class StoreClerkReportFacade extends UnicastRemoteObject implements StoreClerkReportFacadeRemoteInterface {
    
    StoreClerkReportFacade() throws RemoteException
    {}

    //Retrieves the data that will be displayed in the StoreClerk Report
    @Override
    public ArrayList<StoreClerkReportDTO> getReportData() throws RemoteException{
        //Mappers
        StaffMapper SM = new StaffMapper();
        BranchMapper BM = new BranchMapper();
        //StoreClerks
        ArrayList<StoreClerk> storeClerks = SM.getStaffMember();
        //Array of Dto to be returned
        ArrayList<StoreClerkReportDTO> Dto = new ArrayList<>();

        StoreClerkReportDTO dto;
        for (int i = 0; i < storeClerks.size(); i++) {
            dto = new StoreClerkReportDTO(storeClerks.get(i).getBranchId(),
                    BM.getBranch(storeClerks.get(i).getBranchId()).getLocation(),
                    SM.getClerkProfit(storeClerks.get(i)),
                    storeClerks.get(i).getName());

            Dto.add(dto);

        }

        return Dto;
    }

}
