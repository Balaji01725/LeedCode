package LeedCodeProblem.Array;

import java.util.Scanner;

public class countAndSay {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the count value:");
        int n=sc.nextInt();
        String s=returnString(n);
        System.out.println(s);
    }
    static String returnString(int n){
        String str="1";
        for(int i=1;i<n;i++){
            str=generateTheValue(str);
        }
        return str;
    }
    static String generateTheValue(String str){
        char currentChar=str.charAt(0);
        int count=1;
        StringBuilder ans=new StringBuilder();
        for(int i=1;i<str.length();i++){
            char nextChar=str.charAt(i);

            if(currentChar==nextChar){
                count++;
            }
            else{
                ans.append(count).append(currentChar);
                currentChar=nextChar;
                count=1;
            }
        }
        ans.append(count).append(currentChar);
        return ans.toString();
    }
}
