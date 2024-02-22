import java.time.LocalDateTime;

public class Horaire {
    private LocalDateTime startDate;
    private LocalDateTime endDate;

    public Horaire(LocalDateTime start, LocalDateTime end){
        this.startDate = start;
        this.endDate = end;
    }

    public LocalDateTime getStartDate(){
        return this.startDate;
    }

    public LocalDateTime getEndDate(){
        return this.endDate;
    }
}
