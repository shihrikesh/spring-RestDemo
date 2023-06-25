package com.shihri.springRest.data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "RESERVATION")
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "RESERVATION_ID")
    private Long id;
    @Column(name = "ROOM_ID")
    private Long roomId;
    @Column(name = "GUEST_ID")
    private Long guestId;
    @Column(name = "RES_DATE")
    private Date reservationDate;

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "id=" + id +
                ", roomId=" + roomId +
                ", guestId=" + guestId +
                ", reservationDate=" + reservationDate +
                '}';
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRoomId() {
        return roomId;
    }

    public void setRoomId(Long roomId) {
        this.roomId = roomId;
    }

    public Long getGuestId() {
        return guestId;
    }

    public void setGuestId(Long guestId) {
        this.guestId = guestId;
    }

    public Date getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(Date reservationDate) {
        this.reservationDate = reservationDate;
    }
}
