public class SecToHrMinSecConversion
{
    public static void main(String[] args) {
        int totalsec=86399;
        int hours=totalsec/3600;
        System.out.println("Hours=" + hours);
        int min = (totalsec%3600)/60;
        System.out.println("Minutes="+ min);
        int sec = totalsec%60;
        System.out.println("Seconds=" + sec);

    }
}
