package com.bridgelabz;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * This Class is Created for doing File Operations
 */
public class EmployeePayroll {
          public static boolean deleteFiles(File contentToDelete) {
          File[] allContents = contentToDelete.listFiles();
          if (allContents != null) {
          for (File eachFile : allContents) {
          deleteFiles(eachFile);
          }
          }
          return contentToDelete.delete();
          }
          }