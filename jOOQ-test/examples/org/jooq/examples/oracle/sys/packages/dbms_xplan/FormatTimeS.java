/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.oracle.sys.packages.dbms_xplan;

/**
 * This class is generated by jOOQ.
 */
public class FormatTimeS extends org.jooq.impl.AbstractRoutine<java.lang.String> {

	private static final long serialVersionUID = 1485934016;


	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.String> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.VARCHAR);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.math.BigDecimal> NUM = createParameter("NUM", org.jooq.impl.SQLDataType.NUMERIC);

	/**
	 * Create a new routine call instance
	 */
	public FormatTimeS() {
		super("FORMAT_TIME_S", org.jooq.examples.oracle.sys.Sys.SYS, org.jooq.examples.oracle.sys.packages.DbmsXplan.DBMS_XPLAN, org.jooq.impl.SQLDataType.VARCHAR);

		setReturnParameter(RETURN_VALUE);
		addInParameter(NUM);
	}

	/**
	 * Set the <code>NUM</code> parameter to the routine
	 */
	public void setNum(java.lang.Number value) {
		setNumber(org.jooq.examples.oracle.sys.packages.dbms_xplan.FormatTimeS.NUM, value);
	}

	/**
	 * Set the <code>NUM</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void setNum(org.jooq.Field<? extends java.lang.Number> field) {
		setNumber(NUM, field);
	}
}
