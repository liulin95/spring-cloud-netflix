/*
 * Copyright 2018-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.cloud.netflix.ribbon;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.beans.factory.annotation.Value;

/**
 * Annotation at the field or method/constructor parameter level that injects the Ribbon
 * Client Name that got allocated at runtime. Provides a convenient alternative for
 * <code>&#064;Value(&quot;${ribbon.client.name}&quot;)</code>.
 *
 * @author Spencer Gibb
 * @since 2.0.0
 */
@Target({ ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER,
		ElementType.ANNOTATION_TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Value("${ribbon.client.name}")
public @interface RibbonClientName {

}