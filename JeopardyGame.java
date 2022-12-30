import java.util.Scanner;
public class JeopardyGame
{
   private static Scanner scan = new Scanner(System.in);
   public static void main(String Args[])
   {
	   int points =0;
   System.out.println("Welcome to The Jeopardy Game!!");
   System.out.println();
   int rules=0;
   System.out.println("Press 1 if you would like to peek at the rules of the game");
   System.out.println("Press 2 to play right away!"); 
   rules=scan.nextInt();
   System.out.println();
   if(rules==1)
   {
   System.out.println("Here are the rules for this wonderful game buddies!");
   System.out.println(". So I have created a miniature version on this special game");
   System.out.println(". Therefore simply there will be 10 question and for every qustion you answer right you get a 100 points.");
   System.out.println(". In case you cannot answer you do not get those points :(");
   System.out.println(". You can  press 0 as your choice of question any time if you want to quit the game");
   System.out.println(". You can press 100 as your choice of question if you want to take a look at your score");
   System.out.println();
   System.out.println();
   {
	   System.out.println("1) What is the capital of France?\r\n"
	   		+ "2) Who was the first president of the United States?\r\n"
	   		+ "3) What is the largest ocean in the world?\r\n"
	   		+ "4) What is the highest mountain in the Earth?\r\n"
	   		+ "5) What is the chemical symbol for gold?\r\n"
	   		+ "6) In what year did the United States declare independence?\r\n"
	   		+ "7) Who wrote the play \"Hamlet\"?\r\n"
	   		+ "8) How many planets are in the solar system?\r\n"
	   		+ "9) What is the currency of Japan?\r\n"
	   		+ "10) Who painted the Mona Lisa?");}
   }
   else if(rules==2){
   System.out.println("1) What is the capital of France?\r\n"
   		+ "2) Who was the first president of the United States?\r\n"
   		+ "3) What is the largest ocean in the world?\r\n"
   		+ "4) What is the highest mountain in the Earth?\r\n"
   		+ "5) What is the chemical symbol for gold?\r\n"
   		+ "6) In what year did the United States declare independence?\r\n"
   		+ "7) Who wrote the play \"Hamlet\"?\r\n"
   		+ "8) How many planets are in the solar system?\r\n"
   		+ "9) What is the currency of Japan?\r\n"
   		+ "10) Who painted the Mona Lisa?");}
   int choice =100;
   while(choice!=0)
   {
	   System.out.println();
   System.out.println("Plase enter your choice of question:");
   choice = scan.nextInt();
   scan.nextLine();
   System.out.println();

	   if(choice==1)
	   {
		   System.out.println("So what is the answer bruh?");
		   String ans1 = scan.nextLine();
		   if(ans1.equals("Paris"))
		   {
		   System.out.println("You are RIGHT!!!\r\n"
				   + "You get the 100 points my mahn!");
		   points+=100;
	       }
		   else 
		   {
			   System.out.println("Sorry buddy :( better luck next time!");
		   }   
	   }
	   
	   else if(choice==2)
	   {
		   System.out.println("So what is the answer bruh?");
		   String ans2 = scan.nextLine();
		   if(ans2.equals("George Washington"))
		   {
		   System.out.println("You are RIGHT!!!\r\n"
				   + "You get the 100 points my mahn!");
		   points+=100;
	       }
		   else 
		   {
			   System.out.println("Sorry buddy :( better luck next time!");
		   }   
	   }
	   
	   else if(choice==3)
	   {
		   System.out.println("So what is the answer bruh?");
		   String ans1 = scan.nextLine();
		   if(ans1.equals("The Pacific Ocean"))
		   {
		   System.out.println("You are RIGHT!!!\r\n"
				   + "You get the 100 points my mahn!");
		   points+=100;
	       }
		   else 
		   {
			   System.out.println("Sorry buddy :( better luck next time!");
		   }   
	   }
	   
	   else if(choice==4)
	   {
		   System.out.println("So what is the answer bruh?");
		   String ans1 = scan.nextLine();
		   if(ans1.equals("Mount Everest"))
		   {
		   System.out.println("You are RIGHT!!!\r\n"
				   + "You get the 100 points my mahn!");
		   points+=100;
	       }
		   else 
		   {
			   System.out.println("Sorry buddy :( better luck next time!");
		   }   
	   }
	   
	   else if(choice==5)
	   {
		   System.out.println("So what is the answer bruh?");
		   String ans1 = scan.nextLine();
		   if(ans1.equals("Au"))
		   {
		   System.out.println("You are RIGHT!!!\r\n"
				   + "You get the 100 points my mahn!");
		   points+=100;
	       }
		   else 
		   {
			   System.out.println("Sorry buddy :( better luck next time!");
		   }   
	   }
	   
	   else if(choice==6)
	   {
		   System.out.println("So what is the answer bruh?");
		   String ans1 = scan.nextLine();
		   if(ans1.equals("1776"))
		   {
		   System.out.println("You are RIGHT!!!\r\n"
				   + "You get the 100 points my mahn!");
		   points+=100;
	       }
		   else 
		   {
			   System.out.println("Sorry buddy :( better luck next time!");
		   }   
	   }
	   
	   else if(choice==7)
	   {
		   System.out.println("So what is the answer bruh?");
		   String ans1 = scan.nextLine();
		   if(ans1.equals("Shakesphere"))
		   {
		   System.out.println("You are RIGHT!!!\r\n"
				   + "You get the 100 points my mahn!");
		   points+=100;
	       }
		   else 
		   {
			   System.out.println("Sorry buddy :( better luck next time!");
		   }   
	   }
	   
	   else if(choice==8)
	   {
		   System.out.println("So what is the answer bruh?");
		   String ans1 = scan.nextLine();
		   if(ans1.equals("8"))
		   {
		   System.out.println("You are RIGHT!!!\r\n"
				   + "You get the 100 points my mahn!");
		   points+=100;
	       }
		   else 
		   {
			   System.out.println("Sorry buddy :( better luck next time!");
		   }   
	   }
	   
	   else if(choice==9)
	   {
		   System.out.println("So what is the answer bruh?");
		   String ans1 = scan.nextLine();
		   if(ans1.equals("Japanese Yen"))
		   {
		   System.out.println("You are RIGHT!!!\r\n"
				   + "You get the 100 points my mahn!");
		   points+=100;
	       }
		   else 
		   {
			   System.out.println("Sorry buddy :( better luck next time!");
		   }   
	   }
	   
	   else if(choice==10)
	   {
		   System.out.println("So what is the answer bruh?");
		   String ans1 = scan.nextLine();
		   if(ans1.equals("Leonardo da Vinci"))
		   {
		   System.out.println("You are RIGHT!!!\r\n"
				   + "You get the 100 points my mahn!");
		   points+=100;
	       }
		   else 
		   {
			   System.out.println("Sorry buddy :( better luck next time!");
		   }   
	   }
	   
	   else if(choice==100)
	   {
		   System.out.println("Your score is: "+points+"/1000");
	   }
}

	   System.out.println("Thank you for playing!!!!!");
     

   }
}
