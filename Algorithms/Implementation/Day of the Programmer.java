import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String solve(int year,int sumDays){
        
        int february = 28;
        int x = 256;
        String res = "";
        
        if(year >= 1700 && year <= 1917){//julians
            if(year % 4 == 0){//leap
                february = 29;
                sumDays += february;
                res = ""+(x-sumDays)+".09."+year;
            }else{
                sumDays += february;
                res = ""+(x-sumDays)+".09."+year;
            }
        }
        if(year > 1918){//gregorian
            if(year % 400 == 0 || year % 4 == 0 && year % 100 != 0 ){
                february = 29;
                sumDays += february;
                res = ""+(x-sumDays)+".09."+year;
            }else{
                sumDays += february;
                res = ""+(x-sumDays)+".09."+year;
            }
        }
        if(year == 1918){
            sumDays += february;
            res = ""+(x-sumDays+13)+".09."+year;
        }
            
        
        return res;
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        int sumDays = 215;
        String result = solve(year,sumDays);
        System.out.println(result);
    }
}