package net.sourceforge.snmphibernate.api;

public interface ISmiTypeProvider {

	/**
	 * Get the specfic SMI Tpye corresponding to the type enum.
	 * 
	 * @param smiTypeEnum Enum in <code>SmiType</code>
	 * @return SMI Type class.
	 */
	Class getSmiType(SmiType smiTypeEnum);
	
}
