package Proxy.dynamic_cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class AnimalProxyCglib implements MethodInterceptor {
	
	private Object target;
	
	public Object getInstance(Object target){
		this.target = target;
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(this.target.getClass());
		//�ص�����
		enhancer.setCallback(this);
		//���������ش������
		return enhancer.create();
	}

	
	
	public Object intercept(Object target, Method method, Object[] args,
			MethodProxy proxy) throws Throwable {
		Object rs = null;
		System.out.println("��ʼ����");
		//TODO �˴���Ҳ���Ը���method�����ˣ�ȷ��Ҫִ��ʲôҵ�����
		rs = proxy.invokeSuper(target, args);
		System.out.println("��������");
		// TODO Auto-generated method stub
		return rs;
	}

}
