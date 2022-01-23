import java.util.*;
import java.sql.*;

public class mobile extends DBConnection {
    
    void insert(){
        try{
            Scanner sc2=new Scanner(System.in);
            System.out.println("Enter Serial No");
            String no=sc2.next();
            
            System.out.println("Enter Screensize");
            int size=sc2.nextInt();
            
            System.out.println("Enter the brandname");
            String name=sc2.next();
            
            System.out.println("Enter Camerapixels");
            int pixels=sc2.nextInt();

            
            String insertquery="insert into mobile values(?,?,?,?);";
            
            PreparedStatement pst= con.prepareStatement(insertquery);
            
            pst.setString(1,no);
            pst.setInt(2, size);
            pst.setString(3,name);
            pst.setInt(4,pixels);
            
            pst.executeUpdate();
            
            System.out.println("Data inserted");
        }
        catch(Exception e){
            System.out.println("Data not inserted"+e); 
        }
        
    }
    void delete(){
       try{
           String brandname="iphone";
           String delquery="delete from mobile ='"+brandname+"'";
           
           PreparedStatement pst2=con.prepareStatement(delquery);
           
           pst2.executeUpdate();
           System.out.println("Data Deleted");     
        }
        catch(Exception e){
            System.out.println("Can't Delete"+e); 
        } 
    }
    void view(){
       try{
           String viewquery="select* from mobile";
           
           Statement stmt= con.createStatement();
           ResultSet rs=stmt.executeQuery(viewquery);
           
           while(rs.next()){
               System.out.print(" "+rs.getInt(1));
               System.out.print(" "+rs.getString(2));
               System.out.print(" "+rs.getInt(3));
               System.out.print(" "+rs.getString(4));
               System.out.print("\n");
           }
           System.out.println("View func is working");
        }
        catch(Exception e){
            System.out.println("");
        } 
    }
    void update(){
        try{
            String brandnameChange="Oneplus";
            String updateQuery="update mobile set stdbrandname='"+brandnameChange+"' where stdid=3";
            
            PreparedStatement pst3=con.prepareStatement(updateQuery);
            
            pst3.executeUpdate();
            
            System.out.println("Updated Succesfully"); 
        }
        catch(Exception e){
            System.out.println("Not Updated");
        }
    }
            
    public static void main(String args[]){
      mobile obj= new mobile(); 
      while(true){
          System.out.println("\nPress 1 for insert");
          System.out.println("Press 2 for delete");
          System.out.println("Press 3 for view");
          System.out.println("Press 4 for Update");
          System.out.println("Press 5 for Exit");
          
          System.out.println("\nEnter your choice");
          Scanner sc1=new Scanner(System.in);
          int choice= sc1.nextInt();
          
          switch(choice){
              case 1:
                  obj.insert();
                  break;
              case 2:
                  obj.delete();
                  break;
              case 3:
                  obj.view();
                  break;
              case 4:
                  obj.update();
                  break;
              case 5:
                  System.exit(0);
                  break;
              default:
                  System.out.println("Wrong Choice");
          }
      }
    }
}
            