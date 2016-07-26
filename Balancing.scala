package haiyang

import scala.collection.mutable.ListBuffer

object Balancing {
	def main(args: Array[String]) {
		println("Parentheses Balancing")
	}

	//Exercise 2: Parentheses Balancing
	def balance(chars: List[Char]): Boolean = {
		def f(chars: List[Char], numOpens: Int): Boolean = {
			if (chars.isEmpty) {
				numOpens == 0
			} else {
				val h = chars.head
				val n =
					if (h == '(') numOpens + 1
					else if (h == ')') numOpens - 1
					else numOpens
					if (n >= 0) f(chars.tail, n)
					else false
			}
		}

		f(chars, 0)
	}
}
	
