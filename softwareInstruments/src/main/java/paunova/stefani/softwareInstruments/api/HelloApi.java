package paunova.stefani.softwareInstruments.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloApi {
	
	@GetMapping
	public String getHello() {
		return "Hello all!";
	}

}
