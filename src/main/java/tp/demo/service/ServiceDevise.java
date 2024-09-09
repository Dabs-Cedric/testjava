package tp.demo.service;

import tp.demo.model.Devise;

import java.util.ArrayList;
import java.util.List;

public class ServiceDevise {

    //V1 (sans base de données), future V2 avec Database
    public List<Devise> findAllDevises(){
        List<Devise> listeDevises = new ArrayList<>();
        listeDevises.add(new Devise("EUR","Euro",1.0));
        listeDevises.add(new Devise("USD","Dollar",1.1));
                return listeDevises;
    }
}
