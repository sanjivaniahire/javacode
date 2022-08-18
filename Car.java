package assignment;

import javax.annotation.processing.Generated;
import javax.persistence.*;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Car {
 
	@Id
	@javax.persistence.GeneratedValue(strategy=GenerationType.AUTO)
	private int numberplate;
	private String colour;
	private String engine;
	
	public int getNumberplate() {
		return numberplate;
	}

	public void setNnumberplate(int numberplateid) {
		this.numberplate= numberplate;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	
	
	
}