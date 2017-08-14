<%@ include file="/init.jsp" %>

<%
JNDIExample.sayHello();

JNDIExample.useJNDI();
%>

<p>
	<b><liferay-ui:message key="jndi-example-portlet.caption"/></b>
</p>