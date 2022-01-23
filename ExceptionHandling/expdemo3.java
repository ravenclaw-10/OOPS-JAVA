import java.util.Scanner;

class expdemo3{
	void func1(){
		try{
			int arr[]=new int[5];
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter array elements");
			for(int i=0;i<5;i++){
				arr[i]=sc.nextInt();	
			}
			System.out.println("\n--------Array Element---------");
			for(int i=0;i<5;i++){
				System.out.println(arr[i]);
			}			
		}
	
		catch(ArrayIndexOutOfBoundsException ae){
			System.out.println("Array Problem"+ae);
		}
		catch(ArithmeticException aaee){
			System.out.println("division problem"+aaee);
		}
	}
	void func2(){
		System.out.println("Seconf function is working");
	}
	public static void main(String args[]){
		expdemo3 obj=new expdemo3();
		obj.func1();
		obj.func2();
	}
}		