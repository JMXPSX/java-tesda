
import java.sql.*;
public class delete_data {

    public static void main(String[]args)
    {
        try
        {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection con = DriverManager.getConnection("jdbc:odbc:student");
            Statement st = con.createStatement();
            int i = st.executeUpdate("delete from user where id=2");
            System.out.println("Row is deleted");
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}