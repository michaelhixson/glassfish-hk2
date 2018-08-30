/*
 * Copyright (c) 2007, 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0, which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the
 * Eclipse Public License v. 2.0 are satisfied: GNU General Public License,
 * version 2 with the GNU Classpath Exception, which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 */

package com.sun.enterprise.module;

import org.jvnet.hk2.annotations.Contract;
import org.jvnet.hk2.annotations.Service;

/**
 * Modules that wish to invoke special logic when it is loaded, started 
 * or stopped should implement this interface.
 *
 * <p>
 * To define an implementation of this in a module, write a class
 * that implements this interface and puts {@link Service} on it.
 * Maven will take care of the rest.
 * 
 * @author dochez
 * @see ManifestConstants#LIFECYLE_POLICY
 */
@Contract
public interface LifecyclePolicy {
    /**
     * Callback when the module enters the {@link ModuleState#READY READY} state.
     * This is a good time to do any type of one time initialization 
     * or set up access to resources
     * @param module the module instance
     */
    public void start(Module module);
    
    /** 
     * Callback before the module starts being unloaded. The runtime will 
     * free all the module resources and returned to a {@link ModuleState#NEW NEW} state.
     * @param module the module instance
     */
    public void stop(Module module);
    
}
