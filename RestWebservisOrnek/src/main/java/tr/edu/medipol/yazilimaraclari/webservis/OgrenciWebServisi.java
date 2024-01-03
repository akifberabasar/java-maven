package tr.edu.medipol.yazilimaraclari.webservis;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/ogrenci")
public class OgrenciWebServisi {
	
	public record Ogrenci(String adSoyad, String numara) {};
	
	private static final List<Ogrenci> OGRENCİ_LISTESI= new ArrayList<>();
	static {
		OGRENCİ_LISTESI.add(new Ogrenci("Ali Veli","1"));
		OGRENCİ_LISTESI.add(new Ogrenci("Ayşe Fatma","2"));
		OGRENCİ_LISTESI.add(new Ogrenci("Mehmet Emin","3"));
	}
	
	@GetMapping("/")
	public List<Ogrenci> listele(){
		return OGRENCİ_LISTESI;
	}

}
