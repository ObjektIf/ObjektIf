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
@file:Suppress("MaxLineLength")

package samplecode

import io.github.objektif.Objekt.If
import samplecode.SampleCodeForInts.five
import samplecode.SampleCodeForInts.zeroInt

/**
 * Some sample code to show how this library is used.
 */
object SampleCodeForInts {
    /**
     * A zero [Int] to demonstrate usage.
     */
    const val zeroInt = 0

    /**
     * a "five" [Int] to demonstrate usage.
     */
    const val five = 5
}

/**
 * The main entry point to show the usage.
 */
fun main() {
    If(zeroInt).isZero()
        .Then { println("zeroInt is zero") }
        .Else { println("zeroInt is not zero") }

    If(zeroInt) isLessThan five Then { println("zeroInt is less than $five") } Else { println("zeroInt is not less then $five") }
}
