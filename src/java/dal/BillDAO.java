/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;
import java.util.*;
import model.*;
import java.sql.*;
public class BillDAO extends MyDAO{
    public ArrayList <Bill> getAll(){
        ArrayList <Bill> List = new ArrayList<>();
        xSql = "select * from Bill";
        try{
            ps = con.prepareStatement(xSql);
            rs = ps.executeQuery();
            String billid, shippingid, status;
            while (rs.next()){
                 billid = rs.getString("BillID");
                 shippingid = rs.getString("shippingID");
                 status = rs.getString("status");
                 List.add(new Bill(billid, shippingid, status));
            }
            rs.close();
            ps.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return List;  
}
    public static void main(String[] args) {
        BillDAO billdao = new BillDAO();
//        System.out.println(billdao.getAll());        
    }
}
