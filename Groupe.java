import java.util.List;
import java.util.ArrayList;

public class Groupe {
    private List<Cours> lesCours;
    // private List<Etudiant> lesEtudiants;

    public Groupe(){
        this.lesCours = new ArrayList<>();
        // this.lesEtudiants = new ArrayList<>();
    }

    public List<Cours> getCours(){
        return this.lesCours;
    }
}
