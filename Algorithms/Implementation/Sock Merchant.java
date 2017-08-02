import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int sockMerchant(int n, int[] ar) {
        ArrayList<Integer> val = new ArrayList<>();
        int res = 0;
        
        for(int i=0;i<n;i++){
            if(isIn(val,ar[i]) == 0){
                val.add(ar[i]);
                int count = 0;
                for(int k=0;k<n;k++){
                    if(ar[i] == ar[k]){
                        count++;
                    }
                }
                int aux = count / 2;
                if(aux > 0){
                    res += aux;
                }
            }            
        }
        
        return res;
    }
    
    static int isIn(ArrayList<Integer> val,int el){
        for(int i=0;i<val.size();i++){
            if(el == val.get(i)){
                return 1;
            }
        }
        
        return 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = sockMerchant(n, ar);
        System.out.println(result);
    }
}