package es.weso.business;

import java.util.Collection;

import es.weso.model.Observation;

/**
 * Defines the operations that can be performed related to {@link Observation}
 * retrieval
 * 
 * @author Alejandro Montes García
 * @since 01/07/2013
 * @version 1.0
 */
public interface ObservationManagement {

	/**
	 * Gets all the {@link Observation}s
	 * 
	 * @return A {@link Collection} with all the {@link Observation}s
	 */
	public Collection<Observation> getAllObservations();

	/**
	 * Gets all the {@link Observation}s that refer to a set of
	 * {@link es.weso.model.Country countries}
	 * 
	 * @param countries
	 *            The desired {@link es.weso.model.Country countries}
	 * @return A {@link Collection} with all the {@link Observation}s that refer
	 *         to a set of {@link es.weso.model.Country countries}
	 */
	public Collection<Observation> getAllObservationsByCountries(
			Collection<String> countries);

	/**
	 * Gets all the {@link Observation}s that refer to a set of
	 * {@link es.weso.model.Country countries} and come from a specific
	 * {@link es.weso.model.Indicator indicator}
	 * 
	 * @param countries
	 *            The desired {@link es.weso.model.Country countries}
	 * @param indicators
	 *            The desired {@link es.weso.model.Indicator indicators}
	 * @return A {@link Collection} with all the {@link Observation}s that refer
	 *         to a set of {@link es.weso.model.Country countries} and come from
	 *         a specific {@link es.weso.model.Indicator indicator}
	 */
	public Collection<Observation> getAllObservationsByCountries(
			Collection<String> countries, Collection<String> indicators);

	/**
	 * Get all the {@link Observation}s that refer to a set of
	 * {@link es.weso.model.Country countries} and come from a specific
	 * {@link es.weso.model.Indicator indicator} within a specific period of
	 * time
	 * 
	 * @param countries
	 *            The desired {@link es.weso.model.Country countries}
	 * @param indicators
	 *            The desired {@link es.weso.model.Indicator indicators}
	 * @param years
	 *            The desired years
	 * @return A {@link Collection} with all the {@link Observation}s that refer
	 *         to a set of {@link es.weso.model.Country countries} and come from
	 *         a specific {@link es.weso.model.Indicator indicator} within a
	 *         specific period of time
	 */
	public Collection<Observation> getAllObservationsByCountries(
			Collection<String> countries, Collection<String> indicators,
			Collection<Integer> years);

	/**
	 * Gets all the {@link Observation}s within a specific period of time
	 * 
	 * years The desired years
	 * 
	 * @return A {@link Collection} with all the {@link Observation}s within a
	 *         specific period of time
	 */
	public Collection<Observation> getAllObservationsByYear(
			Collection<Integer> years);

	/**
	 * Get all the {@link Observation}s that refer to a set of
	 * {@link es.weso.model.Country countries} within a specific period of time
	 * 
	 * @param years
	 *            The desired years
	 * @param countries
	 *            The desired {@link es.weso.model.Country countries}
	 * @return A {@link Collection} with all the {@link Observation}s that refer
	 *         to a set of {@link es.weso.model.Country countries} within a
	 *         specific period of time
	 */
	public Collection<Observation> getAllObservationsByYear(
			Collection<Integer> years, Collection<String> countries);

	/**
	 * Get all the {@link Observation}s that come from a specific
	 * {@link es.weso.model.Indicator indicator}
	 * 
	 * @param indicators
	 *            The desired {@link es.weso.model.Indicator indicators}
	 * @return A {@link Collection} with all the {@link Observation}s that come
	 *         from a specific {@link es.weso.model.Indicator indicator}
	 */
	public Collection<Observation> getAllObservationsByIndicator(
			Collection<String> indicators);

	/**
	 * Get all the {@link Observation}s that come from a specific
	 * {@link es.weso.model.Indicator indicator} within a specific period of
	 * time
	 * 
	 * @param indicators
	 *            The desired {@link es.weso.model.Indicator indicators}
	 * @param years
	 *            The desired years
	 * @return A {@link Collection} with all the {@link Observation}s that come
	 *         from a specific {@link es.weso.model.Indicator indicator} within
	 *         a specific period of time
	 */
	public Collection<Observation> getAllObservationsByIndicator(
			Collection<String> indicators, Collection<Integer> years);

	/**
	 * Gets an {@link Observation} identified by a uri
	 * 
	 * @param uri
	 *            The uri slice that identifies the {@link Observation}
	 * @return The {@link Observation} that matches with the URI slice
	 */
	public Observation getObservationByURI(String uri);
}
