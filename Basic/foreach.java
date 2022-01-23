class foreach{
	public static void main(String args[]){
		int count=0,sum=0;
		for(String var:args){
			System.out.println(var);
			count++;
			sum+=Integer.parseInt(var);

		}
		System.out.println("No of elements:"+count);
		System.out.println("Total:"+sum);
	}
}