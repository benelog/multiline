Multiline
=========

Supports multiline-string literals in Java by annotation-processors and javadoc comments. 

This project is originated from Adrian Walker's blog post ( <http://www.adrianwalker.org/2011/12/java-multiline-string.html> ).

## Usage
You can use multiline string literals with javadoc comments and '@Multiline' annotation.

For example,

	/**
	DELETE
 	FROM post
 	*/
	@Multiline static String deleteFromPost;

is equivalent to the following expression in Groovy.

	static String deleteFromPost = """
	DELETE
	FROM post
	"""

## Settings
- Settings for a Maven project with Eclipse
- Settings for a Non-Maven Java Project with Eclipse

## Release Notes
- 0.1.2 
- 0.1.0 : the source code from [Adrian Walker's blog post](http://www.adrianwalker.org/2011/12/java-multiline-string.html)
