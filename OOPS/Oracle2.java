class SunMicroSystem1{
	void JAVA(){
		System.out.println("Java Prog..");
	}
	//overridden
	final void clang(){
		System.out.println("C prog by Sun Micro System...base");
	}
}
class Oracle2 extends SunMicroSystem1{

	//overridden
	void clang(int a){
		System.out.println(" C prog by Oracle...Derived");
	}

	void DBMS(){
		System.out.println("Sql..");
	}
	public static void main(String args[]){
		Oracle2 obj=new Oracle2();
		obj.clang();
		obj.clang(15);
	}
}

//final class cannot be inherited...prog doesn't get compiled.