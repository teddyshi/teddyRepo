package ChainOfResponsibility;

/**
 * ��������������������
 * @author Administrator
 *
 */
public abstract class Handler {
	
	//���������������Ĵ������
	private Handler successor;

	public Handler getSuccessor() {
		return successor;
	}

	public void setSuccessor(Handler successor) {
		this.successor = successor;
	}
	
	public abstract void handleRequest(String user,int fee);
}
