import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        HashMap<Character,Integer> freq=new HashMap<>();
        // <key,value>
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(freq.containsKey(ch))
            {
                int oldfrq=freq.get(ch);
                freq.put(ch,oldfrq+1);
            }

            else
            {
                freq.put(ch,1);
            }


        }

        char ch=str.charAt(0);
        int maxfreq=freq.get(ch);

        for(Character key:freq.keySet())
       {
          int currfreq=freq.get(key);
          if(currfreq >maxfreq)
          {
              ch=key;
              maxfreq=currfreq;
          }
       }

       System.out.println(ch);




    }

}
