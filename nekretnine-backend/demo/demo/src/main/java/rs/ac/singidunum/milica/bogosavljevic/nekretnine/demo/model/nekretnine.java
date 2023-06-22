package rs.ac.singidunum.milica.bogosavljevic.nekretnine.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "real_estate")
public class nekretnine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "category")
    private String category;
    @Column(name = "advertType")
    private String advertType;
    @Column(name = "title")
    private String title;
    @Column(name = "location")
    private String location;
    @Column(name = "description")
    private String description;
    @Column(name = "imagePath")
    private String imagePath;
    @Column(name = "isRegistered")
    private boolean isRegistered;
    @Column(name = "is_on_a_lot")
    private boolean isOnALot;
    @Column(name = "isPermitted")
    private boolean isPermitted;
    @Column(name = "createdAt")
    private String createdAt;
    @Column(name = "price")
    private float price;
    @Column(name = "quadrature")
    private float quadrature;
    @Column(name = "numOfRooms")
    private int numOfRooms;
    @Column(name = "heating")
    private boolean heating;

    @Column(name = "numOfFloor")
    private int numOfFloor;

    @Column(name = "hasElevator")
    private boolean hasElevator;
    @Column(name = "hasTerrace")
    private boolean hasTerrace;
    @Column(name = "hasParking")
    private boolean hasParking;
    @Column(name = "hasCableTv")
    private boolean hasCableTv;
    @Column(name = "hasInternet")
    private boolean hasInternet;
    @Column(name = "hasPhone")
    private boolean hasPhone;
    @Column(name = "hasIntercom")
    private boolean hasIntercom;
//    @Column(name = "createdBy")
//    private int createdBy;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "created_by")
    @JsonIgnore
    private korisnik korisnik;

    public nekretnine(int id, String category, String advertType, String title, String location, String description, String imagePath, boolean isRegistered, boolean isOnALot, boolean isPermitted, String createdAt, float price, float quadrature, int numOfRooms, boolean heating, int numOfFloor, boolean hasElevator, boolean hasTerrace, boolean hasParking, boolean hasCableTv, boolean hasInternet, boolean hasPhone, boolean hasIntercom, korisnik korisnik) {
        this.id = id;
        this.category = category;
        this.advertType = advertType;
        this.title = title;
        this.location = location;
        this.description = description;
        this.imagePath = imagePath;
        this.isRegistered = isRegistered;
        this.isOnALot = isOnALot;
        this.isPermitted = isPermitted;
        this.createdAt = createdAt;
        this.price = price;
        this.quadrature = quadrature;
        this.numOfRooms = numOfRooms;
        this.heating = heating;
        this.numOfFloor = numOfFloor;
        this.hasElevator = hasElevator;
        this.hasTerrace = hasTerrace;
        this.hasParking = hasParking;
        this.hasCableTv = hasCableTv;
        this.hasInternet = hasInternet;
        this.hasPhone = hasPhone;
        this.hasIntercom = hasIntercom;
        this.korisnik = korisnik;


    }

    public nekretnine() {
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getAdvertType() {
        return advertType;
    }

    public void setAdvertType(String advertType) {
        this.advertType = advertType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public boolean isRegistered() {
        return isRegistered;
    }

    public void setRegistered(boolean registered) {
        isRegistered = registered;
    }

    public boolean isOnALot() {
        return isOnALot;
    }

    public void setOnALot(boolean onALot) {
        isOnALot = onALot;
    }

    public boolean isPermitted() {
        return isPermitted;
    }

    public void setPermitted(boolean permitted) {
        isPermitted = permitted;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getQuadrature() {
        return quadrature;
    }

    public void setQuadrature(float quadrature) {
        this.quadrature = quadrature;
    }

    public int getNumOfRooms() {
        return numOfRooms;
    }

    public void setNumOfRooms(int numOfRooms) {
        this.numOfRooms = numOfRooms;
    }

    public boolean isHeating() {
        return heating;
    }

    public void setHeating(boolean heating) {
        this.heating = heating;
    }

    public int getNumOfFloor() {
        return numOfFloor;
    }

    public void setNumOfFloor(int numOfFloor) {
        this.numOfFloor = numOfFloor;
    }

    public boolean isHasElevator() {
        return hasElevator;
    }

    public void setHasElevator(boolean hasElevator) {
        this.hasElevator = hasElevator;
    }

    public boolean isHasTerrace() {
        return hasTerrace;
    }

    public void setHasTerrace(boolean hasTerrace) {
        this.hasTerrace = hasTerrace;
    }

    public boolean isHasParking() {
        return hasParking;
    }

    public void setHasParking(boolean hasParking) {
        this.hasParking = hasParking;
    }

    public boolean isHasCableTv() {
        return hasCableTv;
    }

    public void setHasCableTv(boolean hasCableTv) {
        this.hasCableTv = hasCableTv;
    }

    public boolean isHasInternet() {
        return hasInternet;
    }

    public void setHasInternet(boolean hasInternet) {
        this.hasInternet = hasInternet;
    }

    public boolean isHasPhone() {
        return hasPhone;
    }

    public void setHasPhone(boolean hasPhone) {
        this.hasPhone = hasPhone;
    }

    public boolean isHasIntercom() {
        return hasIntercom;
    }

    public void setHasIntercom(boolean hasIntercom) {
        this.hasIntercom = hasIntercom;
    }

    public rs.ac.singidunum.milica.bogosavljevic.nekretnine.demo.model.korisnik getKorisnik() {
        return korisnik;
    }

    public void setKorisnik(rs.ac.singidunum.milica.bogosavljevic.nekretnine.demo.model.korisnik korisnik) {
        this.korisnik = korisnik;
    }

    //    public int getCreatedBy() {
//        return createdBy;
//    }
//
//    public void setCreatedBy(int createdBy) {
//        this.createdBy = createdBy;
//    }
}
