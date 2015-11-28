## Java中的注释
### 通用注释
下面的标记可以用在类文档的注释中
`@author`： 作者
`@version`： 版本
`@since`： 始于
`@deprecated`： 不再使用的方法等
`@see` 引用
`@link` 引用，同`@see`
_用法：_
`@see java.lang.String#toString()`
`@see <a herf="www.google.com>Google</a>"`
`@see "Core Java 2 volume 2"`
<br>
### 类注释
_类注释必须放在import语句之后，类定义之前_
```java
/**
 * General file manipulation utilities.
 * <p>
 * Facilities are provided in the following areas:
 * <ul>
 * <li>writing to a file
 * <li>reading from a file
 * <li>make a directory including parent directories
 * <li>copying files and directories
 * <li>deleting files and directories
 * <li>converting to and from a URL
 * <li>listing files and directories by filter and extension
 * <li>comparing file content
 * <li>file last changed date
 * <li>calculating a checksum
 * </ul>
 * <p>
 * Origin of code: Excalibur, Alexandria, Commons-Utils
 *
 * @version $Id: FileUtils.java 1349509 2012-06-12 20:39:23Z ggregory $
 */
public class FileUtils {
	...
}
```
<br>
### 方法注释
javadoc： 公有的和受保护的构造器及方法
`@param`： 变量描述
`@return`： 返回值描述
`@throws`： 类描述 
_这个标记将添加一个注释，用于表示这个方法有可能抛出异常_
```java
/**
* Construct a file from the set of name elements.
* 
* @param names the name elements
* @return the file
* @since 2.1
*/
public static File getFile(String... names) {
	if (names == null) {
		throw new NullPointerException("names must not be null");
	}
	File file = null;
	for (String name : names) {
		if (file == null) {
			file = new File(name);
		} else {
			file = new File(file, name);
		}
	}
	return file;
}
```
<br>
### 域注释
_只需要对公有域（通常指的是静态常量）建立文档_
```java
/**
* The number of bytes in an exabyte.
* 
* @since 2.4
*/
public static final BigInteger ONE_EB_BIONE_KB_BI.multiply(ONE_PB_BI);
```
<br>
### 注释的抽取
`javadoc -d docDirectory nameOfPackage`
<br>
> 摘抄于CoreJava， 代码来自于Apache.commons