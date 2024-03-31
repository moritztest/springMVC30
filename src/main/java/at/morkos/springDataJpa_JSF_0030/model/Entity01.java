package at.morkos.springDataJpa_JSF_0030.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_springDataJpa_JSF_0030_Entity01")
public class Entity01 {
	@Id
    @SequenceGenerator(
            name="seq_springDataJpa_JSF_0030_Entity01",
            sequenceName = "seq_springDataJpa_JSF_0030_Entity01",
            allocationSize=1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "seq_springDataJpa_JSF_0030_Entity01"
    )

	@Column(name="ent01_Id")
	private Long id;
	private String feld01;
	private String feld02;
	private String feld03;
	private String feld04;
	private String feld05;
	private String feld06;
	private String feld07;
	private String feld08;
	private String feld09;
	private String feld10;
	public Entity01() {
	}
	public Entity01(String feld01, String feld02, String feld03, String feld04, String feld05, String feld06,
			String feld07, String feld08, String feld09, String feld10) {
		this.feld01 = feld01;
		this.feld02 = feld02;
		this.feld03 = feld03;
		this.feld04 = feld04;
		this.feld05 = feld05;
		this.feld06 = feld06;
		this.feld07 = feld07;
		this.feld08 = feld08;
		this.feld09 = feld09;
		this.feld10 = feld10;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFeld01() {
		return feld01;
	}
	public void setFeld01(String feld01) {
		this.feld01 = feld01;
	}
	public String getFeld02() {
		return feld02;
	}
	public void setFeld02(String feld02) {
		this.feld02 = feld02;
	}
	public String getFeld03() {
		return feld03;
	}
	public void setFeld03(String feld03) {
		this.feld03 = feld03;
	}
	public String getFeld04() {
		return feld04;
	}
	public void setFeld04(String feld04) {
		this.feld04 = feld04;
	}
	public String getFeld05() {
		return feld05;
	}
	public void setFeld05(String feld05) {
		this.feld05 = feld05;
	}
	public String getFeld06() {
		return feld06;
	}
	public void setFeld06(String feld06) {
		this.feld06 = feld06;
	}
	public String getFeld07() {
		return feld07;
	}
	public void setFeld07(String feld07) {
		this.feld07 = feld07;
	}
	public String getFeld08() {
		return feld08;
	}
	public void setFeld08(String feld08) {
		this.feld08 = feld08;
	}
	public String getFeld09() {
		return feld09;
	}
	public void setFeld09(String feld09) {
		this.feld09 = feld09;
	}
	public String getFeld10() {
		return feld10;
	}
	public void setFeld10(String feld10) {
		this.feld10 = feld10;
	}
	@Override
	public String toString() {
		return "Entity01 [id=" + id + ", feld01=" + feld01 + ", feld02=" + feld02 + ", feld03=" + feld03 + ", feld04="
				+ feld04 + ", feld05=" + feld05 + ", feld06=" + feld06 + ", feld07=" + feld07 + ", feld08=" + feld08
				+ ", feld09=" + feld09 + ", feld10=" + feld10 + "]";
	}
	
}
