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
import model.Ship;

/**
 *
 * @author Duy Hai
 */
public class ShipDAO extends MyDAO{
    
    List<Ship> ship = new ArrayList<>();
    public List<Ship> getShipList() throws SQLException {
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            String sql = "select * from [Ship]";
            stm = con.prepareStatement(sql);
            rs = stm.executeQuery();
            while (rs.next()) {
                String shipID = rs.getString("shipID");
                String billID = rs.getString("billID");
                String inforShipper = rs.getString("inforShipper");
                Date shipDate = rs.getDate("shipDate");
                Ship shipInfo = new Ship(shipID, billID, inforShipper, shipDate);
                ship.add(shipInfo);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return ship;
    }
}
