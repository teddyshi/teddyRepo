package composite;

import java.util.List;

/**
 * ���ģʽ�������������νṹ������-������ʽ��ʾ��
 * ����ʹ�ͻ����Ե�����������ϵĲ�ͬ���û���ͳһʹ�����ģʽ�е����ж���
 */
public class Test {
	public static void main(String[] args) {
		Employer zs = new Programmer("����Ա������");
		Employer ls = new ProjectAssistant("��Ŀ��������");
		Employer ww = new ProjectManager("��Ŀ��������");
		ww.add(zs);
		ww.add(ls);
		List<Employer> emps = ww.getEmployers();
		for (Employer employer : emps) {
			employer.printInfo();
		}
		ww.printInfo();
	}
	
}
