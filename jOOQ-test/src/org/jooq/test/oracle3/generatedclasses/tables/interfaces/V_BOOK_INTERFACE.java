/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables.interfaces;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "V_BOOK", schema = "TEST")
public interface V_BOOK_INTERFACE extends java.lang.Cloneable {

	/**
	 * An uncommented item
	 */
	public void setID(java.lang.Integer value);

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "ID", nullable = false, precision = 7)
	public java.lang.Integer getID();

	/**
	 * An uncommented item
	 */
	public void setAUTHOR_ID(java.lang.Integer value);

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "AUTHOR_ID", nullable = false, precision = 7)
	public java.lang.Integer getAUTHOR_ID();

	/**
	 * An uncommented item
	 */
	public void setCO_AUTHOR_ID(java.lang.Integer value);

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "CO_AUTHOR_ID", precision = 7)
	public java.lang.Integer getCO_AUTHOR_ID();

	/**
	 * An uncommented item
	 */
	public void setDETAILS_ID(java.lang.Integer value);

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "DETAILS_ID", precision = 7)
	public java.lang.Integer getDETAILS_ID();

	/**
	 * An uncommented item
	 */
	public void setTITLE(java.lang.String value);

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "TITLE", nullable = false, length = 400)
	public java.lang.String getTITLE();

	/**
	 * An uncommented item
	 */
	public void setPUBLISHED_IN(java.lang.Integer value);

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "PUBLISHED_IN", nullable = false, precision = 7)
	public java.lang.Integer getPUBLISHED_IN();

	/**
	 * An uncommented item
	 */
	public void setLANGUAGE_ID(java.lang.Integer value);

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "LANGUAGE_ID", nullable = false, precision = 7)
	public java.lang.Integer getLANGUAGE_ID();

	/**
	 * An uncommented item
	 */
	public void setCONTENT_TEXT(java.lang.String value);

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "CONTENT_TEXT")
	public java.lang.String getCONTENT_TEXT();

	/**
	 * An uncommented item
	 */
	public void setCONTENT_PDF(byte[] value);

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "CONTENT_PDF")
	public byte[] getCONTENT_PDF();
}
