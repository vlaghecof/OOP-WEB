package model;

import java.awt.GridBagConstraints;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import  model.GraphicTest;
import service.MovieService;

public class Graphic {

	
	public Graphic() {

		MovieService movieService = new MovieService();
		
		GraphicTest box = new GraphicTest("Users Manul");
		box.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		box.setSize(550, 360);
		GridBagConstraints c = new GridBagConstraints();
		c.gridx = 0;
		c.gridy = 1;
		JLabel item = new JLabel("<html>Exams taken by Student: " + movieService.findById( (long)1) + " "  + "</html>", SwingConstants.CENTER);
		JLabel item2 = new JLabel("<html>Exams taken by Student22: " + movieService.findById( (long)1) + " "  + "</html>", SwingConstants.CENTER);
		
			c.gridx = 0;
			c.gridy =  2;
			JLabel item1 = new JLabel("<html> All Movies : /movie" , SwingConstants.CENTER);
			box.setItem1(item1);
			box.add(item1, c);
			c.gridy+=15;
			
			JLabel item3 = new JLabel("<html> Find in which room a movie is by its id :  /findHall/movieId " , SwingConstants.CENTER);
			box.setItem1(item3);
			box.add(item3, c);
			c.gridy+=15;
			
			JLabel item4 = new JLabel("<html> All movies in a cinema hall  /movieByHall/hall Id " , SwingConstants.CENTER);
			box.setItem1(item4);
			box.add(item4, c);
			c.gridy+=15;
			
			JLabel item5 = new JLabel("<html> Movie Search by genre : /movie/Genre" , SwingConstants.CENTER);
			box.setItem1(item5);
			box.add(item5, c);
			c.gridy+=15;
			
			JLabel item6 = new JLabel("<html> Make a ticket  /movieS/MovieId/Ticket type(Deluxe,Ultra,Regular)", SwingConstants.CENTER);
			box.setItem1(item6);
			box.add(item6, c);
	
		box.setVisible(true);
		
	} 
	
}
