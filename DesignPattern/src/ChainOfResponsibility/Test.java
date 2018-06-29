package ChainOfResponsibility;

/**
 * 责任链模式在很多方面都有应用。
 * 有纯与不纯两种模式。
 * 纯的责任链模式，是指处理对象只能选择承担全部责任，或者传递给下家处理，不存在既承担了一部分责任同时又传递给下家去处理。
 * 在一个纯的责任链模式里，请求应该被一个对象处理掉，而一个不纯的责任链模式里，一个请求可能不被任何对象处理，也可能被不同对象分步处理。
 * 但通常，纯的责任链模式的应用很少见，大部分都是不纯的，本代码举例极其简单，可看做是一个纯的责任链，
 * 但一般来说，报销流程即便直接领导不同意也需有一个反馈并再提交上上级处理，反馈本身也是对请求作出了一种简单处理，而部门经理及总经理再行处理，所以这又是不纯的责任链了。
 * Tomcat 的过滤器机制即是责任链模式的应用。
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) {
		//装配责任链,流程：项目经理审批500元以下，部门经理审批1000元以下，总经理审批任意金额
		//报销从项目经理审批开始，一级一级往上传
		ProjectManager pm = new ProjectManager();
		DeptManager dm = new DeptManager();
		GeneralManager gm = new GeneralManager();
		pm.setSuccessor(dm);
		dm.setSuccessor(gm);
		
		//报销举例：
		pm.handleRequest("张三", 400);
		System.out.println("========================");
		
		pm.handleRequest("李四",900);
		System.out.println("========================");
		
		pm.handleRequest("王五", 1200);
		
	}
}
