package hansung.designpatterns.command.party;

public class MacroCommand implements Command {
	Command[] commands;
 
	public MacroCommand(Command[] commands) {
		this.commands = commands;
	}
 
	public void execute() {
		for (int i = 0; i < commands.length; i++) {
			commands[i].execute();
		}
	}
 
    /**
     * NOTE:  these commands have to be done backwards to ensure 
     * proper undo functionality
     */
	public void undo() {
	   // 실습 5에서 추가해야할 코드
	}
}

