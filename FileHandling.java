package javaprog;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;

//FileInputStreamReader reads the data from file	
// InputStreamReader data in bytes into data in character

class fileinput extends Thread {
	public void run() {
		char[] streams = new char[500];

		try {

			FileInputStream f1 = new FileInputStream("trial.txt");
			// Scanner sc = new Scanner(System.in);
			// FileOutputStream opt = new FileOutputStream("trial.txt");
			// OutputStreamWriter op = new OutputStreamWriter(opt);
			// op.write(sc.nextLine());
			// op.close();
			InputStreamReader isr = new InputStreamReader(f1);

			isr.read(streams);
			System.out.println("<===== The characters from the files are =====>");
			System.out.println(streams);

			isr.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

class fileoutput extends Thread {
	public void run() {
//char [] streams= new char[500];

		try {

			Scanner sc = new Scanner(System.in);
			FileOutputStream opt = new FileOutputStream("trial.txt",true);
			OutputStreamWriter op = new OutputStreamWriter(opt);
			System.out.println("******** Enter the Data to insert into the File ******** ");
			op.write("\n"+sc.nextLine());
			op.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

public class FileHandling {
	public static void main(String[] args) throws InterruptedException {
		fileinput fin = new fileinput();
		fileoutput fout = new fileoutput();
		
		fout.start();
		fout.join();
		fin.start();
		

	}
}
