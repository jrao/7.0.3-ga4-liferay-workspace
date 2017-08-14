<%@ include file="/init.jsp" %>

<%
JNDISpringExample.sayHello();

JNDISpringExample.useJNDI();
%>

<p>
	<b><liferay-ui:message key="jndi-spring-example-portlet.caption"/></b>
</p>

<p>Hello, World!</p>