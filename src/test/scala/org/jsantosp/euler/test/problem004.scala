/*
 * Copyright (c) 2014 Javier Santos
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jsantosp.euler.test

import org.scalatest.junit.JUnitRunner
import org.scalatest.FunSpec
import org.scalatest.BeforeAndAfter
import org.scalatest.matchers.ShouldMatchers
import org.junit.runner.RunWith

import org.jsantosp.euler.Problem004

@RunWith(classOf[JUnitRunner])
class Test004 extends FunSpec with ShouldMatchers {

	describe("Largest palindrome product"){
		it("Find the largest palindrome made from the product of two 3-digit numbers."){
			Problem004.solve should equal(906609)
		}
	}
	
}