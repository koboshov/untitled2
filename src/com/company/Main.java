package com.company;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

//
//        Set<Integer> integers = new HashSet<>();
//        integers.add(1);
//        integers.add(2);
//        integers.add(3);
//        System.out.println(integers);
//
//        Set<Integer> integers2 = new HashSet<>();
//        integers2.add(0);
//        integers2.add(1);
//        integers2.add(2);
//        System.out.println(integers2);
//
//        System.out.println(symmetricDifference(integers, integers2));
//    }
//
//    public static Set<Integer> symmetricDifference(Set<Integer> integers, Set<Integer> integers2) {
//        Set<Integer> set2 = new HashSet<>(integers);
//
//        set2.removeAll(integers2);
//        integers2.removeAll(integers);
//        set2.addAll(integers2);
//
//        return set2;


//
//        Эки setтин симметриялык айырмасын эсептеген symmetricDifference методун ишке ашырыныз.
//                Метод натыйжаны жаңы set катары кайтарышы керек. Методко параметр катары берилген setтерди өзгөртүүгө жол берилбейт.
//
//        Мисалы: [1, 2, 3} жана {0, 1, 2]
//        Жооп: [0, 3]
//
//        public static Set<Integer> symmetricDifference (Set<Integer> set1, Set<Integer> set2) методу болушу керек

//
        Set<Integer> integers = new HashSet<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        System.out.println(integers);

        Set<Integer> integers1 = new HashSet<>();
        integers1.add(0);
        integers1.add(1);
        integers1.add(2);
        System.out.println(integers1);

        System.out.println(symmetricDifference(integers,integers1));
    }
    public static Set<Integer>symmetricDifference(Set<Integer>integers,Set<Integer>integers1) {

        Set<Integer> set = new HashSet<>(integers);
        set.removeAll(integers1);
        integers1.removeAll(integers);
        set.addAll(integers1);
        return set;


    }
}










