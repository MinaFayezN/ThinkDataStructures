/**
 * 
 */
package com.allendowney.thinkdast;

import java.util.ArrayList;

import org.junit.Before;


/**
 * @author downey
 *
 */
public class MyLinkedListTest extends MyArrayListTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);

		myList = new MyLinkedList<>();
		myList.addAll(list);
	}
}
