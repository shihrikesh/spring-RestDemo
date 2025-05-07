package com.shihri.springRest.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "RESERVATION")
@Data
@NoArgsConstructor
@AllArgsConstructor
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

}
