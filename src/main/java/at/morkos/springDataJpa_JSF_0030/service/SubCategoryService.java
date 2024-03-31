package at.morkos.springDataJpa_JSF_0030.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import at.morkos.springDataJpa_JSF_0030.repository.SubCategoryDao;
import at.morkos.springDataJpa_JSF_0030.model.SubCategory;


@Service
@Transactional
public class SubCategoryService {

	@Autowired
	private SubCategoryDao subCategoryDao;

	public void delete(SubCategory subCategory) {
		subCategoryDao.delete(subCategory);
	}

	public void delete(int id) {
		subCategoryDao.deleteById(id);
	}

	public void save(SubCategory subCategory) {
		subCategoryDao.save(subCategory);
	}

	public List<SubCategory> getList() {
		return subCategoryDao.findAll();
	}

	public SubCategory getSubCategoryById(int id) {
		return subCategoryDao.getOne(id);
	}
	
	public List<SubCategory> getListByMainCategoryId(int id){
		return subCategoryDao.getListByCategoryId(id);
	}
}

