package br.com.cod3r.bridge.converter;

import br.com.cod3r.bridge.converter.converters.CSVConverter;
import br.com.cod3r.bridge.converter.converters.Converter;
import br.com.cod3r.bridge.converter.converters.JsonConverter;
import br.com.cod3r.bridge.converter.employees.ITGuy;
import br.com.cod3r.bridge.converter.employees.ProjectManager;

public class Client {

	public static void main(String[] args) {
		Converter csvConverter = new CSVConverter();
		Converter jsonConverter = new JsonConverter();

		ITGuy it = new ITGuy("Ygor", 23, 6000d);
		ProjectManager pm = new ProjectManager("Kaique", 30, 15000d);

		System.out.println(csvConverter.getEmployeeFormated(it));
		System.out.println(csvConverter.getEmployeeFormated(pm));
		System.out.println(jsonConverter.getEmployeeFormated(it));
		System.out.println(jsonConverter.getEmployeeFormated(pm));
	}
}
