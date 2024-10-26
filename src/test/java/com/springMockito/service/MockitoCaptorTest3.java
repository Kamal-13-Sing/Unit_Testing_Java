package com.springMockito.service;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.springMockito.entity.Person;

@ExtendWith(value = {MockitoExtension.class})
public class MockitoCaptorTest3 {
	
	@Captor		//---use annotation  insted of mannual
	private ArgumentCaptor<Person> argCaptor;
	
	@Test
	
	public void captorTest() {
		
		
		  List<Person> mockList = mock(List.class);
		  
		  Person p1 = new Person(1,"kamal");
		  Person p2 = new Person(2,"Ramu");
		 
		  
		  
		  //-----add  3 object ---
		  mockList.add(p1);
		  mockList.add(p2);
		  mockList.add(new Person(3, "Bimal"));
		  
		  
		  Mockito.verify(mockList, times(3)).add(argCaptor.capture());
		  //----it calls method 3 times--------------
		  
		  List<Person> personList = argCaptor.getAllValues();
		  
		  
		  Assertions.assertEquals(1,personList.get(0).getId());
		  Assertions.assertEquals("kamal",personList.get(0).getName());
		 
		  Assertions.assertEquals(2,personList.get(1).getId());
		  Assertions.assertEquals("Ramu",personList.get(1).getName());

		  Assertions.assertEquals(3,personList.get(2).getId());
		  Assertions.assertEquals("Bimal",personList.get(2).getName());
	}

}
