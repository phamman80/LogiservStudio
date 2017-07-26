package application.model.info;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Provincia {

private final StringProperty nombre;
	
	public Provincia(String nombre){
		this.nombre = new SimpleStringProperty(nombre);
	}
	
	public Provincia(){
		this(null);
	}

	public final StringProperty nombreProperty() {
		return this.nombre;
	}
	

	public final String getNombre() {
		return this.nombreProperty().get();
	}
	

	public final void setNombre(final String nombre) {
		this.nombreProperty().set(nombre);
	}
	
}
