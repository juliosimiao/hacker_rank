import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            char[] number = (n+"").toCharArray(); 
            int count = 0;
            
            for(int i=0;i<number.length;i++){
                int tt = Character.getNumericValue(number[i]);
                if(tt != 0){
                    if(n % tt == 0){
                    count += 1;
                    }
                }                
            }
            
            System.out.println(count);
        }
    }
}
