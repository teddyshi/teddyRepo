package Command;

/**
 * 规范命令可回退的接口
 * @author Administrator
 *
 */
public interface Undoable {
	
	void executeCommond(Command command);
	
	void undoAll();
	
	void undoByStep();
	
}
