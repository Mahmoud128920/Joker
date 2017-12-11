/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StaffManagementSystem;

import StaffManagementSystem.StoreClerkReportDTO;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 *
 * @author Mahmoud
 */
public interface StoreClerkReportFacadeRemoteInterface extends Remote{
    
        public ArrayList<StoreClerkReportDTO> getReportData() throws RemoteException;
    
}
