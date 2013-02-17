/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class T_639_NUMBERS_TABLE extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.oracle3.generatedclasses.tables.records.T_639_NUMBERS_TABLE> implements java.lang.Cloneable {

	private static final long serialVersionUID = 1141159903;

	/**
	 * The singleton instance of <code>T_639_NUMBERS_TABLE</code>
	 */
	public static final org.jooq.test.oracle3.generatedclasses.tables.T_639_NUMBERS_TABLE T_639_NUMBERS_TABLE = new org.jooq.test.oracle3.generatedclasses.tables.T_639_NUMBERS_TABLE();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.oracle3.generatedclasses.tables.records.T_639_NUMBERS_TABLE> getRecordType() {
		return org.jooq.test.oracle3.generatedclasses.tables.records.T_639_NUMBERS_TABLE.class;
	}

	/**
	 * The column <code>T_639_NUMBERS_TABLE.ID</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle3.generatedclasses.tables.records.T_639_NUMBERS_TABLE, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>T_639_NUMBERS_TABLE.BYTE</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle3.generatedclasses.tables.records.T_639_NUMBERS_TABLE, java.lang.Byte> BYTE = createField("BYTE", org.jooq.impl.SQLDataType.TINYINT, this);

	/**
	 * The column <code>T_639_NUMBERS_TABLE.SHORT</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle3.generatedclasses.tables.records.T_639_NUMBERS_TABLE, java.lang.Short> SHORT = createField("SHORT", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * The column <code>T_639_NUMBERS_TABLE.INTEGER</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle3.generatedclasses.tables.records.T_639_NUMBERS_TABLE, java.lang.Integer> INTEGER = createField("INTEGER", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>T_639_NUMBERS_TABLE.LONG</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle3.generatedclasses.tables.records.T_639_NUMBERS_TABLE, java.lang.Long> LONG = createField("LONG", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The column <code>T_639_NUMBERS_TABLE.BYTE_DECIMAL</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle3.generatedclasses.tables.records.T_639_NUMBERS_TABLE, java.lang.Byte> BYTE_DECIMAL = createField("BYTE_DECIMAL", org.jooq.impl.SQLDataType.TINYINT, this);

	/**
	 * The column <code>T_639_NUMBERS_TABLE.SHORT_DECIMAL</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle3.generatedclasses.tables.records.T_639_NUMBERS_TABLE, java.lang.Short> SHORT_DECIMAL = createField("SHORT_DECIMAL", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * The column <code>T_639_NUMBERS_TABLE.INTEGER_DECIMAL</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle3.generatedclasses.tables.records.T_639_NUMBERS_TABLE, java.lang.Integer> INTEGER_DECIMAL = createField("INTEGER_DECIMAL", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>T_639_NUMBERS_TABLE.LONG_DECIMAL</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle3.generatedclasses.tables.records.T_639_NUMBERS_TABLE, java.lang.Long> LONG_DECIMAL = createField("LONG_DECIMAL", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The column <code>T_639_NUMBERS_TABLE.BIG_INTEGER</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle3.generatedclasses.tables.records.T_639_NUMBERS_TABLE, java.math.BigInteger> BIG_INTEGER = createField("BIG_INTEGER", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(22), this);

	/**
	 * The column <code>T_639_NUMBERS_TABLE.BIG_DECIMAL</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle3.generatedclasses.tables.records.T_639_NUMBERS_TABLE, java.math.BigDecimal> BIG_DECIMAL = createField("BIG_DECIMAL", org.jooq.impl.SQLDataType.NUMERIC.precision(22, 5), this);

	/**
	 * Create a <code>T_639_NUMBERS_TABLE</code> table reference
	 */
	public T_639_NUMBERS_TABLE() {
		super("T_639_NUMBERS_TABLE", org.jooq.test.oracle3.generatedclasses.DefaultSchema.DEFAULT_SCHEMA);
	}

	/**
	 * Create an aliased <code>T_639_NUMBERS_TABLE</code> table reference
	 */
	public T_639_NUMBERS_TABLE(java.lang.String alias) {
		super(alias, org.jooq.test.oracle3.generatedclasses.DefaultSchema.DEFAULT_SCHEMA, org.jooq.test.oracle3.generatedclasses.tables.T_639_NUMBERS_TABLE.T_639_NUMBERS_TABLE);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.oracle3.generatedclasses.tables.records.T_639_NUMBERS_TABLE> getPrimaryKey() {
		return org.jooq.test.oracle3.generatedclasses.Keys.PK_T_639_NUMBERS_TABLE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.oracle3.generatedclasses.tables.records.T_639_NUMBERS_TABLE>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.oracle3.generatedclasses.tables.records.T_639_NUMBERS_TABLE>>asList(org.jooq.test.oracle3.generatedclasses.Keys.PK_T_639_NUMBERS_TABLE);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.oracle3.generatedclasses.tables.T_639_NUMBERS_TABLE as(java.lang.String alias) {
		return new org.jooq.test.oracle3.generatedclasses.tables.T_639_NUMBERS_TABLE(alias);
	}
}
