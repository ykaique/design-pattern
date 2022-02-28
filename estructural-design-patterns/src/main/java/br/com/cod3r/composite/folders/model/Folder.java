package br.com.cod3r.composite.folders.model;

import java.util.List;

public class Folder implements FileSystemItem {

    private String name;
    private List<FileSystemItem> items;

    public Folder(String name, List<FileSystemItem> items) {
        this.name = name;
        this.items = items;
    }

    @Override
    public void print(String structure) {
        System.out.println(structure + name);
        for (FileSystemItem item : items){
            item.print(structure + "| ");
        }
    }
}
