

import java.util.HashMap;
import java.util.Map;

public class occurance_16 {

	private static boolean Integer;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Character,Integer> m=new HashMap<>();
		String s="Welcome to sunbeam";
		for(int i=0;i<s.length();i++)
		{
			if(m.containsKey(s.charAt(i)))
			{
				m.put(s.charAt(i), m.get(s.charAt(i))+1);
			}
			else {
				m.put(s.charAt(i),1);
			}
		}
		for(Map.Entry<Character,Integer> entry:m.entrySet())
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
		}	
		
	}

}
