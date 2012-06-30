/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.routines;

/**
 * This class is generated by jOOQ.
 */
public class PGetOneCursor extends org.jooq.impl.AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = -1497010977;


	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.Integer> TOTAL = createParameter("total", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<org.jooq.Result<org.jooq.Record>> BOOKS = createParameter("books", org.jooq.impl.SQLDataType.RESULT);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.Integer[]> BOOK_IDS = createParameter("book_ids", org.jooq.impl.SQLDataType.INTEGER.getArrayDataType());

	/**
	 * Create a new routine call instance
	 */
	public PGetOneCursor() {
		super("p_get_one_cursor", org.jooq.test.postgres.generatedclasses.Public.PUBLIC);

		addOutParameter(TOTAL);
		addOutParameter(BOOKS);
		addInParameter(BOOK_IDS);
	}

	/**
	 * Set the <code>book_ids</code> parameter to the routine
	 */
	public void setBookIds(java.lang.Integer[] value) {
		setValue(org.jooq.test.postgres.generatedclasses.routines.PGetOneCursor.BOOK_IDS, value);
	}

	public java.lang.Integer getTotal() {
		return getValue(TOTAL);
	}

	public org.jooq.Result<org.jooq.Record> getBooks() {
		return getValue(BOOKS);
	}
}
