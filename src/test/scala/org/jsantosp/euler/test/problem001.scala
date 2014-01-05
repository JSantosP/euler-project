package org.jsantosp.euler.test

import org.scalatest.junit.JUnitRunner
import org.scalatest.FunSpec
import org.scalatest.BeforeAndAfter
import org.scalatest.matchers.ShouldMatchers
import org.junit.runner.RunWith

import org.jsantosp.euler.Problem001

@RunWith(classOf[JUnitRunner])
class Test001 extends FunSpec with ShouldMatchers {
	describe("Multiples of 3 and 5"){
		it("Find the sum of all the multiples of 3 or 5 below 1000"){
			Problem001.solve should equal(233168)
		}
	}
}