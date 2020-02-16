package com.knoldus.uniqueWordsCount

object UniqueWordsCount {
  def getUniqueWordsCount(lines: List[String]): scala.collection.mutable.Map[String, Int] = {
    val counts = scala.collection.mutable.Map.empty[String, Int]
    lines.foreach { line =>
      for (getWord <- line.split("[ ,!.]+")) {
        val word = getWord.toLowerCase
        val oldCount =
          if (counts.contains(word)) counts(word)
          else 0
        counts += (word -> (oldCount + 1))
      }
    }
    counts
  }
}
