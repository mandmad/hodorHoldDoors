import java.util.*;
  
class Main { 
  
    static void holdTheDoor(int hodorStrength, int[] doorsStrength, int[] zombiesInflux) 
    { 
      if (doorsStrength.length == zombiesInflux.length){

        int totalStrength[] = new int[doorsStrength.length];
        int secondsResult[] = new int[doorsStrength.length];

        for (int i = 0; i < doorsStrength.length; i++) { 
          totalStrength[i] = doorsStrength[i]+hodorStrength;
        } 
        System.out.println("Total strenght: "+Arrays.toString(totalStrength));

        for (int i = 0; i < totalStrength.length; i++) { 
          secondsResult[i] = totalStrength[i] / zombiesInflux[i];
        } 
        System.out.println("Seconds result: "+Arrays.toString(secondsResult));

        var max = secondsResult[0];
        var maxIndex = 0;

        for (var i = 0; i < secondsResult.length; i++) {
            if (secondsResult[i] > max) {
                maxIndex = i;
                max = secondsResult[i];
            }
        }
        System.out.println("Result: "+maxIndex);

      } else {
        System.out.println("The arrays doesn't have the same length.");
      }

    }
  

    public static void main(String[] args) 
    { 

      int hodorStrength = 50;
      int[] doorsStrength = {10,25,5,10};
      int[] zombiesInflux = {2,3,1,4};

      holdTheDoor(hodorStrength, doorsStrength, zombiesInflux);
    } 
} 
