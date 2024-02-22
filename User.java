public class User {
    private String name;
    private Cours leCours;

    public User(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public Cours getCours(){
        return this.leCours;
    }
}