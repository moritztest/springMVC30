package at.morkos.springDataJpa_JSF_0030.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import at.morkos.springDataJpa_JSF_0030.repository.CategoryDao;
import at.morkos.springDataJpa_JSF_0030.model.Category;



@Service
@Transactional
public class CategoryService {

	@Autowired
	private CategoryDao categoryDao;

	public void delete(Category category) {
		categoryDao.delete(category);
	}
	

	public void delete(int id) {
		categoryDao.deleteById(id);
	}
	
	public void save(Category category)
	{
		categoryDao.save(category);
	}
	
	public List<Category> getList(){
		return categoryDao.findAll();
	}
	
	public Category getCategoryById(int id) {
		return categoryDao.getOne(id);
	}
}

