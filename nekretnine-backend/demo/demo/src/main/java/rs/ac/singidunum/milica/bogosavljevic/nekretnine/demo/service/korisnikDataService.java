package rs.ac.singidunum.milica.bogosavljevic.nekretnine.demo.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import rs.ac.singidunum.milica.bogosavljevic.nekretnine.demo.dao.korisnikdao;
import rs.ac.singidunum.milica.bogosavljevic.nekretnine.demo.model.korisnik;

import java.util.List;
import java.util.Optional;

@Service
public class korisnikDataService implements IKorisnikService   {
    @Autowired
    private korisnikdao kd;
    @Override
    public korisnik getUserById(int Id) {
        Optional<korisnik> optionalUser = kd.findById(Id);
        korisnik korisnik = null;
        if (optionalUser.isPresent()) {
            korisnik = optionalUser.get();
        } else {
            throw new RuntimeException("User not found for id: " + Id);
        }
        return korisnik;
    }
    public List<korisnik> getAllKorisnici(){
        return kd.findAll();
    }

    @Override
    public void saveUser(korisnik korisnik) {
        Optional<korisnik>  ok = kd.findById(korisnik.getId());
        korisnik k = new korisnik();
        if (ok.isPresent() ) {
            k = ok.get();
        }
        k.setName(korisnik.getName());
        k.setSurname(korisnik.getSurname());
        k.setAddress(korisnik.getAddress());
        k.setEmail(korisnik.getEmail());
        k.setNumber(korisnik.getNumber());
        k.setPassword(korisnik.getPassword());

        kd.save(k);

    }

    @Override
    public void deleteUser(int Id) {
        kd.deleteById(Id);

    }

//    @Autowired
//    DataSource dataSource ;
//
//    @Autowired
//    JdbcTemplate jdbcTemplate;
//
//
//
//    public int addUser(String email, String password, String name, String surname, String address, String number) {
//        String query  = "INSERT INTO user (email,`password`,`name`, surname, address,number)"+
//                "VALUES ("+", "+", "+","+", "+", "+"); ";
//
//        int k = jdbcTemplate.update(query);
//
//
//        return k;
//    }
//
//
//    public korisnik updateUser(int Id) {
//        return null;
//    }
//
//
//    public void deleteUser(int Id) {
//
//    }
//
//
//    public List<korisnik> getUserById(Integer Id) {
//        String query  = "SELECT * from real_estate.user WHERE id = " + Id;
//        List<korisnik> k = jdbcTemplate.query(query, new korisnikMapper());
//
//
//        return k;
//    }
//    public List<korisnik> getUsers() {
//        String query  = "SELECT * from real_estate.user ";
//        List<korisnik> k = jdbcTemplate.query(query, new korisnikMapper());
//
//
//        return k;
//    }




}
