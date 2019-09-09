import java.time.LocalTime;
import java.util.Random;

public class TestStopWatch {
    public static void main(String[] args) {
    Random rd=new Random();
    StopWatch account=new StopWatch();
    int[] numbers=new int[10000];
    for (int i=0;i<10000;i++){
        numbers[i]=rd.nextInt(10000);
    }
    long millis1= account.getElapsedTime();
    for (int i=0;i<numbers.length-1;i++){
        for (int j=i+1;j<numbers.length;j++){
            if (numbers[i]>numbers[j]){
                int temp=numbers[i];
                numbers[i]=numbers[j];
                numbers[j]=temp;
            }
        }
    }
    long millis2= account.getElapsedTime();
    long result=millis2-millis1;
        System.out.println("Start time: "+account.getStartTime());
        System.out.println("End time: "+account.getEndTime());
        System.out.println("Total time run:  "+result + " milisecond");
        System.out.println("Reset start time: "+account.start());
        System.out.println("Reset ende time: " + account.stop());

    }
}
class StopWatch{
    private LocalTime startTime;
    private LocalTime endTime;
    public StopWatch(){
        this.startTime=java.time.LocalTime.now();
    }
    public LocalTime start(){
       return this.startTime=java.time.LocalTime.now();
    }
    public LocalTime stop() {
       return this.endTime=java.time.LocalTime.now();
    }

    public LocalTime getStartTime(){
        return this.startTime=java.time.LocalTime.now();
    }
    public LocalTime getEndTime(){
        return this.endTime=java.time.LocalTime.now();
    }
    public long getElapsedTime(){
     long millis=System.currentTimeMillis();
     return millis;
    }

}