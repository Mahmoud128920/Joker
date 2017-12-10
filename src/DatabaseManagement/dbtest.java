/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatabaseManagement;

import StockSystem.Item;
import java.util.ArrayList;

public class dbtest {
    
    public static void main(String[] args)
    {
        //updateitem details
        //GetItem
        ItemMapper IM = new ItemMapper();
        IM.insertItem(new Item("Chair","A Chair","ChairCO",40,30,0,2));
        IM.updateItemDetails(new Item("Chair","A Chair that is really good","ChairCO",40,30,0,2));
        //IM.removeItem(new Item("Chair","A Chair","ChairCO",40,30,0,2));
       // IM.insertItem(new Item("Chair","A Chair","ChairCO",40,30,0,2));
       // ArrayList<Item> items =IM.getItem();
        
        //for(int i=0;i<items.size();i++)
        //{
         //   System.out.print(items.get(i).getDescription());
        //}
        System.out.print(IM.getItem("ChairCO").get(0).getDescription());
    
    }
    
}
