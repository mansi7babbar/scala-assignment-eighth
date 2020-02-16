package com.knoldus.uniqueWordsCount

import java.io.File

import com.knoldus.fileOperations.{CreateFile, ListOfFiles, ReadFile}

object UniqueWordsCountDriver {
  val directoryName = "/home/knoldus/IdeaProjects/scala-assignment-eighth/src/main/scala/com/knoldus/my-files"
  val listOfFiles: List[File] = ListOfFiles.getListOfFiles(directoryName)
  for (file <- listOfFiles) {
    val newDirectoryName = "/home/knoldus/IdeaProjects/scala-assignment-eighth/src/main/scala/com/knoldus/uniqueWordsCount/words-count"
    val fileContents = ReadFile.readFromFile(file)
    val newFile = CreateFile.createNewFile(file.getName, newDirectoryName)
    val wordCount = UniqueWordsCount.getUniqueWordsCount(fileContents).toString()
    val updatedFile = WriteFile.writeInFile(newFile, wordCount)
    updatedFile.close()
  }
}
