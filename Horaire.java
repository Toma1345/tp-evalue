import java.time.LocalDateTime;
import java.util.List;
import java.util.ArrayList;

public class Horaire {
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private List<Salle> lesSalle;
    private List<Cours> lesCours;

    public Horaire(LocalDateTime start, LocalDateTime end){
        this.startDate = start;
        this.endDate = end;
        this.lesSalle = new ArrayList<>();
        this.lesCours = new ArrayList<>();
    }

    public LocalDateTime getStartDate(){
        return this.startDate;
    }

    public LocalDateTime getEndDate(){
        return this.endDate;
    }

    public List<Salle> getSalle(){
        return this.lesSalle;
    }

    public List<Cours> getCours(){
        return this.lesCours;
    }
}
