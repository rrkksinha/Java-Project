
import Frames.ProductsEntry;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InsertInto {
    
    Connection conn;
    Statement st;
    ResultSet rs;
    
    public void call()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String db;
            db = "jdbc:mysql://localhost:3306/myc";
            conn = DriverManager.getConnection(db, "root", "");
            st = conn.createStatement();
            String sql;
            sql = "insert into productsentry (ProductName, ProductImage) values ('kishan', 'kumar')";
            st.executeUpdate(sql);
            System.out.println("Insert Completed");
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ProductsEntry.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void main(String[] args)
    {
        InsertInto in = new InsertInto();
        in.call();
    }
    
}
