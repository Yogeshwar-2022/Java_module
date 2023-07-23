public class Java_96_Date_And_Time {
    public static void main(String[] args) {
        System.out.println("milli seconds passed since 1 january 1970, "+ System.currentTimeMillis()+" ms");
        System.out.println("seconds passed since 1 january 1970, "+ System.currentTimeMillis()/1000+" s");
        System.out.println("hours passed since 1 january 1970, "+ System.currentTimeMillis()/1000/3600+" hrs");
        System.out.println("days passed since 1 january 1970, "+ System.currentTimeMillis()/1000/3600/24+" days");
        System.out.println("years passed since 1 january 1970, "+ System.currentTimeMillis()/1000/3600/24/365+" yrs");
    }
}
