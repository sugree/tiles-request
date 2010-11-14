/*
 * $Id$
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.apache.tiles.request.render;

import static org.junit.Assert.*;

import org.apache.tiles.request.render.NoSuchRendererException;
import org.junit.Test;

/**
 * Tests {@link NoSuchRendererException}.
 *
 * @version $Rev$ $Date$
 */
public class NoSuchRendererExceptionTest {

    /**
     * Test method for {@link NoSuchRendererException#NoSuchRendererException()}.
     */
    @Test
    public void testNoSuchRendererException() {
        NoSuchRendererException exception = new NoSuchRendererException();
        assertNull(exception.getMessage());
        assertNull(exception.getCause());
    }

    /**
     * Test method for {@link NoSuchRendererException#NoSuchRendererException(java.lang.String)}.
     */
    @Test
    public void testNoSuchRendererExceptionString() {
        NoSuchRendererException exception = new NoSuchRendererException("my message");
        assertEquals("my message", exception.getMessage());
        assertNull(exception.getCause());
    }

    /**
     * Test method for {@link NoSuchRendererException#NoSuchRendererException(java.lang.Throwable)}.
     */
    @Test
    public void testNoSuchRendererExceptionThrowable() {
        Throwable cause = new Throwable();
        NoSuchRendererException exception = new NoSuchRendererException(cause);
        assertEquals(cause.toString(), exception.getMessage());
        assertEquals(cause, exception.getCause());
    }

    /**
     * Test method for {@link NoSuchRendererException#NoSuchRendererException(java.lang.String, java.lang.Throwable)}.
     */
    @Test
    public void testNoSuchRendererExceptionStringThrowable() {
        Throwable cause = new Throwable();
        NoSuchRendererException exception = new NoSuchRendererException("my message", cause);
        assertEquals("my message", exception.getMessage());
        assertEquals(cause, exception.getCause());
    }

}
