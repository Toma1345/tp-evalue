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

}
