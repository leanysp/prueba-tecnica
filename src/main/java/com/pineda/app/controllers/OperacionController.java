/**
 * 
 */
package com.pineda.app.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author leanys
 *
 */
@RestController
public class OperacionController {
	
	@GetMapping("/sumar/{num1}/{num2}")
	public ResponseEntity<?> sumar(@PathVariable Integer num1, @PathVariable Integer num2){
		String respuesta= String.format("la suma de %s + %s = %s ", num1, num2,(num1+num2));
		return ResponseEntity.ok(respuesta);
	}

}
