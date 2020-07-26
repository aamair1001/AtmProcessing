package com.company.model;

import java.util.HashMap;

public class AccountNumbers {


         public static HashMap<Integer, Double> registerAccounts () {
            HashMap<Integer, Double> object = new HashMap<Integer, Double>();
            object.put(9011, (double) 1000);
            object.put(9012, (double) 2000);
            return object;
        }

    }

