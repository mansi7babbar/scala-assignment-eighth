package com.knoldus.fileOperations

import java.io.File

object CreateFile {
  def createNewFile(fileName: String, directoryName: String): File = {
    new File(directoryName + "/" + fileName)
  }
}
