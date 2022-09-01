package com.example.primerservicio.controller;



import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.primerservicio.dto.Persona;

@RestController
@RequestMapping(value="/hello")
public class ServicioRestController {
	
	@GetMapping   (value="")
	ResponseEntity<?>  gethello(){
		
		 List<Persona> myList = new ArrayList<Persona>();
		Persona persona= new Persona();
		persona.setIdentificacion(80144005);
		persona.setNombre("Oscar");
		persona.setTelefono(5904848);
		persona.setDireccion("cra 80");
		persona.setCorreo("jf@hkl");
		
		Persona persona1= new Persona();
		persona1.setIdentificacion(9544005);
		persona1.setNombre("Javier");
		persona1.setTelefono(5804848);
		persona1.setDireccion("cra 90");
		persona1.setCorreo("zz@hkl");
		
		Persona persona2= new Persona();
		persona2.setIdentificacion(4244005);
		persona2.setNombre("Pedro");
		persona2.setTelefono(8888848);
		persona2.setDireccion("cra 444");
		persona2.setCorreo("aa@hkl");
		
		
		
		
		 myList.add(persona );
		 myList.add(persona1 );
		 myList.add(persona2 );
		 
		
		 
		
				return ResponseEntity.ok(myList);
		
	}

	@GetMapping   (value="/identificacion/{idenficacion}")
	ResponseEntity<?>  getIdenficacion(@PathVariable int idenficacion){
		
		
		 
		
		 List<Persona> myList = new ArrayList<Persona>();
		 
		Persona persona= new Persona();
		persona.setIdentificacion(80144005);
		persona.setNombre("Oscar"); 
		persona.setTelefono(5904848);
		persona.setDireccion("cra 80");
		persona.setCorreo("jf@hkl");
		
		Persona persona1= new Persona();
		persona1.setIdentificacion(9544005);
		persona1.setNombre("Javier");
		persona1.setTelefono(5804848);
		persona1.setDireccion("cra 90");
		persona1.setCorreo("zz@hkl");
		
		Persona persona2= new Persona();
		persona2.setIdentificacion(4244005);
		persona2.setNombre("Pedro");
		persona2.setTelefono(8888848);
		persona2.setDireccion("cra 444");
		persona2.setCorreo("aa@hkl");
		
		Persona response= new Persona();
		
		 myList.add(persona );
		 myList.add(persona1 );
		 myList.add(persona2 );
		 
			for (int i=0;i< myList.size();i++) {
				response= myList.get(i);

				if( idenficacion==response.getIdentificacion() )
					
					return ResponseEntity.ok(response);
				
			
				
				response= myList.get(i);
				 
			}

		 
		
		 
		
				return ResponseEntity.ok(myList);

	}
	
	
	@PostMapping   (value="/crearCliente")
	ResponseEntity<?>  postRegistro(@RequestBody Persona personaRequest){
		
		
		 
		
		 List<Persona> myList = new ArrayList<Persona>();
		Persona persona= new Persona();
		persona.setIdentificacion(80144005);
		persona.setNombre("Oscar"); 
		persona.setTelefono(5904848);
		persona.setDireccion("cra 80");
		persona.setCorreo("jf@hkl");
		
		Persona persona1= new Persona();
		persona1.setIdentificacion(9544005);
		persona1.setNombre("Javier");
		persona1.setTelefono(5804848);
		persona1.setDireccion("cra 90");
		persona1.setCorreo("zz@hkl");
		
		Persona persona2= new Persona();
		persona2.setIdentificacion(4244005);
		persona2.setNombre("Pedro");
		persona2.setTelefono(8888848);
		persona2.setDireccion("cra 444");
		persona2.setCorreo("aa@hkl");
		
		Persona response= new Persona();
		
		 myList.add(persona );
		 myList.add(persona1 );
		 myList.add(persona2 );
		 myList.add(personaRequest);
		 


		 

		return ResponseEntity.ok(myList);

}


	@PutMapping   (value="/ActualizarCliente")
	ResponseEntity<?>  putRegistro(@RequestBody Persona personaRequest){
		
		
		 
		
		 List<Persona> myList = new ArrayList<Persona>();
		Persona persona= new Persona();
		persona.setIdentificacion(80144005);
		persona.setNombre("Oscar"); 
		persona.setTelefono(5904848);
		persona.setDireccion("cra 80");
		persona.setCorreo("jf@hkl");
		
		Persona persona1= new Persona();
		persona1.setIdentificacion(9544005);
		persona1.setNombre("Javier");
		persona1.setTelefono(5804848);
		persona1.setDireccion("cra 90");
		persona1.setCorreo("zz@hkl");
		
		Persona persona2= new Persona();
		persona2.setIdentificacion(4244005);
		persona2.setNombre("Pedro");
		persona2.setTelefono(8888848);
		persona2.setDireccion("cra 444");
		persona2.setCorreo("aa@hkl");
		
		Persona response= new Persona();
		
		 myList.add(persona );
		 myList.add(persona1 );
		 myList.add(persona2 );
		 
		 

			for (int i=0;i< myList.size();i++) {
				response= myList.get(i);

				if( personaRequest.getIdentificacion()==response.getIdentificacion() ) {
					response= myList.get(i);
																				
				myList.set(i,personaRequest);
				return ResponseEntity.ok(myList);

				}
				 
			}

			return ResponseEntity.ok(myList);

		
}




@DeleteMapping   (value="/ActualizarCliente/{idenficacion}/{nombre}")
ResponseEntity<?>  deleteRegistro(@RequestBody Persona personaRequest, @PathVariable int idenficacion, @PathVariable String nombre)

//ResponseEntity<?>  deleteIdenficacion(@PathVariable int idenficacion)
{
	
	
	 
	
	 List<Persona> myList = new ArrayList<Persona>();
	Persona persona= new Persona();
	persona.setIdentificacion(80144005);
	persona.setNombre("Oscar"); 
	persona.setTelefono(5904848);
	persona.setDireccion("cra 80");
	persona.setCorreo("jf@hkl");
	
	Persona persona1= new Persona();
	persona1.setIdentificacion(9544005);
	persona1.setNombre("Javier");
	persona1.setTelefono(5804848);
	persona1.setDireccion("cra 90");
	persona1.setCorreo("zz@hkl");
	
	Persona persona2= new Persona();
	persona2.setIdentificacion(4244005);
	persona2.setNombre("Pedro");
	persona2.setTelefono(8888848);
	persona2.setDireccion("cra 444");
	persona2.setCorreo("aa@hkl");
	
	Persona response= new Persona();
	
	 myList.add(persona );
	 myList.add(persona1 );
	 myList.add(persona2 );
	 
	 

		for (int i=0;i< myList.size();i++) {
			response= myList.get(i);

			if( (personaRequest.getIdentificacion()==response.getIdentificacion()) && idenficacion==response.getIdentificacion() 
					&& (nombre==response.getNombre())) {
				response= myList.get(i);
			
				myList.remove(i);
			
			return ResponseEntity.ok(myList);

			}
			 
		}

		return ResponseEntity.ok(myList);

	
}

	
}

