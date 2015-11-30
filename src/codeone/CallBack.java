/**
 * /codeone/CallBack.java
 * author: iamaprin
 * date: 2015/11/30
 * time: 23:16
 * description: test how the callback working.
 *              code from futeng @ http://www.zhihu.com/question/19801131
 */
package codeone;

interface DoHomeWork {
    void doHomeWork(String question, String answer);
}

class RoomMate {
    public void getAnswer(String homework, DoHomeWork someone) {
        if ("1+1=?".equals(homework)) {
            someone.doHomeWork(homework, "2");
        } else {
            someone.doHomeWork(homework, "don't know");
        }
    }
}

class Worker implements DoHomeWork {
    @Override
    public void doHomeWork(String question, String answer) {
        System.out.println("exercise book");
        System.out.println("homework: " + question + " answer: " + answer);
    }
}

public class CallBack {

    public static void main(String[] args) {
        Worker worker = new Worker();
        String question = "1+1=?";
        new RoomMate().getAnswer(question, worker);
    }
}