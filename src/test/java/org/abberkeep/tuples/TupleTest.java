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

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Title: TupleTest
 *
 * <p>
 * Description: This tests the methods of the TupleTest class.</p>
 *
 * Copyright: Copyright (c) Oct 8, 2022
 *
 * @author Gary Deken <gary@abberkeep.us>
 * @version 1.0
 */
public class TupleTest {
   private static final String VALUE1 = "String";
   private static final Integer VALUE2 = Integer.valueOf(2394729);
   private static final BigDecimal VALUE3 = new BigDecimal("986234.2342");
   private static final List<String> VALUE4 = new ArrayList<>();
   private static final BigInteger VALUE5 = new BigInteger("56789494");
   private static final Map<String, String> VALUE6 = new HashMap<>();
   private static final String VALUE7 = "value seven";
   private static final String VALUE8 = "value eight";
   private static final String VALUE9 = "value nine";
   private static final String VALUE10 = "value ten";

   public TupleTest() {
   }

   @BeforeEach
   public void setUp() {
   }

   @Test
   public void testSingle() {
      Tuple underTest = new Tuple<>(VALUE1);
      int id = 1;

      assertEquals(id, underTest.size());

      Iterator<Object> iter = underTest.iterator();

      testIteration(iter, VALUE1);
      assertFalse(iter.hasNext());
      assertEquals(VALUE1, underTest.get0());
      assertEquals(VALUE1, underTest.get(id - 1));
      assertThrows(UnsupportedOperationException.class, () -> underTest.get1());
      assertThrows(UnsupportedOperationException.class, () -> underTest.get2());
      assertThrows(UnsupportedOperationException.class, () -> underTest.get3());
      assertThrows(UnsupportedOperationException.class, () -> underTest.get4());
      assertThrows(UnsupportedOperationException.class, () -> underTest.get5());
      assertThrows(UnsupportedOperationException.class, () -> underTest.get6());
      assertThrows(UnsupportedOperationException.class, () -> underTest.get7());
      assertThrows(UnsupportedOperationException.class, () -> underTest.get8());
      assertThrows(UnsupportedOperationException.class, () -> underTest.get9());
      testGetElement(underTest, id);

      Tuple underTest2 = underTest.add().element(VALUE2);

      assertEquals(id + 1, underTest2.size());
   }

   @Test
   public void testPair() {
      Tuple underTest = new Tuple<>(VALUE1, VALUE2);
      int id = 2;

      assertEquals(id, underTest.size());

      Iterator<Object> iter = underTest.iterator();

      testIteration(iter, VALUE1);
      testIteration(iter, VALUE2);
      assertFalse(iter.hasNext());
      assertEquals(VALUE2, underTest.get1());
      assertEquals(VALUE2, underTest.get(id - 1));
      assertThrows(UnsupportedOperationException.class, () -> underTest.get2());
      assertThrows(UnsupportedOperationException.class, () -> underTest.get3());
      assertThrows(UnsupportedOperationException.class, () -> underTest.get4());
      assertThrows(UnsupportedOperationException.class, () -> underTest.get5());
      assertThrows(UnsupportedOperationException.class, () -> underTest.get6());
      assertThrows(UnsupportedOperationException.class, () -> underTest.get7());
      assertThrows(UnsupportedOperationException.class, () -> underTest.get8());
      assertThrows(UnsupportedOperationException.class, () -> underTest.get9());
      testGetElement(underTest, id);

      Tuple underTest2 = underTest.add().element(VALUE3);

      assertEquals(id + 1, underTest2.size());
   }

   @Test
   public void testTriplet() {
      Tuple underTest = new Tuple<>(VALUE1, VALUE2, VALUE3);
      int id = 3;

      assertEquals(id, underTest.size());

      Iterator<Object> iter = underTest.iterator();

      testIteration(iter, VALUE1);
      testIteration(iter, VALUE2);
      testIteration(iter, VALUE3);
      assertFalse(iter.hasNext());
      assertEquals(VALUE3, underTest.get2());
      assertEquals(VALUE3, underTest.get(id - 1));
      assertThrows(UnsupportedOperationException.class, () -> underTest.get3());
      assertThrows(UnsupportedOperationException.class, () -> underTest.get4());
      assertThrows(UnsupportedOperationException.class, () -> underTest.get5());
      assertThrows(UnsupportedOperationException.class, () -> underTest.get6());
      assertThrows(UnsupportedOperationException.class, () -> underTest.get7());
      assertThrows(UnsupportedOperationException.class, () -> underTest.get8());
      assertThrows(UnsupportedOperationException.class, () -> underTest.get9());
      testGetElement(underTest, id);

      Tuple underTest2 = underTest.add().element(VALUE4);

      assertEquals(4, underTest2.size());
   }

   @Test
   public void testQuartet() {
      Tuple underTest = new Tuple<>(VALUE1, VALUE2, VALUE3, VALUE4);
      int id = 4;

      assertEquals(id, underTest.size());

      Iterator<Object> iter = underTest.iterator();

      testIteration(iter, VALUE1);
      testIteration(iter, VALUE2);
      testIteration(iter, VALUE3);
      testIteration(iter, VALUE4);
      assertFalse(iter.hasNext());
      assertEquals(VALUE4, underTest.get3());
      assertEquals(VALUE4, underTest.get(id - 1));
      assertThrows(UnsupportedOperationException.class, () -> underTest.get4());
      assertThrows(UnsupportedOperationException.class, () -> underTest.get5());
      assertThrows(UnsupportedOperationException.class, () -> underTest.get6());
      assertThrows(UnsupportedOperationException.class, () -> underTest.get7());
      assertThrows(UnsupportedOperationException.class, () -> underTest.get8());
      assertThrows(UnsupportedOperationException.class, () -> underTest.get9());
      testGetElement(underTest, id);

      Tuple underTest2 = underTest.add().element(VALUE4);

      assertEquals(id + 1, underTest2.size());
   }

   @Test
   public void testQuintet() {
      Tuple underTest = new Tuple<>(VALUE1, VALUE2, VALUE3, VALUE4, VALUE5);
      int id = 5;

      assertEquals(id, underTest.size());

      Iterator<Object> iter = underTest.iterator();

      testIteration(iter, VALUE1);
      testIteration(iter, VALUE2);
      testIteration(iter, VALUE3);
      testIteration(iter, VALUE4);
      testIteration(iter, VALUE5);
      assertFalse(iter.hasNext());
      assertEquals(VALUE5, underTest.get4());
      assertEquals(VALUE5, underTest.get(id - 1));
      assertThrows(UnsupportedOperationException.class, () -> underTest.get5());
      assertThrows(UnsupportedOperationException.class, () -> underTest.get6());
      assertThrows(UnsupportedOperationException.class, () -> underTest.get7());
      assertThrows(UnsupportedOperationException.class, () -> underTest.get8());
      assertThrows(UnsupportedOperationException.class, () -> underTest.get9());
      testGetElement(underTest, id);

      Tuple underTest2 = underTest.add().element(VALUE6);

      assertEquals(id + 1, underTest2.size());
   }

   @Test
   public void testSextet() {
      Tuple underTest = new Tuple<>(VALUE1, VALUE2, VALUE3, VALUE4, VALUE5, VALUE6);
      int id = 6;

      assertEquals(id, underTest.size());

      Iterator<Object> iter = underTest.iterator();

      testIteration(iter, VALUE1);
      testIteration(iter, VALUE2);
      testIteration(iter, VALUE3);
      testIteration(iter, VALUE4);
      testIteration(iter, VALUE5);
      testIteration(iter, VALUE6);
      assertFalse(iter.hasNext());
      assertEquals(VALUE6, underTest.get5());
      assertEquals(VALUE6, underTest.get(id - 1));
      assertThrows(UnsupportedOperationException.class, () -> underTest.get6());
      assertThrows(UnsupportedOperationException.class, () -> underTest.get7());
      assertThrows(UnsupportedOperationException.class, () -> underTest.get8());
      assertThrows(UnsupportedOperationException.class, () -> underTest.get9());
      testGetElement(underTest, id);

      Tuple underTest2 = underTest.add().element(VALUE7);

      assertEquals(id + 1, underTest2.size());
   }

   @Test
   public void testSeptet() {
      Tuple underTest = new Tuple<>(VALUE1, VALUE2, VALUE3, VALUE4, VALUE5, VALUE6, VALUE7);
      int id = 7;

      assertEquals(id, underTest.size());

      Iterator<Object> iter = underTest.iterator();

      testIteration(iter, VALUE1);
      testIteration(iter, VALUE2);
      testIteration(iter, VALUE3);
      testIteration(iter, VALUE4);
      testIteration(iter, VALUE5);
      testIteration(iter, VALUE6);
      testIteration(iter, VALUE7);
      assertFalse(iter.hasNext());
      assertEquals(VALUE7, underTest.get6());
      assertEquals(VALUE7, underTest.get(id - 1));
      assertThrows(UnsupportedOperationException.class, () -> underTest.get7());
      assertThrows(UnsupportedOperationException.class, () -> underTest.get8());
      assertThrows(UnsupportedOperationException.class, () -> underTest.get9());
      testGetElement(underTest, id);

      Tuple underTest2 = underTest.add().element(VALUE8);

      assertEquals(id + 1, underTest2.size());
   }

   @Test
   public void testOctet() {
      Tuple underTest = new Tuple<>(VALUE1, VALUE2, VALUE3, VALUE4, VALUE5, VALUE6, VALUE7, VALUE8);
      int id = 8;

      assertEquals(id, underTest.size());

      Iterator<Object> iter = underTest.iterator();

      testIteration(iter, VALUE1);
      testIteration(iter, VALUE2);
      testIteration(iter, VALUE3);
      testIteration(iter, VALUE4);
      testIteration(iter, VALUE5);
      testIteration(iter, VALUE6);
      testIteration(iter, VALUE7);
      testIteration(iter, VALUE8);
      assertFalse(iter.hasNext());
      assertEquals(VALUE8, underTest.get7());
      assertEquals(VALUE8, underTest.get(id - 1));
      assertThrows(UnsupportedOperationException.class, () -> underTest.get8());
      assertThrows(UnsupportedOperationException.class, () -> underTest.get9());
      testGetElement(underTest, id);

      Tuple underTest2 = underTest.add().element(VALUE9);

      assertEquals(id + 1, underTest2.size());
   }

   @Test
   public void testEnnead() {
      Tuple underTest = new Tuple<>(VALUE1, VALUE2, VALUE3, VALUE4, VALUE5, VALUE6, VALUE7, VALUE8, VALUE9);
      int id = 9;

      assertEquals(id, underTest.size());

      Iterator<Object> iter = underTest.iterator();

      testIteration(iter, VALUE1);
      testIteration(iter, VALUE2);
      testIteration(iter, VALUE3);
      testIteration(iter, VALUE4);
      testIteration(iter, VALUE5);
      testIteration(iter, VALUE6);
      testIteration(iter, VALUE7);
      testIteration(iter, VALUE8);
      testIteration(iter, VALUE9);
      assertFalse(iter.hasNext());
      assertEquals(VALUE9, underTest.get8());
      assertEquals(VALUE9, underTest.get(id - 1));
      assertThrows(UnsupportedOperationException.class, () -> underTest.get9());
      testGetElement(underTest, id);

      Tuple underTest2 = underTest.add().element(VALUE10);

      assertEquals(id + 1, underTest2.size());
   }

   @Test
   public void testDecade() {
      Tuple underTest = new Tuple<>(VALUE1, VALUE2, VALUE3, VALUE4, VALUE5, VALUE6, VALUE7, VALUE8, VALUE9, VALUE10);
      int id = 10;

      assertEquals(id, underTest.size());

      Iterator<Object> iter = underTest.iterator();

      testIteration(iter, VALUE1);
      testIteration(iter, VALUE2);
      testIteration(iter, VALUE3);
      testIteration(iter, VALUE4);
      testIteration(iter, VALUE5);
      testIteration(iter, VALUE6);
      testIteration(iter, VALUE7);
      testIteration(iter, VALUE8);
      testIteration(iter, VALUE9);
      testIteration(iter, VALUE10);
      assertFalse(iter.hasNext());
      assertEquals(VALUE10, underTest.get9());
      assertEquals(VALUE10, underTest.get(id - 1));
      testGetElement(underTest, id);

      assertThrows(UnsupportedOperationException.class, () -> underTest.add().element(VALUE10));
   }

   private void testGetElement(Tuple underTest, int id) {
      for (int i = id; i < 10; i++) {
         boolean thrown = false;
         try {
            underTest.get(i);
         } catch (IllegalArgumentException e) {
            thrown = true;
         }
         assertTrue(thrown);
      }
   }

   private void testIteration(Iterator<Object> iter, Object expected) {
      assertTrue(iter.hasNext());
      assertThrows(UnsupportedOperationException.class, () -> iter.remove());
      assertEquals(expected, iter.next());
   }

}
