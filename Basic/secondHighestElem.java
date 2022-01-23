import java.util.Scanner;
class arrayinput{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int len;
		System.out.println("Enter the size of array:");
		len=sc.nextInt();
		int arr[]=new int[len];		
		System.out.println("Enter array element:");
		for(int i=0; i<len; i++){
			arr[i]=sc.nextInt();
		}
		int max=arr[0];
		for(int i=0;i<arr.length; i++){
			if(arr[i]>max){
				max=arr[i];
			}
		}
		int max1=arr[0];
		for(int i=0;i<arr.length; i++){
			if(arr[i]>max1 && arr[i]<max){
				max1=arr[i];
			}
		}
		System.out.println("Second highest Number is:"+max1);
	}
}
