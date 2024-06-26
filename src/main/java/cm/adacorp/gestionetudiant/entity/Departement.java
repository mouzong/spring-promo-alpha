package cm.adacorp.gestionetudiant.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Departement {
    @Id
    @GeneratedValue
    UUID codeDepartement;
    String nomDeparement;
    String responsableDepartement;
    int nbreEnseignant;
    int nbreEtudiant;
    int filiere;
    int Telephone;
    String email;

}
