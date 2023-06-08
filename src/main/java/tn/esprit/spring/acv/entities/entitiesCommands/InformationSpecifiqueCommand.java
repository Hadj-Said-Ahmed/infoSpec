package tn.esprit.spring.acv.entities.entitiesCommands;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.istack.NotNull;
import lombok.*;
import lombok.experimental.PackagePrivate;
import tn.esprit.spring.acv.enumeration.Facteur_emission;
import tn.esprit.spring.acv.enumeration.Type_processus;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Builder
@Table(name = "informationspecifique")
public class InformationSpecifiqueCommand {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int visibilite;
    @NotNull
    private String auteur;
    @NotNull
    private String sourceDonnees;
    @Temporal(TemporalType.DATE)
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date date_creation;
    @Temporal(TemporalType.DATE)
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date date_modification;
    @NotNull
    private Type_processus typeProcessus;
    @NotNull
    private Facteur_emission facteurEmission;


}
