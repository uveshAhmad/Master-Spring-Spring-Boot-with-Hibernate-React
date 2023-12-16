package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.MarioGame;
import com.in28minutes.learnspringframework.game.PacmanGame;
import com.in28minutes.learnspringframework.game.SuperContraGame;
//Tightly Coupled
public class App01GamingBasic {

	public static void main(String[] args) {
		var game = new PacmanGame();   // 1 Objection Creation
//		var game = new MarioGame();
		//var game = new SuperContraGame();
		 var gameRunner = new GameRunner(game);  
		 // 2 Object Creation + Wiring of Dependencies
		 // game is a Dependency of GameRunner
		 
		 
		 gameRunner.run();
		 

	}

}
