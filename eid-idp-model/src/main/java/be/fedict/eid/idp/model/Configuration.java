/*
 * eID Identity Provider Project.
 * Copyright (C) 2010-1012 FedICT.
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

package be.fedict.eid.idp.model;

import java.util.List;

import javax.ejb.Local;

import be.fedict.eid.idp.entity.AppletConfigEntity;

@Local
public interface Configuration {

	AppletConfigEntity getAppletConfig();

	void setAppletConfig(AppletConfigEntity appletConfig);

	void removeAppletConfig(AppletConfigEntity appletConfig);

	void setValue(ConfigProperty configProperty, String index, Object value);

	void setValue(ConfigProperty configProperty, Object value);

	<T> T getValue(ConfigProperty configProperty, String index, Class<T> type);

	<T> T getValue(ConfigProperty configProperty, Class<T> type);

	void removeValue(ConfigProperty configProperty, String index);

	void removeValue(ConfigProperty configProperty);

	List<String> getIndexes(ConfigProperty configProperty);
}
