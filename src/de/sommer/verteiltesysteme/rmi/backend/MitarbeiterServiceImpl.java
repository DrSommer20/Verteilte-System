package de.sommer.verteiltesysteme.rmi.backend;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

public class MitarbeiterServiceImpl implements MitarbeiterService{

    List<Mitarbeiter> mitarbeiterList = new ArrayList<Mitarbeiter>();

    @Override
    public void addMitarbeiter(Mitarbeiter mitarbeiter) throws RemoteException{
        mitarbeiterList.add(mitarbeiter);
    }

    @Override
    public void deleteMitarbeiter(int id) throws RemoteException{
        Mitarbeiter mitarbeiter = getMitarbeiter(id);
        mitarbeiterList.remove(mitarbeiter);
    }

    @Override
    public void updateMitarbeiter(Mitarbeiter updatedMitarbeiter) throws RemoteException{
        Mitarbeiter mitarbeiter = getMitarbeiter(updatedMitarbeiter.getId());
        mitarbeiter.setName(updatedMitarbeiter.getName());
        mitarbeiter.setVorname(updatedMitarbeiter.getVorname());
        mitarbeiter.setAlter(updatedMitarbeiter.getAlter());
        mitarbeiter.setAbteilung(updatedMitarbeiter.getAbteilung());
        mitarbeiter.setGehalt(updatedMitarbeiter.getGehalt());
    }

    @Override
    public Mitarbeiter getMitarbeiter(int id) throws RemoteException{
        for(Mitarbeiter mitarbeiter : mitarbeiterList) {
            if(mitarbeiter.getId() == id) {
                return mitarbeiter;
            }
        }
        return null;
    }

    @Override
    public List<Mitarbeiter> getAllMitarbeiter() throws RemoteException{
        return mitarbeiterList;
    }
    
}
