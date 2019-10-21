package com.teste;

import java.util.List;

import org.junit.Test;

import static org.easymock.EasyMock.*;

public class EasyMockTest {

	@Test
	public void test() {
		List mock = createNiceMock(List.class);
		
		expect(mock.get(0)).andStubReturn("one");
		expect(mock.get(1)).andStubReturn("two");
		mock.clear();
	
		replay(mock);
	
		//someCodeThatInteractsWithMock();
	
		verify(mock); 
	
	}
}
