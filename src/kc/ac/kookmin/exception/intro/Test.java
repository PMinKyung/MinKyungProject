package kc.ac.kookmin.exception.intro;
import java.io.*;


class Trade {

	public void readFile() {

			try {
			String path = Trade.class.getResource("a.txt").getPath();
			BufferedReader in = new BufferedReader(new FileReader(path));

			
			while((path = in.readLine())!= null) {
				System.out.println(path);
			}
			in.close();
		} catch (IOException e) {
			System.err.println(e);
			System.exit(1);
		}

	}
}

public class Test {
	public static void main(String args[]) {
		
		Trade a = new Trade();
    	a.readFile();
    }

}
