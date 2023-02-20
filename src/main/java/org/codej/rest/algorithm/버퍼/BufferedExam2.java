package org.codej.rest.algorithm.버퍼;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BufferedExam2 {
    public static void main(String[] args) throws IOException {

//        String str="this string includes default delims";
//        System.out.println(str);
//        System.out.println();
//
//        System.out.println("==========using split method============");
//        String []tokens=str.split(" ");
//
//        for(int i=0;i<tokens.length;i++){
//            System.out.println(tokens[i]);
//        }

//        String str="this string\tincludes\ndefault delims";
//        StringTokenizer stk=new StringTokenizer(str);
//        System.out.println(str);
//        System.out.println();
//
//        System.out.println("total tokens:"+stk.countTokens());
//        System.out.println("================tokens==================");
//        while(stk.hasMoreTokens()){
//            System.out.println(stk.nextToken());
//        }
//        System.out.println("total tokens:"+stk.countTokens());


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();   // 입력을 1 2 로 받음
        StringTokenizer st = new StringTokenizer(str);
        StringTokenizer stz = new StringTokenizer(str, " ");
        while (stz.hasMoreTokens()) {
            String result = stz.nextToken();
            System.out.println(result);
        }
    }
}
