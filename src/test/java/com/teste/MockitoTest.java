package com.teste;

import java.util.List;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class MockitoTest {

	@Test
	public void test() {
		List mock = mock(List.class);

		when(mock.get(0)).thenReturn("one");
		when(mock.get(1)).thenReturn("two");

		//someCodeThatInteractsWithMock();

		verify(mock).clear();  	
	}
}
