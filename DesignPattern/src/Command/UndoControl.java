package Command;

import java.util.Stack;

/**
 * ʵ�ֿɻ��˵����������
 * @author Administrator
 *
 */
@SuppressWarnings("unchecked")
public  class UndoControl implements Undoable {
	
	protected Stack commandStack = new Stack<Command>();
	
	public Stack getCommandStack() {
		return commandStack;
	}
	public void setCommandStack(Stack commandStack) {
		this.commandStack = commandStack;
	}

	public void executeCommond(Command command) {
		// TODO Auto-generated method stub
		command.execute();
		getCommandStack().add(command);
	}

	public void undoAll() {
		// TODO Auto-generated method stub
		Stack vs = getCommandStack();
		if(vs.size()>0){
			int steps = vs.size();
			for(int i=0;i<steps;i++){
				Command c = (Command)vs.pop();
				c.undo();
			}
		}else{
			System.out.println("û�п��Ի��˵Ĳ�����");
		}
	}

	public void undoByStep() {
		Stack vs = getCommandStack();
		if(vs.size()>0){
			Command c = (Command)getCommandStack().pop();
			c.undo();
		}else{
			System.out.println("û�п��Ի��˵Ĳ�����");
		}
	}
	
}
