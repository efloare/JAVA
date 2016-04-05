package sample;

import java.io.*;
import java.nio.file.Paths;

public class Main {

	public static void main(String[] args) throws IOException {

		String filenameForName = Paths.get("").toAbsolutePath().toString() + "/filename.txt";

		BufferedWriter writer = null;

		writer = new BufferedWriter(new FileWriter(filenameForName));
		for (int i = 0; i < 1000; i++) {
			try {

				String s = new RandomString().getRandomName();
				writer.write(s);
				writer.newLine();
				System.out.println(s);

				if (i == 999){
					System.out.println(i);
					writer.close();
				}

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		String filenameForLastName = Paths.get("").toAbsolutePath().toString() + "/filelastname.txt";

		BufferedWriter writer2 = null;

		writer2 = new BufferedWriter(new FileWriter(filenameForLastName));
		for (int i = 0; i < 1000; i++) {
			try {

				String s = new RandomString().getRandomLastName();
				writer2.write(s);
				writer2.newLine();
				System.out.println(s);

				if (i == 999){
					System.out.println(i);
					writer2.close();
				}

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		String filenameForType = Paths.get("").toAbsolutePath().toString() + "/filetype.txt";
		System.out.println(filenameForType);
		BufferedWriter writer3 = null;

		writer3 = new BufferedWriter(new FileWriter(filenameForType));
		for (int i = 0; i < 1000; i++) {
			try {

				String s = new RandomString().getRandomType();
				writer3.write(s);
				writer3.newLine();
				System.out.println(s);

				if (i == 999){
					System.out.println(i);
					writer3.close();
				}

			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}





