/*
 * Copyright (C) 2003-2012 eXo Platform SAS.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package org.gatein.example.portlet.demo;
import org.exoplatform.webui.commons.UIDocumentSelector;
import org.exoplatform.webui.config.annotation.ComponentConfig;
import org.exoplatform.webui.config.annotation.EventConfig;
import org.exoplatform.webui.core.UIPortletApplication;
import org.exoplatform.webui.core.lifecycle.UIApplicationLifecycle;
import org.exoplatform.webui.event.Event;
import org.exoplatform.webui.event.EventListener;

/**
 * Created by The eXo Platform SAS Author : Nguyen Viet Bang
 * bangnv@exoplatform.com Sep 14, 2012
 */
@ComponentConfig(lifecycle = UIApplicationLifecycle.class, template = "app:/groovy/portlet/UIDemoPortlet.gtmpl", events = { @EventConfig(listeners = UIDemoPortlet.OpenPopupActionListener.class) })
public class UIDemoPortlet extends UIPortletApplication {
	protected static final String UIDOCUMENTSELECTOR = "UIDocumentSelector";

	public UIDemoPortlet() throws Exception {
		UIDocumentSelector documentSelector = addChild(
				UIDocumentSelector.class, null, UIDOCUMENTSELECTOR);
		documentSelector.setShowUpload(true);
	}

	static public class OpenPopupActionListener extends
			EventListener<UIDemoPortlet> {

		@Override
		public void execute(Event<UIDemoPortlet> event) throws Exception {
			// TODO Auto-generated method stub

		}
		// public void execute(Event<UIDemoPortlet> event) throws Exception {
		// UIDemoPortlet portlet = event.getSource();
		// UIPopupWindow popup = portlet.getChild(UIPopupWindow.class);
		// popup.setRendered(true);
		// popup.setShow(true);
		// // popup.set
		// }
	}

}
