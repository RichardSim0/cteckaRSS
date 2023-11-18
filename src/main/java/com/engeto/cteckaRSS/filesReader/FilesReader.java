package com.engeto.cteckaRSS.filesReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

import java.util.Scanner;

public class FilesReader {
    public String readFiles(String fileName) {
        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader(fileName)))) {

            return scanner.nextLine();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
