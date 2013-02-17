/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 *
 * An entity holding books
 */
@java.lang.SuppressWarnings("all")
public class T_BOOK extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.oracle3.generatedclasses.tables.records.T_BOOK> implements java.lang.Cloneable {

	private static final long serialVersionUID = 2102166612;

	/**
	 * The singleton instance of <code>T_BOOK</code>
	 */
	public static final org.jooq.test.oracle3.generatedclasses.tables.T_BOOK T_BOOK = new org.jooq.test.oracle3.generatedclasses.tables.T_BOOK();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.oracle3.generatedclasses.tables.records.T_BOOK> getRecordType() {
		return org.jooq.test.oracle3.generatedclasses.tables.records.T_BOOK.class;
	}

	/**
	 * The column <code>T_BOOK.ID</code>. The book ID
	 */
	public final org.jooq.TableField<org.jooq.test.oracle3.generatedclasses.tables.records.T_BOOK, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>T_BOOK.AUTHOR_ID</code>. The author ID in entity 'author'
	 */
	public final org.jooq.TableField<org.jooq.test.oracle3.generatedclasses.tables.records.T_BOOK, java.lang.Integer> AUTHOR_ID = createField("AUTHOR_ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>T_BOOK.CO_AUTHOR_ID</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle3.generatedclasses.tables.records.T_BOOK, java.lang.Integer> CO_AUTHOR_ID = createField("CO_AUTHOR_ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>T_BOOK.DETAILS_ID</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle3.generatedclasses.tables.records.T_BOOK, java.lang.Integer> DETAILS_ID = createField("DETAILS_ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>T_BOOK.TITLE</code>. The book's title
	 */
	public final org.jooq.TableField<org.jooq.test.oracle3.generatedclasses.tables.records.T_BOOK, java.lang.String> TITLE = createField("TITLE", org.jooq.impl.SQLDataType.VARCHAR.length(400), this);

	/**
	 * The column <code>T_BOOK.PUBLISHED_IN</code>. The year the book was published in
	 */
	public final org.jooq.TableField<org.jooq.test.oracle3.generatedclasses.tables.records.T_BOOK, java.lang.Integer> PUBLISHED_IN = createField("PUBLISHED_IN", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>T_BOOK.LANGUAGE_ID</code>. The language of the book
	 */
	public final org.jooq.TableField<org.jooq.test.oracle3.generatedclasses.tables.records.T_BOOK, java.lang.Integer> LANGUAGE_ID = createField("LANGUAGE_ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>T_BOOK.CONTENT_TEXT</code>. Some textual content of the book
	 */
	public final org.jooq.TableField<org.jooq.test.oracle3.generatedclasses.tables.records.T_BOOK, java.lang.String> CONTENT_TEXT = createField("CONTENT_TEXT", org.jooq.impl.SQLDataType.CLOB, this);

	/**
	 * The column <code>T_BOOK.CONTENT_PDF</code>. Some binary content of the book
	 */
	public final org.jooq.TableField<org.jooq.test.oracle3.generatedclasses.tables.records.T_BOOK, byte[]> CONTENT_PDF = createField("CONTENT_PDF", org.jooq.impl.SQLDataType.BLOB, this);

	/**
	 * Create a <code>T_BOOK</code> table reference
	 */
	public T_BOOK() {
		super("T_BOOK", org.jooq.test.oracle3.generatedclasses.DefaultSchema.DEFAULT_SCHEMA);
	}

	/**
	 * Create an aliased <code>T_BOOK</code> table reference
	 */
	public T_BOOK(java.lang.String alias) {
		super(alias, org.jooq.test.oracle3.generatedclasses.DefaultSchema.DEFAULT_SCHEMA, org.jooq.test.oracle3.generatedclasses.tables.T_BOOK.T_BOOK);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.oracle3.generatedclasses.tables.records.T_BOOK> getPrimaryKey() {
		return org.jooq.test.oracle3.generatedclasses.Keys.PK_T_BOOK;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.oracle3.generatedclasses.tables.records.T_BOOK>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.oracle3.generatedclasses.tables.records.T_BOOK>>asList(org.jooq.test.oracle3.generatedclasses.Keys.PK_T_BOOK);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.jooq.test.oracle3.generatedclasses.tables.records.T_BOOK, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.test.oracle3.generatedclasses.tables.records.T_BOOK, ?>>asList(org.jooq.test.oracle3.generatedclasses.Keys.FK_T_BOOK_AUTHOR_ID, org.jooq.test.oracle3.generatedclasses.Keys.FK_T_BOOK_CO_AUTHOR_ID, org.jooq.test.oracle3.generatedclasses.Keys.FK_T_BOOK_LANGUAGE_ID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.oracle3.generatedclasses.tables.T_BOOK as(java.lang.String alias) {
		return new org.jooq.test.oracle3.generatedclasses.tables.T_BOOK(alias);
	}
}
