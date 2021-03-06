package com.example.bookinghotel.models.entities;

import com.example.bookinghotel.models.entities.enumentities.StatusOfBook;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Table(name = "booking")
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "hotel_id")
    Hotel hotel;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "room_id")
    Room room;
    LocalDate checkInDate;
    LocalDate checkOutDate;
    @ManyToOne
    @JoinColumn(name = "guest_id")
    User user;
    String comment;
//    @ManyToOne
//    @JoinColumn(name = "status_of_book")
//    StatusOfBook statusOfBook;
    boolean active;
    float priceOfBook;

}
