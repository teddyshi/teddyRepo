package Proxy.static_;

public class AProxyImpl implements A {

	public void doAction() {
		// TODO Auto-generated method stub
		System.out.println("代理开始");
		new AImpl().doAction();
		System.out.println("代理结束");
	}

}
