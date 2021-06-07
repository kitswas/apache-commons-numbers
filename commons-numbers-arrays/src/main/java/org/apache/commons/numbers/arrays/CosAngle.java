/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.numbers.arrays;

/**
 * Computes the cosine of the angle between two vectors.
 */
public final class CosAngle {

    /** Private constructor. */
    private CosAngle() {
        // intentionally empty.
    }

    /**
     * Computes the cosine of the angle between {@code v1} and {@code v2}.
     *
     * @param v1 Cartesian coordinates of the first vector.
     * @param v2 Cartesian coordinates of the second vector.
     * @return the cosine of the angle between the vectors.
     * @throws IllegalArgumentException if the sizes of the input arrays are different
     */
    public static double value(double[] v1,
                               double[] v2) {
        return LinearCombination.value(v1, v2) / Norms.euclidean(v1) / Norms.euclidean(v2);
    }
}

