package Composite;

import java.sql.SQLOutput;

public class main {
    public static void main(String[] args) {

        Folder root = new Folder("Root");
        Folder subFolder1 = new Folder("Sub Folder 1");
        Folder subFolder2 = new Folder("Sub Folder 2");
        DriveItem file1 = new File("File 1" , 10);
        DriveItem file2 = new File("File 2" , 15);
        DriveItem file3 = new File("File 3" , 50);
        DriveItem file4 = new File("File 4" , 20);


        subFolder2.addItem(file4);

        subFolder1.addItem(subFolder2);
        subFolder1.addItem(file3);

        root.addItem(subFolder1);
        root.addItem(file2);
        root.addItem(file1);


        System.out.println("Root Folder Size: "+root.getSize());
        System.out.println("Sub Folder1 Size: "+subFolder1.getSize());
        System.out.println("Sub Folder2 Size: "+subFolder2.getSize());
        System.out.println("File 1 Size: "+file1.getSize());
        System.out.println("File 2 Size: "+file2.getSize());
        System.out.println("File 3 Size: "+file3.getSize());
        System.out.println("File 4 Size: "+file4.getSize());


    }
}

/*

File || Folder
- name
- size
 */