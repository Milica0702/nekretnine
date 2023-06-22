package rs.ac.singidunum.milica.bogosavljevic.nekretnine.demo.api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rs.ac.singidunum.milica.bogosavljevic.nekretnine.demo.model.korisnik;
import rs.ac.singidunum.milica.bogosavljevic.nekretnine.demo.model.nekretnine;
import rs.ac.singidunum.milica.bogosavljevic.nekretnine.demo.service.korisnikDataService;
import rs.ac.singidunum.milica.bogosavljevic.nekretnine.demo.service.nekretnineDataService;

import java.util.List;

@RestController
public class nekretnineKontroler {
    @Autowired
    private nekretnineDataService nds;
    @Autowired
    private korisnikDataService kds;
    @GetMapping("/nekretnina/{Id}")
    public nekretnine getRealEstateById(@PathVariable int Id){
        return nds.getRealEstateById(Id) ;
    }
    @GetMapping("/nekretnine")
    public List<nekretnine> getRealEstates(){


        return nds.getAllRealEstate() ;
    }
    @PostMapping(
            value = "/nekretnine/add/korisnik/{id}",
            consumes = "application/json",
            produces = "application/json"
    )
    public nekretnine addRealEstate(@RequestBody nekretnine updatedNekretnine,@PathVariable(value = "id") int id){
        nekretnine nekretnine = new nekretnine();
        nekretnine.setCategory(updatedNekretnine.getCategory() );
        nekretnine.setAdvertType(updatedNekretnine.getAdvertType());
        nekretnine.setTitle(updatedNekretnine.getTitle());
        nekretnine.setLocation(updatedNekretnine.getLocation() );
        nekretnine.setDescription(updatedNekretnine.getDescription() );
        nekretnine.setImagePath(updatedNekretnine.getImagePath() );
        nekretnine.setRegistered(updatedNekretnine.isRegistered() );
        nekretnine.setPermitted(updatedNekretnine.isPermitted()  );
        nekretnine.setCreatedAt(updatedNekretnine.getCreatedAt() );
        nekretnine.setPrice(updatedNekretnine.getPrice() );
        nekretnine.setQuadrature(updatedNekretnine.getQuadrature() );
        nekretnine.setNumOfRooms(updatedNekretnine.getNumOfRooms() );
        nekretnine.setHeating(updatedNekretnine.isHeating() );
        nekretnine.setNumOfFloor(updatedNekretnine.getNumOfFloor()  );
        nekretnine.setHasElevator(updatedNekretnine.isHasElevator() );
        nekretnine.setHasTerrace(updatedNekretnine.isHasTerrace() );
        nekretnine.setHasParking(updatedNekretnine.isHasParking() );
        nekretnine.setHasCableTv(updatedNekretnine.isHasCableTv() );
        nekretnine.setHasInternet(updatedNekretnine.isHasInternet() );
        nekretnine.setHasPhone(updatedNekretnine.isHasPhone() );
        nekretnine.setHasIntercom(updatedNekretnine.isHasIntercom() );
        nekretnine.setKorisnik(kds.getUserById(id));
        nds.saveRealEstate(nekretnine, id);
        return nekretnine;
    }
    @PutMapping("/nekretnina/update/{id}")
    public nekretnine editRealEstateById(@PathVariable(value = "id") int id, @RequestBody nekretnine updatedNekretnine){
        nekretnine nekretnine = nds.getRealEstateById(id);

        nekretnine.setCategory(updatedNekretnine.getCategory() != null ? updatedNekretnine.getCategory() : nekretnine.getCategory());
        nekretnine.setAdvertType(updatedNekretnine.getAdvertType() != null ? updatedNekretnine.getAdvertType() : nekretnine.getAdvertType());
        nekretnine.setTitle(updatedNekretnine.getTitle()!= null ? updatedNekretnine.getTitle() : nekretnine.getTitle());
        nekretnine.setLocation(updatedNekretnine.getLocation() != null ? updatedNekretnine.getLocation() : nekretnine.getLocation());
        nekretnine.setDescription(updatedNekretnine.getDescription() != null ? updatedNekretnine.getDescription() : nekretnine.getDescription());
        nekretnine.setImagePath(updatedNekretnine.getImagePath() != null ? updatedNekretnine.getImagePath() : nekretnine.getImagePath());
        nekretnine.setRegistered(updatedNekretnine.isRegistered() != nekretnine.isRegistered() ? updatedNekretnine.isRegistered() : nekretnine.isRegistered());
        nekretnine.setPermitted(updatedNekretnine.isPermitted() != nekretnine.isPermitted() ? updatedNekretnine.isPermitted()  : nekretnine.isPermitted()  );
        nekretnine.setCreatedAt(updatedNekretnine.getCreatedAt() != null ? updatedNekretnine.getCreatedAt() : nekretnine.getCreatedAt());
        nekretnine.setPrice(updatedNekretnine.getPrice() != nekretnine.getPrice() ? updatedNekretnine.getPrice() : nekretnine.getPrice());
        nekretnine.setQuadrature(updatedNekretnine.getQuadrature() != nekretnine.getQuadrature() ? updatedNekretnine.getQuadrature() : nekretnine.getQuadrature());
        nekretnine.setNumOfRooms(updatedNekretnine.getNumOfRooms() != nekretnine.getNumOfRooms() ? updatedNekretnine.getNumOfRooms() : nekretnine.getNumOfRooms());
        nekretnine.setHeating(updatedNekretnine.isHeating() != nekretnine.isHeating() ? updatedNekretnine.isHeating() : nekretnine.isHeating());
        nekretnine.setNumOfFloor(updatedNekretnine.getNumOfFloor() != nekretnine.getNumOfFloor() ? updatedNekretnine.getNumOfFloor()  : nekretnine.getNumOfFloor() );
        nekretnine.setHasElevator(updatedNekretnine.isHasElevator() != nekretnine.isHasElevator() ? updatedNekretnine.isHasElevator() : nekretnine.isHasElevator());
        nekretnine.setHasTerrace(updatedNekretnine.isHasTerrace() != nekretnine.isHasTerrace() ? updatedNekretnine.isHasTerrace() : nekretnine.isHasTerrace());
        nekretnine.setHasParking(updatedNekretnine.isHasParking() != nekretnine.isHasParking() ? updatedNekretnine.isHasParking() : nekretnine.isHasParking());
        nekretnine.setHasCableTv(updatedNekretnine.isHasCableTv() != nekretnine.isHasCableTv() ? updatedNekretnine.isHasCableTv(): nekretnine.isHasCableTv());
        nekretnine.setHasInternet(updatedNekretnine.isHasInternet() != nekretnine.isHasInternet() ? updatedNekretnine.isHasInternet() : nekretnine.isHasInternet());
        nekretnine.setHasPhone(updatedNekretnine.isHasPhone() != nekretnine.isHasPhone() ? updatedNekretnine.isHasPhone() : nekretnine.isHasPhone());
        nekretnine.setHasIntercom(updatedNekretnine.isHasIntercom() != nekretnine.isHasIntercom() ? updatedNekretnine.isHasIntercom() : nekretnine.isHasIntercom());
//        nekretnine.setCreatedBy(updatedNekretnine.getCreatedBy() != nekretnine.getCreatedBy() ? updatedNekretnine.getCreatedBy() : nekretnine.getCreatedBy());




        nds.saveRealEstate(nekretnine, 0);

        return nds.getRealEstateById(id);
    }
    @DeleteMapping("/nekretnine/obrisi/{id}")
    public String deleteRealEstateById(@PathVariable(value = "id")int id){
        nds.deleteRealEstate(id);
        return "Obrisana nekretnina";
    }
}



