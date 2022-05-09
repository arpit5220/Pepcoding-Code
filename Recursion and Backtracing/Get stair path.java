import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
           
           Scanner sc=new Scanner(System.in);
           int n=sc.nextInt();
           ArrayList<String> paths=getstairpaths(n);
           System.out.println(paths);

    }

    public static ArrayList<String> getstairpaths(int n) {
        if(n==0)
        {
            ArrayList<String> bres=new ArrayList<>();
            bres.add("");
            return bres;
        }

        else if(n<0)
        {
            ArrayList<String> bres=new ArrayList<>();
            return bres;
        }

        ArrayList<String> paths1=getstairpaths(n-1);
        ArrayList<String> paths2=getstairpaths(n-2);
        ArrayList<String> paths3=getstairpaths(n-3);
       
       ArrayList<String> paths=new ArrayList<>();
       
       for(String path:paths1)
       {
           paths.add(1+path);
       }

       for(String path:paths2)
       {
           paths.add(2+path);
       }

       for(String path:paths3)
       {
           paths.add(3+path);
       }

       return paths;

    }

}
