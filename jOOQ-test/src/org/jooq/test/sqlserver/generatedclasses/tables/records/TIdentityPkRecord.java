/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sqlserver.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class TIdentityPkRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.sqlserver.generatedclasses.tables.records.TIdentityPkRecord> implements org.jooq.Record2<java.lang.Integer, java.lang.Integer> {

	private static final long serialVersionUID = -1918881035;

	/**
	 * Setter for <code>dbo.t_identity_pk.id</code>. 
	 */
	public void setId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>dbo.t_identity_pk.id</code>. 
	 */
	public java.lang.Integer getId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>dbo.t_identity_pk.val</code>. 
	 */
	public void setVal(java.lang.Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>dbo.t_identity_pk.val</code>. 
	 */
	public java.lang.Integer getVal() {
		return (java.lang.Integer) getValue(1);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Integer> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Integer, java.lang.Integer> fieldsRow() {
		return (org.jooq.Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Integer, java.lang.Integer> valuesRow() {
		return (org.jooq.Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.test.sqlserver.generatedclasses.tables.TIdentityPk.T_IDENTITY_PK.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return org.jooq.test.sqlserver.generatedclasses.tables.TIdentityPk.T_IDENTITY_PK.VAL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value2() {
		return getVal();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TIdentityPkRecord
	 */
	public TIdentityPkRecord() {
		super(org.jooq.test.sqlserver.generatedclasses.tables.TIdentityPk.T_IDENTITY_PK);
	}
}
