/**
 * This class is generated by jOOQ
 */
package org.jooq.test.derby.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class VLibraryRecord extends org.jooq.impl.TableRecordImpl<org.jooq.test.derby.generatedclasses.tables.records.VLibraryRecord> implements org.jooq.Record2<java.lang.String, java.lang.String> {

	private static final long serialVersionUID = 1028464682;

	/**
	 * Setter for <code>TEST.V_LIBRARY.AUTHOR</code>. 
	 */
	public void setAuthor(java.lang.String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>TEST.V_LIBRARY.AUTHOR</code>. 
	 */
	public java.lang.String getAuthor() {
		return (java.lang.String) getValue(0);
	}

	/**
	 * Setter for <code>TEST.V_LIBRARY.TITLE</code>. 
	 */
	public void setTitle(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>TEST.V_LIBRARY.TITLE</code>. 
	 */
	public java.lang.String getTitle() {
		return (java.lang.String) getValue(1);
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.String, java.lang.String> fieldsRow() {
		return (org.jooq.Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.String, java.lang.String> valuesRow() {
		return (org.jooq.Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return org.jooq.test.derby.generatedclasses.tables.VLibrary.AUTHOR;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return org.jooq.test.derby.generatedclasses.tables.VLibrary.TITLE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value1() {
		return getAuthor();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getTitle();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached VLibraryRecord
	 */
	public VLibraryRecord() {
		super(org.jooq.test.derby.generatedclasses.tables.VLibrary.V_LIBRARY);
	}
}
