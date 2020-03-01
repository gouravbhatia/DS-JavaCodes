/*package whatever //do not write package name here */

import java.util.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner g=new Scanner(System.in);
		int n = Integer.parseInt(g.nextLine());
		String s;
		for(int k=0;k<n;k++)
		{
		    s=g.nextLine();
		    s=s.toLowerCase();
		    s=s.replaceAll("[^a-zA-Z]","");
            		int count=0;
            	int j=0;
            	for(int i=s.length()-1;i>=0;i--)
            	{
                	if(s.charAt(i)==s.charAt(j))
                	{
                    	count++;
                	}
                j++;
            }
		System.out.println(s);
            if(count==s.length())
            {
                System.out.print("YES");
            }
            else
            {
                System.out.print("NO");
            }
		}
		g.close();
	}
}
/*int n = Integer.parseInt(sc.nextLine())*/