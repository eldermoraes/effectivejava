/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.eldermoraes.item01staticfactorymethods;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

/**
 *
 * @author eldermoraes
 */
public class VaryReturnTest {
    
    @Test
    public void isSmallCar(){
        VaryReturn v1 = VaryReturn.getInstance(4);
        
        assertTrue(VaryReturn.class.isAssignableFrom(v1.getClass()));
    }
    
    @Test
    public void isMiniVan(){
        VaryReturn v1 = VaryReturn.getInstance(7);
        
        assertTrue(VaryReturn.class.isAssignableFrom(v1.getClass()));
    }
    
    @Test
    public void isBus(){
        VaryReturn v1 = VaryReturn.getInstance(8);
        
        assertTrue(VaryReturn.class.isAssignableFrom(v1.getClass()));
    }    
}
