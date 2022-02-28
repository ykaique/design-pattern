package br.com.cod3r.composite.folders;

import br.com.cod3r.composite.folders.model.File;
import br.com.cod3r.composite.folders.model.FileSystemItem;
import br.com.cod3r.composite.folders.model.Folder;

import java.util.Arrays;

public class Client {

	public static void main(String[] args) {

		FileSystemItem file1 = new File("texto.txt");
		FileSystemItem file2 = new File("audio.mp3");
		FileSystemItem file3 = new File("video.mp4");
		FileSystemItem file4 = new File("planilha.xls");
		FileSystemItem sf1 = new Folder("docs", Arrays.asList(file1, file4));
		FileSystemItem sf2 = new Folder("imagens", Arrays.asList(file2, file3));
		FileSystemItem folder = new Folder("pasta pessoal", Arrays.asList(sf1, sf2));

		folder.print(">: ");
	}
}
