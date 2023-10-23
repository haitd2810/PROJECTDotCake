/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import model.Bill;

/**
 *
 * @author Duy Hai
 */
public class BillDAO extends MyDAO{
    List<Bill> bill = new ArrayList<>();
    public List<Bill> getBillList() throws SQLException {
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            String sql = "select * from [Bill]";
            stm = con.prepareStatement(sql);
            rs = stm.executeQuery();
            while (rs.next()) {
                String billID = rs.getString("BillID");
                int shipfee = rs.getInt("shipp_fee");
                Date shipDate = rs.getDate("ShipmentDate");
                String status = rs.getString("status");
                String orderID = rs.getString("orderID");
                Bill Bill = new Bill(billID, shipfee, shipDate, status, orderID);
                bill.add(Bill);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return bill;
    }
}
