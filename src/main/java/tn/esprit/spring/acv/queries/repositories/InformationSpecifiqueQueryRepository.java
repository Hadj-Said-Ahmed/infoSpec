package tn.esprit.spring.acv.queries.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import tn.esprit.spring.acv.entities.entitiesQueries.InformationSpecifiqueQuery;

public interface InformationSpecifiqueQueryRepository extends MongoRepository<InformationSpecifiqueQuery, Integer> {
}
