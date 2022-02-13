package br.com.cod3r.factory.app.dbadapter;

import br.com.cod3r.factory.app.dbadapter.factory.DBFactory;
import br.com.cod3r.factory.app.dbadapter.factory.OracleFactory;

public class Client {

	public static void main(String[] args) {

		DBFactory factory = new OracleFactory();

		factory.getDatabase().query("oi");

	}
}
