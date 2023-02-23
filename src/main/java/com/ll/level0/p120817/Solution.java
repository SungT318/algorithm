package com.ll.level0.p120817;

public class Solution {
    public double solution(int[] numbers) {

        float num =0;

        for(int i=0; i<numbers.length; i++)
            num += numbers[i];

        return num/numbers.length;
    }

}
