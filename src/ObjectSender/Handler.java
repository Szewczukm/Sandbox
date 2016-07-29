package ObjectSender;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Handler extends Thread {
	
	private Socket client;
	private ObjectInputStream ois;
	private ObjectOutputStream ous;
	private Address addr = new Address();
	
	public Handler(Socket client){
		this.client = client;
	}
	
	public void run(){
		while(client.isConnected()){
			try{
				ois = new ObjectInputStream(client.getInputStream());
				ous = new ObjectOutputStream(client.getOutputStream());
				ous.writeObject(new String("Would you like to see an object sent over the internet?"));
				ous.flush();
				String task = (String)ois.readObject();
				if(task.equalsIgnoreCase("yes")){
					ous.writeObject(addr);
				}
				else{
					client.close();
				}
			}
			catch(Exception e){
				System.err.println(e);
			}
		}
	}

}
