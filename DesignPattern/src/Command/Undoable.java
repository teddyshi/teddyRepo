package Command;

/**
 * �淶����ɻ��˵Ľӿ�
 * @author Administrator
 *
 */
public interface Undoable {
	
	void executeCommond(Command command);
	
	void undoAll();
	
	void undoByStep();
	
}
