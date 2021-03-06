package org.apache.maven.diagrams.connectors.classes.test_classes;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

/**
 * @author <a href="mailto:ptab@newitech.com">Piotr Tabor</a>
 * @version $Id$
 */
public class Color
{
    private int r;

    private int g;

    private int b;

    public Color( int a_r, int a_g, int a_b )
    {
        r = a_r;
        g = a_g;
        b = a_b;
    }

    public int getRed()
    {
        return r;
    }

    public int getGreen()
    {
        return g;
    }

    public int getBlue()
    {
        return b;
    }
}
