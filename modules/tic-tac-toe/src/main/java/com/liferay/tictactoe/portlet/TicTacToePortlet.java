package com.liferay.tictactoe.portlet;

import com.liferay.tictactoe.constants.TicTacToePortletKeys;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.Portlet;

import org.osgi.service.component.annotations.Component;

/**
 * @author jrao
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.css-class-wrapper=tic-tac-toe-portlet",
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.instanceable=true",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.header-portlet-css=/css/test.css",
		"com.liferay.portlet.header-portlet-js=/css/main.js",
		"javax.portlet.display-name=Tic Tac Toe Portlet",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + TicTacToePortletKeys.TicTacToe,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class TicTacToePortlet extends MVCPortlet {
}