package com.jobdu;
import java.util.Scanner;

public class Main {
        public static void main(String[] args){
                Scanner cin=new Scanner(System.in);
                String str1,str2;
                while(cin.hasNext()){
                        str1=cin.next();
                        str2=cin.next();
                        System.out.println(check(str1,str2));
                }
        }
        public static int check(String str1,String str2){
                int k,i,j;
                int flag;
                int count=0;
                for(i=0;i<str1.length();i++){
                        k=i;
                        flag=0;
                        for(j=0;j<str2.length();j++){
                                if((k<str1.length())&&(str1.charAt(k)==str2.charAt(j)))
                                                k++;
                                else{
                                        flag=1;
                                        break;
                                }
                        }
                        if(flag==0){
                                count++;
                        }
                }
                return count;
        }
}