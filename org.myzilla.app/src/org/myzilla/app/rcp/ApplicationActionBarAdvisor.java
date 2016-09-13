/*
 * Copyright (c) 2004 - 2012 Eike Stepper (Berlin, Germany) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Eike Stepper - initial API and implementation
 */
package org.myzilla.app.rcp;

import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;

/**
 * @author Eike Stepper
 */
public class ApplicationActionBarAdvisor extends ActionBarAdvisor
{
  public ApplicationActionBarAdvisor(IActionBarConfigurer configurer)
  {
    super(configurer);
  }
}
