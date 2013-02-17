/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class T_725LobTest extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.hsqldb.generatedclasses.tables.records.T_725LobTestRecord> {

	private static final long serialVersionUID = 276861460;

	/**
	 * The singleton instance of <code>PUBLIC.T_725_LOB_TEST</code>
	 */
	public static final org.jooq.test.hsqldb.generatedclasses.tables.T_725LobTest T_725_LOB_TEST = new org.jooq.test.hsqldb.generatedclasses.tables.T_725LobTest();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.hsqldb.generatedclasses.tables.records.T_725LobTestRecord> getRecordType() {
		return org.jooq.test.hsqldb.generatedclasses.tables.records.T_725LobTestRecord.class;
	}

	/**
	 * The column <code>PUBLIC.T_725_LOB_TEST.ID</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.hsqldb.generatedclasses.tables.records.T_725LobTestRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>PUBLIC.T_725_LOB_TEST.LOB</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.hsqldb.generatedclasses.tables.records.T_725LobTestRecord, byte[]> LOB = createField("LOB", org.jooq.impl.SQLDataType.VARBINARY.length(16777216), this);

	/**
	 * Create a <code>PUBLIC.T_725_LOB_TEST</code> table reference
	 */
	public T_725LobTest() {
		super("T_725_LOB_TEST", org.jooq.test.hsqldb.generatedclasses.Public.PUBLIC);
	}

	/**
	 * Create an aliased <code>PUBLIC.T_725_LOB_TEST</code> table reference
	 */
	public T_725LobTest(java.lang.String alias) {
		super(alias, org.jooq.test.hsqldb.generatedclasses.Public.PUBLIC, org.jooq.test.hsqldb.generatedclasses.tables.T_725LobTest.T_725_LOB_TEST);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.hsqldb.generatedclasses.tables.records.T_725LobTestRecord> getPrimaryKey() {
		return org.jooq.test.hsqldb.generatedclasses.Keys.PK_T_725_LOB_TEST;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.hsqldb.generatedclasses.tables.records.T_725LobTestRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.hsqldb.generatedclasses.tables.records.T_725LobTestRecord>>asList(org.jooq.test.hsqldb.generatedclasses.Keys.PK_T_725_LOB_TEST);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.hsqldb.generatedclasses.tables.T_725LobTest as(java.lang.String alias) {
		return new org.jooq.test.hsqldb.generatedclasses.tables.T_725LobTest(alias);
	}
}
