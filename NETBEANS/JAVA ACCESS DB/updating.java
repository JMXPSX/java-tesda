
import java.sql.*;
public class updating {
     public static void main(String[]args)
    {
        try
        {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection con = DriverManager.getConnection("jdbc:odbc:student");
            Statement st = con.createStatement();


			int i = st.executeUpdate("update user set stud_name='catiafi', address = 'ttctce' ");
            System.out.println("Row is updated");
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
