package test;

import model.*;
import java.time.LocalDate;

public class MainTest {
    public static void main(String[] args) {
        HourlyEmployee h = new HourlyEmployee(1, "Test", Gender.MALE,
                LocalDate.of(2022, 1, 1), 10, 50, 2);
        System.out.println("Expected 600.0, got: " + h.calculateSalary());
    }
}