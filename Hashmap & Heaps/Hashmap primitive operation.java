import java.io.*;
import java.util.*;
public class HelloWorld{

     public static void main(String []args){
        
        //<key,value>
        
        HashMap<String,Integer> hm=new HashMap<>();
      
      //1.put
       hm.put("CSK",4);
       hm.put("MI",5);
       hm.put("KKR",2);
      
      // System.out.println(hm.get("CSK"));  // 4
       
    //   //2.update
    //   hm.put("CSK",6);  //override the old value
    //   System.out.println(hm.get("CSK"));  //6
    //   // for unknown
    //   System.out.println(hm.get("RR")); // null
      
      //
    //   HashMap <Long,Long> phone=new HashMap<>();
    //   phone.put(9319117889l,91l);
    //   System.out.println(phone.get(9319117889l)); // 91l
       
       //3. remove
    //   Integer count=hm.remove("CSK");
    //     System.out.println(hm.get("CSK")); //null // csk deleated
    //      System.out.println(count);// 4
    //      // if unknown key
         
    //      Integer c2=hm.remove("RR");
    //       System.out.println(c2);  // null
    
    // to print whole hashmap or value
    // System.out.println(hm);
    
   // hm.put("DC",1);
    // System.out.println(hm);
    
    //4. containskey
    //  if(hm.containsKey("RR"))
    //  {
    //       System.out.println(hm.get("RR"));
    //  }
    //  else
    //  {
    //       System.out.println("oops1");
    //  }
      
    //   if(hm.containsKey("CSK"))
    //   {
    //       System.out.println(hm.get("CSK"));
    //   }
    //   else
    //   {
    //       System.out.println("oops2");
    //   }
    
    //5. keyset
     
    // Set<String> keys=hm.keySet();
    // for(String str:keys)    // access the keys using this
    // {
    //     System.out.println(str+"  ");
    // }
    
    // // OR
    // for(String str:hm.keySet())
    // {                    // access the keys using this also
    //     System.out.print(str+" ");
    // }
      
    //6. SIZE
    
    //System.out.println(hm.size());  //3 -->total key size
    
     
       
       
     }
}
