/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
public class SystemRecord extends org.jooq.impl.TableRecordImpl<org.jooq.test.hsqldb.generatedclasses.tables.records.SystemRecord> implements org.jooq.test.hsqldb.generatedclasses.tables.interfaces.ISystem {

	private static final long serialVersionUID = 151732384;

	/**
	 * An uncommented item
	 */
	@Override
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.tables.System.SYSTEM.ID, value);
	}

	/**
	 * An uncommented item
	 */
	@Override
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.hsqldb.generatedclasses.tables.System.SYSTEM.ID);
	}

	/**
	 * Create a detached SystemRecord
	 */
	public SystemRecord() {
		super(org.jooq.test.hsqldb.generatedclasses.tables.System.SYSTEM);
	}
}
