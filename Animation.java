


class Animation {

//display the current status of the hangman. Takes in the amount of wrong guesses, max allowed wrong guesses and whteher or not the user has completed the word/phrase
        public static void hangmanfigure(double wGuess,double mWrong, boolean cAnswer){
            if(wGuess == mWrong && cAnswer == false){
            System.out.println("\t\t\t\t\t\t\t\t--------| ");
            System.out.println("\t\t\t\t\t\t\t\t|       | ");
            System.out.println("\t\t\t\t\t\t\t\t|       | ");
            System.out.println("\t\t\t\t\t\t\t\t|        ");
            System.out.println("\t\t\t\t\t\t\t\t|        ");
            System.out.println("\t\t\t\t\t\t\t\t|        ");
            System.out.println("\t\t\t\t\t\t\t\t|      ");
            System.out.println("\t\t\t\t\t\t\t\t__         *BUUUUUUUUUUUURP* ");
            System.out.println("\t\t\t\t\t\t\t\t[≈ >-(づ ՞ਊ ՞ )づ ≈≈] ");
            System.out.println();
          }

          else if(wGuess == 0.0 && cAnswer == true){

            System.out.println("\t\t\t\t\t\t[CONGRATS HE IS AIGHT...MOSTLY!]      \n");
            System.out.println("\t\t\t\t\t\t\t\t--------| ");
            
            System.out.println("\t\t\t\t\t\t\t\t|       | ");
            System.out.println("\t\t\t\t\t\t\t\t|   ( ͡° ͜ʖ ͡°) \t\"I am still traumatized\"");
            System.out.println("\t\t\t\t\t\t\t\t|       | ");
            System.out.println("\t\t\t\t\t\t\t\t|      /|\\ ");
            System.out.println("\t\t\t\t\t\t\t\t|       | ");
            System.out.println("\t\t\t\t\t\t\t\t|     _/\\_");
            System.out.println("\t\t\t\t\t\t\t\t__");
            System.out.println("\t\t\t\t\t\t\t\t[≈    (ಠ ∩ಠ)  ≈≈] ");
            System.out.println();


          }


          else if(wGuess == 0.0 && cAnswer == false){
            System.out.println("\t\t\t\t\t\t\t\t--------| ");
            System.out.println("\t\t\t\t\t\t\t\t|       | ");
            System.out.println("\t\t\t\t\t\t\t\t|       | ");
            System.out.println("\t\t\t\t\t\t\t\t|     (ᗒᗣᗕ) \t\"ARE THOSE PIRANHAS?!?!?! HELP\"");
            System.out.println("\t\t\t\t\t\t\t\t|       | ");
            System.out.println("\t\t\t\t\t\t\t\t|      /|\\ ");
            System.out.println("\t\t\t\t\t\t\t\t|       | ");
            System.out.println("\t\t\t\t\t\t\t\t|     _/ \\_");
            System.out.println("\t\t\t\t\t\t\t\t__");
            System.out.println("\t\t\t\t\t\t\t\t[≈ >-(¯﹃¯*) ≈≈] ");
  
          }



          else if((mWrong - wGuess) == Math.floor(mWrong/2.0)){
          
            System.out.println("\t\t\t\t\t\t\t\t--------| ");
            System.out.println("\t\t\t\t\t\t\t\t|       | ");
            System.out.println("\t\t\t\t\t\t\t\t|       | ");
            System.out.println("\t\t\t\t\t\t\t\t|     (」°ﾛ°)｣ \t\"MY LEGGGGGGGGGGG\"");
            System.out.println("\t\t\t\t\t\t\t\t|       | ");
            System.out.println("\t\t\t\t\t\t\t\t|       | ");
            System.out.println("\t\t\t\t\t\t\t\t|       | ");
            System.out.println("\t\t\t\t\t\t\t\t|     _/ ");
            System.out.println("\t\t\t\t\t\t\t\t__");
            System.out.println("\t\t\t\t\t\t\t\t[≈ >-(✦ ‿ ✦) ≈≈] ");
            System.out.println();
          }

          else if((mWrong - wGuess) == Math.floor(mWrong/3.0)){

            System.out.println("\t\t\t\t\t\t\t\t--------| ");
            System.out.println("\t\t\t\t\t\t\t\t|       | ");
            System.out.println("\t\t\t\t\t\t\t\t|       | ");
            System.out.println("\t\t\t\t\t\t\t\t|    (ಥ﹏ಥ) \t\"NO MORE FEET PICS HOW AM I GONNA PAY BILLS NOW\"");
            System.out.println("\t\t\t\t\t\t\t\t|       | ");
            System.out.println("\t\t\t\t\t\t\t\t|      /|\\ ");
            System.out.println("\t\t\t\t\t\t\t\t|       | ");
            System.out.println("\t\t\t\t\t\t\t\t|      ");
            System.out.println("\t\t\t\t\t\t\t\t__");
            System.out.println("\t\t\t\t\t\t\t\t[≈ >-(✦ ‿ ✦) ≈≈] ");
            System.out.println();
          }

          else if((mWrong - wGuess) == Math.floor(mWrong/4.0)){

            System.out.println("\t\t\t\t\t\t\t\t--------| ");
            System.out.println("\t\t\t\t\t\t\t\t|       | ");
            System.out.println("\t\t\t\t\t\t\t\t|       | ");
            System.out.println("\t\t\t\t\t\t\t\t|     (⁰д⁰) \t\" I AM A LEFTY HOW AM I GONNA--\"");
            System.out.println("\t\t\t\t\t\t\t\t|       | ");
            System.out.println("\t\t\t\t\t\t\t\t|      /| ");
            System.out.println("\t\t\t\t\t\t\t\t|        ");
            System.out.println("\t\t\t\t\t\t\t\t|      ");
            System.out.println("\t\t\t\t\t\t\t\t__");
            System.out.println("\t\t\t\t\t\t\t\t[≈ >-( ͡° ͜ʖ ͡°) ≈≈] ");
            System.out.println();
          }


            else if ((mWrong - wGuess) == Math.floor(mWrong/5.0) && cAnswer == true){
            System.out.println("\t\t\t\t\t\t[U saved Pman...]      \n");
            System.out.println("\t\t\t\t\t\t\t\t--------| ");
            System.out.println("\t\t\t\t\t\t\t\t|       | ");
            System.out.println("\t\t\t\t\t\t\t\t|       | ");
            System.out.println("\t\t\t\t\t\t\t\t|      (ʘдʘ╬) \t\"U want me to thank u??? i am floating head \"");
            System.out.println("\t\t\t\t\t\t\t\t|        ");
            System.out.println("\t\t\t\t\t\t\t\t|        ");
            System.out.println("\t\t\t\t\t\t\t\t|        ");
            System.out.println("\t\t\t\t\t\t\t\t|      ");
            System.out.println("\t\t\t\t\t\t\t\t__");
            System.out.println("\t\t\t\t\t\t\t\t[≈ >-( ͡° ͜ʖ ͡°) ≈≈] ");
            System.out.println();
            }

          else if((mWrong - wGuess) == Math.floor(mWrong/5.0)){
            System.out.println("\t\t\t\t\t\t\t\t--------| ");
            System.out.println("\t\t\t\t\t\t\t\t|       | ");
            System.out.println("\t\t\t\t\t\t\t\t|       | ");
            System.out.println("\t\t\t\t\t\t\t\t|     (ಠ益ಠ) \t\"U  IDIOT ILL HAUNT U IF I DIE --\"");
            System.out.println("\t\t\t\t\t\t\t\t|        ");
            System.out.println("\t\t\t\t\t\t\t\t|        ");
            System.out.println("\t\t\t\t\t\t\t\t|        ");
            System.out.println("\t\t\t\t\t\t\t\t|      ");
            System.out.println("\t\t\t\t\t\t\t\t__");
            System.out.println("\t\t\t\t\t\t\t\t[≈ >-( ͡° ͜ʖ ͡°) ≈≈] ");
            System.out.println();

          }

            else if(wGuess != 0.0 && cAnswer == true){

            System.out.println("\t\t\t\t\t\t\t\t\t[Pman was taken to the hospital]\n\n\n");

          }

          else{

          }

      }


}