public enum Matiere{
    MATH("Maths"), INITPROG("Initiation à la programmation"), 
    ANGLAIS("Anglais"), DEVWEB("Développement Web"), 
    BDD("Base de Donnée"), BASNIVEAU("Développement bas niveau"), POO("Programmation orienté objet");

    private final String nom;

    private Matiere(String nom){
        this.nom=nom;
    }

    public String getNom(){
        return this.nom;
    }
}