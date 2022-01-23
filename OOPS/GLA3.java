class Amity{
	Amity(){
		System.out.println("Amity..Non para...const...base");
	}
	Amity(int a){
		System.out.println("Amity..Para...const...base");
	}
}
class GLA3 extends Amity{
	GLA3(){
		System.out.println("GLA...Non para...constr...derived");
	}
	GLA3(int z){
		super(z);
		System.out.println("GLA...Para...constr...derived");
	}
	public static void main(String args[]){
		GLA3 con=new GLA3(10);
	}
}	


//super() method must me the first statement of the contructor otherwise the error will come.