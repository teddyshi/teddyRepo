package adapter.classAdapter;

import adapter.objectAdapter.PipeSix;
import adapter.objectAdapter.Target;

/**
 * ������ģʽ֮��������
 * ����������֪������ˮ����Ҫ��Ϊ���ķֹܼ����ֹ�
 * �����ķֹ��Ѿ������ˣ�����ֻ�����ֹ��ˣ���ô�����Ҫһ�������ֹܵĽӿ�ת�������ܼ����������ֹܡ�
 * �ص����������������Ѿ�����һ��PipeFour�࣬����Ҫ����һ��ת���ӿ�PipeAdapter��ת��PipeSix
 * ��������ģʽ�У�����ʹ��PipeAdapter�̳����ķֹ��࣬���Ҽ������ֹܣ���ôPipeAdapterͬʱҲ��Ҫʵ��Ŀ��ӿ�Target,
 * ��ΪTaget�ӿھ��Ƕ������ġ�����ת����������Ϊ��
 * ��ʵ���˾���ת�ӷ��������ǵ���������ģʽ������ˡ�
 * ������һ�£�����һ����ʵ���˶���������ģʽ������˼��һ����ֻ������������Ҫ�̳���ԭ�࣬������������ȴ�ǰ�ԭ���ʵ��ֱ��������
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) {
		Target t = new PipeAdapter(new PipeSix());
		t.describePipeFour();
		t.describePipeSix();
	}
}
