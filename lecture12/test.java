//package lecture12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class test {

	public static void main(String[] args) throws IOException {
		try (
			// Create an output stream to the file
			FileOutputStream output = new FileOutputStream("temp.dat");
			) {
			// Output values to the file
			output.write(199);
		}
		try (
			// Create an input stream for the file
			FileInputStream input = new FileInputStream("temp.dat");
			) {
			// Read values from the file
			int value;
			while ((value = input.read()) != -1)
				System.out.print(value + " ");
		}
	}
}
