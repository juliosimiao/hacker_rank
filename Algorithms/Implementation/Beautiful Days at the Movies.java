import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        int j = in.nextInt();
        int k = in.nextInt();
        
        int count = 0;
        
        
        for(int n = i; n<=j; n++){   
            
            String p1 = "";
            char[] n1 = (n + "").toCharArray();
            for(int m = (n1.length - 1); m >= 0 ; m--){
                p1 += n1[m];
            }
            
            int p = Integer.parseInt(p1);
            
            
            if((n - p) % k == 0){
                count += 1;
            }
        }
        
        System.out.println(count);
        
    }