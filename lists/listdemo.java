package lists;

import java.util.*;

public class listdemo {
    void func(){

        List ls=new ArrayList();

        ls.add("Frooti");
        ls.add("Coke");
        ls.add(10);
        ls.add(7.6);
        ls.add("Dairy Milk");
        ls.add("Coke");

        System.out.println(ls);
        System.out.println("Nossss:"+ls.size());

        System.out.println("\n\n--------------------------\n\n");

        //ls.remove(4); //delete particular
        ls.clear();   //delete all

        System.out.println(ls);
        System.out.println("Nossss:"+ls.size());
    }
    public static void main(String args[]){
        listdemo obj= new listdemo();
        obj.func();
    }
}
