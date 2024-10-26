package com.springMockito.service;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;

public class MockitoCaptorTest {
	
	@Test
	
	public void captorTest() {
		
		List<String> mockList = mock(List.class);
		
		mockList.add("kamal");
		
		//----captor object---------
		
		ArgumentCaptor<String> argCapture = ArgumentCaptor.forClass(String.class);
		
		verify(mockList).add(argCapture.capture());
		
		Assertions.assertEquals("kamal",argCapture.getValue());
	}

}
