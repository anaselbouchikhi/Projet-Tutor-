package esisa.parking.com.parking.reposistories;



import org.springframework.data.jpa.repository.Query;
import org.springframework.data.mongodb.repository.MongoRepository;

import esisa.parking.com.parking.entities.Voiture;

public interface ItemRepository  extends MongoRepository<Voiture, String> {
    
        @Query("{matricule:'?0'}")
        Voiture findVoitureByMatricule(String matricule);
        
    
    }
    

