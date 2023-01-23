package main;

import java.util.Scanner;
    public class Main {
        public static void main(String[] args) {

            float x=123.5f;//initialization
            float y=54673.0f;
            char symbol='a';
            boolean z=true;
            String name="Bro";
            String B="water";
            String M="Kool-Aid";
            String temp;
            temp=B;
            B = M;
            M = temp;

            Scanner scan = new Scanner(System.in);
            System.out.println("what is your name?");
            String name1 = scan.nextLine();
            System.out.println("HELLO "+name1);
            System.out.println("B: "+B);
            System.out.println("M: "+M);
            System.out.println("My number is: "+x);
            System.out.println("My number is: "+y);
            System.out.println("My number is: "+symbol);
            System.out.println("My number is: "+z);
            System.out.println("Hello "+name);
            System.out.println("I love MOM & DAD");
            System.out.println("\tI love my FAMILY\t");
            int age = 10;
            if(age>=18&&age<=30)
                System.out.println("you are an adult!");

            else if(age >=30)
                System.out.println("ok boomer!");
            else
            {
                System.out.println("you are not an adult!");
            }
            String day="MONDAY";
            switch(day){
                case "SUNDAY":System.out.println("it is SUNDAY");
                break;
                case "MONDAY":System.out.println("it is MONDAY");
                    break;
                case "TUESDAY":System.out.println("it is TUESDAY");
                    break;
                case "WEDNSDAY":System.out.println("it is WEDNSDAY");
                    break;
                case "THURSDAY":System.out.println("it is THURSDAY");
                    break;
                case "FRIDAY":System.out.println("it is FRIDAY");
                    break;
                case "SATURDAY":System.out.println("it is SATURDAY");
                    break;
                default:System.out.println("is not a day");


                    int temp1=40;
                    if(temp1>30){
                        System.out.println("it is hot out side");
                    }
                    else if(temp1 >=20&&temp1<=30){
                        System.out.println("it is warm outside");
                    }
                    else{
                        System.out.println("it is cold outside");
                    }
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("YOU ARE PLAYING GAME!! PRESS q OR QTO QUIT THE GAME");
                    String response = scanner.next();
                    if (response.equals("q")||response.equals("Q"))
                    {
                        System.out.println("YOU QUIT THE GAME");

                    }
                    else
                    {
                        System.out.println("YOU ARE STILL PLAYING");
                    }

                    String [] dormMates={"helina","eldana"};
                    System.out.println(dormMates[0]);

                    String[] family = new String[5];
                    family[0]="Baba";
                    family[1]="mom";
                    family[2]="asil";
                    family[3]="menal";
                    family[4]="firdows";
                    for(int i=0;i<family.length;i++)
                    {
                        System.out.println(family[i]);
                    }
                    String[][] courses = new String[2][2];
                    courses[0][0]="Data Structure ";
                    courses[0][1]=" Operating System";
                    courses[1][0]="Computer Organization and Architectuure ";
                    courses[1][1]=" Computer Networking";
                    for (int k=0;k<courses.length;k++)
                    {
                        System.out.println();
                        for(int j=0;j<courses[k].length;j++)
                            System.out.print(courses[k][j]);
                    }
            }
        }

    }