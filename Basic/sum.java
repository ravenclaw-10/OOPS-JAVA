class sum{
	public static void main(String args[]){
		int o=args.length;
		int sum=0;
		int p=0;
		while(o>0){
			int n=Integer.parseInt(args[p]);
			System.out.println(args[p]);
			sum+=n;
			p+=1;
			o-=1;
		}
		System.out.println("Sum of alla elements :"+sum);
	}
}