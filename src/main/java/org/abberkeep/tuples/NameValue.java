/*
 * =============================================================================
 *
 *   Copyright (c) 2022, Gary Deken
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
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
 * Title: NameValue
 *
 * <p>
 * Description: A simple Name Value pair object. The name is a String representing the "name" of this pair. This Name is
 * immutable. The value is mutable, but must be the same type of was constructed.</p>
 *
 * Copyright (c) Oct 16, 2022
 * @author Gary Deken
 * @version 1.0
 * @param <String>
 * @param <A>
 */
public class NameValue<String, A> {
   private String name;
   private A value;

   public NameValue(String name, A value) {
      this.name = name;
      this.value = value;
   }

   public String getName() {
      return name;
   }

   public A getValue() {
      return value;
   }

   public void setValue(A value) {
      this.value = value;
   }

   /**
    * Resets the type of the Value, but creating a new NameValue object.
    * @param <Y>
    * @param value
    * @return
    */
   public <Y> NameValue<String, Y> resetValue(final Y value) {
      return new NameValue<>(this.name, value);
   }

}
