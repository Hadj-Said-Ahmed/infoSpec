package tn.esprit.spring.acv.queries.services;

import tn.esprit.spring.acv.entities.entitiesQueries.InformationSpecifiqueQuery;

import java.util.List;

public interface IInformationSpecifiqueQueryService {
    List<InformationSpecifiqueQuery> listerInformationsSpec();
}
