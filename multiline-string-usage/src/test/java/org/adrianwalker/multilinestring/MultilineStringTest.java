package org.adrianwalker.multilinestring;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class MultilineStringTest {

	/**
	DELETE
   FROM post
   	*/
	@Multiline final String deleteFromPost = null;
	
	@Test
	public void readMultilineString() {
		System.out.println(deleteFromPost);
		assertThat(deleteFromPost, is(notNullValue()));
		assertThat(deleteFromPost.trim(), is("DELETE\n   FROM post"));
	}
}
