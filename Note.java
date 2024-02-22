public class Note {
    
    private double note;
    private String nomCotrole;
    private Matiere matiere;
    private Etudiant etudiant;

    public Note(double note, String nomControle, Matiere matiere, Etudiant etudiant){
        this.note=note;
        this.nomCotrole=nomControle;
        this.matiere=matiere;
        this.etudiant=etudiant;
    }

    public double getNote(){
        return this.note;
    }

    public String getNomControle(){
        return this.nomCotrole;
    }

    public String getNomMatiere(){
        return this.matiere.getNom();
    }

    public String getNomEtudiant(){
        return this.etudiant.getNom();
    }

    public void changerNote(double valeur){
        this.note=valeur;
    }

}
