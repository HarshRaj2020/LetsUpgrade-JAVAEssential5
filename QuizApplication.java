
import java.util.Scanner;

public class QuizApplication
 {

    public static void main(String[] args)
 {
	
        Game game=new Game();
        game.initGame();
        game.play();

    }
}

class Player
 {

    Scanner sc=new Scanner(System.in);
    String name;
    int score=0;

    public void getDetails()
{

        System.out.println("Enter name:");
        name=sc.next();

    }

}



class Question 
{

    Scanner sc=new Scanner(System.in);
    String question,option1,option2,option3,option4;
    int correctAnswer,userAnswer;

    public boolean askQuestion()
    {
        System.out.println(question);
        System.out.println("1. "+option1);
        System.out.println("2. "+option2);
        System.out.println("3. "+option3);
        System.out.println("4. "+option4);
        System.out.println("please choose an option");
        userAnswer=sc.nextInt();
        if(userAnswer==correctAnswer)
	{
           		 return true;
     	   }
       return false;
    }

}


 class Game 
{

    

Question[] questions=new Question[3];
   
 Player player=new Player();

   
 String[] questionsdata={"Which is used to find and fix bugs in JAVA program?","An interface with no fields or methods is known as ?","Which of the following is a marker interface?"};
   
 String[] options1={"JVM","Runnable","Remote"};
   
 String[] options2={"JRE","Marker","Result"};
  
  String[] options3={"JDK","Abstract","Readable"};
   
 String[] options4={"JDB","CharSequence","Runnable"};
 
   int[] answers={4,2,1};


  
  public void initGame()
    {


  for(int i=0;i<3;i++)
{
            
questions[i]=new Question();
   
     }

for(int i=0;i<3;i++)
    
    {

          
  questions[i].question=questionsdata[i];
       
 questions[i].option1=options1[i];
       
 questions[i].option2=options2[i];
     
   questions[i].option3=options3[i];
      
  questions[i].option4=options4[i];
        
questions[i].correctAnswer=answers[i];
      
  }


}
    
public void play()
   
 {

        
  player.getDetails();
         
 for(int i=0;i<3;i++)
       
   {
             
 boolean status=questions[i].askQuestion();
       
       if(status==true)
          
    {
               
   System.out.println("Your answer is right");
       
           player.score=player.score+5;
           
   }
            
  else
{
            
      System.out.println("Your answer is wrong");
                
  player.score=player.score-5;
          
    }
     
     }

      
  System.out.println(player.name+" your score is "+player.score);

  
  }


}

