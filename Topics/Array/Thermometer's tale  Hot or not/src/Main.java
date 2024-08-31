import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        // Declare and initialize the array
        // Read temperature values
        // Calculate average, highest, and count above 30.0°C
        // Print results

        float[] array_temperature = new float[n];

        for(int i=0; i<n; i++){
            array_temperature[i] = scanner.nextFloat();
        }

        float average = averageTemperature(array_temperature);
        float highest = highestTemperature(array_temperature);
        int aboveCount = aboveTemperature(array_temperature);

        System.out.printf("Average: %.1f\n", average);
        System.out.printf("Highest: %.1f\n", highest);
        System.out.printf("Above 30.0°C: %d\n", aboveCount);

        scanner.close();
    }

    public static float averageTemperature(float[] array){
        float sum=0;
        for(float temperature : array){
             sum+=temperature;
        }
        return sum/array.length;
    }


    public static float highestTemperature(float[] array){
        float highest = array[0];

        for(float temperature : array){
            if(temperature>highest){
                highest = temperature;
            }
        }
        return highest;
    }


    public static int aboveTemperature(float[] array){
        int count=0;
        for(float temperature : array){
            if(temperature>30.0){
                count+=1;
            }
        }
        return count;
    }
}