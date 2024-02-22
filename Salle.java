public class Salle {
    private String name;
    private Horaire hour;

    public Salle(String name, Horaire hour){
        this.name = name;
        this.hour = hour;
    }

    public String getSalle(){
        return this.name;
    }

    public Horaire getHoraire(){
        return this.hour;
    }
}
