import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int x = in.nextInt(); //a
            int y = in.nextInt(); //b
            int z = in.nextInt(); //mouse
        
            int catA = Math.abs(z - x);
            int catB = Math.abs(z - y);
            
            if(catA < catB){
                System.out.println("Cat A");
            }
            if(catA > catB){
                System.out.println("Cat B");
            }
            if(catA == catB){
                System.out.println("Mouse C");
            }
        
        
        }
    }
}