package com.teste;

import static org.assertj.core.api.Assertions.*;

import org.junit.Test;


public class AssertJTest {
	
	@Test
	public void checkEquality() {
		Person person= new Person("Barrack", "Obama");
		Person personClone = new Person("Barrack", "Obama");
	    
		assertThat(person).isEqualTo(personClone);
	}

}
