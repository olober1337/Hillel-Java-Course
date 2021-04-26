package com.hillel.homework.homework13;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Class2 extends Class1 {

    public Class2(List newList, Set newSet, Map newMap) {
        super(newList, newSet, newMap);
    }

    public void wildCards (List myWildCardsList, List myWildCardsList2) {

        List<? extends Class1> newList1 = new LinkedList<>(myWildCardsList);
        System.out.println(newList1);

        List<? super Class3> newList2 = new LinkedList<>(myWildCardsList2);
        System.out.println(newList2);
    }
}
