class GLA2{
	GLA2(){
		System.out.println("Non para Constr..");
	}
	GLA2(int a){
		System.out.println("Para constr..");
	}
	public static void main(String args[]){
		GLA2 con1=new GLA2(15);
		GLA2 con2=new GLA2();
	}
}