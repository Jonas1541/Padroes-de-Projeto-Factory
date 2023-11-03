package main.java.padroes_de_projeto.factories;

public class MongoDBFactory implements iDatabaseFactory{
    @Override
    public iCourse useDatabase(){
        iCourse course = new MongoDBFactory();
        return course;
    }

}
