/*
 * Copyright 2019 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.numkt.math

import org.jetbrains.numkt.callFunc
import org.jetbrains.numkt.core.KtNDArray

/**
 * Hyperbolic sine, element-wise.
 */
fun <T : Number> sinh(x: KtNDArray<T>): KtNDArray<Double> =
    callFunc(nameMethod = arrayOf("sinh"), args = arrayOf(x), dtype = Double::class)

/**
 * Hyperbolic cosine, element-wise.
 */
fun <T : Number> cosh(x: KtNDArray<T>): KtNDArray<Double> =
    callFunc(nameMethod = arrayOf("cosh"), args = arrayOf(x), dtype = Double::class)

/**
 * Compute hyperbolic tangent element-wise.
 */
fun <T : Number> tanh(x: KtNDArray<T>): KtNDArray<Double> =
    callFunc(nameMethod = arrayOf("tanh"), args = arrayOf(x), dtype = Double::class)

/**
 * Inverse hyperbolic sine element-wise.
 */
fun <T : Number> arcsinh(x: KtNDArray<T>): KtNDArray<Double> =
    callFunc(nameMethod = arrayOf("arcsinh"), args = arrayOf(x), dtype = Double::class)

/**
 * Inverse hyperbolic cosine, element-wise.
 */
fun <T : Number> arccosh(x: KtNDArray<T>): KtNDArray<Double> =
    callFunc(nameMethod = arrayOf("arccosh"), args = arrayOf(x), dtype = Double::class)

/**
 * Inverse hyperbolic tangent element-wise.
 */
fun <T : Number> arctanh(x: KtNDArray<T>): KtNDArray<Double> =
    callFunc(nameMethod = arrayOf("arctanh"), args = arrayOf(x), dtype = Double::class)