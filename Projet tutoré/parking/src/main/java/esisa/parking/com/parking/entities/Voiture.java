package esisa.parking.com.parking.entities;

import javax.persistence.Id;


import org.springframework.stereotype.Repository;

enum TypeCarburant {Diesel, Essence} ; 

@Repository("Voiture")
public class Voiture {
    @Id
    private int id;

    private String cin;
    private String marque;
    private TypeCarburant typeCarburant;






    public int getId() {
        return id;
    }
    
  
    
     public TypeCarburant getTypeCarburant() {
        return typeCarburant;
    }



    public void setTypeCarburant(TypeCarburant typeCarburant) {
        this.typeCarburant = typeCarburant;
    }



    public String getMarque() {
        return marque;
    }
    public void setMarque(String marque) {
        this.marque = marque;
    }
    public String getCin() {
        return cin;
    }
    public void setCin(String cin) {
        this.cin = cin;
    }
    public void setId(int id) {
        this.id = id;
    }

    
}
