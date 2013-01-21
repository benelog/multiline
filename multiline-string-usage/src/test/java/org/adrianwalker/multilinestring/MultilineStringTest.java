package org.adrianwalker.multilinestring;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class MultilineStringTest {

	/**
	DELETE
   FROM post
   	*/ @Multiline 
	public static String deleteFromPost;

	@Test
	public void readMultilineString() {
		System.out.println(deleteFromPost);
		assertThat(deleteFromPost.trim(), is("DELETE\n   FROM post"));
	}
}
