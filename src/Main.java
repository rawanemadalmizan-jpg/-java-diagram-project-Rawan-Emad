import model.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
        public static void main(String[] args) {

                MonthlyEmployee manager = new MonthlyEmployee(1, "Mayar", Gender.FEMALE,
                                LocalDate.of(2018, 3, 1), 20000, 21, 10, true);

                HourlyEmployee hourly = new HourlyEmployee(2, "Ali", Gender.MALE,
                                LocalDate.of(2022, 6, 15), 50, 43, 80);

                CommissionEmployee sales = new CommissionEmployee(3, "Rawan", Gender.FEMALE,
                                LocalDate.of(2021, 1, 10), 5000, 0.07, 100000);

                Department dept = new Department(10, "Sales", manager, new ArrayList<>());
                dept.addEmployee(manager);
                dept.addEmployee(hourly);
                dept.addEmployee(sales);

                System.out.println(dept);
                dept.printAllEmployees();
                System.out.println("Total payroll: " + dept.calculateTotalPayroll());
        }
}