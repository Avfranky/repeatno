package guvi;
import java.util.HashMap;
import java.util.Scanner;
public class norep {
   public static void main(String[] args)
   {
       Scanner sc=new Scanner(System.in);
       String s1=sc.nextLine();
       String[] s=s1.split(" ");
       HashMap<String,Integer> h=new HashMap<>();
       for(int i=0;i<s.length;i++)
       {
           h.put(s[i], 0);
       }
       for(int i=0;i<s.length;i++)
       {
           h.put(s[i], h.get(s[i])+1);
       }
       for(int i=0;i<s.length;i++)
       {
           if(h.get(s[i])==1)
           {
               System.out.print(s[i]);
               break;
           }
       }
   }
}
