package main.java.padroes_de_projeto.factories;

public class MySQLFactory implements iDatabaseFactory{
    @Override
    public iCourse useDatabase(){
        iCourse course = new MySQLFactory();
        return course;
    }
}
