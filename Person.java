package assignment;

import javax.annotation.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;




@Entity
public class Person {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Person_id")
	private int id;
	@Column(name="Person_name")
	private String name;
	@Column(name="License_number")
	private int lno;
	@Column(name="Is_Colour_Blind")
	private boolean is_colour_blind;
	
	@OneToOne
	Car car;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLno() {
		return lno;
	}

	public void setLno(int lno) {
		this.lno = lno;
	}

	public boolean isIs_colour_blind() {
		return is_colour_blind;
	}

	public void setIs_colour_blind(boolean is_colour_blind) {
		this.is_colour_blind = is_colour_blind;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}


	
	
	
	
	

}