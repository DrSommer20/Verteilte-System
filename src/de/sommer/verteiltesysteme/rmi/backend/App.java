package de.sommer.verteiltesysteme.rmi.backend;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class App {
    public static void main(String[] args) {
        int port = 2002;
        try {
            MitarbeiterServiceImpl mitarbeiterService = new MitarbeiterServiceImpl();
            Registry registry = LocateRegistry.createRegistry(port);
            MitarbeiterService stub = (MitarbeiterService) UnicastRemoteObject.exportObject(mitarbeiterService, 0);
            registry.rebind("Mitarbeiter", stub);
            System.out.println("Server is running on port " + port);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
