package service;

import javax.swing.*;

import model.Movie;

import java.awt.*;
import java.util.List;

public class MainClass {
	public static void main(String[] args) {
		
		//StudentService test = new StudentService();
		//List<Exam> examsTaken = test.findExamTakenByStudent(5L);
		//PersonService person = new PersonService();
		//ExamService exam = new ExamService();
		
		MovieService movieService = new MovieService();
		
		GraphicTest box = new GraphicTest("Users Manul");
		box.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		box.setSize(550, 360);
		GridBagConstraints c = new GridBagConstraints();
		c.gridx = 0;
		c.gridy = 1;
		JLabel item = new JLabel("<html>Exams taken by Student: " + movieService.findById( (long)1) + " "  + "</html>", SwingConstants.CENTER);
		JLabel item2 = new JLabel("<html>Exams taken by Student22: " + movieService.findById( (long)1) + " "  + "</html>", SwingConstants.CENTER);
		
		/*
		 * box.setItem1(item); box.setItem1(item2); box.add(item, c);
		 */
		
	
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
		/*
		 * GraphicTest box2 = new GraphicTest("Students taking a specific Exam");
		 * box2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); box2.setSize(550, 360);
		 * List<Movie> students = movieService.findAll(); c.gridx = 0; c.gridy = 1;
		 * JLabel itemExam = new JLabel("<html>Students taking Exam: " +
		 * movieService.findById((long) 1).getMoviName() + "<br>ClassRoom: " +
		 * movieService.findById((long) 1).getMoviName() + "<br>Date: " +
		 * movieService.findById((long) 1).getMoviName() + "</html>",
		 * SwingConstants.CENTER); box2.setItem1(itemExam); box2.add(itemExam, c);
		 * for(int i = 0; i < students.size(); i++) { c.gridx = 0; c.gridy = i + 2;
		 * JLabel item1 = new JLabel("<html>" + movieService.findById((long)
		 * 1).getMoviName() + " " + movieService.findById((long) 1).getMoviName() +
		 * "</html>", SwingConstants.CENTER); box2.setItem1(item1); box2.add(item1, c);
		 * } box2.setVisible(true);
		 */
	} 
	
}