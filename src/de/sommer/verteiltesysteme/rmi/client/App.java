package de.sommer.verteiltesysteme.rmi.client;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.List;

import de.sommer.verteiltesysteme.rmi.backend.Mitarbeiter;
import de.sommer.verteiltesysteme.rmi.backend.MitarbeiterService;

public class App {
    public static void main(String[] args) {
        try {
            System.out.println("Connecting to RMI registry...");
            Registry registry = LocateRegistry.getRegistry("localhost", 2002);
            System.out.println("Looking up MitarbeiterService...");
            MitarbeiterService mitarbeiterService = (MitarbeiterService) registry.lookup("Mitarbeiter");

            System.out.println("");
            System.out.println("Creating new Mitarbeiter...");
            Mitarbeiter mitarbeiter = new Mitarbeiter(1, "Sommer", "Max", 25, "IT", 5000);
            System.out.println("Adding Mitarbeiter to the service...");
            mitarbeiterService.addMitarbeiter(mitarbeiter);
            System.out.println("Mitarbeiter added successfully.");

            System.out.println("");
            System.out.println("Retrieving Mitarbeiter with ID 1...");
            mitarbeiter = mitarbeiterService.getMitarbeiter(1);
            System.out.println(mitarbeiter);

            System.out.println("");
            System.out.println("Adding another Mitarbeiter to the service...");
            mitarbeiterService.addMitarbeiter(new Mitarbeiter(2, "Muster", "Hans", 30, "HR", 4000));
            System.out.println("Mitarbeiter added successfully.");

            System.out.println("");
            System.out.println("Retrieving all Mitarbeiter...");
            List<Mitarbeiter> mitarbeiterList = mitarbeiterService.getAllMitarbeiter();
            System.out.println("All Mitarbeiter:");
            for (Mitarbeiter m : mitarbeiterList) {
                System.out.println(m);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
