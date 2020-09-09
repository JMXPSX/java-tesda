
import java.sql.*;
public class searching {
     public static void main(String[]args)
    {
        try
        {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection con = DriverManager.getConnection("jdbc:odbc:student");
            Statement st = con.createStatement();
            ResultSet rs=st.executeQuery("select * from user where stud_name like '%fi'");
            while (rs.next())
            {
                System.out.println(rs.getString("stud_name")+" "+rs.getString("address"));
            }
         }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}