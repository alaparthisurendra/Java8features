package info.lambdaexpression;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Lambda {
	//Lambda:when you want to pass whole implementation on to the particular object

	public static void main(String[] args) {
		/*
		 //Code in java7
		  
		 Game cricketGame = new Game() {
			public void play() {
				System.out.println("I'M playing cricket");
			}
		};

		Game football = new Game() {
			public void play() {
				System.out.println("I'm playing football");
			}

		};*/
		
		//java 8 code
		
		Game cricket=() -> System.out.println("Im playing cricket");
		Game football=()-> System.out.println("Im playing football");
		
		cricket.play();
		football.play();
		
		List<String> players= Arrays.asList("rohit", "dhawan", "kholi", "dhoni", "rayudu", "shankar");
		
		// Java 7 code to find specific player
		/*for (String play : players) {
			if(play.equals("rohit"))
			{
				System.out.println("yeah rohit exists");
			}
		}*/

		players.stream().filter(play ->
			 play.equals("kholi")).forEach(play -> System.out.println("yes kohli")
		);
		System.out.println("======================");
		
		Optional<String> str=players.stream().filter(player -> player.length() > 4).findAny();
		str.ifPresent(System.out::println);
		

	}

	interface Game {
		void play();

	}

}
