package by.epam.javaIntro.simpleClass;

public class Time {

    /*Составьте описание класса для представления времени.
     * Предусмотрте возможности установки времени и изменения его
     * отдельных полей (час, минута, секунда) с проверкой
     * допустимости вводимых значений. В случае недопустимых значений
     * полей поле устанавливается в значение 0.
     * Создать методы изменения времени на заданное количество часов,
     * минут и секунд.
     */

    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        super();
        if(hour<=23 && hour>=0) {
            this.hour = hour;
        } else {
            this.hour = 0;
        }
        if(minute<=59 && minute>=0) {
            this.minute = minute;
        } else {
            this.minute = 0;
        }
        if(second<=59 && second>=0) {
            this.second = second;
        } else {
            this.second = 0;
        }
    }



    public int getHour() {
        return hour;
    }



    public int getMinute() {
        return minute;
    }



    public int getSecond() {
        return second;
    }



    public void setHour(int hour) {

        if(hour<=23 && hour>=0) {
            this.hour = hour;
        } else {
            this.hour = 0;
        }
    }


    public void setMinute(int minute) {

        if(minute<=59 && minute>=0) {
            this.minute = minute;
        } else {
            this.minute = 0;
        }
    }



    public void setSecond(int second) {

        if(second<=59 && second>=0) {
            this.second = second;
        } else {
            this.second = 0;
        }
    }



    public void changeTimeWithHour(int hour) {
        if(this.getHour()+hour<24) {
            this.hour+=hour;
        } else if(this.getHour()+hour==24){
            this.hour=0;
        }

        if(hour>24) {
            this.hour=this.hour-24+(hour%24);
        } else if(this.getHour()+hour>24) {
            this.hour = this.hour-24+hour;
        }
    }


    public void changeTimeWithMinute(int minute) {

        if(this.getMinute()+minute<60 && this.getMinute()+minute>0) {
            this.minute+=minute;
        } else

        if (this.getMinute()+minute>=60 || this.getMinute()+minute<=0){

            if((this.getMinute()+minute)%60==0) {
                this.changeTimeWithHour((this.getMinute()+minute)/60);
                this.minute = 0;
            } else {
                this.changeTimeWithHour((this.getMinute()+minute)/60);
                this.minute=this.minute-60+minute;
            }
        }
    }



    public void changeTimeWithSecond(int second) {

        if(this.getSecond()+second<60 && this.getSecond()+second>0) {
            this.second+=second;
        } else

        if (this.getSecond()+second>=60 || this.getSecond()+second<=0) {

            if((this.getSecond()+second)%60==0) {
                this.changeTimeWithMinute((this.getSecond()+second)/60);
                this.second = 0;
            } else {
                this.changeTimeWithMinute((this.getSecond()+second)/60);
                this.second = this.second-60+second;
            }
        }
    }



    @Override
    public String toString() {
        return "Hour: " + hour + ", minute: " + minute + ", second: " + second;
    }



    public static void main (String[] args) {

        Time time = new Time(22,40,55);
        System.out.println(time.toString());

        time.changeTimeWithHour(2);

        time.changeTimeWithMinute(45);

        time.changeTimeWithSecond(34);

        System.out.println(time.toString());
    }
}
