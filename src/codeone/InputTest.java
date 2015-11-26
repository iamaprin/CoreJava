/**
 * /codeone/InputTest.java
 * author: iamaprin
 * date: 2015/11/27
 * time: 0:02
 * description: System.in & Scanner class
 */
package codeone;

import java.io.Console;
import java.util.Scanner;

public class InputTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("What's your name?");
        String name = in.nextLine();

        //if input is not a int, it will throw InputMismatchException.
        System.out.println("How old are you?");
        int age = in.nextInt();

        System.out.println("name: " + name + ", age: " + age);

        //Console cannot be used in IDE idea, it will throw NullPointException
        Console cons = System.console();
        String username = cons.readLine("User name: ");
        char[] password = cons.readPassword("Password: ");//for safe, place password in a char array
    }
}