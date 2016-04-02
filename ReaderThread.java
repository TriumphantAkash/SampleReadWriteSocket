package sampleSocketConnection;

import java.io.BufferedReader;
import java.io.IOException;

public class ReaderThread extends Thread{

	private BufferedReader br;
	private String str;
	
	ReaderThread(BufferedReader ois){
		this.br = ois;
	}
	
	public void run(){
		
		while(true){
		try {
			str = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("[Reader] received this message: "+str);

		}
	}
}
