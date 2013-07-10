package es.weso.model;

import java.util.Collection;
import java.util.Collections;

public class ItemCollection<T> {
	private Collection<T> collection;
	
	public ItemCollection() {
		collection = Collections.emptyList();
	}
	
	public ItemCollection(Collection<T> collection) {
		this.collection = collection;
	}

	public Collection<T> getCollection() {
		return collection;
	}

	public void setCollection(Collection<T> collection) {
		this.collection = collection;
	}

}
