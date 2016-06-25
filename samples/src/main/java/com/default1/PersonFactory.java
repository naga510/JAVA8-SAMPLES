package com.default1;

public interface PersonFactory<P extends Person> {

	P create(String fName, String lName);
}
