import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        Stack<Integer> pilha = new Stack<>();
        
        for(int i=0;i<n;i++){
            int type = in.nextInt();
            if(type == 1){
                int x = in.nextInt();
                pilha.push(x);
            }else if(type == 2){
                pilha.pop();
            }else if(type == 3){
                int max = pilha.peek();
                for(int j=1;j<pilha.size();j++){System.out.println("entrei");
                    if(pilha.get(j) > max){
                        max = pilha.get(j);
                        System.out.println(max);
                    }
                }
            }
        }
    }
}