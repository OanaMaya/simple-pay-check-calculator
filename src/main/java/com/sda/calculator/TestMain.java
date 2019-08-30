package com.sda.calculator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestMain {

    public static void main(String[] args) {
        List<Entity> entityList = showentities();
        List<Entity> rearangedEntityList = rearrangeEntities(entityList);

        System.out.println(rearangedEntityList);
         computeAmountReceivedCity(rearangedEntityList, "Bistrita");

        System.out.println(rearangedEntityList);
        double salariesFromBistrita = computeAmountReceivedCity(entityList, "Bistrita");
        System.out.println(salariesFromBistrita);
        
    }

    public static List<Entity> showentities() {
        List<Entity> entitiesList = new ArrayList<>();
        // declaram studenti si profesorii pentru a popula lista.

        Student student1 = new Student("Cluj-Napoca", 500);
        Student student2 = new Student("Bistrita", 700);
        Professor professor1 = new Professor("Zalau", 2500);
        Professor professor2 = new Professor("Sibiu", 3000);

        entitiesList.add(student1);
        entitiesList.add(student2);
        entitiesList.add(professor1);
        entitiesList.add(professor2);

        return entitiesList;

    }

    public static List<Entity> rearrangeEntities(List<Entity> entities) {
        List<Entity> professorList = new ArrayList<>();
        List<Entity> studentList = new ArrayList<>();

        for (Entity e : entities) {
            if (e instanceof Professor) { // cand vrem sa verificam ca un obiect este instanta de o clasa folosim instanceof
                professorList.add(e);

            } else if (e instanceof Student) {
                studentList.add(e);
            }
        }
        // sortam lista in functie de ce parametrii ceruti:
        //  profesorii crescator in fuctie de salar si studentii descrescato in functie de bursa
        Comparator<Entity> myComparator = new EntityComparator();
        // studentii- cresc, profi- descr.
        Collections.sort(professorList, myComparator);
        Collections.sort(studentList, myComparator);
        Collections.reverse(professorList);

        //golim lista, ca sa nu se repete elementele
        entities.clear();
        entities.addAll(professorList);
        entities.addAll(studentList);

        return entities;
    }


    public static double computeAmountReceivedCity(List<Entity> entities, String city) {
        double sum = 0;
        for (Entity e : entities) {
            if (e.getCity().equalsIgnoreCase(city)) {
                sum = sum + e.amountReceived();
            }
        }
        return sum;
    }


}



