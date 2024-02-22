import java.time.LocalDateTime;

public class Horaire {
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private Salle salle;

    public Horaire(LocalDateTime start, LocalDateTime end, Salle salle){
        this.startDate = start;
        this.endDate = end;
        this.salle = salle;
    }

    public LocalDateTime getStartDate(){
        return this.startDate;
    }

    public LocalDateTime getEndDate(){
        return this.endDate;
    }

    public Salle getSalle(){
        return this.salle;
    }
}
