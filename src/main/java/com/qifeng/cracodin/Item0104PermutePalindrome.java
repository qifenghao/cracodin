package com.qifeng.cracodin;

/**
 * 面试题 01.04. 回文排列
 * 难度：简单
 *
 * 给定一个字符串，编写一个函数判定其是否为某个回文串的排列之一。
 * 回文串是指正反两个方向都一样的单词或短语。排列是指字母的重新排列。
 * 回文串不一定是字典当中的单词。
 *
 * 示例1：
 *  输入："tactcoa"
 *  输出：true（排列有"tacocat"、"atcocta"，等等）
 */
public class Item0104PermutePalindrome {
    public static boolean canPermutePalindrome(String s) {
        int[] arr = new int[128];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i)]++;
        }

        int numOfOdds = 0;
        for (int a : arr) {
            if (a % 2 != 0) {
                numOfOdds++;
            }
        }

        // 最多只有一个字符的出现次数为奇数才能组成回文串
        return numOfOdds <= 1;
    }

    public static void main(String[] args) {
        System.out.println(canPermutePalindrome("tactcoa")); // true
        System.out.println(canPermutePalindrome("a")); // true
        System.out.println(canPermutePalindrome("abbc")); // false
        System.out.println(canPermutePalindrome("abba")); // true
        System.out.println(canPermutePalindrome("AaBb//a")); // false
    }
}
