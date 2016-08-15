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

package com.geemvc.taglib.form;

import javax.servlet.jsp.JspException;
import java.io.IOException;

public class InputHiddenTagSupport extends InputTagSupport {
    public InputHiddenTagSupport() {
        dynamicAttributes.put("type", "hidden");
    }

    @Override
    public void writePostFieldBlock(String fieldName) throws JspException, IOException {
        // Do nothing.
    }

    @Override
    public void writePreFieldBlock(String elementId, String name, Object value) throws JspException, IOException {
        // Do nothing.
    }
}
