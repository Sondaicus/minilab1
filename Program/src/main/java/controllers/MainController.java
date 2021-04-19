package controllers;



import models.Kompis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import repositories.KompisRepository;



@Controller
@RequestMapping(path="/")
public class MainController
{
	@Autowired
	private KompisRepository kompisRepository;
	
	
	
	@GetMapping(path="/add")
	public @ResponseBody String addNewKompis(@RequestParam String name, @RequestParam String email, @RequestParam Long telephoneNumber)
	{
		Kompis
		buddy;
		
		
		
		buddy = new Kompis();
		buddy.setName(name);
		buddy.setEmail(email);
		buddy.setTelephoneNumber(telephoneNumber);
		kompisRepository.save(buddy);
		
		return "Saved";
		
	}
	
	@PostMapping(path="/addByPost")
	public @ResponseBody String addNewKompisByPost(@RequestParam String name, @RequestParam String email, @RequestParam Long telephoneNumber)
	{
		Kompis
		buddy;
		
		
		
		buddy = new Kompis();
		buddy.setName(name);
		buddy.setEmail(email);
		buddy.setTelephoneNumber(telephoneNumber);
		kompisRepository.save(buddy);
		
		return "Saved";
		
	}
	
	
	
	@GetMapping(path="/all")
	public @ResponseBody Iterable<Kompis> getAllKompisar()
	{
		return kompisRepository.findAll();
	}

}