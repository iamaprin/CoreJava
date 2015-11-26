/**
 * /codeone/CharAtandCodePoint.java
 * author: iamaprin
 * date: 2015/11/26
 * time: 23:07
 * description: compare charAt & codePointAt in class String
 */
package codeone;

public class CharAtandCodePoint {

    public static void main(String[] args) {
        String str = "Hello world!";
        System.out.println(str.charAt(0));          //H
        System.out.println(str.codePointAt(0));     //72

        /*
        char in Java is UTF-16 --> 0x0000-0xFFFF
        codePoint .. Unicode, --> 0x000000-0x10FFFF
        while codePoint > 0xFFFF, one codePoint == two char in Java
        so the length of string == the number of codePoint in the string //?
         */
    }
}