package ChainOfResponsibility;

public class DeptManager extends Handler {

	@Override
	public void handleRequest(String user, int fee) {
		// TODO Auto-generated method stub
		if(fee<=1000){
			System.out.println("���ž�����׼"+user+"����:"+fee+"Ԫ��");
		}else{
			System.out.println("���ž���ܾ�!");
			getSuccessor().handleRequest(user, fee);
		}
	}

}
