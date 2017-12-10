package StockSystem;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import jokerRMI.ItemReportFacadeRemoteInterface;
import jokerRMI.ShoppingCartRemoteInterface;

public class StockServer {

    public static void main(String[] args) {
        try {

            //Create Remote interfaces
            ItemReportFacadeRemoteInterface ItemReportRI
                    = new ItemReportFacade();
            ShoppingCartRemoteInterface ShoppingCartRI = new ShoppingCart();
            //Start Registry
            Registry Reg = LocateRegistry.createRegistry(1098);
            System.out.println("Stock Server Running... Port:1098");

            //Add Remote Interfaces to Registry
            Reg.bind("ItemReportRI", ItemReportRI);
            System.out.println("ItemReport Remote Interface added to registry");

            Reg.bind("ShoppingCartRI", ShoppingCartRI);
            System.out.println("Shopping Cart Remote Interface added to registry");

        } catch (Exception ex) {
            System.out.printf(ex.getMessage());
        }
    }

}
