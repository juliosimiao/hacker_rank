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
        Stack<Integer> maximum = new Stack<>();
        int max = Integer.MIN_VALUE;
        maximum.push(max);
        
        for(int i=0;i<n;i++){
            
            int type = in.nextInt();
            
            if(type == 1){
                int x = in.nextInt();
                pilha.push(x);
                
                max = Math.max(x, maximum.peek());
                maximum.push(max);
            }
            else if(type == 2){
                
                if(!pilha.isEmpty()){
                    if(pilha.peek() == maximum.peek()){
                        maximum.pop();
                        pilha.pop();
                    }
                }       
            }
            else if(type == 3){            
                                
                System.out.println(maximum.peek());

            }
        }
    }
}