
public class CommandControl {
	
	public BookCommand bookCommand;

	public BookCommand getBookCommand() {
		return bookCommand;
	}

	public void setBookCommand(BookCommand bookCommand) {
		this.bookCommand = bookCommand;
	}

	public CommandControl(BookCommand bookCommand) {
		 
		this.bookCommand = bookCommand;
	}
	
	public void buttonClick() {
		bookCommand.execute();
	}

}
