/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StockSystem;

import StockSystem.ItemReportDTO;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 *
 * @author Mahmoud
 */
public interface ItemReportFacadeRemoteInterface extends Remote{
    
        public ArrayList<ItemReportDTO> getReportData() throws RemoteException;
    
}
