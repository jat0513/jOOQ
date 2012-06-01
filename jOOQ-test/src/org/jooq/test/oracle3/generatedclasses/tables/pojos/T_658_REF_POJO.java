/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "T_658_REF", schema = "TEST")
public class T_658_REF_POJO extends java.lang.ThreadDeath implements java.lang.Cloneable, org.jooq.test.oracle3.generatedclasses.tables.interfaces.T_658_REF_INTERFACE {

	private static final long serialVersionUID = -1760468387;

	private org.jooq.test.oracle3.generatedclasses.enums.T_658_11 REF_11;
	private org.jooq.test.oracle3.generatedclasses.enums.T_658_21 REF_21;
	private org.jooq.test.oracle3.generatedclasses.enums.T_658_31 REF_31;
	private org.jooq.test.oracle3.generatedclasses.enums.T_658_12 REF_12;
	private org.jooq.test.oracle3.generatedclasses.enums.T_658_22 REF_22;
	private org.jooq.test.oracle3.generatedclasses.enums.T_658_32 REF_32;

	@javax.persistence.Column(name = "REF_11", length = 3)
	@Override
	public org.jooq.test.oracle3.generatedclasses.enums.T_658_11 getREF_11() {
		return this.REF_11;
	}

	@Override
	public void setREF_11(org.jooq.test.oracle3.generatedclasses.enums.T_658_11 REF_11) {
		this.REF_11 = REF_11;
	}

	@javax.persistence.Column(name = "REF_21", precision = 7)
	@Override
	public org.jooq.test.oracle3.generatedclasses.enums.T_658_21 getREF_21() {
		return this.REF_21;
	}

	@Override
	public void setREF_21(org.jooq.test.oracle3.generatedclasses.enums.T_658_21 REF_21) {
		this.REF_21 = REF_21;
	}

	@javax.persistence.Column(name = "REF_31", precision = 15)
	@Override
	public org.jooq.test.oracle3.generatedclasses.enums.T_658_31 getREF_31() {
		return this.REF_31;
	}

	@Override
	public void setREF_31(org.jooq.test.oracle3.generatedclasses.enums.T_658_31 REF_31) {
		this.REF_31 = REF_31;
	}

	@javax.persistence.Column(name = "REF_12", length = 3)
	@Override
	public org.jooq.test.oracle3.generatedclasses.enums.T_658_12 getREF_12() {
		return this.REF_12;
	}

	@Override
	public void setREF_12(org.jooq.test.oracle3.generatedclasses.enums.T_658_12 REF_12) {
		this.REF_12 = REF_12;
	}

	@javax.persistence.Column(name = "REF_22", precision = 7)
	@Override
	public org.jooq.test.oracle3.generatedclasses.enums.T_658_22 getREF_22() {
		return this.REF_22;
	}

	@Override
	public void setREF_22(org.jooq.test.oracle3.generatedclasses.enums.T_658_22 REF_22) {
		this.REF_22 = REF_22;
	}

	@javax.persistence.Column(name = "REF_32", precision = 15)
	@Override
	public org.jooq.test.oracle3.generatedclasses.enums.T_658_32 getREF_32() {
		return this.REF_32;
	}

	@Override
	public void setREF_32(org.jooq.test.oracle3.generatedclasses.enums.T_658_32 REF_32) {
		this.REF_32 = REF_32;
	}
}
