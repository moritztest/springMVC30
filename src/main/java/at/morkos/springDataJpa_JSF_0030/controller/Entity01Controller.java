package at.morkos.springDataJpa_JSF_0030.controller;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.annotation.ManagedProperty;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import javax.ws.rs.POST;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;


//import org.primefaces.event.SelectEvent;

import at.morkos.springDataJpa_JSF_0030.model.Entity01;
import at.morkos.springDataJpa_JSF_0030.service.Entity01Service;
//(name="entity01ManagedBean")
@Component
@SuppressWarnings("deprecation")
@ManagedBean( name ="entity01ManagedBean")
@SessionScoped
public class Entity01Controller implements Serializable {
	private static final long serialVersionUID = 1L;
	private Entity01 entity01;
	private List<Entity01> listEntity01;
	static Logger logger = Logger.getLogger(Entity01Controller.class);
	//@ManagedProperty(value = "#{entity01Service}")
	@Autowired
	private Entity01Service entity01Service;
	/*@PostConstruct
	public void init() {
		listEntity01 = entity01Service.getList();
	}*/
	public Entity01Controller() {
		entity01 = new Entity01();
		listEntity01 = new ArrayList<Entity01>();
		entity01Service=new Entity01Service();
	}
	public Entity01 getEntity01() {
		return entity01;
	}
	public void setEntity01(Entity01 entity01) {
		this.entity01 = entity01;
	}
	public List<Entity01> getListEntity01() {
		return listEntity01;
	}
	public void setListEntity01(List<Entity01> listEntity01) {
		this.listEntity01 = listEntity01;
	}
	public void onload() {
		this.entity01=new Entity01();
		this.listEntity01=entity01Service.getList();
	}
	public void saveEntity01_500_DatenAnzeigen() {
		List<Entity01> r_records;
		r_records=entity01Service.addRecords(getEntity01List());
		for(Entity01 ent01: r_records) {
			logger.info("Record:" +ent01.toString());
		}
		/*ModelAndView mav=new ModelAndView("/saveEntity01_500_DatenAnzeigen");
		mav.addObject("records", r_records);
	    return mav;*/
	}
	private List<Entity01> getEntity01List(){
		List<Entity01> p_records= new ArrayList<Entity01>();
		Entity01 entity01;
		String zaehler="";
		String feldValue="";
		for (int i=1;i<501;i++) {
			entity01=new Entity01();
			zaehler="000"+i;
			zaehler=zaehler.substring(zaehler.length()-3);
			for (int j=1;j<11;j++) {
				switch (j) {
				case 1: entity01.setFeld01("feld01_Record_"+zaehler);
					break;
				case 2: entity01.setFeld02("feld02_Record_"+zaehler);
				break;
				case 3: entity01.setFeld03("feld03_Record_"+zaehler);
				break;
				case 4: entity01.setFeld04("feld04_Record_"+zaehler);
				break;
				case 5: entity01.setFeld05("feld05_Record_"+zaehler);
				break;
				case 6: entity01.setFeld06("feld06_Record_"+zaehler);
				break;
				case 7: entity01.setFeld07("feld07_Record_"+zaehler);
				break;
				case 8: entity01.setFeld08("feld08_Record_"+zaehler);
				break;
				case 9: entity01.setFeld09("feld09_Record_"+zaehler);
				break;
				case 10: entity01.setFeld10("feld10_Record_"+zaehler);
				break;
				default:
					break;
				}
			}
			p_records.add(entity01);
		}
		return p_records;
	}
	
}
