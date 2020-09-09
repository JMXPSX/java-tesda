
import java.sql.*;
public class insertData {
    public static void main(String[]args)
    {
        try
        {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection con = DriverManager.getConnection("jdbc:odbc:student");
            Statement st = con.createStatement();
            String stud_name = "catiafi";
            String address = "theman";
            int i = st.executeUpdate("insert into user (stud_name,address)values ('"+ stud_name +"','" + address +"')");
            System.out.println("Row is added");
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
