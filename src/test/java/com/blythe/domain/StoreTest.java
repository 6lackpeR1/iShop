package com.blythe.domain;

import static org.junit.Assert.*;
import org.junit.Test;

import com.blythe.domain.Store;

public class StoreTest {

	@Test
	public void testGetName(){
		Store store = new Store();
		String result = store.getName();
		assertEquals(result,"hello");
	}

	@Test
	public void testPartnumCorrectFormat(){
		Store store = new Store();
	 	String partnum = "192000-000";
		store.setPartnum(partnum);
		assertEquals(partnum, store.getPartnum());
	}

	@Test
	public void testPartnumIncorrectFormat(){
		Store store = new Store();
	 	String partnum = "192000";
		store.setPartnum(partnum);
		assertNull(store.getPartnum());
	}
	
}
