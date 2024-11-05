package apoteker;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;


public class connect {
    public static Connection Go(){
        try {
            MysqlDataSource m = new MysqlDataSource();
            m.setServerName("localhost"); 
            m.setDatabaseName("db_apoteker_project"); 
            m.setUser("root"); 
            m.setPassword(""); 
            m.setPortNumber(3306); 
            m.setServerTimezone("Asia/Jakarta"); 
            
            Connection C = m.getConnection();
            System.out.println("Koneksi sukses");
            return C;
        } catch (SQLException e) {
            System.err.println("Koneksi Gagal!\n"+
                    e.getMessage());
        }
        
        
        return null;
        

    }
    
}
