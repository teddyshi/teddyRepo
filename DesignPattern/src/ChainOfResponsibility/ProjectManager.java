package ChainOfResponsibility;

public class ProjectManager extends Handler {

	@Override
	public void handleRequest(String user, int fee) {
		// TODO Auto-generated method stub
		if(fee<=500){
			System.out.println("项目经理批准"+user+"报销:"+fee+"元！");
		}else{
			System.out.println("项目经理拒绝!");
			getSuccessor().handleRequest(user, fee);
		}
	}

}
