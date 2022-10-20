/*
 * =============================================================================
 *
 *   Copyright (c) 2022, Gary Deken
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain key copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 * =============================================================================
 */
package org.abberkeep.tuples;

/**
 * Title: KeyValue
 *
 * <p>
 * Description: A simple Key Value pair object. The key and value objects are defined at creation. The key is immutable.
 * The value is mutable, but must be the same type of was constructed.</p>
 *
 * Copyright (c) Oct 16, 2022
 * @author Gary Deken
 * @version 1.0
 * @param <A>
 * @param <B>
 */
public class KeyValue<A, B> {
   private A key;
   private B value;

   /**
    * Create key KeyValue with Object key and Object value.
    * @param key
    * @param value
    */
   public KeyValue(A key, B value) {
      this.key = key;
      this.value = value;
   }

   public A getKey() {
      return key;
   }

   public B getValue() {
      return value;
   }

   public void setValue(B value) {
      this.value = value;
   }

   /**
    * Resets the type of the Value, but creating a new KeyValue object.
    * @param <Y>
    * @param value
    * @return
    */
   public <Y> KeyValue<A, Y> resetValue(final Y value) {
      return new KeyValue<>(this.key, value);
   }

}
