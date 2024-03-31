package at.morkos.springDataJpa_JSF_0030.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import at.morkos.springDataJpa_JSF_0030.model.Entity01;
import at.morkos.springDataJpa_JSF_0030.repository.Entity01Repository;

@Service
@Transactional
public class Entity01Service {
	
	@Autowired
	private Entity01Repository entity01Repository;

	public void delete(Entity01 entity01) {
		entity01Repository.delete(entity01);
	}
	

	public void delete(Long id) {
		entity01Repository.deleteById(id);
	}
	
	public void save(Entity01 entity01)
	{
		entity01Repository.save(entity01);
	}
	
	public List<Entity01> getList(){
		return (List<Entity01>) entity01Repository.findAll();
	}
	
	public Optional<Entity01> getEntity01ById(Long id) {
		return entity01Repository.findById(id);
	}
	public List<Entity01> addRecords(List<Entity01> entities) {
		return (List<Entity01>) entity01Repository.saveAll(entities);
	}


	public Entity01Service() {
	}
	

}
