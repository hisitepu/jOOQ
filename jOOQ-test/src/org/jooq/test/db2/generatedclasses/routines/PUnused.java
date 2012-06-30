/**
 * This class is generated by jOOQ
 */
package org.jooq.test.db2.generatedclasses.routines;

/**
 * This class is generated by jOOQ.
 */
public class PUnused extends org.jooq.impl.AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = -175637361;


	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.String> IN1 = createParameter("IN1", org.jooq.impl.SQLDataType.VARCHAR);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.Integer> OUT1 = createParameter("OUT1", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.Integer> OUT2 = createParameter("OUT2", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * Create a new routine call instance
	 */
	public PUnused() {
		super("P_UNUSED", org.jooq.test.db2.generatedclasses.Lukas.LUKAS);

		addInParameter(IN1);
		addOutParameter(OUT1);
		addInOutParameter(OUT2);
	}

	/**
	 * Set the <code>IN1</code> parameter to the routine
	 */
	public void setIn1(java.lang.String value) {
		setValue(org.jooq.test.db2.generatedclasses.routines.PUnused.IN1, value);
	}

	/**
	 * Set the <code>OUT2</code> parameter to the routine
	 */
	public void setOut2(java.lang.Integer value) {
		setValue(org.jooq.test.db2.generatedclasses.routines.PUnused.OUT2, value);
	}

	public java.lang.Integer getOut1() {
		return getValue(OUT1);
	}

	public java.lang.Integer getOut2() {
		return getValue(OUT2);
	}
}
