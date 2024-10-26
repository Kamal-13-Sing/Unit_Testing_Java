package com.springMockito.service;

import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.springMockito.entity.Student;

//@SpringBootTest // --it start application when test start
@ExtendWith(value = {MockitoExtension.class})
public class StudentServiceTest {

//	@Spy //---it call actual database----
	@Mock
	private StudentServiceImp stdSrvsImp;
	
	@Test
	public void testGetById() {
		
		//Mockito.mock(StudentServiceImp.class);	//- manually
		
		System.out.println(stdSrvsImp.hashCode());
		
	
		when(stdSrvsImp.getById(Mockito.anyInt())).thenReturn(getFakeObj());
		//-----anyInt() mean not fixed 
		
		//when(stdSrvsImp.getById(1)).thenReturn(getFakeObj());
		
		Student std = stdSrvsImp.getById(1);
		System.out.println(std.getId());
		System.out.println(std.getName());
		System.out.println(std.getAddress());
		
	}
	
	//----fake object-------------
	
	public Student getFakeObj() {
		
		Student st = new Student();
		st.setId(1);
		st.setName("Ram");
		st.setAddress("butwal");
		
		return st;
	}


}
