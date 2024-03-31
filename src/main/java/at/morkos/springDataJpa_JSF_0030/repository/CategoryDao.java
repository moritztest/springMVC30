package at.morkos.springDataJpa_JSF_0030.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import at.morkos.springDataJpa_JSF_0030.model.Category;


public interface CategoryDao extends JpaRepository<Category, Integer> {

}