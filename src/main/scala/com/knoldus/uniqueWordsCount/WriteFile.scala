package com.knoldus.uniqueWordsCount

import java.io.{File, PrintWriter}

object WriteFile {
  def writeInFile(file: File, wordCount: String): PrintWriter = {
    val fileWrite = new PrintWriter(file)
      fileWrite.write(wordCount)
    fileWrite
  }
}
