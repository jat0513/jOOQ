/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.mysql.sakila.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class FilmTextRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.examples.mysql.sakila.tables.records.FilmTextRecord> implements org.jooq.Record3<java.lang.Short, java.lang.String, java.lang.String> {

	private static final long serialVersionUID = -1651722426;

	/**
	 * Setter for <code>sakila.film_text.film_id</code>. 
	 */
	public void setFilmId(java.lang.Short value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>sakila.film_text.film_id</code>. 
	 */
	public java.lang.Short getFilmId() {
		return (java.lang.Short) getValue(0);
	}

	/**
	 * Setter for <code>sakila.film_text.title</code>. 
	 */
	public void setTitle(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>sakila.film_text.title</code>. 
	 */
	public java.lang.String getTitle() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>sakila.film_text.description</code>. 
	 */
	public void setDescription(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>sakila.film_text.description</code>. 
	 */
	public java.lang.String getDescription() {
		return (java.lang.String) getValue(2);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Short> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record3 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.Short, java.lang.String, java.lang.String> fieldsRow() {
		return (org.jooq.Row3) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.Short, java.lang.String, java.lang.String> valuesRow() {
		return (org.jooq.Row3) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Short> field1() {
		return org.jooq.examples.mysql.sakila.tables.FilmText.FILM_TEXT.FILM_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return org.jooq.examples.mysql.sakila.tables.FilmText.FILM_TEXT.TITLE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return org.jooq.examples.mysql.sakila.tables.FilmText.FILM_TEXT.DESCRIPTION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Short value1() {
		return getFilmId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getTitle();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getDescription();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached FilmTextRecord
	 */
	public FilmTextRecord() {
		super(org.jooq.examples.mysql.sakila.tables.FilmText.FILM_TEXT);
	}
}
