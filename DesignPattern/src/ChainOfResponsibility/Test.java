package ChainOfResponsibility;

/**
 * ������ģʽ�ںܶ෽�涼��Ӧ�á�
 * �д��벻������ģʽ��
 * ����������ģʽ����ָ��������ֻ��ѡ��е�ȫ�����Σ����ߴ��ݸ��¼Ҵ����������ڼȳе���һ��������ͬʱ�ִ��ݸ��¼�ȥ������
 * ��һ������������ģʽ�����Ӧ�ñ�һ��������������һ��������������ģʽ�һ��������ܲ����κζ�������Ҳ���ܱ���ͬ����ֲ�������
 * ��ͨ��������������ģʽ��Ӧ�ú��ټ����󲿷ֶ��ǲ����ģ��������������򵥣��ɿ�����һ��������������
 * ��һ����˵���������̼���ֱ���쵼��ͬ��Ҳ����һ�����������ύ���ϼ���������������Ҳ�Ƕ�����������һ�ּ򵥴����������ž������ܾ������д��������������ǲ������������ˡ�
 * Tomcat �Ĺ��������Ƽ���������ģʽ��Ӧ�á�
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) {
		//װ��������,���̣���Ŀ��������500Ԫ���£����ž�������1000Ԫ���£��ܾ�������������
		//��������Ŀ����������ʼ��һ��һ�����ϴ�
		ProjectManager pm = new ProjectManager();
		DeptManager dm = new DeptManager();
		GeneralManager gm = new GeneralManager();
		pm.setSuccessor(dm);
		dm.setSuccessor(gm);
		
		//����������
		pm.handleRequest("����", 400);
		System.out.println("========================");
		
		pm.handleRequest("����",900);
		System.out.println("========================");
		
		pm.handleRequest("����", 1200);
		
	}
}