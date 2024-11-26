package com.StudentLibrary.Studentlibrary.Repositories;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.StudentLibrary.Studentlibrary.Model.Reservation;
import com.StudentLibrary.Studentlibrary.Model.ReservationStatus;
@Transactional
public interface ReservationRepository extends JpaRepository<Reservation,Integer> {
	List<Reservation> findByBook_IdAndStatus(int bookId,ReservationStatus status);

}
