package es.weso.model;

/**
 * Triple name-uri-value
 * 
 * @author Alejandro Montes García
 * @since 04/07/2013
 * @version 1.0
 */
public class ValuedNamedUri extends NamedUri {
	private Double value;

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

}
