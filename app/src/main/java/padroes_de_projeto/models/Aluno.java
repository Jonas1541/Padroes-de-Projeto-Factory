package main.java.padroes_de_projeto.models;

import main.java.padroes_de_projeto.factories.iCourse;
import main.java.padroes_de_projeto.factories.iDatabaseFactory;

public class Aluno {
    private iDatabaseFactory databaseFactory;
    public iCourse course = null;

    public Aluno(iDatabaseFactory databaseFactory) {
        this.databaseFactory = databaseFactory;
        this.course = databaseFactory.useDatabase();
    }

    public iDatabaseFactory getDatabaseFactory() {
		return this.databaseFactory;
	}
}
