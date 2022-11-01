package hv_7;


import java.util.Arrays;
import java.util.Comparator;

public class EmployeeUtils {
//    Необходимо расширить утилитарный класс EmployeeUtils из прошлого задания следующими методами:
//    поиск наименьшего количества подчиненных в массиве менеджеров
//    поиск наибольшего количества подчиненных в массиве менеджеров
//    поиск наибольшей надбавки (разнице между базовой зарплатой и выплатой) в массиве менеджеров
//    поиск наименьшей надбавки (разнице между базовой ставки и зарплатой) в массиве менеджеров


    public static String employeeParthNameSearch(NewManeger[] managers,String name){

        for (NewManeger newManeger : managers) {
            if (newManeger.getName().contains(name)){

                return newManeger.newPrintData(immutableMonth.FIRST_QUART);
            }
        }
        return "This list doesn't has this employee";

    }
    public static void sumOfSalary(NewManeger[] managers){
        int sumOfSalary = 0;
        for (NewManeger newManeger : managers) {
            sumOfSalary += newManeger.getBaseSalary(immutableMonth.FIRST_QUART);
        }
        System.out.println(sumOfSalary);
    }
    public static void loverstAndHighestSalaru(NewManeger[] managers,String trigger){
        int[] salary = new int[managers.length];
        for (int i = 0; i < managers.length; i++) {
            salary[i] = managers[i].getBaseSalary(immutableMonth.FIRST_QUART);
        }
        Arrays.sort(salary);
        if (trigger.equals("min")){
            System.out.println("Min salary : " + salary[0]);
        } else if (trigger.equals("max")) {
            System.out.println("Max salary : " + salary[salary.length - 1]);
        }
    }
    public static int loverstAndHighestNumberOfSubordinates(NewManeger[] managers,String trigger){
        if (managers == null || managers.length == 0){
            return -1;
        }
            Arrays.sort(managers,Comparator.comparing(NewManeger :: getNumberOfSubordinates));
            if (trigger.equals("min")){
                return managers[0].getNumberOfSubordinates();
            }else if (trigger.equals("max")){
                return managers[managers.length - 1].getNumberOfSubordinates();
            }

        return 0;

    }
    public static int loverstAndHighesPayment(NewManeger[] managers,String trigger) {
        int[] payments = new int[managers.length];
        for (int i = 0; i < managers.length; i++) {
            payments[i] = managers[i].getSalaryNewManager
                    (immutableMonth.FIRST_QUART) - managers[i].getBaseSalary(immutableMonth.FIRST_QUART);
        }
        Arrays.sort(payments);
        if (trigger.equals("min")) {
            return payments[0];
        } else if (trigger.equals("max")) {
            return payments[payments.length - 1];
        }

        return 0;
    }
}
