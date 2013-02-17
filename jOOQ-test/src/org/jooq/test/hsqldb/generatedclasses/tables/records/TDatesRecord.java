/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class TDatesRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.hsqldb.generatedclasses.tables.records.TDatesRecord> implements org.jooq.Record8<java.lang.Integer, java.sql.Date, java.sql.Time, java.sql.Timestamp, java.lang.Integer, java.lang.Long, org.jooq.types.YearToMonth, org.jooq.types.DayToSecond>, org.jooq.test.hsqldb.generatedclasses.tables.interfaces.ITDates {

	private static final long serialVersionUID = -722273327;

	/**
	 * Setter for <code>PUBLIC.T_DATES.ID</code>. 
	 */
	@Override
	public void setId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>PUBLIC.T_DATES.ID</code>. 
	 */
	@Override
	public java.lang.Integer getId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>PUBLIC.T_DATES.D</code>. 
	 */
	@Override
	public void setD(java.sql.Date value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>PUBLIC.T_DATES.D</code>. 
	 */
	@Override
	public java.sql.Date getD() {
		return (java.sql.Date) getValue(1);
	}

	/**
	 * Setter for <code>PUBLIC.T_DATES.T</code>. 
	 */
	@Override
	public void setT(java.sql.Time value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>PUBLIC.T_DATES.T</code>. 
	 */
	@Override
	public java.sql.Time getT() {
		return (java.sql.Time) getValue(2);
	}

	/**
	 * Setter for <code>PUBLIC.T_DATES.TS</code>. 
	 */
	@Override
	public void setTs(java.sql.Timestamp value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>PUBLIC.T_DATES.TS</code>. 
	 */
	@Override
	public java.sql.Timestamp getTs() {
		return (java.sql.Timestamp) getValue(3);
	}

	/**
	 * Setter for <code>PUBLIC.T_DATES.D_INT</code>. 
	 */
	@Override
	public void setDInt(java.lang.Integer value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>PUBLIC.T_DATES.D_INT</code>. 
	 */
	@Override
	public java.lang.Integer getDInt() {
		return (java.lang.Integer) getValue(4);
	}

	/**
	 * Setter for <code>PUBLIC.T_DATES.TS_BIGINT</code>. 
	 */
	@Override
	public void setTsBigint(java.lang.Long value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>PUBLIC.T_DATES.TS_BIGINT</code>. 
	 */
	@Override
	public java.lang.Long getTsBigint() {
		return (java.lang.Long) getValue(5);
	}

	/**
	 * Setter for <code>PUBLIC.T_DATES.I_Y</code>. 
	 */
	@Override
	public void setIY(org.jooq.types.YearToMonth value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>PUBLIC.T_DATES.I_Y</code>. 
	 */
	@Override
	public org.jooq.types.YearToMonth getIY() {
		return (org.jooq.types.YearToMonth) getValue(6);
	}

	/**
	 * Setter for <code>PUBLIC.T_DATES.I_D</code>. 
	 */
	@Override
	public void setID(org.jooq.types.DayToSecond value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>PUBLIC.T_DATES.I_D</code>. 
	 */
	@Override
	public org.jooq.types.DayToSecond getID() {
		return (org.jooq.types.DayToSecond) getValue(7);
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
	// Record8 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row8<java.lang.Integer, java.sql.Date, java.sql.Time, java.sql.Timestamp, java.lang.Integer, java.lang.Long, org.jooq.types.YearToMonth, org.jooq.types.DayToSecond> fieldsRow() {
		return (org.jooq.Row8) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row8<java.lang.Integer, java.sql.Date, java.sql.Time, java.sql.Timestamp, java.lang.Integer, java.lang.Long, org.jooq.types.YearToMonth, org.jooq.types.DayToSecond> valuesRow() {
		return (org.jooq.Row8) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.test.hsqldb.generatedclasses.tables.TDates.T_DATES.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Date> field2() {
		return org.jooq.test.hsqldb.generatedclasses.tables.TDates.T_DATES.D;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Time> field3() {
		return org.jooq.test.hsqldb.generatedclasses.tables.TDates.T_DATES.T;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field4() {
		return org.jooq.test.hsqldb.generatedclasses.tables.TDates.T_DATES.TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field5() {
		return org.jooq.test.hsqldb.generatedclasses.tables.TDates.T_DATES.D_INT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field6() {
		return org.jooq.test.hsqldb.generatedclasses.tables.TDates.T_DATES.TS_BIGINT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.types.YearToMonth> field7() {
		return org.jooq.test.hsqldb.generatedclasses.tables.TDates.T_DATES.I_Y;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.types.DayToSecond> field8() {
		return org.jooq.test.hsqldb.generatedclasses.tables.TDates.T_DATES.I_D;
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
	public java.sql.Date value2() {
		return getD();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Time value3() {
		return getT();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value4() {
		return getTs();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value5() {
		return getDInt();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value6() {
		return getTsBigint();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.types.YearToMonth value7() {
		return getIY();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.types.DayToSecond value8() {
		return getID();
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(org.jooq.test.hsqldb.generatedclasses.tables.interfaces.ITDates from) {
		setId(from.getId());
		setD(from.getD());
		setT(from.getT());
		setTs(from.getTs());
		setDInt(from.getDInt());
		setTsBigint(from.getTsBigint());
		setIY(from.getIY());
		setID(from.getID());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends org.jooq.test.hsqldb.generatedclasses.tables.interfaces.ITDates> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TDatesRecord
	 */
	public TDatesRecord() {
		super(org.jooq.test.hsqldb.generatedclasses.tables.TDates.T_DATES);
	}
}
