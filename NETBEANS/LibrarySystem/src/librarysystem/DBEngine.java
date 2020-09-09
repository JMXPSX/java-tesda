/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package librarysystem;

/**
 *
 * @author Paulo
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

public class DBEngine extends LibrarySystem {
    
 public Connection dbCon() throws Exception{
    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
    String myDB = "jdbc:odbc:bookInfo";
    return DriverManager.getConnection(myDB,"","");
 }
 
 public Vector getBooks() throws Exception{
     Vector<Vector<String>> bookVector = new Vector<Vector<String>>();
     
    Connection con = dbCon();
    String SQLmain = "select * from BookInfo";
    PreparedStatement pre = con.prepareStatement(SQLmain);
    
    ResultSet rs = pre.executeQuery();
    
    while(rs.next()){
        Vector<String> books = new Vector<String>();
        books.add(rs.getString(1));
        books.add(rs.getString(2));
        books.add(rs.getString(3));
        books.add(rs.getString(4));
        books.add(rs.getString(5));
        books.add(rs.getString(6));
        books.add(rs.getString(7));
        bookVector.add(books);
    }
    con.close();
    
    return bookVector;
 }
    
}
