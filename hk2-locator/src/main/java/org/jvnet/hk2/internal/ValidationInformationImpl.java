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

package org.jvnet.hk2.internal;

import java.util.HashSet;

import org.glassfish.hk2.api.ActiveDescriptor;
import org.glassfish.hk2.api.Filter;
import org.glassfish.hk2.api.Injectee;
import org.glassfish.hk2.api.Operation;
import org.glassfish.hk2.api.ValidationInformation;

/**
 * @author jwells
 *
 */
public class ValidationInformationImpl implements ValidationInformation {
    private final static String SERVICE_LOCATOR_IMPL = "org.jvnet.hk2.internal.ServiceLocatorImpl";
    private final static String VALIDATE_METHOD = "validate";
    private final static String CHECK_METHOD = "checkConfiguration";

    private final static String[] SKIP_ME = {
        "org.jvnet.hk2.internal",
        "org.jvnet.hk2.external.generator",
        "org.glassfish.hk2.extension",
        "org.glassfish.hk2.api",
        "org.glassfish.hk2.internal",
        "org.glassfish.hk2.utilities",
        "org.glassfish.hk2.utilities.binding",
        "org.jvnet.hk2.annotations",
        "org.glassfish.hk2.utilities.cache",
        "org.glassfish.hk2.utilities.cache.internal",
        "org.glassfish.hk2.utilities.reflection",
        "org.jvnet.hk2.component",
        "java.util.concurrent"
    };

    private final static HashSet<String> PACKAGES_TO_SKIP = new HashSet<String>();

    static {
        for (String pack : SKIP_ME) {
            PACKAGES_TO_SKIP.add(pack);
        }
    }
    private final Operation operation;
    private final ActiveDescriptor<?> candidate;
    private final Injectee injectee;
    private final Filter filter;

    /**
     * Creates the validation information
     * @param operation The operation to perform
     * @param candidate The candidate to perform it on
     * @param injectee The injecteee that may be involved
     * @param filter The filter that may be involved in the lookup
     */
    public ValidationInformationImpl(Operation operation,
            ActiveDescriptor<?> candidate,
            Injectee injectee,
            Filter filter) {
        this.operation = operation;
        this.candidate = candidate;
        this.injectee = injectee;
        this.filter = filter;
    }

    /**
     * Creates the validation information
     * @param operation The operation to perform
     * @param candidate The candidate to perform it on
     */
    public ValidationInformationImpl(Operation operation,
            ActiveDescriptor<?> candidate) {
        this(operation, candidate, null, null);
    }

    /* (non-Javadoc)
     * @see org.glassfish.hk2.api.ValidationInformation#getOperation()
     */
    @Override
    public Operation getOperation() {
        return operation;
    }

    /* (non-Javadoc)
     * @see org.glassfish.hk2.api.ValidationInformation#getCandidate()
     */
    @Override
    public ActiveDescriptor<?> getCandidate() {
        return candidate;
    }

    /* (non-Javadoc)
     * @see org.glassfish.hk2.api.ValidationInformation#getInjectee()
     */
    @Override
    public Injectee getInjectee() {
        return injectee;
    }

    /* (non-Javadoc)
     * @see org.glassfish.hk2.api.ValidationInformation#getFilter()
     */
    @Override
    public Filter getFilter() {
        return filter;
    }

    private String getPackage(String name) {
        int index = name.lastIndexOf('.');
        if (index < 0) return name;

        return name.substring(0, index);
    }

    /**
     * The implementation of this method is VERY dependent on the implementation
     * of ServiceLocatorImpl.  Any refactoring of ServiceLocatorImpl having to
     * do with validation will likely cause this code to break.  Hopefully the
     * unit tests will catch any such failures!
     */
    @Override
    public StackTraceElement getCaller() {
        StackTraceElement frames[] = Thread.currentThread().getStackTrace();

        boolean foundValidationCaller = false;
        for (StackTraceElement e : frames) {
            if (!foundValidationCaller) {
                if (SERVICE_LOCATOR_IMPL.equals(e.getClassName()) &&
                        (VALIDATE_METHOD.equals(e.getMethodName()) ||
                         CHECK_METHOD.equals(e.getMethodName()))) {
                    foundValidationCaller = true;
                }
            }
            else {
                String pack = getPackage(e.getClassName());
                if (!PACKAGES_TO_SKIP.contains(pack)) return e;
            }
        }

        return null;
    }

    public String toString() {
        return "ValidationInformation(" + operation + "," +
            candidate + "," +
            injectee + "," +
            filter + "," +
            System.identityHashCode(this) + ")";
    }
}
