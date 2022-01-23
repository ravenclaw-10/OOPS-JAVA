import java.util.*;
import java.sql.*;

public class Operation extends DBConnection {
    
    void insert(){
        try{
            Scanner sc2=new Scanner(System.in);
            System.out.println("Enter Student ID");
            int id=sc2.nextInt();
            
            System.out.println("Enter student name");
            String name=sc2.next();
            
            System.out.println("Enter stuent age");
            int age=sc2.nextInt();
            
            System.out.println("Enter student course");
            String course=sc2.next();
            
            String insertquery="insert into student values(?,?,?,?);";
            
            PreparedStatement pst= con.prepareStatement(insertquery);
            
            pst.setInt(1,id);
            pst.setString(2, name);
            pst.setInt(3,age);
            pst.setString(4,course);
            
            pst.executeUpdate();
            
            System.out.println("Data inserted");
        }
        catch(Exception e){
            System.out.println("Data not inserted"+e); 
        }
        
    }
    void delete(){
       try{
           //int id=3;
           //String delquery="delete from student where stdid="+id;
           
           String course="BCA";
           String delquery="delete from student where stdcourse='"+course+"'";
           
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
           String viewquery="select* from student";
           
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
            String courseChange="Mtech";
            String updateQuery="update student set stdcourse='"+courseChange+"' where stdid=3";
            
            PreparedStatement pst3=con.prepareStatement(updateQuery);
            
            pst3.executeUpdate();
            
            System.out.println("Updated Succesfully"); 
        }
        catch(Exception e){
            System.out.println("Not Updated");
        }
    }
            
    public static void main(String args[]){
      Operation obj= new Operation(); 
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
