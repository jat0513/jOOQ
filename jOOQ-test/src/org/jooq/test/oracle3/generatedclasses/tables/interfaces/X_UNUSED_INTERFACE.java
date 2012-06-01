/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables.interfaces;

/**
 * This class is generated by jOOQ.
 *
 * An unused table in the same schema.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "X_UNUSED", schema = "TEST", uniqueConstraints = {
	@javax.persistence.UniqueConstraint(columnNames = {"ID", "NAME"})
})
public interface X_UNUSED_INTERFACE extends java.lang.Cloneable {

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setID(java.lang.Integer value);

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	@javax.persistence.Column(name = "ID", unique = true, nullable = false, precision = 7)
	public java.lang.Integer getID();

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setNAME(java.lang.String value);

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	@javax.persistence.Column(name = "NAME", nullable = false, length = 10)
	public java.lang.String getNAME();

	/**
	 * An uncommented item
	 */
	public void setBIG_INTEGER(java.math.BigInteger value);

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "BIG_INTEGER", precision = 38)
	public java.math.BigInteger getBIG_INTEGER();

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_X_UNUSED_SELF
	 * FOREIGN KEY (ID_REF, NAME_REF)
	 * REFERENCES TEST.X_UNUSED (ID, NAME)
	 * </pre></code>
	 */
	public void setID_REF(java.lang.Integer value);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_X_UNUSED_SELF
	 * FOREIGN KEY (ID_REF, NAME_REF)
	 * REFERENCES TEST.X_UNUSED (ID, NAME)
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "ID_REF", precision = 7)
	public java.lang.Integer getID_REF();

	/**
	 * An uncommented item
	 */
	public void setCLASS(java.lang.Integer value);

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "CLASS", precision = 7)
	public java.lang.Integer getCLASS();

	/**
	 * An uncommented item
	 */
	public void setFIELDS(java.lang.Integer value);

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "FIELDS", precision = 7)
	public java.lang.Integer getFIELDS();

	/**
	 * An uncommented item
	 */
	public void setCONFIGURATION(java.lang.Integer value);

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "CONFIGURATION", precision = 7)
	public java.lang.Integer getCONFIGURATION();

	/**
	 * An uncommented item
	 */
	public void setU_D_T(java.lang.Integer value);

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "U_D_T", precision = 7)
	public java.lang.Integer getU_D_T();

	/**
	 * An uncommented item
	 */
	public void setMETA_DATA(java.lang.Integer value);

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "META_DATA", precision = 7)
	public java.lang.Integer getMETA_DATA();

	/**
	 * An uncommented item
	 */
	public void setTYPE0(java.lang.Integer value);

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "TYPE0", precision = 7)
	public java.lang.Integer getTYPE0();

	/**
	 * An uncommented item
	 */
	public void setPRIMARY_KEY(java.lang.Integer value);

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "PRIMARY_KEY", precision = 7)
	public java.lang.Integer getPRIMARY_KEY();

	/**
	 * An uncommented item
	 */
	public void setPRIMARYKEY(java.lang.Integer value);

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "PRIMARYKEY", precision = 7)
	public java.lang.Integer getPRIMARYKEY();

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_X_UNUSED_SELF
	 * FOREIGN KEY (ID_REF, NAME_REF)
	 * REFERENCES TEST.X_UNUSED (ID, NAME)
	 * </pre></code>
	 */
	public void setNAME_REF(java.lang.String value);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_X_UNUSED_SELF
	 * FOREIGN KEY (ID_REF, NAME_REF)
	 * REFERENCES TEST.X_UNUSED (ID, NAME)
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "NAME_REF", length = 10)
	public java.lang.String getNAME_REF();

	/**
	 * An uncommented item
	 */
	public void setFIELD_737(java.math.BigDecimal value);

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "FIELD 737", precision = 25, scale = 2)
	public java.math.BigDecimal getFIELD_737();

	/**
	 * An uncommented item
	 */
	public void setMS_UNUSED_ID_REF(java.lang.Integer value);

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "MS_UNUSED_ID_REF", precision = 7)
	public java.lang.Integer getMS_UNUSED_ID_REF();

	/**
	 * An uncommented item
	 */
	public void setMS_UNUSED_NAME_REF(java.lang.String value);

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "MS_UNUSED_NAME_REF", length = 10)
	public java.lang.String getMS_UNUSED_NAME_REF();
}
