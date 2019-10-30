package main;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hello myComponent;
		try {
			myComponent = (Hello) Naming.lookup("Hello");
			System.out.println(myComponent.sayHello());
			myComponent.getAgent().live();
		} catch (MalformedURLException | RemoteException | NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
