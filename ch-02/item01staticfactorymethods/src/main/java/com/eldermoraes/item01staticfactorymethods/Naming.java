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
 * @author eldmorae
 */
public class Naming {

    private final String s1;
    private final String s2;
    private final String s3;
    private final String s4;
    private final Integer i1;
    private final Integer i2;

    private Naming() {
        this.s1 = null;
        this.s2 = null;
        this.s3 = null;
        this.s4 = null;
        this.i1 = null;
        this.i2 = null;
    }

    private Naming(String s1, String s2, Integer i1) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = null;
        this.s4 = null;
        this.i1 = i1;
        this.i2 = null;
    }

    private Naming(String s3, Integer i2, String s4) {
        this.s1 = null;
        this.s2 = null;
        this.s3 = s3;
        this.i1 = null;
        this.s4 = s4;
        this.i2 = i2;
    }

    public static Naming noParam() {
        return new Naming();
    }

    public static Naming sOneStwoIone(String s1, String s2, Integer i1) {
        return new Naming(s1, s2, i1);
    }

    public static Naming sThreeItwoSfour(String s3, Integer i2, String s4) {
        return new Naming(s3, i2, s4);
    }

    public String getS1() {
        return s1;
    }

    public String getS2() {
        return s2;
    }

    public String getS3() {
        return s3;
    }

    public String getS4() {
        return s4;
    }

    public Integer getI1() {
        return i1;
    }

    public Integer getI2() {
        return i2;
    }
}
