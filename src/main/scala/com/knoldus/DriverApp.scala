package com.knoldus

object DriverApp extends App {
  println("Enter your choice\n" +
    "1. Assignment No.1 : Capitalize the content of a file\n" +
    "2. Assignment No.2 : Calculate the word count of all unique words of a file")
  val choice = scala.io.StdIn.readInt()
  choice match {
    case 1 => modifyFileContent.ModifyFileContentDriver
    case 2 => uniqueWordsCount.UniqueWordsCountDriver
  }
}
