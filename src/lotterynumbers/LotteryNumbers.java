package lotterynumbers;

public class LotteryNumbers {

    public static void main(String[] args) {
        int[] theNumbers = new int[5];
        int numbersSoFar = 0, guess;
        int stepCounter = 0;
        while(numbersSoFar < 5) {
            guess = (int) (Math.random() * 90 + 1);
            int i = 0;
            while(i < numbersSoFar && !(theNumbers[i] == guess)) {    
               i++;          
               stepCounter++;
            }
               boolean alreadyHas = (i < numbersSoFar);
            if(!alreadyHas){
                theNumbers[numbersSoFar++] = guess;   
            
            }
        }
        for (int i = 0; i <= 4; i++) 
            System.out.print(theNumbers[i]+" ");
        System.out.println("");
        System.out.println("Number of steps taken: " + stepCounter);
        }
    }
    