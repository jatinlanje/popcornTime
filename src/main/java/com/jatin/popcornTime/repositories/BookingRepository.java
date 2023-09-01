package com.jatin.popcornTime.repositories;

import com.jatin.popcornTime.models.Booking;
import com.jatin.popcornTime.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookingRepository extends JpaRepository<Booking, Long> {
    List<Booking> getBookingsByCustomer(Customer customer);
}
