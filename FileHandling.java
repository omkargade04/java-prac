import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class file {
    public static void main(String[] args) {
        String sourceFileName = "input.txt";
        String targetFileName = "output.txt";
        String content = "All the best!";

        File sourceFile = new File(sourceFileName);
        if(!sourceFile.exists()) {
            try(BufferedWriter writer = new BufferedWriter(new FileWriter(sourceFile))) {
                writer.write(content);
                System.out.println("File 'input.txt' created with content: " + content);
            } catch(IOException e) {
                System.out.println("Error creating 'input.txt': " + e.getMessage());
                return;
            }
        }

        try(
            BufferedReader reader = new BufferedReader(new FileReader(sourceFileName));
            BufferedWriter writer = new BufferedWriter(new FileWriter(targetFileName))
        ) {
            String line;
            while((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
            System.out.println("Content copied from 'input.txt' to 'output.txt' successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while reading or writing the file: " + e.getMessage());
        }
    }
}


//-----------------------------------------


//Creating a file

import java.io.File;
import java.io.IOException;

public class FileHandling {
    public static void main(String[] args) {
        try{
            File f1 = new File("input1.txt");
            if(f1.createNewFile()) {
                System.out.println("File created");
            } else {
                System.out.println("File exists");
            }
        } catch(IOException e) {
            System.out.println("Error: " + e);
        }
    }
}


// Reading in a file

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileHandling {
    public static void main(String args[]) {
        try{
            File f1 = new File("input.txt");
            Scanner obj = new Scanner(f1);
            while(obj.hasNextLine()) {
                String data = obj.nextLine();
                System.out.println(data);
            }
            obj.close();
        } catch(FileNotFoundException e) {
            System.out.println("Error"+e);
        }
    }
}


// Writing in a file

import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {
    public static void main(String[] args) {
        try{
            FileWriter writer = new FileWriter("input.txt");
            writer.write("Hey");
            writer.close();
        } catch(IOException e) {
            System.out.println("Error: " + e);
            e.printStackTrace();
        } 
    }
}


// Reading and Writing in a file

import java.io.FileWriter;
import java.io.FilReader;
import java.io.IOException;

public class FileHandling {
    public static void main(String[] args) {
        try{
            FileWriter writer = new FileWriter("input.txt");
            writer.write("Hello World");
            writer.close();

            FileReader reader = new FileReader("input.txt");
            int i;
            while((i == reader.read()) != -1) {
                System.out.println((char)i);
            }
        } catch(IOException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }
}