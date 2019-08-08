package com.training.models;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class Doctor {

	private long doctorId;
	private String doctorName;
	private String specialization;
	private long phoneNumber;
	
	@Autowired
	private Address address;
}
