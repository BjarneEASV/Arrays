/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg5;

/**
 *
 * @author thor1
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        /*ArrayOperations arrayO = new ArrayOperations(5, 1, 10);
        arrayO.printArray();
        arrayO.printNumberAt(10);
        arrayO.printNumberOf(10);
        System.out.println(arrayO.getMimimum());
        System.out.println(arrayO.getMaximum());
        System.out.println(arrayO.getAverage());
        System.out.println(arrayO.getSum());
        System.out.println(arrayO.firstIndexOf(16));
        System.out.println(arrayO.lastIndexOf(16));
        arrayO.reverse();
        arrayO.printArray();*/
/*      Die die = new Die(6);
        die.rollDices(6);
        die.printRolls();*/
        LottoGenerator lGen = new LottoGenerator();
        lGen.drawTheNumbers(7, 3, 32, 1);
        lGen.printLottoNumbers();
        lGen.sortLottoNumber();
        lGen.printLottoNumbers();
        /*ArrayListOperation arrayList = new ArrayListOperation();
        arrayList.addRandomNumbers(20, 1, 10);
        arrayList.printArraList();
        System.out.println("Highest number is " + arrayList.getHighest());
        System.out.println("lowest number is " + arrayList.getLowest());
        System.out.println("The first occuences index is " + arrayList.getFirstOccuenc(2));
        System.out.println("The last occuences index is " + arrayList.getLastOccuenc(2));
        System.out.println("The sum of the ArrayList is " + arrayList.getSum());
        arrayList.numberOfOccuences(2);
        arrayList.reverse();
        arrayList.printArraList();*/
        /*MultiArrays multi = new MultiArrays(10, 10);
        multi.printArrays();*/
        
        
        
    }
    
}
