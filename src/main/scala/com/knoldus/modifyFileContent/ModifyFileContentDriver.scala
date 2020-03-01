package com.knoldus.modifyFileContent

import java.io.File

import com.knoldus.fileOperations.{CreateFile, ListOfFiles, ReadFile}

object ModifyFileContentDriver {
  val directoryName = "./src/main/scala/com/knoldus/my-files"
  val listOfFiles: List[File] = ListOfFiles.getListOfFiles(directoryName)
  for (file <- listOfFiles) {
    val newDirectoryName = "./src/main/scala/com/knoldus/modifyFileContent/modified-files"
    val fileContents = ReadFile.readFromFile(file)
    val newFile = CreateFile.createNewFile(file.getName, newDirectoryName)
    val updatedFile = WriteFile.writeInFile(newFile, fileContents)
    updatedFile.close()
  }
}
