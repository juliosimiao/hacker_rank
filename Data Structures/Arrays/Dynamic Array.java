import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.List;
import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int q = in.nextInt();
        
        ArrayList<ArrayList<Integer>> seqList = new ArrayList<ArrayList<Integer>>();             
        int lastAnswer = 0;
        
        for(int i=0;i<n;i++){
            ArrayList<Integer> eList = new ArrayList<>();   
            seqList.add(eList);
        }
        
        for(int i=0;i<q;i++){
            int t = in.nextInt(); 
            int x = in.nextInt();
            int y = in.nextInt();
            
            int index = ( (x ^ lastAnswer) % n );
            
            if(t == 1){
                seqList.get(index).add(y);
            }else{
                int size = y % seqList.get(index).size(); 
                lastAnswer = seqList.get(index).get(y);
                System.out.println(lastAnswer);
            }
        }
    }
    
}