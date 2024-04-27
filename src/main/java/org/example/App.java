package org.example;

import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        HashMap<String, Student> alumnos = new HashMap<>();

        Student student1 = new Student("Jose Lopez", 70);
        Student student2 = new Student("Pablo Molina", 56);
        Student student3 = new Student("Lourdes Santiago", 87);
        Student student4 = new Student("Maria Recacho", 47);

        alumnos.put(student1.getName(),student1);
        alumnos.put(student2.getName(),student2);
        alumnos.put(student3.getName(),student3);
        alumnos.put(student4.getName(),student4);


        increaseGrades(alumnos);

        System.out.println(alumnos.toString());
    }
    public static Map<String, Student> increaseGrades(Map<String, Student> mapaAlumnos) {

        for (Map.Entry<String, Student> entry : mapaAlumnos.entrySet()){
            double nota = entry.getValue().getGrade();
            entry.getValue().setGrade((int)(nota*1.1));

        }
        return mapaAlumnos;

    }
}
