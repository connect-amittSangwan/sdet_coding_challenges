package leetcode;/*
Problem Statement:
Given a string S of length N consisting only of letters 'A' and/or 'B', the task is to obtain a string in
the format "A...AB...B" where all letters 'A' occur before all letters 'B' by deleting some letters from S
Write a function solution that returns the minimum number of letters that need to be deleted from S to
achieve the desired format.

Examples:
Given S = "BAAABAB", the function should return 2.
We can obtain "AAABB" by deleting the first occurrence of 'B' and the last occurrence of 'A'.

Given S = "BBABAA", the function should return 3.
We can delete all occurrences of 'A' or all occurrences of 'B'.
*/

import org.testng.Assert;
import org.testng.annotations.Test;

public class MinimunDeletionAABBB {

    @Test
    public void minDeletionTest(){
        String s1 = "BAAABAB";
        String s2 = "BBABAA";
        String s3 = "AABBBB";

        Assert.assertEquals(solution(s1), 2);
        Assert.assertEquals(solution(s2),3);
        Assert.assertEquals(solution(s3),0);
    }

    public static int solution(String s) {


        //amittsangwan: Type You Code Here



        return 0;
    }

}
