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
		//回调方法
		enhancer.setCallback(this);
		//创建并返回代理对象
		return enhancer.create();
	}

	
	
	public Object intercept(Object target, Method method, Object[] args,
			MethodProxy proxy) throws Throwable {
		Object rs = null;
		System.out.println("开始代理");
		//TODO 此处你也可以根据method来过滤，确定要执行什么业务操作
		rs = proxy.invokeSuper(target, args);
		System.out.println("结束代理");
		// TODO Auto-generated method stub
		return rs;
	}

}
