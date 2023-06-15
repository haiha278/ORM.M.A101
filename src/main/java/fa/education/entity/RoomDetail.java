package fa.education.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "RoomDetail")
public class RoomDetail {
    @Id
    @Column(name = "ROOM_DETAIL_ID")
    private int roomDetailId;
    @OneToOne
    @JoinColumn(name = "CINEMA_ROOM_ID")
    private Room room;
    @Column(name = "ROOM_RATE", nullable = false)
    private int roomRate;
    @Column(name = "ACTIVE_DATE", nullable = false)
    private Date activeDate;
    @Column(name = "ROOM_DESCRIPTION", nullable = false)
    private String roomDescription;

    public int getRoomDetailId() {
        return roomDetailId;
    }

    public void setRoomDetailId(int roomDetailId) {
        this.roomDetailId = roomDetailId;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public int getRoomRate() {
        return roomRate;
    }

    public void setRoomRate(int roomRate) {
        this.roomRate = roomRate;
    }

    public Date getActiveDate() {
        return activeDate;
    }

    public void setActiveDate(Date activeDate) {
        this.activeDate = activeDate;
    }

    public String getRoomDescription() {
        return roomDescription;
    }

    public void setRoomDescription(String roomDescription) {
        this.roomDescription = roomDescription;
    }
}
