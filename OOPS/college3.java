package OOPS;

interface AKTUniversity1{
	abstract void btech();
	static void func(){
		System.out.println("Static func is working in interface");
	}
}
class college3 implements AKTUniversity1{
	public void btech(){
		System.out.println("btech prog..");
	}
	public static void main(String args[]){
		college3 obj=new college3();
		obj.btech();
		
		AKTUniversity1.func();
	}
}