/*
 * Copyright (c) 2003, 2021 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Distribution License v. 1.0, which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: BSD-3-Clause
 */

package jakarta.xml.bind;

/**
 * This event indicates that a problem was encountered while validating the    
 * incoming XML data during an unmarshal operation, while performing 
 * on-demand validation of the Java content tree, or while marshalling the
 * Java content tree back to XML data.
 * 
 * @author <ul><li>Ryan Shoemaker, Sun Microsystems, Inc.</li><li>Kohsuke Kawaguchi, Sun Microsystems, Inc.</li><li>Joe Fialli, Sun Microsystems, Inc.</li></ul> 
 * @see ValidationEventHandler
 * @since 1.6, JAXB 1.0
 */
public interface ValidationEvent {
    
    /** 
     * Conditions that are not errors or fatal errors as defined by the 
     * XML 1.0 recommendation 
     */
    int WARNING     = 0;
    
    /**
     * Conditions that correspond to the definition of "error" in section 
     * 1.2 of the W3C XML 1.0 Recommendation
     */
    int ERROR       = 1;
    
    /**
     * Conditions that correspond to the definition of "fatal error" in section 
     * 1.2 of the W3C XML 1.0 Recommendation
     */
    int FATAL_ERROR = 2;

    /**
     * Retrieve the severity code for this warning/error. 
     *
     * <p>
     * Must be one of {@code ValidationEvent.WARNING},
     * {@code ValidationEvent.ERROR}, or {@code ValidationEvent.FATAL_ERROR}.
     *
     * @return the severity code for this warning/error
     */
    int getSeverity();
    
    /**
     * Retrieve the text message for this warning/error.
     *
     * @return the text message for this warning/error or null if one wasn't set
     */
    String getMessage();
    
    /**
     * Retrieve the linked exception for this warning/error.
     *
     * @return the linked exception for this warning/error or null if one
     *         wasn't set
     */
    Throwable getLinkedException();
    
    /**
     * Retrieve the locator for this warning/error.
     *
     * @return the locator that indicates where the warning/error occurred
     */
    ValidationEventLocator getLocator();
    
}
