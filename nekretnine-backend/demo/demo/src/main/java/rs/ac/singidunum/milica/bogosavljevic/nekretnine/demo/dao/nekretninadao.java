package rs.ac.singidunum.milica.bogosavljevic.nekretnine.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import rs.ac.singidunum.milica.bogosavljevic.nekretnine.demo.model.nekretnine;

public interface nekretninadao extends JpaRepository<nekretnine, Integer> {
}
