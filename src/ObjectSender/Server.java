package ObjectSender;
import java.net.ServerSocket;
import java.net.Socket;

public class Server extends Thread{
	
	private ServerSocket server;
	private Socket client;
	private int port = 5555; //default
	
	public Server(int port){
		this.port = port;
	}
	
	public Server(){
		
	}
	
	public void run(){
		try{
			server = new ServerSocket(port);
			while(true){
				System.out.println("Accepting client...");
				client = server.accept();
				
				new Handler(client);
			}
			
		}
		catch(Exception e){
			System.err.println(e);
		}
		
	}

}
