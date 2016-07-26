package haiyang

object Pascal {
  def main(args: Array[String]): Unit = {
		println("Pascal's Triangle")
		for (row <- 0 to 10) {
			for (col <- 0 to row)
				print(pascal(col, row) + " ")
				println()
		}
  }

	def pascal(c: Int, r: Int): Int = {
		if (c == 0 || c == r) 1 else pascal(c - 1, r - 1) + pascal(c, r - 1)
	}
}
