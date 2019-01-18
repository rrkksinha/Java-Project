package Frames;

import java.awt.Component;
import java.sql.*;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class DbConnection {
    
    Connection conn;
    PreparedStatement st;
    ResultSet rs;
    public void DbConnection() throws ClassNotFoundException{
            try{
            String driver;
            driver = "com.mysql.jdbc.Driver";
            Class.forName(driver);
            String db;
            db = "jdbc:mysql://localhost:3306/myc";
            conn = DriverManager.getConnection(db, "root", "");
            String sql = "Select * from myc";
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            //table.setModel(DbUtils.resultSetToTableModel(rs));
            System.out.print("Hii");
        }catch(SQLException ex) {

            System.out.println(ex);
            Component String = null;
            JOptionPane.showMessageDialog(String, ex);

        }
    }
    
}
