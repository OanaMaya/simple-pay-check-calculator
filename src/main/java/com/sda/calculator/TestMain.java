package com.sda.calculator;

import java.util.ArrayList;
import java.util.List;

public class TestMain {

    public static void main(String[] args) {
    }

    public List<Entity> showentities() {
        List<Entity> entitiesList = new ArrayList<>();

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

    public void SortEntitiesList(List<Entity> list){
        List<Entity> professortList = new ArrayList<>();
        List<Entity> studentList = new ArrayList<>();

        for( Entity entity: list ){
            if(entity instanceof Professor){
                professortList.add(entity);

            }else{
                studentList.add(entity);}
            }
             // contanare 2 liste



        }





    }

}