/*
 * Copyright (c) 2008 ISDC! Romania. All rights reserved.
 */
package ro.isdc.wro.cache;

/**
 * CacheStrategy.java.
 * <p>
 * This interface will be implemented by all classes which will support a
 * caching strategy.
 * 
 * @author alexandru.objelean / ISDC! Romania
 * @version $Revision: $
 * @date $Date: $
 * @created Created on Nov 18, 2008
 */
public interface CacheStrategy<K, V> {
  /**
   * Put a value in the cache using a key.
   * 
   * @param key
   *          Object.
   * @param value
   *          Object.
   */
  void put(final K key, final V value);

  /**
   * Restore a value from the cache.
   * 
   * @param key
   *          Object
   * @return value Object.
   */
  V get(final K key);

}