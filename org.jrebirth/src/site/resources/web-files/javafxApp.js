function launchApplication(jnlpfile) {
	dtjava.launch(            {
			url : 'http://apps.jrebirth.org/' + JAVAFX_APP_JNLP,
			jnlp_content : ''
		},
		{
			javafx : '2.0+'
		},
		{}
	);
	return false;
}
function javafxEmbed() {
	dtjava.embed(
		{
			url : 'http://apps.jrebirth.org/' + JAVAFX_APP_JNLP,
			placeholder : 'javafx-app-placeholder',
			width : JAVAFX_APP_WIDTH,
			height : JAVAFX_APP_HEIGHT,
			jnlp_content : ''
		},
		{
			javafx : '2.0+'
		},
		{}
	);
}
<!-- Embed FX application into web page once page is loaded -->
dtjava.addOnloadCallback(javafxEmbed);