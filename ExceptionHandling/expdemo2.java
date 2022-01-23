import java.util.Scanner;

class expdemo2{
	void func1(){
		try{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter value");
			String var=sc.next();

			System.out.println("String Vale:");
			System.out.println(var+5);
			
			System.out.println("\n======================\n");
			
			int z=Integer.parseInt(var);
			
			System.out.println("numeric value:");
			System.out.println(z+5);
		}
	
		catch(Exception e){
			System.out.println(e+".............catch block");
		}
		finally{
			System.out.println("no impact here..........finally block");
		}
	}
	void func2(){
		System.out.println("Seconf function is working");
	}
	public static void main(String args[]){
		expdemo2 obj=new expdemo2();
		obj.func1();
		obj.func2();
	}
}		