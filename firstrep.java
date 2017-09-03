/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guvi;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Avfranky
 */
public class firstrep {
    public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       LinkedList <String> list=new LinkedList <String> ();
       String[] list1=sc.nextLine().split(" ");
       for(int i=0;i<list1.length;i++)
       {
           if(list.contains(list1[i]))
           {
               System.out.print(list1[i]);
               break;
           }
           else
           {
               list.add(list1[i]);
           }
       }
     
   }
}
