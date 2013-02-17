/**
 * This class is generated by jOOQ
 */
package org.jooq.test.firebird.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class TDates extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.firebird.generatedclasses.tables.records.TDatesRecord> {

	private static final long serialVersionUID = -1817007605;

	/**
	 * The singleton instance of <code>T_DATES</code>
	 */
	public static final org.jooq.test.firebird.generatedclasses.tables.TDates T_DATES = new org.jooq.test.firebird.generatedclasses.tables.TDates();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.firebird.generatedclasses.tables.records.TDatesRecord> getRecordType() {
		return org.jooq.test.firebird.generatedclasses.tables.records.TDatesRecord.class;
	}

	/**
	 * The column <code>T_DATES.ID</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.firebird.generatedclasses.tables.records.TDatesRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>T_DATES.D</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.firebird.generatedclasses.tables.records.TDatesRecord, java.sql.Date> D = createField("D", org.jooq.impl.SQLDataType.DATE, this);

	/**
	 * The column <code>T_DATES.T</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.firebird.generatedclasses.tables.records.TDatesRecord, java.sql.Time> T = createField("T", org.jooq.impl.SQLDataType.TIME, this);

	/**
	 * The column <code>T_DATES.TS</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.firebird.generatedclasses.tables.records.TDatesRecord, java.sql.Timestamp> TS = createField("TS", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * The column <code>T_DATES.D_INT</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.firebird.generatedclasses.tables.records.TDatesRecord, java.lang.Integer> D_INT = createField("D_INT", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>T_DATES.TS_BIGINT</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.firebird.generatedclasses.tables.records.TDatesRecord, java.lang.Long> TS_BIGINT = createField("TS_BIGINT", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * Create a <code>T_DATES</code> table reference
	 */
	public TDates() {
		super("T_DATES", org.jooq.test.firebird.generatedclasses.DefaultSchema.DEFAULT_SCHEMA);
	}

	/**
	 * Create an aliased <code>T_DATES</code> table reference
	 */
	public TDates(java.lang.String alias) {
		super(alias, org.jooq.test.firebird.generatedclasses.DefaultSchema.DEFAULT_SCHEMA, org.jooq.test.firebird.generatedclasses.tables.TDates.T_DATES);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.firebird.generatedclasses.tables.records.TDatesRecord> getPrimaryKey() {
		return org.jooq.test.firebird.generatedclasses.Keys.PK_T_DATES;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.firebird.generatedclasses.tables.records.TDatesRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.firebird.generatedclasses.tables.records.TDatesRecord>>asList(org.jooq.test.firebird.generatedclasses.Keys.PK_T_DATES);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.firebird.generatedclasses.tables.TDates as(java.lang.String alias) {
		return new org.jooq.test.firebird.generatedclasses.tables.TDates(alias);
	}
}
