package prototype;

/**
 * 原型模式的优点：
 * 针对一个已有对象A的实例，可以不使用new关键字来创建其它新的实例，而是改用.clone方法来得到新实例。
 * 这么做的优点在于高效，对象克隆是直接在内存中复制对象，而创建一个对象需要在内存中新开辟空间。
 * 有深拷贝与浅拷贝之分，浅拷贝是指八类基本属性另辟空间，对象及集合等复杂属性共享空间。
 * 深拷贝是指，无论基本、复杂属性一律另辟空间，调用互不影响。
 * 而，java中的cloneable接口，默认实现浅拷贝，深拷贝需在clone方法里另外手工实现。
 * 如何实现：
 * 只要A类实现Cloneable接口，并且覆盖其原有的clone方法，那么A类除了原实例以外的其它实例都可以克隆创建。
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) {
		Prototype p1 = new Prototype("123");
		Prototype p2 = (Prototype)p1.clone();
		System.out.println(p1.getName());
		System.out.println(p2.getName());
	}
}
