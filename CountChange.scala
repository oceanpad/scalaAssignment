package haiyang

import scala.collection.mutable.ListBuffer

object CountChange {
	def main(args: Array[String]) {
		println("Counting Change")
	}
	
	//Exercise 3: Counting Change
	def countChange(money: Int, coins: List[Int]): Int = {
		def f(lastMaxCoin_total_coll: List[(Int, Int)], count: Int): Int = {
			if (lastMaxCoin_total_coll.isEmpty) {
				count
			} else {
				val b = ListBuffer[(Int, Int)]()
				var newCount = count
				for ((lastMaxCoin, total) <- lastMaxCoin_total_coll) {
					if (total < money) {
						for (c <- coins) {
							if (c >= lastMaxCoin) {
								val e = (c, total + c)
								b += e
							}
						}
						} else if (total == money) {
							newCount += 1
						}
				} 
				
				f(b.toList, newCount)
			}
		}

		val b = coins.map { c => (c, c) }
		f(b, 0)
	}
}
