import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] words = new String[n];
        
        for(int i=0;i<n;i++){
            words[i] = in.next();
        }
        
        for(int i=0;i<words.length;i++){
            char[] palavra = words[i].toCharArray();
            int tam = palavra.length;
            String par = "";
            String impar = "";
            for(int j=0;j<tam;j++){
                if(j % 2 == 0 || j == 0){
                    par += palavra[j];
                }else{
                    impar += palavra[j];
                }                
            }
            System.out.println(par+" "+impar);
        }
            
            
        
    }
}