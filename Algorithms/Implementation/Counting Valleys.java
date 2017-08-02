import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    static int checkValley(String steps){
        
        int seaLevel = 0;
        int valley = 0;
        
        for(int i=0;i<steps.length();i++){
            if(steps.charAt(i) == 'D'){                
                if(seaLevel == 0){
                    seaLevel--;
                    for(int j=i+1;j<steps.length();j++){
                        if(steps.charAt(j) == 'U'){
                            valley++;
                            break;
                        }
                    }
                }else{
                    seaLevel--;
                }
            }else{
                seaLevel++;
            }
                
        }
        
        return valley;        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        String steps = in.nextLine();
        
        int res = checkValley(steps);
        System.out.println(res);
    }
}