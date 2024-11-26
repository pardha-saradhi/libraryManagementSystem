package com.StudentLibrary.Studentlibrary.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.StudentLibrary.Studentlibrary.Services.ReservationService;

@RestController
@RequestMapping("/reservation")
public class ReservationController {
	
	@Autowired
	private ReservationService reservationService;
	
	@PostMapping("/reserveBook")
	public ResponseEntity<String> reserveBook(@RequestParam int studentId ,@RequestParam int bookId){
		 try {
	            String response = reservationService.reserveBook(studentId, bookId);
	            return new ResponseEntity<>(response, HttpStatus.OK);
	        } catch (Exception e) {
	            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
	        }
	}

}
