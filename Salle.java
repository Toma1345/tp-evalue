public class Salle {
    private String name;
    private Horaire hour;

    private int capacite;

    /**
     * @param name Nom de la salle
     * @param hour Horaire du cours dans la salle
     * @param capacite Capacite de la salle
     */
    public Salle(String name,Horaire hour, int capacite){
        this.name = name;
        this.hour = hour;
        this.capacite = capacite;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Horaire getHour() {
        return hour;
    }

    public void setHour(Horaire hour) {
        this.hour = hour;
    }

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    public Salle getSalle(){
        return this;
    }
}
