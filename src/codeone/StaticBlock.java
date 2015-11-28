/**
 * /codeone/StaticBlock.java
 * author: iamaprin
 * date: 2015/11/28
 * time: 19:54
 * description: static initialization block
 */
package codeone;

public class StaticBlock {

    //just be executed once
    static {
        System.out.println("i am a static initialization block");
    }

    public static void main(String[] args) {
        StaticBlock s = new StaticBlock();
        StaticBlock ss = new StaticBlock();
    }
    /*
    result:
        i am a static initialization block
     */
}