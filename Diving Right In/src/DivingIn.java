import java.util.Scanner;

public class DivingIn
	{

		public static void main(String[] args)
			{
				questions();
			}

		public static void questions()
			{
				
				System.out.println("SUCKIT COLLIN!");
				
				Scanner nam = new Scanner(System.in);
				int check=0;
				for(int random=0;check<1; check++)
					{
						try{
						System.out.println("What is your name?");
						String name = nam.nextLine();
						   }
						catch(Exception e)
							{
								System.out.println("Wrong...");
								check=0;
							}
					}
				System.out.println("What is your name?");
				String name = nam.nextLine();
				Scanner ag = new Scanner(System.in);
				System.out.println("What is your age?");
				int age = ag.nextInt();
				Scanner yea = new Scanner(System.in);
				System.out.println("What year were you born?");
				int year = yea.nextInt();
				System.out.println("Oh hey " + name);
				if (age < 17)
					{
						System.out.println("Have you gotten your license yet?");
					}
				if (age == 17)
					{
						System.out.println("You excited to... uh... vote?");
					}
				if (age > 17)
					{
						System.out.println("I forgot, who did you vote for?");
					}
				int c = 0;
				int dog = age / 7;
				for (int counter = year; counter < 2017; counter = counter + 1)
					{
						System.out.println("In " + counter + " you were " + c + " years old.");
						c++;
					}
				System.out.println("Did you know you are " + dog + " years old in dog years?");
				int leap = (2017 - year) / 4;
				System.out.println("You have also lived through " + leap + " leap days!");
			}

	}