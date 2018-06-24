package com.taae.examples.hispringboot.dao;

import org.hibernate.dialect.HSQLDialect;

public class FixHSQLDialect extends HSQLDialect{

	// Do not drop constraints explicitly, just do this by cascading instead.
	@Override
	public boolean dropConstraints() {
		return false;
	}

	@Override
	public String getCascadeConstraintsString() {
		return " CASCADE ";
	}
	
}
