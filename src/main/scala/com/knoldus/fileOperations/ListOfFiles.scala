package com.knoldus.fileOperations

import java.io.File

object ListOfFiles {
  def getListOfFiles(directoryName: String): List[File] = {
    val dir = new File(directoryName)
    if (dir.exists && dir.isDirectory)
      dir.listFiles().filter(_.isFile).toList
    else
      List[File]()
  }
}
