package rs.ac.singidunum.milica.bogosavljevic.nekretnine.demo.service;

import rs.ac.singidunum.milica.bogosavljevic.nekretnine.demo.model.korisnik;

public interface IKorisnikService {
    korisnik getUserById(int Id);

    void saveUser(korisnik korisnik);

    void deleteUser(int Id);
}
