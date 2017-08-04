import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int max = 0;
        int n = in.nextInt();
        int k = in.nextInt();
        int[] height = new int[n];
        for(int height_i=0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
            if(height[height_i] > max){
                max = height[height_i];
            }
        }
        
        if(max > k){
            System.out.println(max-k);
        }else{
            System.out.println("0");
        }
    }
}
