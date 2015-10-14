package ua.dvreznik.conect;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Conect extends JFrame implements Runnable {

	static private Socket connection;
	static private ObjectInputStream input;
	static private ObjectOutputStream output;

	static public void main(String[] args) {

		new Thread(new Conect("Test")).start();
		new Thread(new Server()).start();
	}
	
	public Conect(String name) {
		super(name);
		setLayout(new FlowLayout());
		setSize(300, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLocationRelativeTo(null);
		
		JTextField t1 = new JTextField(10);
		JButton b1 = new JButton("Send");
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==b1) {
					sendData(t1.getText());
				}
			}
		});
		add(t1);
		add(b1);
	}
	@Override
	public void run() {

		try {
			while (true) {
				connection = new Socket(InetAddress.getByName("127.0.0.1"), 5678);
				input = new ObjectInputStream(connection.getInputStream());
				output = new ObjectOutputStream(connection.getOutputStream());
				JOptionPane.showMessageDialog(null, input.readObject());
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

	private static void sendData(Object obj) {
		try {
			output.flush();
			output.writeObject(obj);
		} catch (IOException e) {
		}
	}

}
