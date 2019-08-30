package com.sda.calculator;

import java.util.Comparator;

public class EntityComparator implements Comparator<Entity> {
   // orice comparator returneaza un int
    //1 -> in cazul in care amount 1 e mai mare ca amount 2
    //0 -> in cazul in care salariile sunt egale
    //-1 -> in cazul in care amount-ul 2 e mai mare ca 1
    @Override

    public int compare(Entity entity1, Entity entity2) {
//    if(entity1.amountReceived()== entity2.amountReceived()) {
//        return 0;
//    } else if(entity1.amountReceived()> entity2.amountReceived()) {
//        return 1;
//    } else{
//        return -1;
//    }

     //mai simplu
      return  Double.compare(entity1.amountReceived(),entity2.amountReceived());
     // clasa rapper, tratam primitivele ca si clase
    }
}