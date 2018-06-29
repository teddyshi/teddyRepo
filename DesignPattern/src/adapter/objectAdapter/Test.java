package adapter.objectAdapter;

/**
 * 适配器模式之对象适配器
 * 举例：我们知道家用水管主要分为，四分管及六分管
 * 假设四分管已经用完了，现在只有六分管了，那么你就需要一个四六分管的接口转换器才能继续接上六分管。
 * 回到程序中来，现在已经有了一个PipeFour类，我们要定义一个转换接口PipeAdapter来转接PipeSix
 * 对象适配器模式中，我们使得PipeAdapter引用了四分管类的实例，并且兼容六分管，那么PipeAdapter同时也需要实现目标接口Target,
 * 因为Taget接口就是定义了四、六分转接这样的行为。
 * 在实现了具体转接方法后，我们的类适配器模式就完成了。
 * 这里提一下，上面一个包实现了类适配器模式，基本思想一样，只是类适配器需要继承自原类，但对象适配器却是把原类的实例直接引用了
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) {
		Target t = new PipeAdapter(new PipeFour(),new PipeSix());
		t.describePipeFour();
		t.describePipeSix();
	}
}
