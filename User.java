import java.util.List;
import java.util.ArrayList;

public class User {

    private String name;
    private List<Cours> lesCours;

    public User(String name){
        this.name = name;
        this.lesCours = new ArrayList<>();
    }


    // Getters :

    public String getName(){
        return this.name;
    }

    public List<Cours> getCours(){
        return this.lesCours;
    }


    // Méthodes :
    
    public void creerCours(String nomMatiere, Horaire heure) {
        new Cours(nomMatiere, heure);
    }

    public void creerSalle(String nomSalle, int capaciteSalle, Horaire heure){
        Salle salle = new Salle(nomSalle, heure, capaciteSalle);
    }
}