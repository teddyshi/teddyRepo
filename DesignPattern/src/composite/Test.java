package composite;

import java.util.List;

/**
 * 组合模式，将对象以树形结构，部分-整体形式表示。
 * 可以使客户忽略单个对象与组合的不同，用户将统一使用组合模式中的所有对象。
 */
public class Test {
	public static void main(String[] args) {
		Employer zs = new Programmer("程序员：张三");
		Employer ls = new ProjectAssistant("项目助理：李四");
		Employer ww = new ProjectManager("项目经理：王五");
		ww.add(zs);
		ww.add(ls);
		List<Employer> emps = ww.getEmployers();
		for (Employer employer : emps) {
			employer.printInfo();
		}
		ww.printInfo();
	}
	
}
