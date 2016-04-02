package sampleSocketConnection;

import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class WriterThread extends Thread{

	private DataOutputStream os;
	
	WriterThread(DataOutputStream os){
		this.os = os;
	}
	
	public void run(){
		while(true){
			System.out.println("write a number:");
			Scanner in = new Scanner(System.in);
			int n = in.nextInt();
			
			in.nextLine();
			
			System.out.println("write a pattern");
			String str = in.nextLine();
			
			try {
				os.writeBytes(n+str);
				os.writeBytes("\n");
				os.flush();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println();
				e.printStackTrace();
			}
		}
	}
}