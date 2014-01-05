package org.jsantosp.euler

/**
	Multiples of 3 and 5
	Problem 1

	If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

	Find the sum of all the multiples of 3 or 5 below 1000.
*/

object Problem001{

	def solve: Int =
		(1 until 1000).filter(n => List(3,5).exists(m => n % m == 0)).sum

}