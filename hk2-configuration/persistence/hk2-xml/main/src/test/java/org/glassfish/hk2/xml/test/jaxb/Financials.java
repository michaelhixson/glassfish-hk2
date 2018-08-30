/*
 * Copyright (c) 2015, 2018 Oracle and/or its affiliates. All rights reserved.
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

package org.glassfish.hk2.xml.test.jaxb;

import javax.xml.bind.annotation.XmlElement;

/**
 * @author jwells
 *
 */
public class Financials {
    private String symbol;
    private String exchange;
    
    @XmlElement
    public String getSymbol() { return symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
    
    @XmlElement
    public String getExchange() { return exchange; }
    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

}
