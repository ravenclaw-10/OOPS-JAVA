//base //parent //super
class SunMicroSystem{
	void JAVA(){
		System.out.println("Java Prog..");
	}
}

class Google extends SunMicroSystem{
	void Android(){
		System.out.println("Android app dev..");
	}
}

//derived //Child //Sub
class Oracle extends Google{
	void DBMS(){
		System.out.println("sql..");
	}
	public static void main(String args[]){
	Oracle obj=new Oracle();
	obj.DBMS();
	obj.JAVA();
	obj.Android();
	}
}


//NOTE: Java does not support multiple Irheritance therefore 
//java provides a concept of an interface for implementing multiple inheritance.