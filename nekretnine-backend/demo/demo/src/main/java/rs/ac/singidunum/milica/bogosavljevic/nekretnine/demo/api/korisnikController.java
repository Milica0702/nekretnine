package rs.ac.singidunum.milica.bogosavljevic.nekretnine.demo.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import rs.ac.singidunum.milica.bogosavljevic.nekretnine.demo.service.korisnikDataService;
import rs.ac.singidunum.milica.bogosavljevic.nekretnine.demo.model.korisnik;

import java.rmi.ServerException;
import java.util.List;

@RestController
public class korisnikController {
    @Autowired
    private korisnikDataService kds;
    @GetMapping("/korisnik/{Id}")
    public korisnik getKorisnikById(@PathVariable(value = "Id") int Id){
        return kds.getUserById(Id);
    }
    @GetMapping("/korisnici")
    public List<korisnik> getAllKorisnici(){
        return kds.getAllKorisnici();
    }
    @PostMapping(
            value = "/korisnik/add",
            consumes = "application/json",
            produces = "application/json"
    )
    public String addUser(@RequestBody korisnik korisnik){
        kds.saveUser(korisnik);
        return "Dodat korisnik";
    }
    @PutMapping("/korisnik/update/{id}")
    public korisnik editUserById(@PathVariable(value = "id") int id, @RequestBody korisnik updatedUser){
        korisnik korisnik = kds.getUserById(id);

        korisnik.setName(updatedUser.getName() != null ? updatedUser.getName() : korisnik.getName());
        korisnik.setSurname(updatedUser.getSurname() != null ? updatedUser.getSurname() : korisnik.getSurname());
        korisnik.setEmail(updatedUser.getEmail() != null ? updatedUser.getEmail() : korisnik.getEmail());
        korisnik.setPassword(updatedUser.getPassword() != null ? updatedUser.getPassword() : korisnik.getPassword());
        korisnik.setAddress(updatedUser.getAddress() != null ? updatedUser.getAddress() : korisnik.getAddress());
        korisnik.setNumber(updatedUser.getNumber() != null ? updatedUser.getNumber() : korisnik.getNumber());

        kds.saveUser(korisnik);

        return kds.getUserById(id);
    }
    @DeleteMapping("/korisnik/obrisi/{id}")
    public String deleteUserById(@PathVariable(value = "id")int id){
        kds.deleteUser(id);
        return "Obrisan korisnik";
    }





//    public korisnikController(korisnikDataService kds) {
//        this.kds = kds;
//    }
//    @GetMapping("/korisnik/{Id}")
//    public List<korisnik> getUserById(@PathVariable Integer Id){
//
//        System.out.print(Id);
//        return kds.getUserById(Id) ;
//    }
//    @GetMapping("/korisnici")
//    public List<korisnik> getUsers(){
//
//
//        return kds.getUsers() ;
//    }
//    @PostMapping(path = "/dodajKorsnika", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
//    public int addUser(@RequestBody korisnik newKorisnik){
//
//
//        if (newKorisnik == null) {
//            System.out.println("Greska");
//        } else {
//            return kds.addUser(newKorisnik.getEmail(),newKorisnik.getPassword(), newKorisnik.getName(), newKorisnik.getSurname(),newKorisnik.getAddress(), newKorisnik.getNumber());
//        }
//
//        return 0;
//    }

}
