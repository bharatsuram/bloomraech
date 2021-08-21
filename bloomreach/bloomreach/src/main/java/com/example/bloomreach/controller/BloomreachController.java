package com.example.bloomreach.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BloomreachController {

	/**
	 * Calculate period between versions
	 * 
	 * @deprecated This method is no longer acceptable to classifyPerson. Use
	 *             classifyPerson(int, String)instead.
	 */
	@Deprecated
	@GetMapping("/persons/{id}/{gender}")
	public String classifyPerson(@PathVariable int age, @PathVariable boolean gender) {
		// assuming Gender True means MAN and False means FEMALE
		if (gender && age >= 18) {
			return "MAN";
		} else if (gender && age < 18) {
			return "BOY";
		} else if (age >= 18) {
			return "WOMAN";
		} else {
			return "GIRL";
		}
	}

	@GetMapping("/persons/{id}/{gender}")
	public String classifyPerson(@PathVariable int age, @PathVariable String gender) {
		if (gender == "Male" && age >= 18) {
			return "MAN";
		} else if (gender == "Male" && age < 18) {
			return "BOY";
		} else if (gender == "Female" && age >= 18) {
			return "WOMAN";
		} else if (gender == "Female" && age < 18) {
			return "GIRL";
		} else {
			return gender;
		}
	}

}
