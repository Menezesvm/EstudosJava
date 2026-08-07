package application;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.println("How many will be registered?");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.println();
            System.out.println("Employee #" + (i + 1) + ":");
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            while (hasID(list, id)) {
                System.out.println("Id already taken! try again: ");
                id = sc.nextInt();
            }
            System.out.print("name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("salary: ");
            Double salary = sc.nextDouble();

            Employee emp = new Employee(id, name, salary);

            list.add(emp);
        }
        System.out.println();
        System.out.println("Enter the employee id that will have salary increase :");
        Integer idSalary = sc.nextInt();

        Employee emp = list.stream().filter(e -> e.getId() == idSalary).findFirst().orElse(null);

        //Integer pos = position(list,idSalary);
        if (emp == null) {
            System.out.println("This id does not exist!");
        } else {
            System.out.println("Enter the Porcentage:");
            double percentage = sc.nextDouble();
            //list.get(emp.getId()).increaseSalary(percentage);
            emp.increaseSalary(percentage);
        }
        System.out.println();
        System.out.println("List of employees:");
        for (Employee obj : list) {
            System.out.println(obj);
        }
        sc.close();
    }

    public static Integer position(List<Employee> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }

        public static boolean hasID (List < Employee > list,int id){
            Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
            return emp != null;
        }
    }







