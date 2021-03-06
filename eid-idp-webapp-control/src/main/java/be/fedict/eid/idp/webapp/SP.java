/*
 * eID Identity Provider Project.
 * Copyright (C) 2010 FedICT.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License version
 * 3.0 as published by the Free Software Foundation.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, see 
 * http://www.gnu.org/licenses/.
 */

package be.fedict.eid.idp.webapp;

import java.io.IOException;
import java.io.OutputStream;

import javax.ejb.Local;

@Local
public interface SP {

	public static final String LANGUAGE_LIST_SESSION_ATTRIBUTE = "LanguageList";

	/*
	 * Lifecycle.
	 */
	void destroy();

	/*
	 * Accessors
	 */
	String getRp();

	boolean isRpLogo();

	void paint(OutputStream stream, Object object) throws IOException;

	long getTimeStamp();

	/*
	 * Factories
	 */
	void attributeFactory();

	/*
	 * Actions
	 */
	void initLanguage();
}
