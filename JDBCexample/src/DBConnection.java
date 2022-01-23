import java.sql.*;
public class DBConnection {
    Connection con;
    DBConnection(){
        try{
           Class.forName("com.mysql.jdbc.Driver");
           String URL="jdbc:mysql://localhost:3306/sectiongDB";
           con=DriverManager.getConnection(URL,"root","root");
            System.out.println("Connection Success");
        }
        catch(Exception e){
            System.out.println("Connection Failed "+e);
        }
    }
    public static void main(String args[]){
        DBConnection obj=new DBConnection();
    }
}
