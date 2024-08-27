

public class duplicateString_13 {
public static void main(String args[])
{
	String arr[]= {"Welcome","To","SunBeam","To","study","Welcome"};
	
	for(int i=0;i<arr.length-1;i++) {
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]==arr[j])
			{
				System.out.println(arr[i]);
				break;
			}
			
		}
	}
	
	
}
	
}
