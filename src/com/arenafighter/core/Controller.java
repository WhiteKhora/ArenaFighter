package com.arenafighter.core;

import com.fighter.template.Fighter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller {
    Scanner scanner = new Scanner(System.in);

    List<Fighter> fighters = new ArrayList<>();
    public void run() {

    }



    public static Fighter createFighter(String name, String type) {
        return Fighter.createFighter(name, type);
    }




}
