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

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Title: Tuple
 *
 * <p>
 * Description: Java implementation of a Tuple class. This class will go up to ten tuple sets. Each element in the Tuple
 * can be of any object. This class is immutable, and the elements within cannot be changed, although attributes within
 * the containing objects can be changed.</p>
 *
 * Copyright (c) Oct 8, 2022
 * @author Gary Deken <gary@abberkeep.us>
 * @version 1.0
 * @param <A>
 * @param <B>
 * @param <C>
 * @param <D>
 * @param <E>
 * @param <F>
 * @param <G>
 * @param <H>
 * @param <I>
 * @param <J>
 */
public class Tuple<A, B, C, D, E, F, G, H, I, J> implements Iterable<Object> {
   private static final String UNSUPPORTED_SIZE = "Tuple is of size ";
   private int size;
   private TupleAdd tupleAdd;
   private A a;
   private B b;
   private C c;
   private D d;
   private E e;
   private F f;
   private G g;
   private H h;
   private I i;
   private J j;

   /**
    * Creates a Tuple with one element.
    * @param a
    */
   public Tuple(A a) {
      this.a = a;
      size = 1;
      tupleAdd = (TupleAdd<B>) (B b1) -> new Tuple(a, b1);
   }

   /**
    * Creates a Tuple with two elements.
    * @param a
    * @param b
    */
   public Tuple(A a, B b) {
      this.a = a;
      this.b = b;
      size = 2;
      tupleAdd = (TupleAdd<C>) (C c1) -> new Tuple(a, b, c1);
   }

   /**
    * Creates a Tuple with three elements.
    * @param a
    * @param b
    * @param c
    */
   public Tuple(A a, B b, C c) {
      this.a = a;
      this.b = b;
      this.c = c;
      size = 3;
      tupleAdd = (TupleAdd<D>) (D d1) -> new Tuple(a, b, c, d1);
   }

   /**
    * Creates a Tuple with four elements.
    * @param a
    * @param b
    * @param c
    * @param d
    */
   public Tuple(A a, B b, C c, D d) {
      this.a = a;
      this.b = b;
      this.c = c;
      this.d = d;
      size = 4;
      tupleAdd = (TupleAdd<E>) (E e1) -> new Tuple(a, b, c, d, e1);
   }

   /**
    * Creates a Tuple with five elements.
    * @param a
    * @param b
    * @param c
    * @param d
    * @param e
    */
   public Tuple(A a, B b, C c, D d, E e) {
      this.a = a;
      this.b = b;
      this.c = c;
      this.d = d;
      this.e = e;
      size = 5;
      tupleAdd = (TupleAdd<F>) (F f1) -> new Tuple(a, b, c, d, e, f1);
   }

   /**
    * Creates a Tuple with six elements.
    * @param a
    * @param b
    * @param c
    * @param d
    * @param e
    * @param f
    */
   public Tuple(A a, B b, C c, D d, E e, F f) {
      this.a = a;
      this.b = b;
      this.c = c;
      this.d = d;
      this.e = e;
      this.f = f;
      size = 6;
      tupleAdd = (TupleAdd<G>) (G g1) -> new Tuple(a, b, c, d, e, f, g1);
   }

   /**
    * Creates a Tuple with seven elements.
    * @param a
    * @param b
    * @param c
    * @param d
    * @param e
    * @param f
    * @param g
    */
   public Tuple(A a, B b, C c, D d, E e, F f, G g) {
      this.a = a;
      this.b = b;
      this.c = c;
      this.d = d;
      this.e = e;
      this.f = f;
      this.g = g;
      size = 7;
      tupleAdd = (TupleAdd<H>) (H h1) -> new Tuple(a, b, c, d, e, f, g, h1);
   }

   /**
    * Creates a Tuple with eight elements.
    * @param a
    * @param b
    * @param c
    * @param d
    * @param e
    * @param f
    * @param g
    * @param h
    */
   public Tuple(A a, B b, C c, D d, E e, F f, G g, H h) {
      this.a = a;
      this.b = b;
      this.c = c;
      this.d = d;
      this.e = e;
      this.f = f;
      this.g = g;
      this.h = h;
      size = 8;
      tupleAdd = (TupleAdd<I>) (I i1) -> new Tuple(a, b, c, d, e, f, g, h, i1);
   }

   /**
    * Creates a Tuple with nine elements.
    * @param a
    * @param b
    * @param c
    * @param d
    * @param e
    * @param f
    * @param g
    * @param h
    * @param i
    */
   public Tuple(A a, B b, C c, D d, E e, F f, G g, H h, I i) {
      this.a = a;
      this.b = b;
      this.c = c;
      this.d = d;
      this.e = e;
      this.f = f;
      this.g = g;
      this.h = h;
      this.i = i;
      size = 9;
      tupleAdd = (TupleAdd<J>) (J j1) -> new Tuple(a, b, c, d, e, f, g, h, i, j1);
   }

   /**
    * Creates a Tuple with ten elements.
    * @param a
    * @param b
    * @param c
    * @param d
    * @param e
    * @param f
    * @param g
    * @param h
    * @param i
    * @param j
    */
   public Tuple(A a, B b, C c, D d, E e, F f, G g, H h, I i, J j) {
      this.a = a;
      this.b = b;
      this.c = c;
      this.d = d;
      this.e = e;
      this.f = f;
      this.g = g;
      this.h = h;
      this.i = i;
      this.j = j;
      size = 10;
      tupleAdd = (TupleAdd) (Object t) -> {
         throw new UnsupportedOperationException("Tuple size of Eleven is not supported.");
      };
   }

   /**
    * This returns a TupleAdd class. Call the element() method to create a new Tuple from current Tuple with the added
    * element.
    * @return
    */
   public TupleAdd add() {
      return tupleAdd;
   }

   /**
    * Returns the Ith element in this Tuple. If i is outside the range of this Tuple it will throw in
    * IllegalArgumentException.
    * @param i
    * @return
    */
   public Object get(int i) {
      if (i >= size) {
         throw new IllegalArgumentException("Index is larger then Tuple Size.");
      }
      return getInternal(i);
   }

   public A get0() {
      return a;
   }

   public B get1() {
      if (size <= 1) {
         throw new UnsupportedOperationException(UNSUPPORTED_SIZE + size);
      }
      return b;
   }

   public C get2() {
      if (size <= 2) {
         throw new UnsupportedOperationException(UNSUPPORTED_SIZE + size);
      }
      return c;
   }

   public D get3() {
      if (size <= 3) {
         throw new UnsupportedOperationException(UNSUPPORTED_SIZE + size);
      }
      return d;
   }

   public E get4() {
      if (size <= 4) {
         throw new UnsupportedOperationException(UNSUPPORTED_SIZE + size);
      }
      return e;
   }

   public F get5() {
      if (size <= 5) {
         throw new UnsupportedOperationException(UNSUPPORTED_SIZE + size);
      }
      return f;
   }

   public G get6() {
      if (size <= 6) {
         throw new UnsupportedOperationException(UNSUPPORTED_SIZE + size);
      }
      return g;
   }

   public H get7() {
      if (size <= 7) {
         throw new UnsupportedOperationException(UNSUPPORTED_SIZE + size);
      }
      return h;
   }

   public I get8() {
      if (size <= 8) {
         throw new UnsupportedOperationException(UNSUPPORTED_SIZE + size);
      }
      return i;
   }

   public J get9() {
      if (size <= 9) {
         throw new UnsupportedOperationException(UNSUPPORTED_SIZE + size);
      }
      return j;
   }

   /**
    * Iterator that will iterate over the elements in this Tuple, depending on the size of the Tuple.
    * @return
    */
   @Override
   public Iterator<Object> iterator() {
      return new Iter();
   }

   /**
    * Returns the size of this Tuple. The size will be from 1 to 10.
    * @return
    */
   public int size() {
      return size;
   }

   private Object getInternal(int iter) {
      return switch (iter) {
         case 0 ->
            a;
         case 1 ->
            b;
         case 2 ->
            c;
         case 3 ->
            d;
         case 4 ->
            e;
         case 5 ->
            f;
         case 6 ->
            g;
         case 7 ->
            h;
         case 8 ->
            i;
         case 9 ->
            j;
         default ->
            null;
      };
   }

   private class Iter implements Iterator<Object> {
      int cursor;       // index of next element to return

      Iter() {
      }

      @Override
      public boolean hasNext() {
         return cursor != size;
      }

      @Override
      public Object next() {
         int i = cursor;
         if (i >= size) {
            throw new NoSuchElementException();
         }
         Object ret = getInternal(i);
         cursor = i + 1;
         return ret;
      }

   }

}
