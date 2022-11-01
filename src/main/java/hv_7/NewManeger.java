package hv_7;

public final class NewManeger extends BaseEmployee {
//    Необходимо создать класс Manager с полями: имя, возраст, пол, ЗП в день и количество подчиненных.
//    Все поля сделать приватными и для каждого поля добавить методы set и get.
//    Класс должен иметь метод - getSalary(Month[] monthArray),
//    метод возвращает зарплату за те месяцы которые были переданы в качестве аргумента.
//    К рассчитанной ЗП должно прибавляться по 1% за каждого подчиненного.
    private int numberOfSubordinates;

    public NewManeger(String name, int age, char sex, int salaryPerDay,int numberOfSubordinates) {
        super(name, age, sex, salaryPerDay);
        this.numberOfSubordinates = numberOfSubordinates;
    }


    public int getNumberOfSubordinates(){
        return numberOfSubordinates;
    }
    public void setNumberOfSubordinates(int numberOfSubordinates){
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public int getSalaryNewManager(immutableMonth[] monthArray) {
        return super.getBaseSalary(monthArray) +
                (int)(super.getBaseSalary(monthArray) * (getNumberOfSubordinates() / 100.0));
    }

    public String newPrintData(immutableMonth[] monthArray){
        return String.format("Name : %s \n Age : %d \n Sex : %s \n SalaryPerDay : %s \n FinalSalary : %s ",
                super.getName(),super.getAge(),super.getSex(),super.getSalaryPerDay(),getSalaryNewManager(monthArray));
    }


}
