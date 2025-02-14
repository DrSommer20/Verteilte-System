package de.sommer.verteiltesysteme.rmi.backend;

import java.rmi.RemoteException;
import java.util.List;

public interface MitarbeiterService extends java.rmi.Remote {

    public void addMitarbeiter(Mitarbeiter mitarbeiter)throws RemoteException;
    public void deleteMitarbeiter(int id)throws RemoteException;
    public void updateMitarbeiter(Mitarbeiter mitarbeiter)throws RemoteException;
    public Mitarbeiter getMitarbeiter(int id)throws RemoteException;
    public List<Mitarbeiter> getAllMitarbeiter()throws RemoteException;
    
} 
