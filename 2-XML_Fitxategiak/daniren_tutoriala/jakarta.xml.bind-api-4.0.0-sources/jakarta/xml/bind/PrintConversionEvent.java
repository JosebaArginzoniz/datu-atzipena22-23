/*
 * Copyright (c) 2004, 2021 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Distribution License v. 1.0, which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: BSD-3-Clause
 */

package jakarta.xml.bind;

/**
 * This event indicates that a problem was encountered while converting data
 * from the Java content tree into its lexical representation.
 * 
 * @author <ul><li>Ryan Shoemaker, Sun Microsystems, Inc.</li><li>Kohsuke Kawaguchi, Sun Microsystems, Inc.</li><li>Joe Fialli, Sun Microsystems, Inc.</li></ul> 
 * @see ValidationEvent
 * @see ValidationEventHandler
 * @see Marshaller
 * @since 1.6, JAXB 1.0
 */
public interface PrintConversionEvent extends ValidationEvent {

}
