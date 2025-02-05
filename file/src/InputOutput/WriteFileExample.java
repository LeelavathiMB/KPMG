package InputOutput;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFileExample {
	public static void main(String[] args) {
		try {
			FileWriter fr=new FileWriter("MyFile.txt",true);
			String content="This is my File";
			fr.write(content);
			fr.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
