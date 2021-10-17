package com.company.oopClasses;



public class Trees {
    abstract class Tree {
        void printInfo(Season season) {
            System.out.println(season + "");

        }


    }


    enum Season {Winter, Spring, Summer, Autumn}

    public static void main(String[] args) {


    }


  //  public class conifer extends Tree {
    //    void printInfo(Season season) {
      //      System.out.println(season + "");
        //    super.printInfo(season);


      //  }

    //}

    private void printInfo(Season season) {
    }

    class Decidious extends Tree {
        void getInfo(Season season) {

        }

    }
}

   // void getInfo(Season season) {
     //   super.getInfo(season);
       // switch (season){
         //   case Winter:
           //     System.out.println("The tree stays green");
             //   break;
            //case Spring:
              //  System.out.println("The tree blooms");
                //break;
           // case Summer:
             //   System.out.println("The tree grows quickly");
               // break;
            //case Autumn:
              //  System.out.println("The tree grows slowly");
                //break;

  //  }





