package main.java.padroes_de_projeto.repositories;

import main.java.padroes_de_projeto.factories.iCourse;

public class SQLDatabase implements iCourse {
    @Override
    public String nomeCurso() {
		return "Usando MY SQL";
	}
    
}
