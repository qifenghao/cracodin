package com.qifeng.cracodin;

/**
 * 面试题 01.02. 判定是否互为字符重排
 * 难度：简单
 *
 * 给定两个字符串 s1 和 s2，请编写一个程序，确定其中一个字符串的字符重新排列后，能否变成另一个字符串。
 *
 * 示例 1：
 *  输入: s1 = "abc", s2 = "bca"
 *  输出: true
 *
 * 示例 2：
 *  输入: s1 = "abc", s2 = "bad"
 *  输出: false
 *
 * 说明：
 *  0 <= len(s1) <= 100
 *  0 <= len(s2) <= 100
 */
public class Item0102Permutation {
    public static boolean checkPermutation(String s1, String s2) {
        int len = s1.length();
        if (s2.length() != len) {
            return false;
        }

        int[] arr = new int[26];
        for (int i = 0; i < len; i++) {
            arr[s1.charAt(i) - 'a']++;
            arr[s2.charAt(i) - 'a']--;
        }

        for (int i = 0; i < 26; i++) {
            if (arr[i] != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(checkPermutation("abc", "bca"));
        System.out.println(checkPermutation("abc", "bad"));
    }
}
