import java.util.*;
public class FirstNonRepeat
{
    public static void main(String [] args)
    {
        Scanner g=new Scanner(System.in);
        String s1=g.nextLine();
        String s2=s1.toLowerCase();
        int n=s2.length();
        int [] mark=new int[n];
        int f=0;
        int k=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(s2.charAt(i)==s2.charAt(j))
                {
                    f=f+1;
                    mark[k]=f;
                    k++;
                }
            }   
        }
        g.close();
    }
}