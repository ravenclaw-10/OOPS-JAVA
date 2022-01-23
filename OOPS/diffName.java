class first{
	void func1(){
		System.out.println("First Class function...");
	}
}
class second extends first{
	void func2(){
		System.out.println("Second Class funciton...");
	}
}
class third extends second{
	void func3(){
		System.out.println("Third Class function...");
	}
}


class demo1 extends third{
	void func(){
		System.out.println("Sample Program...");
	}
	public static void main(String[] args){
		demo1 obj=new demo1();
		obj.func();
	}
}