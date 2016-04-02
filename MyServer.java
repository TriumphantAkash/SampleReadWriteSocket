package sampleSocketConnection;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {

	public static void main(String []args){
		
		try{
		ServerSocket serverSocket = new ServerSocket(9696);
		Socket client = serverSocket.accept();
		
		DataOutputStream out = new DataOutputStream(client.getOutputStream());
		WriterThread writerThread = new WriterThread(out);
		writerThread.start();
		
		BufferedReader input = new BufferedReader(new InputStreamReader(client.getInputStream()));
		ReaderThread readerThread = new ReaderThread(input);
		readerThread.start();
			
	}catch(Exception e){
		System.out.println("some exception at server");
	}
	}
}
