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
package org.apache.commons.numbers.gamma;

/**
 * Natural logarithm of the absolute value of \( \Gamma(x) \).
 *
 * <p>\[ \operatorname{lgamma}(z) = \ln \lvert \Gamma(x) \rvert \]
 *
 * <p>This code has been adapted from the <a href="https://www.boost.org/">Boost</a>
 * {@code c++} implementation {@code <boost/math/special_functions/gamma.hpp>}.
 *
 * @see
 * <a href="https://www.boost.org/doc/libs/1_77_0/libs/math/doc/html/math_toolkit/sf_gamma/lgamma.html">
 * Boost C++ Log Gamma functions</a>
 */
public final class LogGamma {
    /** Private constructor. */
    private LogGamma() {
        // intentionally empty.
    }

    /**
     * Computes the function \( \ln \lvert \Gamma(x) \rvert \), the natural
     * logarithm of the absolute value of \( \Gamma(x) \).
     *
     * @param x Argument.
     * @return \( \ln \lvert \Gamma(x) \rvert \), or {@code NaN} if {@code x <= 0}
     * and is an integer.
     */
    public static double value(double x) {
        return BoostGamma.lgamma(x);
    }

    /**
     * Computes the function \( \ln \lvert \Gamma(x) \rvert \), the natural
     * logarithm of the absolute value of \( \Gamma(x) \).
     *
     * <p>The sign output is set to 1 if the sign of gamma(x) is positive or zero;
     * otherwise it is set to -1.
     *
     * @param x Argument.
     * @param sign Sign output. If a non-zero length the first index {@code sign[0]} is
     * set on output to the sign of gamma(z).
     * @return \( \ln \lvert \Gamma(x) \rvert \), or {@code NaN} if {@code x <= 0}
     * and is an integer.
     */
    public static double value(double x, int[] sign) {
        return BoostGamma.lgamma(x, sign);
    }
}
