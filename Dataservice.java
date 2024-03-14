import java.util.List;
import java.util.ArrayList;

public class Dataservice {
    private List<Salle> salles;
    private List<Cours> cours;
    private List<Etudiant> etudiants;

    public List<Salle> getSalles() {
        return salles;
    }

    public void setSalles(List<Salle> salles) {
        this.salles = salles;
    }

    public List<Cours> getCours() {
        return cours;
    }

    public void setCours(List<Cours> cours) {
        this.cours = cours;
    }

    public List<Etudiant> getEtudiants() {
        return etudiants;
    }

    public void setEtudiants(List<Etudiant> etudiants) {
        this.etudiants = etudiants;
    }

    public Dataservice(){
        this.salles = new ArrayList<>();
        this.cours = new ArrayList<>();
        this.etudiants = new ArrayList<>();
    }

    public void ajouterCoursEtudiant(Matiere nomCours, List<Etudiant> lesEtudiants){
        
    }
}
