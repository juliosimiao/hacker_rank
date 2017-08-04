import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void insertIntoSorted(int[] ar) {
        int tam = (ar.length) - 1;        
        int n = ar[tam];
        
        for(int i = (tam-1); i >= 0; i--){
            if(ar[i] > n){
                ar[i + 1] = ar[i];
                printArray(ar);        
            }else if(n > ar[i]){
                ar[i + 1] = n;
                printArray(ar);
                break;     
            }
        }
        
        if(n < ar[0]){
            ar[0] = n;
            printArray(ar);
        }
        
    }
    
    
/* Tail starts here */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
        }
        insertIntoSorted(ar);
    }
    
    
    private static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
        System.out.println("");
    }
}