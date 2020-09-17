package net.bridge.spring.controller;

import java.util.List;
import net.bridge.spring.controller.FatorialCalculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import net.bridge.spring.model.Fatorial;
import net.bridge.spring.repository.FatorialRepository;

//@CrossOrigin(origins="http://localhost:3000/")
@RestController
@RequestMapping("/api")
public class FatorialController {
	FatorialCalculator fc = new FatorialCalculator();
	private final FatorialRepository repository;
	


	FatorialController(FatorialRepository repository) {
		    this.repository = repository;
		  }
	@Autowired
	private FatorialRepository fatorialRepository;
	
	@GetMapping("/fatorials")
	public List<Fatorial> getFatorials(){
		return this.fatorialRepository.findAll();		
	}
	//@RequestBody  @RequestBody(required = false)
	@PostMapping("/fatorials")
	//@ResponseBody	
	public Fatorial createFatorial(@RequestBody  Fatorial fatorial) {
		int number = Integer.parseInt(fatorial.getNumber());
		  fatorial = fc.calcFatorial(number);
		//System.out.println(fatorial.getFatorial());
		return this.fatorialRepository.save(fatorial);
	}

}
