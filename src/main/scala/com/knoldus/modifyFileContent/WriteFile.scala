package com.knoldus.modifyFileContent

import java.io.{File, PrintWriter}

object WriteFile {
  def writeInFile(file: File, listOfLines: List[String]): PrintWriter = {
    val fileWrite = new PrintWriter(file)
    listOfLines.foreach {
      line => fileWrite.write(line.toUpperCase)
    }
    fileWrite
  }
}
