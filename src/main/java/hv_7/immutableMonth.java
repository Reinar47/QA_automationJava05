package hv_7;

public final class immutableMonth {
//    Создать класс immutableMonth с полями: имя месяца, количеством дней и количеством рабочих дней.
//    Создать класс MonthUtils который бы хранил подготовленные месяцы
//    или их массивы для использования (объекты класса immutableMonth).
    private final String month;
    private final int numberOfDays;
    private static  int numberOfWorkDays;


    public immutableMonth(String month,int numberOfDays,int numberOfWorkDays){
        this.month = month;
        this.numberOfDays = numberOfDays;
        immutableMonth.numberOfWorkDays = numberOfWorkDays;
    }
    static final immutableMonth[] FIRST_QUART = {MonthUtils.JANUARY,MonthUtils.FEBRUARY,MonthUtils.MARCH};


    static final immutableMonth[] SECOND_QUART = {MonthUtils.APRIL,MonthUtils.MAY,MonthUtils.JUNE};

    static final immutableMonth[] THIRD_QUART = {MonthUtils.JULY,MonthUtils.AUGUST,MonthUtils.SEPTEMBER};

    static final immutableMonth[] FOURTH_QUART = {MonthUtils.OCTOBER,MonthUtils.NOVEMBER,MonthUtils.DECEMBER};

    static final immutableMonth[] FIRST_HALF_YEAR = new immutableMonth[]{
                MonthUtils.JANUARY,MonthUtils.FEBRUARY,MonthUtils.MARCH,
                MonthUtils.APRIL,MonthUtils.MAY,MonthUtils.JUNE};

    static final immutableMonth[] SECOND_HALF_YEAR = {
                MonthUtils.JULY,MonthUtils.AUGUST,MonthUtils.SEPTEMBER,
                MonthUtils.OCTOBER,MonthUtils.NOVEMBER,MonthUtils.DECEMBER};

    static final immutableMonth[] YEAR = {
                MonthUtils.JANUARY,MonthUtils.FEBRUARY,MonthUtils.MARCH,
                MonthUtils.APRIL,MonthUtils.MAY,MonthUtils.JUNE,
                MonthUtils.JULY,MonthUtils.AUGUST,MonthUtils.SEPTEMBER,
                MonthUtils.OCTOBER,MonthUtils.NOVEMBER,MonthUtils.DECEMBER};

    public static immutableMonth[] getYear() {
        return YEAR;
    }

    public String getMonth(){
        return month;
    }
    public int getNumberOfDays(){
        return numberOfDays;
    }
    public static int getNumberOfWorkDays(){
        return numberOfWorkDays;
    }



}
