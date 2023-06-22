package rs.ac.singidunum.milica.bogosavljevic.nekretnine.demo.service;

import rs.ac.singidunum.milica.bogosavljevic.nekretnine.demo.model.nekretnine;

import java.util.List;

public interface INekretninaService {
    nekretnine getRealEstateById(int Id);

    List<nekretnine> getAllRealEstate();

    void saveRealEstate(nekretnine nekretnina, int korisnikId);

    void deleteRealEstate(int Id);
}


