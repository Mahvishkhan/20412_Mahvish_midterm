package string_problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    /*
    Write a Java Program, `isAnagram`, to check if any two strings are anagrams

    An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, using all of the
    original letters exactly once.

        Ex: "CAT" & "ACT",
            "ARMY" & "MARY",
            "FART" & "RAFT"
    */

    //Implement Here
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter two strin");

        String str1 = in.nextLine();
        String str2 = in.nextLine();

        char arr1[] = str1.toCharArray();
        char arr2[] = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        String sortedstr1 = new String(arr1);
        String sortedstr2 = new String(arr2);

        if (sortedstr1.equals(sortedstr2)) ;
        {
            System.out.print("Anagram");
       // } else {
        {
            {
                System.out.println("Not an anagram");
            }
        }
    }
    }
}

