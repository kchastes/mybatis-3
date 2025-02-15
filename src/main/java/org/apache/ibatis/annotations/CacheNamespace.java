/*
 *    Copyright 2009-2022 the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       https://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package org.apache.ibatis.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.apache.ibatis.cache.Cache;
import org.apache.ibatis.cache.decorators.LruCache;
import org.apache.ibatis.cache.impl.PerpetualCache;

/**
 * The annotation that specify to use cache on namespace(e.g. mapper interface).
 *
 * <p>
 * <b>How to use:</b>
 *
 * <pre>
 * &#064;CacheNamespace(implementation = CustomCache.class, properties = {
 *   &#064;Property(name = "host", value = "${mybatis.cache.host}"),
 *   &#064;Property(name = "port", value = "${mybatis.cache.port}"),
 *   &#064;Property(name = "name", value = "usersCache")
 * })
 * public interface UserMapper {
 *   // ...
 * }
 * </pre>
 *
 * @author Clinton Begin
 * @author Kazuki Shimizu
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface CacheNamespace {

  /**
   * 返回要使用的缓存实现类型.
   *
   * @return the cache implementation type
   */
  Class<? extends Cache> implementation() default PerpetualCache.class;

  /**
   * 返回要使用的缓存驱逐实现类型
   *
   * @return the cache evicting implementation type
   */
  Class<? extends Cache> eviction() default LruCache.class;

  /**
   * 返回刷新间隔
   *
   * @return the flush interval
   */
  long flushInterval() default 0;

  /**
   * 返回缓存大小
   *
   * @return the cache size
   */
  int size() default 1024;

  /**
   * 返回是否使用读/写缓存.
   *
   * @return {@code true} if use read/write cache; {@code false} if otherwise
   */
  boolean readWrite() default true;

  /**
   * 返回是否在请求时阻塞缓存
   *
   * @return {@code true} if block the cache; {@code false} if otherwise
   */
  boolean blocking() default false;

  /**
   * 返回实现对象的属性值。
   *
   * @return property values
   * @since 3.4.2
   */
  Property[] properties() default {};

}
