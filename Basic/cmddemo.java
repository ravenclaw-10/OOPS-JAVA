class cmddemo{
	public static void main(String args[]){
		//System.out.println(args[0]+args[1]);

		//int var1=Integer.parseInt(args[0]);
		//int var2=Integer.parseInt(args[1]);

		//int res=var1 + var2;
		//System.out.println("Sum"+res);

		int sum=0;

		int size=args.length;
		System.out.println("No of elements:"+size);
		for(int i=0;i<size;i++){
			System.out.println(args[i]);
			sum+=Integer.parseInt(args[i]);
		}
		System.out.println("Total="+sum);

	}
}