import java.util.ArrayList;
import java.util.List;

public enum Matiere{
    MATH("Maths"), INITPROG("Initiation à la programmation"), 
    ANGLAIS("Anglais"), DEVWEB("Développement Web"), 
    BDD("Base de Donnée"), BASNIVEAU("Développement bas niveau"), POO("Programmation orienté objet");

    private List<Note> notes;
    private String nom;

    private Matiere(String nom){
        this.notes = new ArrayList<>();
        this.nom=nom;
    }

    public String getNom(){
        return this.nom;
    }

    public void ajouterNote(Note note){
        this.notes.add(note);
    }

    public double moyenneMatiere(){
        double sommeNote=0;
        int sommeCoef=0;
        for(Note note : this.notes){
            sommeNote += note.getNote()*note.getCoef();
            sommeCoef += note.getCoef();
        }
        return sommeNote/sommeCoef;
    }
}