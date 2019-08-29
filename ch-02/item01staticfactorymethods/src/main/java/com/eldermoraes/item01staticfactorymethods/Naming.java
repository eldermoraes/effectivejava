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

    private final String firstname;
    private final String lastname;
    private final String email;
    private final Integer age;

    private Naming() {
        this.firstname = null;
        this.lastname = null;
        this.email = null;
        this.age = null;
    }

    private Naming(String firstname, String lastname, Integer age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = null;
        this.age = age;
    }

    private Naming(String firstname, Integer age, String email) {
        this.firstname = firstname;
        this.lastname = null;
        this.email = email;
        this.age = age;
    }

    public static Naming noParam() {
        return new Naming();
    }

    public static Naming firstnameAndLastname(String firstname, String lastname, Integer age) {
        return new Naming(firstname, lastname, age);
    }

    public static Naming firstnameAndEmail(String firstname, String email, Integer age) {
        return new Naming(firstname, age, email);
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }

    public Integer getAge() {
        return age;
    }

}
