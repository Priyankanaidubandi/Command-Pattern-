
public class ComicBook implements MyDevice {

	@Override
	public void open() {
		System.out.println("Open the comic book");

	}

	@Override
	public void read() {
		System.out.println("Read the comic book");

	}

	@Override
	public void close() {
		System.out.println("Close the comic book");

	}

}
