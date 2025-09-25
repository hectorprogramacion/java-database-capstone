@Entity
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @NotNull
    private Doctor doctor;
    @ManyToOne
    @NotNull
    private Patient patient;
    @Future
    private LocalDateTime appointmentTime;
    private int status; // 0 = Scheduled, 1 = Completed
    @Transient
    public LocalDateTime getEndTime() {
        return appointmentTime.plusHours(1);
    }
    public Patient getPatient() {
        return patient;
    }
    
    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    
    public LocalDateTime getAppointmentTime() {
        return appointmentTime;
    }
    
    public void setAppointmentTime(LocalDateTime appointmentTime) {
        this.appointmentTime = appointmentTime;
    }
    
    public int getStatus() {
        return status;
    }
    
    public void setStatus(int status) {
        this.status = status;
    }
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public Doctor getDoctor() {
        return doctor;
    }
    
    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
    @Transient
public LocalDate getAppointmentDate() {
    return appointmentTime.toLocalDate();
}

@Transient
public LocalTime getAppointmentTimeOnly() {
    return appointmentTime.toLocalTime();
}
}
