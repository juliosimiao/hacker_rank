import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String values[] = new String[n];      
        for(int i=0;i<n;i++){
            values[i] = in.next();
        }
        int nQueries = in.nextInt();
        String queries[] = new String[nQueries];
        for(int i=0;i<nQueries;i++){
            queries[i] = in.next();
        }
        
        doQueries(values,queries);               
    }
    
    static void doQueries(String values[],String queries[]){
        for(int i=0;i<queries.length;i++){
            int count = 0;
            for(int j=0;j<values.length;j++){
                if(queries[i].equals(values[j])){
                    count += 1;
                }
            }
            System.out.println(count);
        }
    }
}