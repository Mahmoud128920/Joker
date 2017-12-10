/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StaffManagementSystem;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import jokerRMI.StoreClerkReportFacadeRemoteInterface;
import jokerRMI.UserAuthenticationRemoteInterface;

/**
 *
 * @author Mahmoud
 */
public class SMServer {

    public static void main(String[] args) {
        try {

            //Create Remote interfaces
            UserAuthenticationRemoteInterface UserAuth
                    = new UserAuthentication();

            StoreClerkReportFacadeRemoteInterface StoreClerkReport
                    = new StoreClerkReportFacade();

            //Start Registry
            Registry Reg = LocateRegistry.createRegistry(1097);
            System.out.println("Staff Management Server Running... Port:1097");

            //Add remote interfaces to registry
            Reg.bind("UserAuth", UserAuth);
            System.out.println("User Authentication RemoteInterface added to registry");

            Reg.bind("StoreClerkReport", StoreClerkReport);
            System.out.println("StoreClerk Report RemoteInterface added to registry");
        } catch (Exception ex) {
            System.out.printf(ex.getMessage());
        }
    }

}
