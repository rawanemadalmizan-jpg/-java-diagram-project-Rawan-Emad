package model;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {
    private double hourlyRate;
    private double hoursWorked;
    private double overtimeRate;

    public HourlyEmployee(int id, String name, Gender gender, LocalDate hireDate,
            double hourlyRate, double hoursWorked, double overtimeRate) {
        super(id, name, gender, hireDate);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
        this.overtimeRate = overtimeRate;
    }

    @Override
    public double calculateSalary() {
        if (hoursWorked <= 50) {
            return hoursWorked * hourlyRate;
        }
        double overtimeHours = hoursWorked - 50;
        return (50 * hourlyRate) + (overtimeHours * overtimeRate);
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getOvertimeRate() {
        return overtimeRate;
    }

    public void setOvertimeRate(double overtimeRate) {
        this.overtimeRate = overtimeRate;
    }
        @Override
    public String toString() {
        return "HourlyEmployee{" + super.toString() + ", hourlyRate=" + hourlyRate
                + ", hoursWorked=" + hoursWorked + ", overtimeRate=" + overtimeRate + "}";
    }

}