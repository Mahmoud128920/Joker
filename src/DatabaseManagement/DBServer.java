/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatabaseManagement;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author Mahmoud
 */
public class DBServer {

    public static void main(String[] args) {
        try {

            //Create Remote interfaces
            ClientMapperRemoteInterface CMR = new ClientMapper();
            StaffMapperRemoteInterface SMR = new StaffMapper();
            ManufacturerMapperRemoteInterface MMR = new ManufacturerMapper();
            ItemMapperRemoteInterface IMR = new ItemMapper();

            //Start Registry
            Registry Reg = LocateRegistry.createRegistry(1099);
            System.out.println("Database Server Running... Port:1099");
            
            
            //Add remote interfaces to registry
            Reg.bind("CMR", CMR);
            System.out.println("ClientMapper added to registry");

            Reg.bind("SMR", SMR);
            System.out.println("Staff Mapper added to registry");

            Reg.bind("MMR", MMR);
            System.out.println("Manufacturer Mapper added to registry");

            Reg.bind("IMR", IMR);
            System.out.println("Item Mapper added to registry");

        } catch (Exception ex) {
            System.out.printf(ex.getMessage());
        }
    }
}
