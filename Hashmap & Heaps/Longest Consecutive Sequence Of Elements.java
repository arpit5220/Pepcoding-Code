import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int [] arr=new int[n];
    for(int i=0;i<n;i++)
    {
       arr[i]=sc.nextInt(); 
    }

    HashMap<Integer,Boolean> hm=new HashMap<>();

    for(int i=0;i<n;i++)
    {
        hm.put(arr[i],true);
    }
   
   int maxcount=0;
   int startpoint=0;

   for(Integer key:hm.keySet())
   {
       if(hm.containsKey(key-1)==false)
       {
           int length=1;
           while(hm.containsKey(key+length)==true)
           {
               length++;
           }

           if(length>maxcount)
           {
               maxcount=length;
               startpoint=key;
           }
       }
   }

     for(int i=0;i<maxcount;i++)
     {
         System.out.println(startpoint+i);
     }


 }

}
