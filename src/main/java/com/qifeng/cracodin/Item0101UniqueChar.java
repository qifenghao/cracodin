package com.qifeng.cracodin;

/**
 * 面试题 01.01. 判定字符是否唯一
 * 难度：简单
 *
 * 实现一个算法，确定一个字符串 s 的所有字符是否全都不同。
 *
 * 示例 1：
 *  输入: s = "leetcode"
 *  输出: false
 *
 * 示例 2：
 *  输入: s = "abc"
 *  输出: true
 *
 * 限制：
 *  0 <= len(s) <= 100
 *  如果你不使用额外的数据结构，会很加分。
 */
public class Item0101UniqueChar {
    public static boolean isUnique(String astr) {
        int[] arr = new int[26];
        for (int i = 0; i < astr.length(); i++) {
            int j = astr.charAt(i) - 'a';
            if (arr[j] == 1) {
                return false;
            }
            arr[j]++;
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "leetcode";
        String s2 = "abc";
        System.out.println(isUnique(s1));
        System.out.println(isUnique(s2));
    }
}
