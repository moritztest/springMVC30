package at.morkos.springDataJpa_JSF_0030.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import at.morkos.springDataJpa_JSF_0030.model.Entity01;
@Repository
public interface Entity01Repository extends CrudRepository<Entity01, Long> {

}
