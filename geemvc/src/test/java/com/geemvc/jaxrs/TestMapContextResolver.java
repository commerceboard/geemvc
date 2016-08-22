/*
 * Copyright 2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.geemvc.jaxrs;

import com.geemvc.mock.bean.Person;

import javax.inject.Singleton;
import javax.ws.rs.ext.ContextResolver;
import javax.ws.rs.ext.Provider;
import java.util.Map;

/**
 * Created by Michael on 16.08.2016.
 */
@Provider
@Singleton
public class TestMapContextResolver implements ContextResolver<Map<String, Person>> {
    @Override
    public Map<String, Person> getContext(Class<?> type) {
        return null;
    }
}