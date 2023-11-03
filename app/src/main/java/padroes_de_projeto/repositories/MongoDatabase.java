package main.java.padroes_de_projeto.repositories;

import main.java.padroes_de_projeto.factories.iCourse;

public class MongoDatabase  implements iCourse{
    @Override
    public String nomeCurso() {
		return "Usando MongoDB";
	}

}
