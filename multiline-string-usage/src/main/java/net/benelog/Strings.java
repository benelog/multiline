package net.benelog;

import org.adrianwalker.multilinestring.Multiline;

public class Strings {
	  /**
	  <html>
	    <head/>
	    <body>
	      <p>
	        Hello<br/>
	        Multiline<br/>
	        World<br/>
	      </p>
	    </body>
	  </html>	  */
	  @Multiline
	  public static String html;
	  
	  
	  /**
		SELECT title, email, name
		FROM post
		WHERE post_id = :postId
	  */
	  @Multiline
	  public static String selectFromPost;
}
