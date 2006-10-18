package net.sourceforge.snmphibernate.api.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target( { ElementType.FIELD })
public @interface MibIndex {

	public static final int VARSTR_WITH_LENGTH = -1;

	public static final int VARSTR_WITHOUT_LENGTH = -2;

	int no(); // index no, 0 start.

	int length(); // length of the index
}
