package com.comp1;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertTrue;

import javax.persistence.Column;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.comp1.entity.DoctorEntity;
import com.comp1.repo.DoctorRepo;

@SpringBootTest
class Comp1ApplicationTests {

	@Autowired
	private DoctorRepo doctorRepo;

	@Test
	void contextLoad() {

	}

	@Test
	void findByName() {
		DoctorEntity d = new DoctorEntity("Akshay shinde", 23, "Male", "Pharma");
		doctorRepo.save(d);
		
		Boolean actualResult = doctorRepo.findByName("Akshay shinde");
		
	}

}
