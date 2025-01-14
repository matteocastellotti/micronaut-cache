/*
 * Copyright 2017-2020 original authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.micronaut.cache.caffeine;

import io.micronaut.cache.CacheConfiguration;
import io.micronaut.cache.caffeine.configuration.CaffeineCacheConfiguration;
import io.micronaut.context.annotation.EachProperty;
import io.micronaut.context.annotation.Parameter;
import io.micronaut.runtime.ApplicationConfiguration;

/**
 * Default cache configuration implementation used to configure instances of {@link DefaultSyncCache}.
 *
 * @author graemerocher
 * @since 1.0.2
 */
@EachProperty(CacheConfiguration.PREFIX)
public class DefaultCacheConfiguration extends CaffeineCacheConfiguration {

    /**
     * Creates a new cache with the given name.
     *
     * @param cacheName                Name or key of the cache
     * @param applicationConfiguration The common application configuration
     */
    public DefaultCacheConfiguration(@Parameter String cacheName, ApplicationConfiguration applicationConfiguration) {
        super(cacheName, applicationConfiguration);
    }
}