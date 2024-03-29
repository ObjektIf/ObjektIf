/*-
 * #%L
 * ObjektIf
 * %%
 * Copyright (C) 2020 - 2021 Janosch Schwalm, Alexander Wirz
 * %%
 * Redistribution and use in source and binary forms, with or without modification,
 * are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 *
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * 3. Neither the name of the ObjektIf nor the names of its contributors
 *    may be used to endorse or promote products derived from this software without
 *    specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
 * IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT,
 * INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING,
 * BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE
 * OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED
 * OF THE POSSIBILITY OF SUCH DAMAGE.
 * #L%
 */
package io.github.objektif.ifs.intif

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe

internal class IntIfTest : BehaviorSpec({
    fun five(): Int = 5
    fun minusFive(): Int = -five()

    Given("a zero int") {
        val sut = SimpleIntIf(0)
        When("Testing for zero") {
            var isZero: Boolean? = null
            sut.isZero()
                .Then { isZero = true }
                .Else { isZero = false }
            Then("'isZero' is true") {
                isZero shouldBe true
            }
        }
        When("Testing for less then ${five()}") {
            var isLessThanFive: Boolean? = null
            sut.isLessThan(five())
                .Then { isLessThanFive = true }
                .Else { isLessThanFive = false }
            Then("'isLessThanFive' is true") {
                isLessThanFive shouldBe true
            }
        }
        When("Testing for less then ${minusFive()}") {
            var isLessThanMinusFive: Boolean? = null
            sut.isLessThan(minusFive())
                .Then { isLessThanMinusFive = true }
                .Else { isLessThanMinusFive = false }
            Then("'isLessThanMinusFive' is false") {
                isLessThanMinusFive shouldBe false
            }
        }
    }

    Given("a positive int") {
        val sut = SimpleIntIf(five())
        When("Testing for zero") {
            var isZero: Boolean? = null
            sut.isZero()
                .Then { isZero = true }
                .Else { isZero = false }
            Then("'isZero' is false") {
                isZero shouldBe false
            }
        }
    }
})
