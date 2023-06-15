package fa.education.entity;

import javax.persistence.*;

@Entity
@Table(name = "Room")
public class Room {
    @Id
    @Column(name = "CINEMA_ROOM_ID")
    private int roomId;
    @Column(name = "CINEMA_ROOM_NAME", nullable = false)
    private String roomName;
    @Column(name = "SEAT_QUANTITY", nullable = false)
    private int seatQuantity;
    @OneToOne(mappedBy = "room", orphanRemoval = true)
    private RoomDetail roomDetail;

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public int getSeatQuantity() {
        return seatQuantity;
    }

    public void setSeatQuantity(int seatQuantity) {
        this.seatQuantity = seatQuantity;
    }
}
