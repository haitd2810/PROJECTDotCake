package dal;

import java.sql.*;
import model.DBContext;

public class MyDAO extends DBContext {
  public Connection con = null;
  public PreparedStatement ps = null;
  public ResultSet rs = null;
  public String xSql = null;

  public MyDAO() {
     con = connection;
  }
  @Override
  public void finalize() {
     try {
        if(con != null) con.close();
     }
     catch(Exception e) {
        e.printStackTrace();
     }
  }
    
}
