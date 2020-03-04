/*
 * Copyright (c) 2020, WSO2 Inc. (http://wso2.com) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.ballerina.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Run {
    private static final Logger log = LoggerFactory.getLogger(Run.class);

    public static void main(String [] args) {
        Utils.downloadFile("1.1.1","ballerina-macos-installer-x64-1.1.1.pkg");
    }
}