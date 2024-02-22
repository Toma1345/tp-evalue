import java.util.ArrayList;
import java.util.List;

public class Etudiant {
    private String prenom;
    private String nom;
    private List<Note> notes;
    private int age;
    private List<Groupe> groupes;

    public Etudiant(String prenom, String nom, int age){
        this.prenom=prenom;
        this.nom=nom;
        this.age=age;
        this.notes= new ArrayList<>();
        this.groupes= new ArrayList<>();
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNom() {
        return nom;
    }

    public int getAge() {
        return age;
    }

    public List<Groupe> getGroupes() {
        return groupes;
    }

    public List<Note> getNotes() {
        return notes;
    }

    public List<Note> getNotes(Matiere matiere){
        List<Note> notes = new ArrayList<>();
        for (Note note : this.notes){
            if (note.getNomMatiere()==matiere.getNom()){
                notes.add(note);
            }
        }
        return notes;
    }

    public double getMoyenneGeneral(){
        double total=0;
        int nbNotes=0;
        for (Note note : this.notes){
            total += note.getNote();
            nbNotes += note.getCoef();
        }
        return total/nbNotes;
    }
}
