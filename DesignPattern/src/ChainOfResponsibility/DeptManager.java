package ChainOfResponsibility;

public class DeptManager extends Handler {

	@Override
	public void handleRequest(String user, int fee) {
		// TODO Auto-generated method stub
		if(fee<=1000){
			System.out.println("部门经理批准"+user+"报销:"+fee+"元！");
		}else{
			System.out.println("部门经理拒绝!");
			getSuccessor().handleRequest(user, fee);
		}
	}

}
