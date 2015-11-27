### Java方法参数的使用

----------


- 一个方法不能修改一个基本数据类型的参数（即数值型和布尔型）
- 一个方法可以修改一个对象的状态
- 一个方法不能让对象参数引用一个新的对象

<br>


##### 一个方法不能修改一个基本数据类型的参数（即数值型和布尔型）
```java
double percent = 10;
public static void tripleValue(double x) {
	x = 3 * x;
}
tripleValue(percent);
```
> percent的值为10， 并不是30

<br>


##### 一个方法可以修改一个对象的状态
```java
public static void tripSalary(Employee x) {
	x.raiseSalary(200);
}
harry = new Emplyee(...);
tripSalary(harry);
```
> harry的salary属性被改变为3*salary

<br>

##### 一个方法不能让对象参数引用一个新的对象
```java
public static void swap(Employee x, Employee y) {
	Employee temp = x;
	x = y;
	y = temp;
}
Emplyee a = new Employee("Alice", ...);
Emplyee b = new Employee("Bob", ...);
swap(a, b)
```
> a， b依然分别指向"Alice"， "Bob"， 没有发生改变


----------
**摘抄自CoreJava**
2015/11/27 17:31:10 