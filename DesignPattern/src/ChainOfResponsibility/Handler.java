package ChainOfResponsibility;

/**
 * 报销处理，责任链抽象父类
 * @author Administrator
 *
 */
public abstract class Handler {
	
	//定义后续持有请求的处理对象
	private Handler successor;

	public Handler getSuccessor() {
		return successor;
	}

	public void setSuccessor(Handler successor) {
		this.successor = successor;
	}
	
	public abstract void handleRequest(String user,int fee);
}
