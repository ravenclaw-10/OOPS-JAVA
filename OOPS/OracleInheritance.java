//base //parent //super
class SunMicroSystem2{
	void JAVA(){
		System.out.println("Java Prog..");
	}
}

class Google1 extends SunMicroSystem2{
	void Android(){
		System.out.println("Android app dev..");
	}
}

//derived //Child //Sub
class Oracle1 extends Google1{
	void DBMS(){
		System.out.println("sql..");
	}
	public static void main(String args[]){
	Oracle1 obj=new Oracle1();
	obj.DBMS();
	obj.JAVA();
	obj.Android();
	}
}


//NOTE: Java does not support multiple Irheritance therefore 
//java provides a concept of an interface for implementing multiple inheritance.