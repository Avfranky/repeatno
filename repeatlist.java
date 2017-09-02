
package guvi;

import java.util.LinkedList;
import java.util.Scanner;

public class repeatlist {
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       LinkedList <String> list=new LinkedList <String> ();
       String[] list1=sc.nextLine().split(" ");
       for(int i=0;i<list1.length;i++)
       {
           if(list.contains(list1[i]))
           {
               System.out.print(list1[i]+" ");
           }
           else
           {
               list.add(list1[i]);
           }
       }
     
   }
}
