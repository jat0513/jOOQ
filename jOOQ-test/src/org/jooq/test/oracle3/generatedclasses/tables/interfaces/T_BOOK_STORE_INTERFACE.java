/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables.interfaces;

/**
 * This class is generated by jOOQ.
 *
 * A book store
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "T_BOOK_STORE")
public interface T_BOOK_STORE_INTERFACE extends java.lang.Cloneable, java.io.Serializable {

	/**
	 * Setter for <code>T_BOOK_STORE.NAME</code>. The books store name
	 */
	public void setNAME(java.lang.String value);

	/**
	 * Getter for <code>T_BOOK_STORE.NAME</code>. The books store name
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "NAME", unique = true, nullable = false, length = 400)
	public java.lang.String getNAME();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface T_BOOK_STORE_INTERFACE
	 */
	public void from(org.jooq.test.oracle3.generatedclasses.tables.interfaces.T_BOOK_STORE_INTERFACE from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface T_BOOK_STORE_INTERFACE
	 */
	public <E extends org.jooq.test.oracle3.generatedclasses.tables.interfaces.T_BOOK_STORE_INTERFACE> E into(E into);
}
