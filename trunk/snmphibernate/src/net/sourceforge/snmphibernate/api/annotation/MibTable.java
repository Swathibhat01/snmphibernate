package net.sourceforge.snmphibernate.api.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Declare mapping an Java Value Object to a row of a MIB table.
 * 
 * @author Ery Lee(ery.lee@gmail.com)
 * 
 */
@Retention(RetentionPolicy.RUNTIME)
@Target( { ElementType.TYPE })
public @interface MibTable {
}
