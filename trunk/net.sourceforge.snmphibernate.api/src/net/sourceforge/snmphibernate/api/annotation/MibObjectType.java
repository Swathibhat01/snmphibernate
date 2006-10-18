package net.sourceforge.snmphibernate.api.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import net.sourceforge.snmphibernate.api.SmiType;

@Retention(RetentionPolicy.RUNTIME)
@Target( { ElementType.FIELD })
public @interface MibObjectType {
	public enum Access { READ, WRITE, CREATE }
	String oid();
	SmiType smiType();
	Access access();
}
