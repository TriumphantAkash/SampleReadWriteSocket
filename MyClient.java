package sampleSocketConnection;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class MyClient {

	public static void main(String []args) throws IOException{
		Socket client = new Socket("localhost", 9696);
	
		/*
		ObjectOutputStream oos = new ObjectOutputStream(client.getOutputStream());
		WriterThread writerThread = new WriterThread(oos);
		writerThread.start();
		
		ObjectInputStream ois = new ObjectInputStream(client.getInputStream());
		ReaderThread readerThread = new ReaderThread(ois);
		readerThread.start();
		*/
		DataOutputStream out = new DataOutputStream(client.getOutputStream());
		WriterThread writerThread = new WriterThread(out);
		writerThread.start();
		
		BufferedReader input = new BufferedReader(new InputStreamReader(client.getInputStream()));
		ReaderThread readerThread = new ReaderThread(input);
		readerThread.start();
	}

}
