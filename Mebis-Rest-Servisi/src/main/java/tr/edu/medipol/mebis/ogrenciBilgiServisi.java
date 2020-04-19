package tr.edu.medipol.mebis;
import java.util.*;



import org.springframework.web.bind.annotation.*;

 

@RestController
@RequestMapping("/ogrenciler")

public class ogrenciBilgiServisi {

	private static List<String> ogrenciler = new ArrayList<>();
    static {
        
        ogrenciler.add("Simge");
        ogrenciler.add("Halil");
        ogrenciler.add("Kemal");
        ogrenciler.add("Gizem");
        ogrenciler.add("Gamze");
    }
    
    @GetMapping("/tumbilgiler")
    public List<String> ogrenciBilgileri(){
        return ogrenciler;
    }
    @GetMapping("/ogrenciEkleme/{ogrenciAdi}")
    public List<String> ogrenciEkle(@PathVariable String ogrenciAdi){
        ogrenciler.add(ogrenciAdi);
        return ogrenciler;
    }
    @GetMapping("/ogrenciSilme/{ogrenciAdi}")
    public List<String> ogrenciSil(@PathVariable String ogrenciAdi){
        ogrenciler.remove(ogrenciAdi);
        return ogrenciler;
    }
    @GetMapping("/ogrenciGuncelleme")
    public List<String> ogrenciGuncelle(
            @RequestParam String yeniAd,
            @RequestParam String eskiAd){
        ogrenciler.remove(eskiAd);
        ogrenciler.add(yeniAd);
        return ogrenciler;
    }

    @GetMapping("/ogrenciNotEkleme/{ogrenciAdi}/{ogrenciNotu}")
    public List<String> ogrenciNotEkle(@PathVariable String ogrenciAdi,@PathVariable String ogrenciNotu){
            ogrenciler.add(ogrenciAdi);
            ogrenciler.add(ogrenciNotu);
            return ogrenciler;
    }
       @GetMapping("/ogrenciNotGuncelleme")
       public List<String> ogrencinotGuncelle(
               @RequestParam String yeninot,
               @RequestParam String eskinot){
          
           ogrenciler.remove(eskinot);
           ogrenciler.add(yeninot);
           return ogrenciler;
       
}
}