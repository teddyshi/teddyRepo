package bridge;

/**
 * 桥接模式的优点：
 * 分离接口及其实现部分
 * 提高可扩充性
 * 使得具体实现对客户透明化
 * 
 * 实现方式：使目标对象及动作对象都为抽象类，动作对象作为目标对象的构造函数入参。
 * 而目标对象及动作对象的具体实现均由子类承担，
 * 目标对象（抽象类）的职责仅仅只是调用动作对象的主方法
 * 动作对象（抽象类）的职责仅仅只是定义了本身要做的事，具体怎么做，凭子类实现
 * 这样做也有遵循了高内聚、低耦合的编程宗旨
 * 
 * @author Teddy.shi
 *
 */
public class Test {
	public static void main(String[] args) {
		System.out.println("画矩形:");
		Shape shape1 = new Rectangle(new DrawObject1());
		shape1.draw();
		
		System.out.println("画奥运五环:");
		Shape shape2 = new OlympicRings(new DrawObject2());
		shape2.draw();
	}
}
