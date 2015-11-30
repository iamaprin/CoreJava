## Java中的回调函数

*"if you call me, i will call back"*
```java
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
```
这个例子取自知乎上的回答，意思是一位worker让其室友帮忙完成工作。其中worker知道工作的内容但不想做，而其室友知道该怎么做却不知道做什么，这其中有个信息交换的过程。
![](http://i.imgur.com/2tWths1.png)
`getAnswer()` => *"if you call me"*
`doHomeWork()` => *"i will call you back*
<br>


1. 这其中有个委托机制，我委托你做一件我自己不能完成的事情，但是对于这件事情你需要在我这获得更多的信息。
2. 被委托者也需要执行委托者中的方法，所以在调用的过程中委托者需要将自己引用传递给被委托者。
3. 在多线程中，可以实现异步回调。

----------

<br>
```java
著作权归作者所有。
商业转载请联系作者获得授权，非商业转载请注明出处。
作者：刘云龙
链接：http://www.zhihu.com/question/19801131/answer/17158216
来源：知乎

public class Button {
	private OnClickLisener onClickLisener;

	public interface OnClickLisener {
		public void onClick();
	}

	public void setOnClickLisener(OnClickLisener onClickLisener) {
		this.onClickLisener = onClickLisener;
	}

	public void onClick() {
		onClickLisener.onClick();
	}
}

public class Main implements Button.OnClickLisener {

	public static void main(String args[]) {
		Button button = new Button();
		button.setOnClickLisener(new Main());
		button.onClick();
	}

	@Override
	public void onClick() {
		System.out.println("点击，回调");
	}

}
```
在这个例子中，Main执行Button的onClick()方法，然后Button执行了Main的onClick()方法。Main也将自己的引用传递给了Button，然后Button在从引用调用Main的方法。

----------
<br>
```Javascript
$("p").hide(1000,function(){
alert("The paragraph is now hidden");
});
```
这是JQuery的一段代码，同样用到了回调机制，实现的效果是p中文字先消失，再弹出对话框。这个例子中function方法的引用被传递给了hide方法。

----------
<br>
*刚开始接触回调，待修改，有问题欢迎指正*
<br>

**相关资料出处：**
futeng，刘云龙 @ [回调函数（callback）是什么？--知乎](http://www.zhihu.com/question/19801131 "回调函数（callback）是什么？")

[jQuery Callback 函数--w3school](http://www.w3school.com.cn/jquery/jquery_callback.asp "jQuery Callback 函数")
