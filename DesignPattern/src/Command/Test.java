package Command;

/**
 * 命令模式：
 * 解耦命令调用者与命令接受者的联系，调用者及客户端程序，不必知道任何接受者任何接口。
 * 命令被封装成比较内聚的对象，从而使得遇到日志记录、需要操作的命令序列这样的应用场景时，回退（Undo）是容易实现的。
 * 本例中，我们把汽车点火、变速箱加减档等行为封装成为了变速箱对象，及各种控制命令。把驾驶员想象成调度者，封装成为了UndoControl对象。
 * 生动描述了命令调度者与命令接受者之间，是如何通过command模式解耦的。
 * 
 * 命令模式的好处是解耦，是应用于较多常见场景的一种设计模式，比如事务控制、支持撤销的事件日志、并发处理等等
 * 缺点是，需要生成过多的具体命令类。
 * 
 * 
 * @author teddy.shi
 */
public class Test {
	public static void main(String[] args) {
		//初始化设置
		Undoable myControl = new UndoControl();//初始化调度控制器
		GearBox box = new GearBox(false,0);//初始化变速箱，未启动，当前档位0
		Boot bootCmd = new Boot(box);//点火命令
		Off offCmd = new Off(box);//熄火命令
		SpeedMinus minusCmd = new SpeedMinus(box);//减档命令
		SpeedPlus plusCmd = new SpeedPlus(box);//加档命令
		
		//调度开始
		System.out.println("命令调度开始");
		myControl.executeCommond(bootCmd);
		myControl.executeCommond(plusCmd);
		myControl.executeCommond(minusCmd);
		myControl.executeCommond(plusCmd);
		myControl.executeCommond(plusCmd);
		myControl.executeCommond(plusCmd);
		

		//测试命令回退
		System.out.println("命令模式下的单步回退测试：");
		myControl.undoByStep();
		System.out.println("命令模式下的单步回退测试：");
		myControl.undoByStep();
		
		System.out.println("命令模式下的全部回退测试：");
		myControl.undoAll();

		
	}
}
