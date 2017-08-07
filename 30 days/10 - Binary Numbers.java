import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> nBinary = new ArrayList<>();
        
        while(n > 0){
            int remainder = n % 2;
            n = n / 2;
            nBinary.add(remainder);
        }
        
        int max = 1;
        
        for(int i = 0; i < nBinary.size() - 1 ;i++){
            int con = 1;
            if(nBinary.get(i) == 1){
                for(int j = (i+1); j < nBinary.size() ; j++){
                    if(nBinary.get(j) == 1){
                        con += 1;
                        if(con > max){
                            max = con;
                        }
                    }else{
                        break;                        
                    }
                }  
            }
        }
        
        System.out.println(max);
    }
}