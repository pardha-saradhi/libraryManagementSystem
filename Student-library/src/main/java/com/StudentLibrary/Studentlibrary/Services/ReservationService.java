package com.StudentLibrary.Studentlibrary.Services;

import java.sql.Date;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.StudentLibrary.Studentlibrary.Model.Book;
import com.StudentLibrary.Studentlibrary.Model.Reservation;
import com.StudentLibrary.Studentlibrary.Model.ReservationStatus;
import com.StudentLibrary.Studentlibrary.Model.Student;
import com.StudentLibrary.Studentlibrary.Repositories.BookRepository;
import com.StudentLibrary.Studentlibrary.Repositories.ReservationRepository;
import com.StudentLibrary.Studentlibrary.Repositories.StudentRepository;

@Service
public class ReservationService {
	@Autowired
	private BookRepository bookRepository;
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private ReservationRepository reservationRepository;
	
	
	public String reserveBook(int studentId, int bookId) throws Exception{
		Book book=bookRepository.findById(bookId).orElseThrow(()-> new RuntimeException("Book not found"));
		if(book.isAvailable()) {
			throw new Exception("Book is currently available , no need to reserve.");
			
		}
		Student student =studentRepository.findById(studentId).orElseThrow(()->new RuntimeException("Student not found"));
		Reservation reservation=new Reservation();
		 reservation.setBook(book);
	        reservation.setStudent(student);
	        reservation.setStatus(ReservationStatus.PENDING);
	        reservationRepository.save(reservation);
	        return "Book reserved successfully.";
		
	}

}
