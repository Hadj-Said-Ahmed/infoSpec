package tn.esprit.spring.acv.entities.entitiesQueries;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import tn.esprit.spring.acv.enumeration.Facteur_emission;
import tn.esprit.spring.acv.enumeration.Type_processus;

import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection = "informationspecifique")
public class InformationSpecifiqueQuery {
    @Id
    private int id;
    private int visibilite;
    private String auteur;
    private String sourceDonnees;
    private Date date_creation;
    private Date date_modification;
    private Type_processus typeProcessus;
    private Facteur_emission facteurEmission;
}
