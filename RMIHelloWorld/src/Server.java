
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class Server {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Hello myComponent = new HelloImpl();
			
			Naming.rebind("Hello", myComponent);
			
			System.out.println("Serveur actif");
			
		} catch (RemoteException | MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
