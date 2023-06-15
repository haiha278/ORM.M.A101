package fa.education.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Seat {
    @Id
    @Column(name = "SEAT_ID")
    private int seatId;
    @ManyToOne
    @JoinColumn(name = "")
    private Room room;
}
