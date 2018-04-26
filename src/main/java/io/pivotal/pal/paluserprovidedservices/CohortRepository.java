package io.pivotal.pal.paluserprovidedservices;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;

@Repository
public interface CohortRepository extends CrudRepository<Cohort, Long>{


    public List<Cohort> findAll();

    public Cohort findById(Long id);

    public Cohort save(Cohort cohort);

}
