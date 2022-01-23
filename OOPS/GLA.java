//Contructor

class GLA{
	GLA(){
		System.out.println("Welcome to GLA");
	}
	void btech(){
		System.out.println("BTECH Prog..");
	}
	void bba(){
		System.out.println("BBA Prog..");
	}
	void bca(){
		System.out.println("BCA Prog..");
	}
	public static void main(String args[]){
		GLA con=new GLA();
		con.btech();
		con.bba();
		con.bca();
		con.btech();
		con.btech();
		con.bca();
	}
}