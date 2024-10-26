package com.springMockito.service;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(value = {MockitoExtension.class})
public class MockitoCaptorTest2 {
	
	@Captor		//---use annotation  insted of mannual
	private ArgumentCaptor<String> argCaptor;
	
	@Test
	
	public void captorTest() {
		
		List<String> mockList = mock(List.class);
		
		mockList.add("kamal");
		
		//----captor object---------
		
		//ArgumentCaptor<String> argCaptor = ArgumentCaptor.forClass(String.class);
		
		verify(mockList).add(argCaptor.capture());
		
		Assertions.assertEquals("kamal",argCaptor.getValue());
	}

}
