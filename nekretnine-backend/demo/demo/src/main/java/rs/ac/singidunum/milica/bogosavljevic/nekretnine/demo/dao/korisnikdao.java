package rs.ac.singidunum.milica.bogosavljevic.nekretnine.demo.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rs.ac.singidunum.milica.bogosavljevic.nekretnine.demo.model.korisnik;



@Repository
public interface korisnikdao extends JpaRepository<korisnik, Integer> {

}
