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
 * Title: TupleAdd
 *
 * <p>
 * Description: Support Interface for the Tuple Object. This interface is used with adding an element to an existing
 * Tuple.</p>
 *
 * Copyright (c) Oct 16, 2022
 * @author Gary Deken
 * @version 1.0
 * @param <T> Object type to be added to a Tuple.
 */
public interface TupleAdd<T> {
   Tuple element(T t);

}
