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

/**
 *
 * @author eldermoraes
 */
public class ReturnSubtype {
    
    public static ReturnSubtype getInstanceOfSubtype1(){
        return new Subtype1();
    }
    
    public static ReturnSubtype getInstanceOfSubtype2(){
        return new Subtype2();
    }    

    private static class Subtype1 extends ReturnSubtype{
                
    }
    
    private static class Subtype2 extends ReturnSubtype{
        
    }
}

