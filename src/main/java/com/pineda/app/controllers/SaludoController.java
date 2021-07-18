/**
 * 
 */
package com.pineda.app.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author leanys
 *
 */
@RestController
public class SaludoController {
	
	@GetMapping("/")
	public ResponseEntity<?> holaMundo(){
		String saludo = "Hola a todos, bienvenidos";
		return ResponseEntity.ok(saludo);
	}

}
