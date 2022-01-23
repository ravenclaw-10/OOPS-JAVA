import java.util.Scanner;
class AgeException extends Exception{
	AgeException(){
		System.out.println("Under 18 problems");
	}
}
class userexp{
	void func1(){
		try{
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter ur age");
			int age=sc.nextInt();
			if(age>=18){
				System.out.println("Vote done");
			}
			else{
				throw new AgeException();
			}
		}
		catch(AgeException ae){
			System.out.println(ae);
		}
		finally{
			System.out.println("next voter will come");
		}
	}
	public static void main(String args[]){
		userexp obj=new userexp();
		obj.func1();
	}
}