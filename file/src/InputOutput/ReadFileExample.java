package InputOutput;
	import java.io.FileNotFoundException;
	import java.io.FileReader;
	import java.io.IOException;

	public class ReadFileExample {
		public static void main(String[] args) {
			try {
				FileReader fr=new FileReader("MyFile.txt");
				int data=fr.read();
				while(data != 0)
				{
					System.out.print((char)data);
					data=fr.read();
				}
				System.out.println("done");
			}
			catch(IOException e) {
				e.printStackTrace();

				}

	}

}
