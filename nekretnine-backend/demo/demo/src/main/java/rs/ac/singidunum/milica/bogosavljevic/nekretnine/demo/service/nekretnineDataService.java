package rs.ac.singidunum.milica.bogosavljevic.nekretnine.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rs.ac.singidunum.milica.bogosavljevic.nekretnine.demo.dao.korisnikdao;
import rs.ac.singidunum.milica.bogosavljevic.nekretnine.demo.dao.nekretninadao;
import rs.ac.singidunum.milica.bogosavljevic.nekretnine.demo.model.korisnik;
import rs.ac.singidunum.milica.bogosavljevic.nekretnine.demo.model.nekretnine;

import java.util.List;
import java.util.Optional;

@Service
public class nekretnineDataService implements INekretninaService {
    @Autowired
    private nekretninadao nd;
    @Autowired
    private korisnikdao kd;
    @Override
    public nekretnine getRealEstateById(int Id) {
        Optional<nekretnine> optionalRealEstate = nd.findById(Id);
        nekretnine n = null;
        if(optionalRealEstate.isPresent()){
            n = optionalRealEstate.get();
        }else {
            throw new RuntimeException("Nije pronadjena nekretnina: " + Id);
        }
        return n;
    }

    @Override
    public List<nekretnine> getAllRealEstate() {
        return nd.findAll();
    }

    @Override
    public void saveRealEstate(nekretnine nekretnina, int korisnikId) {
        Optional<nekretnine> optionalItem = nd.findById(nekretnina.getId());

        nekretnine n = new nekretnine();
        if(optionalItem.isPresent()){
            n = optionalItem.get();
        }

        n.setCategory(nekretnina.getCategory());
        n.setAdvertType(nekretnina.getAdvertType());
        n.setTitle(nekretnina.getTitle());
        n.setLocation(nekretnina.getLocation());
        n.setDescription(nekretnina.getDescription());
        n.setImagePath(nekretnina.getImagePath());
        n.setRegistered(nekretnina.isRegistered());
        n.setOnALot(nekretnina.isOnALot());
        n.setPermitted(nekretnina.isPermitted());
        n.setCreatedAt(nekretnina.getCreatedAt());
        n.setPrice(nekretnina.getPrice());
        n.setQuadrature(nekretnina.getQuadrature());
        n.setNumOfRooms(nekretnina.getNumOfRooms());
        n.setHeating(nekretnina.isHeating());
        n.setNumOfFloor(nekretnina.getNumOfFloor());
        n.setHasElevator(nekretnina.isHasElevator());
        n.setHasTerrace(nekretnina.isHasTerrace());
        n.setHasParking(nekretnina.isHasParking());
        n.setHasCableTv(nekretnina.isHasCableTv());
        n.setHasInternet(nekretnina.isHasIntercom());
        n.setHasPhone(nekretnina.isHasPhone());
        n.setHasIntercom(nekretnina.isHasIntercom());
//        n.setCreatedBy(n.getCreatedBy());


        if(kd.findById(korisnikId).isPresent()){
            nekretnine finalItem = n;
            kd.findById(korisnikId).map(user ->{
                finalItem.setKorisnik(user);
                return nd.save(finalItem);
            }).orElseThrow(() -> new RuntimeException("User not found for is: " + korisnikId));
        }



        nd.save(n);
    }

    @Override
    public void deleteRealEstate(int Id) {
        nd.deleteById(Id);
    }


//    @Autowired
//    JdbcTemplate jdbcTemplate;
//
//    public List<nekretnine> getRealEstateById(Integer Id) {
//        String query  = "SELECT * from real_estate.real_estate WHERE id = " + Id;
//        List<nekretnine> n = jdbcTemplate.query(query, new nekretnineMapper());
//
//
//        return n;
//    }
//    public List<nekretnine> getRealEstates() {
//        String query  = "SELECT * from real_estate.real_estate ";
//        List<nekretnine> n = jdbcTemplate.query(query, new nekretnineMapper());
//
//
//        return n;
//    }
}
