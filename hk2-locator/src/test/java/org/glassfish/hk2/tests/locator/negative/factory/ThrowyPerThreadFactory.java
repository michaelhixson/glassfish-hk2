/*
 * Copyright (c) 2014, 2018 Oracle and/or its affiliates. All rights reserved.
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

package org.glassfish.hk2.tests.locator.negative.factory;

import javax.inject.Singleton;

import org.glassfish.hk2.api.Factory;
import org.glassfish.hk2.api.PerThread;

/**
 * @author jwells
 *
 */
@Singleton
public class ThrowyPerThreadFactory implements Factory<SimpleService4> {

    @Override @PerThread
    public SimpleService4 provide() {
        throw new RuntimeException(NegativeFactoryTest.THROW_STRING);
    }

    @Override
    public void dispose(SimpleService4 instance) {
        // Do nothing
        
    }

}
