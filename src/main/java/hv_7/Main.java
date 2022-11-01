package hv_7;

public class Main {

    public static void main(String[] args) {

        NewEmployee newEmployee = new NewEmployee("Alex",43,'M',500);
        NewManeger newManeger1 = new NewManeger("Smith",55,'M',300,5);
        NewManeger newManeger2 = new NewManeger("Joe",32,'M',500,10);
        NewManeger newManeger3 = new NewManeger("Billy",25,'M',700,15);

        NewManeger[] managers = new NewManeger[]{newManeger1,newManeger2,newManeger3};

//
       // System.out.println(EmployeeUtils.employeeParthNameSearch(managers,"Billy"));
//        EmployeeUtils.sumOfSalary(managers);
//
        System.out.println(EmployeeUtils.loverstAndHighestNumberOfSubordinates(managers,"max"));
//        EmployeeUtils.loverstAndHighesPayment(managers,"max");
//
//
//        System.out.println(newEmployee.getSalary(immutableMonth.firstQuart()));
//        System.out.println(newManeger1.getSalary(immutableMonth.firstQuart()));


       // System.out.println(100 + 100 * 5 / 100);

//        newEmployee.newPrintData(MonthUtils.april);





//        worker.printData();
//        manager.printData();
//        director.printData();
//        System.out.println(manager.getSalary());
//        System.out.println(director.getSalary());



    }
}
