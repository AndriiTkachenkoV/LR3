package controller;

import model.University;
import model.Human;

public class UniversityCreator {
    public static University createUniversity(String name, Human head) {
        return new University(name, head);
    }
}
