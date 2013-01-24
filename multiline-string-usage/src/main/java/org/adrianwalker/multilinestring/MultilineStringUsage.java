package org.adrianwalker.multilinestring;

public final class MultilineStringUsage {

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
	</html>
	*/
	@Multiline private static String html;

	public static void main(final String[] args) {
		System.out.println(html);
	}
}
