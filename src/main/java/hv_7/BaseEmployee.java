package hv_7;

public abstract class BaseEmployee {
    private String name;
    private int age;
    private char sex;
    private int salaryPerDay;

    public BaseEmployee(String name, int age,char sex,int salaryPerDay){
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.salaryPerDay = salaryPerDay;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getSalaryPerDay() {
        return salaryPerDay;
    }

    public void setSalaryPerDay(int salaryPerDay) {
        this.salaryPerDay = salaryPerDay;
    }

    public int getBaseSalary(immutableMonth[] monthArray) {
        int sumSalary = 0;
        for (immutableMonth month : monthArray) {
            sumSalary += getSalaryPerDay() * immutableMonth.getNumberOfWorkDays();
        }
        return sumSalary;
    }
    public int getBaseSalary(immutableMonth month) {
        return getSalaryPerDay() * immutableMonth.getNumberOfWorkDays();
    }


}
