package Proxy.static_;

public class AProxyImpl implements A {

	public void doAction() {
		// TODO Auto-generated method stub
		System.out.println("����ʼ");
		new AImpl().doAction();
		System.out.println("�������");
	}

}
