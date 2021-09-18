
public class OpenBook implements BookCommand {
	
	public OpenBook(MyDevice myDevise) {
		 
		this.myDevise = myDevise;
	}

	public MyDevice myDevise ;

	public MyDevice getMyDevise() {
		return myDevise;
	}

	public void setMyDevise(MyDevice myDevise) {
		this.myDevise = myDevise;
	}

	@Override
	public void execute() {
		 
		myDevise.open();

	}

}
