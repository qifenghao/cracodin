package com.qifeng.cracodin;

/**
 * 面试题 01.03. URL化
 * 难度：简单
 *
 * URL化。编写一种方法，将字符串中的空格全部替换为%20。假定该字符串尾部有足够的空间存放新增字符，并且知道字符串的“真实”长度。
 * （注：用Java实现的话，请使用字符数组实现，以便直接在数组上操作。）
 *
 * 示例 1：
 *  输入："Mr John Smith    ", 13
 *  输出："Mr%20John%20Smith"
 *
 * 示例 2：
 *  输入："               ", 5
 *  输出："%20%20%20%20%20"
 *
 * 提示：
 *  字符串长度在 [0, 500000] 范围内。
 */
public class Item0103StringToURL {
    public static String replaceSpaces(String S, int length) {
        String str = S.substring(0, length);
        return str.replace(" ", "%20");
    }

    public static String replaceSpaces2(String S, int length) {
        // “真实”长度内的空格数
        int numOfSpaces = 0;
        for (int i = 0; i < length; i++) {
            if (S.charAt(i) == ' ') {
                numOfSpaces++;
            }
        }

        char[] arr = new char[length + 2 * numOfSpaces];
        int j = 0;
        for (int i = 0; i < length; i++) {
            char ch = S.charAt(i);
            if (ch == ' ') {
                arr[j++] = '%';
                arr[j++] = '2';
                arr[j++] = '0';
            } else {
                arr[j++] = ch;
            }
        }
        String result = String.valueOf(arr);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(replaceSpaces("Mr John Smith    ", 13));
        System.out.println(replaceSpaces("               ", 5));

        System.out.println(replaceSpaces2("Mr John Smith    ", 13));
        System.out.println(replaceSpaces2("               ", 5));
        System.out.println(replaceSpaces2("ds sdfs afs sdfa dfssf asdf             ",27));
    }
}
