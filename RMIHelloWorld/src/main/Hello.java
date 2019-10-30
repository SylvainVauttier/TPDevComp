package main;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Hello extends Remote {
	
	String sayHello() throws RemoteException;
	
	Agent getAgent() throws RemoteException;

}
