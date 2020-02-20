package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


    }

    public static void drakeEquation(){
/*Drake equation
N = number of intelligent species that can communicate with us
R∗ = 1 yr−1 (1 star formed per year, on the average over the life of the galaxy; this was regarded as conservative)
fp = 0.2 to 0.5 (one fifth to one half of all stars formed will have planets)
ne = 1 to 5 (stars with planets will have between 1 and 5 planets capable of developing life)
fl = 1 (100% of these planets will develop life)
fi = 1 (100% of which will develop intelligent life)
fc = 0.1 to 0.2 (10–20% of which will be able to communicate)
L = 1000 to 100,000,000 years (which will last somewhere between 1000 and 100,000,000 years)
 */

int N;
int rStar;
double f_p;
int numberOfExoplanets;
double f_l;
double f_i;
double f_c;
int L;

Scanner input = new Scanner(System.in);
//todo initialize the scanner to take input and commit
//Ask for rStar number store in the rStar variable and commit
// Ask for rStar number store in the rStar variable and commit
// Ask for f_p fraction store in the f_p variable and commit
//Ask for numberOfExponents store in the nunmberOfExponents variable and commit
//Ask for f_l store in the f_l variable and commit
// Ask for f_i store in the f_i variable and commit
// Ask for f_c store in the f_c variable and commit
// Ask for L store in the L variable and commit

//todo complete each one of the variables storing them correctly and commiting each time
        System.out.println("Give me a value of how many stars are formed per year");
        rStar = input.nextInt();
        System.out.println("Give me a fraction of planets that will have stars");
        f_p = input.nextInt();
        System.out.println("Give me a number of planets capable of developing life");
        numberOfExoplanets = input.nextInt();
        System.out.println("Give me percentage of those planets that will develope life");
        f_l = input.nextInt();
        System.out.println("Give me a percentage of those planets that will have intelligent life");
        f_i = input.nextInt();
        System.out.println("Give a percentage of those life that will able to communicate ");
        f_c = input.nextInt();
        System.out.println("Give me a number of years it will last for");
        L = input.nextInt();


N = rStar *f_p * numberOfExoplanets * f_l *f_i * f_c * L;







    }

}
