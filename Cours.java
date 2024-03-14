import java.util.List;
import java.util.ArrayList;

public class Cours{
    private Horaire hour;
    private User utilisateur;
    private List<Groupe> lesGroupes;
    private Matiere matiere;

    public Cours(Matiere nom, Horaire hour, User utilisateur){
        this.hour = hour;
        this.utilisateur = utilisateur;
        this.lesGroupes = new ArrayList<>();
        this.matiere = nom;
    }

    public void ajouteGroupe(){
        this.lesGroupes.add(new Groupe());
    }

    public Matiere getCours(){
        return matiere;
    }

    public Horaire getHoraire(){
        return this.hour;
    }

    public User getUtilisateurs(){
        return this.utilisateur;
    }
}
