/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multwithoutfor;

/**
 *
 * @author tere
 */
public class MultWithoutFor {

    //make a mult a*b without *
    static int multip(int a, int b) {
        int mult = 0;
        int aa = ((a < b) ? b : a);// get the max num
        int bb = ((a < b) ? a : b);//get the min num
        for (int x = 0; x < Math.abs(aa); x++) {//we convert the number to positive
            mult += bb;//if this is a negative num it will sum the num neg
        }
        System.out.println("perro " + aa + " " + bb);
        return mult;
    }

    //Arreglo que saque al numero mayor y menor
    static String getMaxMinNum() {
        int[] nums = {1, 2, 3, 4, 5};
        int max = 0, min = 0;
        for (int x = 0; x < nums.length; x++) {
            if (nums[x] > max) {
                max = nums[x];
            } else if (nums[x] < min) {
                min = nums[x];
            }
        }
        return max + " " + min;
    }

    //Arreglo que multiplique todos sus numeros
    static int multNums() {
        int[] arrMult = {2, 4, 6, 8, 9};
        int multRes = 1;
        for (int x = 0; x < arrMult.length; x++) {
            multRes *= arrMult[x];
        }
        return multRes;
    }

    public static void main(String[] args) {
        System.out.println(MultWithoutFor.multip(-10,-1));
        System.out.println(getMaxMinNum());
        System.out.println(multNums());
    }

}
