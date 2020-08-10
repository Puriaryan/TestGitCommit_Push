package com.company;
import java.util.Scanner;

public class University_Programs {

    //declaring class variables
    static int b_tech; //variable for B-Tech
    static int m_tech; //M-Tech
    static int m_s; //M-S
    static int p_hd; //P.hd

    //this method will accept the values from the user
    public static void take_input() {

        // new scanner variable , dp (department population)
        Scanner dp = new Scanner(System.in);

        // asking integer output for student population in department B-Tech
        System.out.println("Enter the number of students in B.Tech: ");
        b_tech = dp.nextInt(); // storing the output in the variable

        // asking integer output for student population in department M-Tech
        System.out.println("Enter the number of students in M.Tech: ");
        m_tech = dp.nextInt();

        // asking integer output for student population in department M-S
        System.out.println("Enter the number of students in M.S: ");
        m_s = dp.nextInt();

        // asking integer output for student population in department P-hd
        System.out.println("Enter the number of students in P.hd: ");
        p_hd = dp.nextInt();
    }

    //this method will compute the total population percentage in each department
    public static void computePercent(int btech, int mtech, int ms, int phd) { //methods with parameters

        int total_pop; //total population
        double p_btech; // population percentage for b-tech
        double p_mtech; // population percentage for m-tech
        double p_ms; // population percentage for ms
        double p_phd; // population percentage for phd

        total_pop = btech + mtech + ms + phd; // compute total department populations

        //compute total percentage each department get
        p_btech = (double) btech / total_pop * 100;
        p_mtech = (double) mtech / total_pop * 100;
        p_ms = (double) ms / total_pop * 100;
        p_phd = (double) phd / total_pop * 100;

        System.out.println("The percentage of students in department 'B.tech' is :" + String.format("%.2f", p_btech) + " percent");
        System.out.println("The percentage of students in department 'M.tech' is :" + String.format("%.2f", p_mtech) + " percent");
        System.out.println("The percentage of students in department 'M.S' is :" + String.format("%.2f", p_ms) + " percent");
        System.out.println("The percentage of students in department 'P.hd' is :" + String.format("%.2f", p_phd) + " percent");

    }

    //this method will determine the department which has highest number of students
    public static void max(int btech, int mtech, int ms, int phd) { //methods with parameters

        //comparing all the departments with B-tech
        if (btech >= mtech && btech >= ms && btech >= phd) {
            System.out.println("B.Tech has the biggest number of students");
        }
        //comparing all the departments with M-tech
        else if (mtech >= btech && mtech >= ms && mtech >= phd) {
            System.out.println("M.Tech has the biggest number if students");
        }
        //comparing all the departments with M-S
        else if (ms >= btech && ms >= mtech && ms >= phd) {
            System.out.println("M.S has the biggest number if students");
        }
        //comparing all the departments with P-hd
        else if (phd >= btech && phd >= mtech && phd >= ms) {
            System.out.println("M.S has the biggest number if students");
        }
        else if (btech == mtech && btech == ms && btech == phd) { // tried but did not work
            System.out.println("All the departments have equal number of students");
        }
    }

    //this method will determine the department which has the lowest number of students
    public static void min(int btech, int mtech, int ms, int phd) { //methods with parameters

        if (btech <= mtech && btech <= ms && btech <= phd) {
            System.out.println("B.Tech has the smallest number of students");
        } else if (mtech <= btech && mtech <= ms && mtech <= phd) {
            System.out.println("M.Tech has the smallest number if students");
        } else if (ms <= btech && ms <= mtech && ms <= phd) {
            System.out.println("M.S has the smallest number if students");
        } else if (phd <= btech && phd <= mtech && phd <= ms) {
            System.out.println("M.S has the smallest number if students");
        } else if (btech == mtech && btech == ms && btech == phd) { //tried but did not work
            System.out.println("All the departments have equal number of students");
        }
    }
    // combining all the methods in main function
    public static void main(String[] args) {
        take_input();
        computePercent(b_tech, m_tech, m_s, p_hd);
        max(b_tech, m_tech, m_s, p_hd);
        min(b_tech, m_tech, m_s, p_hd);

    }
}



