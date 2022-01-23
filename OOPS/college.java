//Abstract Class/interface **

/*
abstract class AKTUniversity{
	void btech(){
		System.out.println("Btech by AKTU");
	}
	abstract void manager();// Declarative
	abstract void manager2();// Declarative
}
class college extends AKTUniversity{
	//overrides
	void manager()//definition	
	{
		System.out.println("AKTU Manager..");
	}
	void diploma(){
		System.out.println("Self course..");
	}
	public static void main(String args[]){
		college obj=new college();
		obj.btech();
		obj.manager();
	}	
}


 */

//Error:java: college is not abstract and does not override abstract method manager2() in AKTUniversity
