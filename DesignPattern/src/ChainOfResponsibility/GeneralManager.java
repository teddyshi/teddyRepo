package ChainOfResponsibility;

public class GeneralManager extends Handler {

	@Override
	public void handleRequest(String user, int fee) {
		// TODO Auto-generated method stub
		if(fee>1000){
			System.out.println("�ܾ�����׼"+user+"����:"+fee+"Ԫ��");
		}else{
			System.out.println("�ܾ���ܾ�!");
		}
	}

}
