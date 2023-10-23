import java.io.*;

public class FileReaderExample{
	public static void main(String args[]) {
		FileReader fr;
		try { 								// (1)
			fr = new FileReader("test.txt"); // (2)
			int ch;
			while ((ch = fr.read()) != -1) 		// (3)
				System.out.print((char) ch + " ");
			fr.close(); 						// (4)
		} catch (IOException e) {			e.printStackTrace();		}
	}
}