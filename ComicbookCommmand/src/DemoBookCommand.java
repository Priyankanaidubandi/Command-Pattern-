
public class DemoBookCommand {
	
	public static void main(String[] args) {
		
		MyDevice comicBook = new ComicBook();
		
		OpenBook openCommand = new OpenBook(comicBook);
		
		CommandControl remoteCall = new CommandControl(openCommand);
		
		remoteCall.buttonClick();
		
		System.out.println("\n");
      ReadBook readCommand = new ReadBook(comicBook);
		
		CommandControl readcontrol = new CommandControl(readCommand);
		
		readcontrol.buttonClick();
		
		System.out.println("\n");
		
		 CloseBook closeCommand = new CloseBook(comicBook);
			
			CommandControl closecontrol = new CommandControl(closeCommand);
			
			closecontrol.buttonClick();
		 

	}
	
	
}
