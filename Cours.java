import java.util.List;
import java.util.ArrayList;

public class Cours{
    private String nomMatiere;
    
    private Horaire hour;
    private List<User> lesUtilisateurs;
    private List<Groupe> lesGroupes;
    // private Matiere matiere;

    public Cours(String nom, Horaire hour){
        this.nomMatiere = nom;
        this.hour = hour;
        this.lesUtilisateurs = new ArrayList<>();
        // this.lesGroupes = new ArrayList<>();
        // this.matiere = (Matiere) nom;
    }

    public void ajouteGroupe(){
        this.lesGroupes.add(new Groupe());
    }

    public String getCours(){
        return nomMatiere;
    }

    public Horaire getHoraire(){
        return this.hour;
    }

    public List<User> getUtilisateurs(){
        return this.lesUtilisateurs;
    }
}
