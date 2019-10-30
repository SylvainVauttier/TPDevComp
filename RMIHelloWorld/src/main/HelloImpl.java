package main;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import server.AgentImpl;

public class HelloImpl extends UnicastRemoteObject implements Hello  {

	protected HelloImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String sayHello() throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("service called");
		return "Hello world";
	}

	@Override
	public Agent getAgent() throws RemoteException {
		// TODO Auto-generated method stub
		return new AgentImpl();
	}

}
