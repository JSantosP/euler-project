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

package org.jsantosp.euler

/*
 * Smallest multiple
 * Problem 5
 * Published on Friday, 30th November 2001, 06:00 pm; Solved by 199861
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * 
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */

object Problem005{

	def lcm(a: Int,b: Int): Int = {
		def recFunction(x: Int,y:Int): Int = 
			if (x==y) x 
			else if (x>y) recFunction(x,y+b) 
			else recFunction(x+a,b)
		recFunction(a,b)
	}
	
	def solve: Int = 
		(1 /: (2 to 20))((n,i) => lcm(i,n))

}
