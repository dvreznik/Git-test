package ua.dvreznik.conect;

import java.awt.HeadlessException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JOptionPane;

public class Server implements Runnable{

	static private ServerSocket server;
	static private Socket connection;
	static private ObjectInputStream input;
	static private ObjectOutputStream output;
	@Override
	public void run() {
		try {
			server = new ServerSocket(5678,10);
			while (true) {
				connection = server.accept();
				output = new ObjectOutputStream(connection.getOutputStream());
				input = new ObjectInputStream(connection.getInputStream());
				output.writeObject("You send : " + (String)input.readObject());
			}
		} catch (UnknownHostException e) {
		} catch (IOException e) {
			e.printStackTrace();
		} catch (HeadlessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
