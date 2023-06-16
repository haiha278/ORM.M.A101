package fa.education.entities;

import jakarta.persistence.*;


@Entity
@Table(name = "Seat")
public class Seat {
    @Id
    @Column(name = "SEAT_ID")
    private int seatId;
    @ManyToOne
    @JoinColumn(name = "ROOM_ID",nullable = false)
    private Room room;
    @Column(name = "SEAT_COLUMN", nullable = false)
    private String column;
    @Column(name = "SEAT_ROW", nullable = false)

    private int row;
    @Column(name = "SEAT_STATUS", nullable = false)
    private String status;
    @Column(name = "SEAT_TYPE", nullable = false)
    private String type;

    public int getSeatId() {
        return seatId;
    }

    public void setSeatId(int seatId) {
        this.seatId = seatId;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public String getColumn() {
        return column;
    }

    public void setColumn(String column) {
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
