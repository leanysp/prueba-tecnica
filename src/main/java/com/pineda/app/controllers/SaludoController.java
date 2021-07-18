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
public class SaludoController {
	
	@GetMapping("/{nombre}")
	public ResponseEntity<?> holaMundo(@PathVariable String nombre){
		String saludo = String.format("Hola a todos, mi nombre es %s, bienvenidos!", nombre);
		return ResponseEntity.ok(saludo);
	}

}
