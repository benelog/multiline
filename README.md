multiline
=========

Supports multiline-string literals in Java by annotation-processors and javadoc. 

This project is originated from the blog post of Adrian Walker ( <http://www.adrianwalker.org/2011/12/java-multiline-string.html> ).

## Usage
You can use multiline string literals with javadoc comments and '@Multiline' annotation.

For example,

  /**
	DELETE
  FROM post
 	*/
	@Multiline static String deleteFromPost;

is equivalent to the following expression in groovy.

	@Multiline static String deleteFromPost = """
  DELETE
  FROM post
"""
