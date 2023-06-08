package tn.esprit.spring.acv.dto;

import lombok.Getter;
import lombok.Setter;
import tn.esprit.spring.acv.enumeration.Facteur_emission;
import tn.esprit.spring.acv.enumeration.Type_processus;

import java.util.Date;
@Getter
@Setter
public class InformationSpecifiqueDto {
    private int id;
    private int visibilite;
    private String auteur;
    private String sourceDonnees;
    private Date date_creation = new Date();;
    private Date date_modification = new Date();
    private Type_processus typeProcessus;
    private Facteur_emission facteurEmission;
}
