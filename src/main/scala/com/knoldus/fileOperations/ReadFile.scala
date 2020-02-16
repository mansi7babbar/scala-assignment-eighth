package com.knoldus.fileOperations

import java.io.File

import scala.io.Source

object ReadFile {
  def readFromFile(file: File): List[String] = {
    Source.fromFile(file).getLines.toList
  }
}
