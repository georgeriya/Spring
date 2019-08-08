package com.training.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class Address {

	private String addressLine1;
	private String city;
	private long pinCode;
}
