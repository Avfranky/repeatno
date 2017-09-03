package guvi;
import java.util.Scanner;
public class sumoftwoelements {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String[] s=a.split(" ");
        int i,j,k,count=0;
        for(i=0;i<s.length-1;i++)
        {
            for(j=i+1;j<s.length;j++)
            {
                for(k=0;k<s.length;k++)
                {
                    if(Integer.parseInt(s[i])+Integer.parseInt(s[j])==Integer.parseInt(s[k]))
                    {
                     System.out.print(i+" "+j+" "+k);
                     count++;
                     break;
                    }
                }
                if(count==1)
                {
                    break;
                }
            }
            if(count==1)
            {
                break;
            }
        }
    }
}
