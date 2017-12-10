/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jokerRMI;

import StaffManagementSystem.Staff;
import StaffManagementSystem.StoreClerk;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 *
 * @author Mahmoud
 */
public interface StaffMapperRemoteInterface extends Remote {

    public Staff getManager(String role) throws RemoteException;

    public boolean exists(String username, String password) throws RemoteException;

    public ArrayList<StoreClerk> getStaffMember(String branchId) throws RemoteException;

    public StoreClerk getStaffMember(int id) throws RemoteException;

    public StoreClerk getStaffMemberByUsername(String user) throws RemoteException;

    public ArrayList<StoreClerk> getStaffMember() throws RemoteException;

    public boolean insertStaffMember(Staff staff) throws RemoteException;
//  public boolean removeStaff(Staff staff)throws RemoteException;

    public boolean updateStaffDetails(Staff staff) throws RemoteException;

}
