/**
 * /codeone/ArraylistSizeTest.java
 * author: iamaprin
 * date: 2015/11/29
 * time: 21:32
 * description: test the number of element in list:
 *              about size() and trimToSize()
 */
package codeone;

import java.util.ArrayList;

public class ArraylistSizeTest {

    public static void main(String[] args) {
        ArrayList<Integer> nameList = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            nameList.add(i);
        }
        nameList.add(10);
        System.out.println(nameList);
        System.out.println(nameList.size());

        /*
        size(): not the true space the list occupy, the number of element in list
        after trimToSize(), ... == ...
         */
    }
}