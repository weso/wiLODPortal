package es.weso.model;

import java.util.Collection;

/**
 * Representation of a country group for the web index project
 * 
 * @author Alejandro Montes García
 * @since 01/07/2013
 * @version 1.0
 */
public class CountryGroup {

	private String name, uri;
	private Collection<NamedUri> countries;
	private boolean isContinent;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public Collection<NamedUri> getCountries() {
		return countries;
	}

	public void setCountries(Collection<NamedUri> countries) {
		this.countries = countries;
	}

	public boolean isContinent() {
		return isContinent;
	}

	public void setContinent(boolean isContinent) {
		this.isContinent = isContinent;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((uri == null) ? 0 : uri.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CountryGroup other = (CountryGroup) obj;
		if (uri == null) {
			if (other.uri != null)
				return false;
		} else if (!uri.equals(other.uri))
			return false;
		return true;
	}

}
