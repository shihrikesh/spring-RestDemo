package com.shihri.springRest.util;

import com.shihri.springRest.bussiness.ReservationService;
import com.shihri.springRest.bussiness.RoomReservation;
import com.shihri.springRest.data.Guest;
import com.shihri.springRest.data.Reservation;
import com.shihri.springRest.data.Room;
import com.shihri.springRest.repository.GuestRepository;
import com.shihri.springRest.repository.ReservationRepository;
import com.shihri.springRest.repository.RoomRepository;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Component
public class AppStartUpEvent implements ApplicationListener<ApplicationReadyEvent> {

    private final RoomRepository roomRepository;
    private final GuestRepository guestRepository;
    private final ReservationRepository reservationRepository;
    private final DateUtils dateUtils;
    private final ReservationService reservationService;

    public AppStartUpEvent(RoomRepository roomRepository, GuestRepository guestRepository
            , ReservationRepository reservationRepository, DateUtils dateUtils, ReservationService reservationService) {
        this.roomRepository = roomRepository;
        this.guestRepository = guestRepository;
        this.reservationRepository = reservationRepository;
        this.dateUtils = dateUtils;
        this.reservationService = reservationService;
    }


    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {

        Iterable<Room> rooms = this.roomRepository.findAll();
        rooms.forEach(System.out::println);
        Iterable<Guest> guests = this.guestRepository.findAll();
        guests.forEach(System.out::println);
        Iterable<Reservation> reservations = this.reservationRepository.findAll();
        reservations.forEach(System.out::println);
        Date date = dateUtils.createDateFromDateString("2023-06-20");
        List<RoomReservation> reservationList = reservationService.getRoomReservationsForDate(date);
        reservationList.forEach(System.out::println);
    }
}
