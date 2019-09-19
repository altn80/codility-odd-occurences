/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novaes.codility.odd.occurences;

/**
 *
 * @author kbos
 */
public class Solution {

    public int solution(int[] A) {
        int x = 0;
        for (int i : A) {
            x ^= i;
        }
        return x;
    }
    
    public static void main(String[] args) {
        System.out.println(new Solution().solution(new int[]{9, 3, 9, 3, 9, 7, 9}));
    }

}
