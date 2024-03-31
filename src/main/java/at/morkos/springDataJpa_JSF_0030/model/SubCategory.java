package at.morkos.springDataJpa_JSF_0030.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import at.morkos.springDataJpa_JSF_0030.core.model.BaseEntity;

@Entity
@Table(name = "tbl_sub_Category")
public class SubCategory extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column
	private String name;

	@ManyToOne
	private  Category category;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	

	

}
