package com.jobdu;//����Ƶģ�û��ȥ���������˰��죬�������û�д�
import java.io.*;
import java.util.Scanner;

public class Main_1094 {         
    public static void main(String [] args){
                     
            Scanner in = new Scanner(System.in);    
            while(in.hasNext()){
                    String strT = in.next();
                    String strP = in.next();
                    int n = strT.length();
                    int m = strP.length();
                    int count = 0;
                    
                    if(n<m){
                            System.out.println("0");
                            break;
                    }
                    
                    for(int i=0;i<=n-m;i++){
                            String strSub = strT.substring(i,i+m);
                            if(strSub.equals(strP))
                                    count++;
                    }
                    System.out.println(count);
            }
                    
    }//main
}//Main