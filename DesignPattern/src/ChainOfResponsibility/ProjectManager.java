package ChainOfResponsibility;

public class ProjectManager extends Handler {

	@Override
	public void handleRequest(String user, int fee) {
		// TODO Auto-generated method stub
		if(fee<=500){
			System.out.println("��Ŀ������׼"+user+"����:"+fee+"Ԫ��");
		}else{
			System.out.println("��Ŀ����ܾ�!");
			getSuccessor().handleRequest(user, fee);
		}
	}

}
