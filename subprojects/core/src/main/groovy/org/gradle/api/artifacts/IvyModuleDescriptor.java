/*
 * Copyright 2014 the original author or authors.
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
package org.gradle.api.artifacts;

import org.gradle.api.Incubating;

import java.util.Map;

/**
 * The metadata about an Ivy module that acts as an input to a component metadata rule.
 */
@Incubating
public interface IvyModuleDescriptor {
    /***
     * Returns the branch attribute of the info element in this descriptor.
     *
     * @return the branch for this descriptor
     */
    String getBranch();

    /**
     * Returns the status attribute of the info element in this descriptor.
     *
     * @return the status for this descriptor
     */
    String getIvyStatus();

    /**
     * Returns a read-only map of the extra info declared in this descriptor.
     * <p>
     * The extra info is the set of all non-standard subelements of the <em>info</em> element.
     * For each such element, the returned map contains one entry. The entry's key is a
     * {@link NamespaceId} describing the namespace and name
     * of the extra element. The entry's value is the contents of the element.
     *
     * @return a read-only map of the extra info declared in this descriptor
     */
    Map<NamespaceId, String> getExtraInfo();
}
