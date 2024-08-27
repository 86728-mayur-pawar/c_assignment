
import java.util.Scanner;

public class conversion_ {
	public static void printresult(int arr[],int start)
	{
		 for(int j=start-1;j>=0;j--)
	     {
	    	 System.out.print(arr[j]);
	     }
	}
	public static void toOctal(int n)
	{
		 int []octalnum=new int[100];
	     int k=0;
	     while(n>0)
	     {
	    	 octalnum[k]=n%8;
	    	 n=n/8;
	    	 k++;
	     }
	     printresult(octalnum,k);
		
	}
	public static void toBinary(int n)
	{
		 int []binarynum=new int[32];
	     int i=0;
	     while(n>0)
	     {
	    	 binarynum[i]=n%2;
	    	 n=n/2;
	    	 i++;
	     }
	    printresult(binarynum, i);
	}
	public static void toHexadecimal(int n)
	{
		int hexanum[]=new int[100];
		int i=0;
		while(n>0)
		{
			hexanum[i]=n%16;
			n=n/16;
			i++;
		}
		
		for(int j=i-1;j>=0;j--)
		{
			
			if(hexanum[j]>9)
			{
				System.out.print((char)(55+hexanum[j]));
			}
			else
			{
				System.out.print(hexanum[j]);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc =new Scanner(System.in);
      System.out.println("Enter no");
      int n=sc.nextInt();
      toBinary(n);
      System.out.println();
      toHexadecimal(n);
      System.out.println();
      toOctal(n);
 
     
	
	
	}

}
