/*
 * Copyright (c) 2012, 2018 Oracle and/or its affiliates. All rights reserved.
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

package com.oracle.sdp.management;

import java.io.IOException;
import java.net.URL;

import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.BundleException;

/**
 * Installs the SDP
 * 
 * @author jwells
 *
 */
public class InstallSDPService {
    private final static String RESOURCE = "bundles/sdp.jar";
    private final BundleContext context;
    
    private Bundle installedSDP;
    
    public InstallSDPService(BundleContext context) {
        this.context = context;
    }
    
    public void install() throws IOException, BundleException {
        Bundle bundle = context.getBundle();
        URL url = bundle.getResource(RESOURCE);
        
        installedSDP = context.installBundle("sdp", url.openStream());
        installedSDP.start();
    }
    
    public boolean uninstall() throws BundleException {
        if (installedSDP == null) return false;
        Bundle localSDP = installedSDP;
        installedSDP = null;
        
        localSDP.uninstall();
        
        return true;
        
    }

}
