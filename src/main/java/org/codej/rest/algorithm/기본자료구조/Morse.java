package org.codej.rest.algorithm.기본자료구조;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Morse {
    public static void main(String[] args) {
       String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        String letter = ".... . .-.. .-.. ---";
        // mos에 a - z 까지 박는 배열 넣으면될듯
        String[] arr = letter.split(" ");
        StringBuilder sb = new StringBuilder();

        for (String s : arr) {
            for(int i = 0; i< morse.length; i++){
                if (s.equals(morse[i])){
                    sb.append(Character.toString(i+'a'));
                }
            }
        }
        System.out.println(sb.toString());

    }
    }

