package Modele;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alexis on 19/03/14.
 */
class Gardien {

    List<ImageSnap> savedStates;
    Originator createur;
    int position = -1;

    public Gardien(){
        createur = new Originator();
        List<ImageSnap> savedStates = new ArrayList<ImageSnap>();
    }

    public void ajouterSnap(Perspective state){
        createur.SetSave(state);
        savedStates.add(createur.CreateSave());
        position = +1;
    }

    public Perspective restorFromMemento(int x){
        return createur.restoreFromMemento(savedStates.get(x));
    }





}