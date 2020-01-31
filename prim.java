//alternate prime using array in java
import java.util.*;
class prim{
 public static void main(String []args){

Scanner sc = new Scanner(System.in);
   System.out.println("enter no");
   int m=sc.nextInt();
   int arr[]=new int[m];;
int k=0;
int temp=0;
	for(int i = 2;i<=m;i++)
	{
			for(int j=2;j<=i-1; j++)
		{
			if(i%j==0)
			{
				temp=temp+1;
			}
		}		  
		if(temp==0)
		{
			
			for(;k<arr.length;){
				arr[k]=i;
				k++;
				break;
			}
			//System.out.println(k);

		}


		else
		{
			temp=0;
		}
	}
	for(int k1=0;k1<k;k1=k1+2)
		System.out.print(" "+arr[k1]);		

 }
}
