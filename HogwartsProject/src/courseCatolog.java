import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


public class courseCatolog extends JFrame
	{
		private static final long serialVersionUID = 1L;
		static ArrayList<courses> coreName = new ArrayList<courses>(); 
		static ArrayList<courses> electiveName = new ArrayList<courses>();
		static ArrayList <Integer> corePeriod = new ArrayList<Integer>();
		static ArrayList <Integer> electivePeriod = new ArrayList<Integer>();
		static ArrayList<courses> userPicks = new ArrayList<courses>(); 
		static String name;
		static String house;
		static int year;
		static String grade;
		static String divider;
		static String core;
		static JFrame frame = new JFrame();

		public static void main(String[] args)
			{
				greeting();
				instantiateArray();
				shufflePeriods();
				printClassCatolog();
				giveInfo();
				takeStudentInfo();
				requestCore();
				requestElectives();
			}
		public static void greeting()
		{
			JOptionPane.showMessageDialog(frame, "Today is course sign up day.");
			JOptionPane.showMessageDialog(frame, "Check the screen to view the course catolog.");
		}
		public static void instantiateArray()
		{
			coreName.add(new courses(1, "Charms", "Filius Flitwick"));
			coreName.add(new courses(1, "Transfiguration", "Minerva McGonagall"));
			coreName.add(new courses(1, "Potions", "Severus Snape"));
			coreName.add(new courses(1, "History of Magic", "Cuthbert Binns"));
			electiveName.add(new courses(1, "Astronomy", "Aurora Sinistra"));
			electiveName.add(new courses(1, "Flying", "Rolanda Hooch"));
			coreName.add(new courses(1, "Herbology", "Pomona Sprout"));
			electiveName.add(new courses(3, "Muggle Studies", "Charity Burbage"));
			electiveName.add(new courses(6, "Alcehmy", "Auroleus Hohenheim"));
			electiveName.add(new courses(6, "Apparition", "Wilkie Twycross"));
			electiveName.add(new courses(3, "Arithmancy", "Septima Vector"));
			electiveName.add(new courses(3, "Magical Creatures", "Rubeus Hagrid"));
			electiveName.add(new courses(3, "Divination", "Sybill Trelawney"));
			electiveName.add(new courses(3, "Ancient Runes", "Bathsheda Babbling"));
			electiveName.add(new courses(3, "Ancient Studies", "Bathsheda Babbling"));
			electiveName.add(new courses(3, "Art", "Herbert Beery"));
			electiveName.add(new courses(3, "Muggle Art", "Herbert Beery"));
			electiveName.add(new courses(3, "Frog Choir", "Filius Flitwick"));
			electiveName.add(new courses(3, "Ghoul Studies", "Cuthbert Binns"));
			electiveName.add(new courses(1, "Magical Theory", "Adalbert Waffling"));
			electiveName.add(new courses(3, "Music", "Ambrose Swott"));
			electiveName.add(new courses(3, "Muggle Music", "Charity Burbage"));
			electiveName.add(new courses(3, "Orchestra", "Filius Flitwick"));
			electiveName.add(new courses(4, "Xylomancy", "Sybill Trelawney"));
			coreName.add(new courses(1, "Defense Against Dark Arts", "TBA"));

		}
		public static void shufflePeriods()
		{
			corePeriod.add(1);
			corePeriod.add(2);
			corePeriod.add(5);
			electivePeriod.add(3);
			electivePeriod.add(4);
			Collections.shuffle(corePeriod);
			Collections.shuffle(electivePeriod);
		}
		public static void printClassCatolog()
		{
			System.out.println("Core:");
			String heading1 = "Year";
			String heading2 = "Class";
			String heading3 = "Professor";
			System.out.printf("%s %10s %30s %n", heading1, heading2, heading3);
			String divider = "________________________________________________________";
			System.out.println(divider);
			for (courses c : coreName)
				{
					System.out.printf("%-9s %-26s %-25s %n", c.getYear(),c.getClasses(), c.getTeacher());
				}
			System.out.println(divider);
			System.out.println();
			System.out.println("Electives:");
			String heading4 = "Year";
			String heading5 = "Class";
			String heading6 = "Professor";
			System.out.printf("%s %10s %30s %n", heading4, heading5, heading6);
			System.out.println(divider);
			for (courses c : electiveName)
				{
					System.out.printf("%-9s %-26s %-25s %n", c.getYear(),c.getClasses(), c.getTeacher());
				}
			System.out.println(divider);
		}
		public static void giveInfo()
		{
			JOptionPane.showMessageDialog(frame, "The catolog provides the first year a class is available.");
			JOptionPane.showMessageDialog(frame, "It will remain available for every year after the year shown.");
		}
		public static void takeStudentInfo()
		{
			name = JOptionPane.showInputDialog("What is your name?");
			JOptionPane.showMessageDialog(frame, "Thank you, " + name);
			
			Object[] houseNames = {"Gryffindor", "Ravenclaw", "Hufflepuff", "Slytherin"};
			String house = (String) JOptionPane.showInputDialog(frame, "What is your house?",
					"Houses",
					JOptionPane.QUESTION_MESSAGE, 
					null,
					houseNames,
					houseNames[0]);
			switch (house)
			{
				case "Gryffindor":
						{
							JOptionPane.showMessageDialog(frame, "Thank you.");
							break;
						}
				case "Ravenclaw":
						{
							JOptionPane.showMessageDialog(frame, "Thank you.");
							break;
						}
				case "Hufflepuff":
						{
							JOptionPane.showMessageDialog(frame, "Thank You.");
							break;
						}
				case "Slytherin":
						{
							JOptionPane.showMessageDialog(frame, "Thank you.");
							break;
						}
			}
			Object[] year = {"Year 1", "Year 2", "Year 3", "Year 4", "Year 5", "Year 6", "Year 7"};
			grade = (String) JOptionPane.showInputDialog(frame, "What is your year?",
					"Years",
					JOptionPane.QUESTION_MESSAGE,
					null, 
					year, 
					year[0]);
			
			switch (grade)
			{
				case "Year 1":
						{
							JOptionPane.showMessageDialog(frame, "You are eligible for all electives marked with a 1 in the catolog.");
							JOptionPane.showMessageDialog(frame, name + ", " + house + ", " + grade);
							break;
						}
				case "Year 2":
						{
							JOptionPane.showMessageDialog(frame, "You are eligible for all electives marked with a 1 in the catolog.");
							JOptionPane.showMessageDialog(frame, name + ", " + house + ", " + grade);
							break;
						}
				case "Year 3":
						{
							JOptionPane.showMessageDialog(frame, "You are eligible for all electives marked with a 3 in the catolog.");
							JOptionPane.showMessageDialog(frame, name + ", " + house + ", " + grade);
							break;
						}
				case "Year 4":
						{
							JOptionPane.showMessageDialog(frame, "You are eligible for all electives marked with a 3 in the catolog.");
							JOptionPane.showMessageDialog(frame, name + ", " + house + ", " + grade);
							break;
						}
				case "Year 5":
						{
							JOptionPane.showMessageDialog(frame, "You are eligible for all electives marked with a 3 in the catolog.");
							JOptionPane.showMessageDialog(frame, name + ", " + house + ", " + grade);
							break;
						}
				case "Year 6":
						{
							JOptionPane.showMessageDialog(frame, "You are eligible for all electives marked with a 3 or a 6 in the catolog.");
							JOptionPane.showMessageDialog(frame, name + ", " + house + ", " + grade);
							break;
						}
				case "Year 7":
						{
							JOptionPane.showMessageDialog(frame, "You are eligible for all electives marked with a 3 or a 6 in the catolog.");
							JOptionPane.showMessageDialog(frame, name + ", " + house + ", " + grade);
							break;
						}
			}
		}
		public static void requestCore()
		{
			JOptionPane.showMessageDialog(frame, "You will get 5 classes a semester: 3 core and 2 electives.");
			System.out.println();
			System.out.println("Class Schedule- Semester 1:");
			String heading1 = "Period";
			String heading2 = "Class";
			String heading3 = "Professor";
			System.out.printf("%s %10s %30s %n", heading1, heading2, heading3);
			divider = "________________________________________________________";
			System.out.println(divider);
			for (int i=0; i<3; i++)
				{
			Object[] coreClasses = {"Charms", "Transfiguration", "Potions", "Defense Against Dark Arts", "History of Magic", "Herbology"};
			core = (String) JOptionPane.showInputDialog(frame, "Please Select your Core classes.",
					"Core",
					JOptionPane.QUESTION_MESSAGE,
					null, 
					coreClasses, 
					coreClasses[0]);
			switch (core)
			{
				case "Charms":
						{
							userPicks.add(coreName.get(0));
							System.out.println();
							System.out.printf("%-9s %-26s %-25s %n", corePeriod.get(0), coreName.get(0).getClasses(), coreName.get(0).getTeacher());
							corePeriod.remove(0);
							break;
						}
				case "Transfiguration":
					{
						userPicks.add(coreName.get(1));
						System.out.println();
						System.out.printf("%-9s %-26s %-25s %n", corePeriod.get(0), coreName.get(1).getClasses(), coreName.get(1).getTeacher());
						corePeriod.remove(0);
						break;
					}
				case "Potions":
						{
							userPicks.add(coreName.get(2));
							System.out.println();
							System.out.printf("%-9s %-26s %-25s %n", corePeriod.get(0), coreName.get(2).getClasses(), coreName.get(2).getTeacher());
							corePeriod.remove(0);
							break;
						}
				case "Defense Against Dark Arts":
						{
							userPicks.add(coreName.get(5));
							System.out.println();
							System.out.printf("%-9s %-26s %-25s %n",corePeriod.get(0), coreName.get(5).getClasses(), coreName.get(5).getTeacher());
							corePeriod.remove(0);
							break;
						}
				case "History of Magic":
						{
							userPicks.add(coreName.get(3));
							System.out.println();
							System.out.printf("%-9s %-26s %-25s %n",corePeriod.get(0), coreName.get(3).getClasses(), coreName.get(3).getTeacher());
							corePeriod.remove(0);
							break;
						}
				case "Herbology":
						{
							userPicks.add(coreName.get(4));
							System.out.println();
							System.out.printf("%-9s %-26s %-25s %n",corePeriod.get(0), coreName.get(4).getClasses(), coreName.get(4).getTeacher());
							corePeriod.remove(0);
							break;
						}
				}
				}
		}
		public static void requestElectives()
		{
			for (int i=0; i<2; i++)
				{
			Object[] electiveClasses = {"Flying", "Magical Theory", "Astronomy", "Muggle Studies", "Arithmancy", "Magical Creatures", "Divination", "Ancient Runes", "Ancient Studies", "Art", "Muggle Art", "Frog Choir", "Ghoul Studies", "Music", "Muggle Music", "Orchestra", "Xylomancy", "Apparition", "Alchemy"};
			String electives = (String) JOptionPane.showInputDialog(frame, "Please Select 2 Elective classes.",
					"Electives",
					JOptionPane.QUESTION_MESSAGE,
					null, 
					electiveClasses, 
					electiveClasses[0]);
			switch (electives)
			{
				case "Flying":
					{
						userPicks.add(electiveName.get(1));
						System.out.println();
						System.out.printf("%-9s %-26s %-25s %n",electivePeriod.get(0), electiveName.get(1).getClasses(), electiveName.get(1).getTeacher());
						electivePeriod.remove(0);
						break;
					}
				case "Magical Theory":
					{
						userPicks.add(electiveName.get(14));
						System.out.println();
						System.out.printf("%-9s %-26s %-25s %n",electivePeriod.get(0), electiveName.get(14).getClasses(), electiveName.get(14).getTeacher());
						electivePeriod.remove(0);
						break;
					}
				case "Astronomy":
						{
							userPicks.add(electiveName.get(0));
							System.out.println();
							System.out.printf("%-9s %-26s %-25s %n",electivePeriod.get(0), electiveName.get(0).getClasses(), electiveName.get(0).getTeacher());
							electivePeriod.remove(0);
							break;
						}
				case "Muggle Studies":
						{
							if (grade.equals("3") || grade.equals("Year 4") || grade.equals("Year 5") || grade.equals("Year 6") || grade.equals("Year 7"))
								{
									userPicks.add(electiveName.get(2));
									System.out.println();
									System.out.printf("%-9s %-26s %-25s %n",electivePeriod.get(0), electiveName.get(2).getClasses(), electiveName.get(2).getTeacher());
									electivePeriod.remove(0);
									break;
								}
							else 
								{
									JOptionPane.showMessageDialog(frame, "I'm sorry, please choose a different elective. You are not old enough.");
									requestElectives();
									break;
								}
						}
				case "Arithmancy":
						{
							if (grade.equals("3") || grade.equals("Year 4") || grade.equals("Year 5") || grade.equals("Year 6") || grade.equals("Year 7"))
								{
									userPicks.add(electiveName.get(5));
									System.out.println();
									System.out.printf("%-9s %-26s %-25s %n",electivePeriod.get(0), electiveName.get(5).getClasses(), electiveName.get(5).getTeacher());
									electivePeriod.remove(0);
									break;
								}
							else 
								{
									JOptionPane.showMessageDialog(frame, "I'm sorry, please choose a different elective. You are not old enough.");
									requestElectives();
									break;
								}
						}
				case "Magical Creatures":
						{
							if (grade.equals("3") || grade.equals("Year 4") || grade.equals("Year 5") || grade.equals("Year 6") || grade.equals("Year 7"))
								{
									userPicks.add(electiveName.get(6));
									System.out.println();
									System.out.printf("%-9s %-26s %-25s %n",electivePeriod.get(0), electiveName.get(6).getClasses(), electiveName.get(6).getTeacher());
									electivePeriod.remove(0);
									break;
								}
							else 
								{
									JOptionPane.showMessageDialog(frame, "I'm sorry, please choose a different elective. You are not old enough.");
									requestElectives();
									break;
								}
						}
				case "Divination":
						{
							if (grade.equals("3") || grade.equals("Year 4") || grade.equals("Year 5") || grade.equals("Year 6") || grade.equals("Year 7"))
								{
									userPicks.add(electiveName.get(7));
									System.out.println();
									System.out.printf("%-9s %-26s %-25s %n",electivePeriod.get(0), electiveName.get(7).getClasses(), electiveName.get(7).getTeacher());
									electivePeriod.remove(0);
									break;
								}
							else 
								{
									JOptionPane.showMessageDialog(frame, "I'm sorry, please choose a different elective. You are not old enough.");
									requestElectives();
									break;
								}
						}
				case "Ancient Runes":
						{
							if (grade.equals("3") || grade.equals("Year 4") || grade.equals("Year 5") || grade.equals("Year 6") || grade.equals("Year 7"))
								{
									userPicks.add(electiveName.get(8));
									System.out.println();
									System.out.printf("%-9s %-26s %-25s %n",electivePeriod.get(0), electiveName.get(8).getClasses(), electiveName.get(8).getTeacher());
									electivePeriod.remove(0);
									break;
								}
							else 
								{
									JOptionPane.showMessageDialog(frame, "I'm sorry, please choose a different elective. You are not old enough.");
									requestElectives();
									break;
								}
						}
				case "Ancient Studies":
						{
							if (grade.equals("3") || grade.equals("Year 4") || grade.equals("Year 5") || grade.equals("Year 6") || grade.equals("Year 7"))
								{
									userPicks.add(electiveName.get(9));
									System.out.println();
									System.out.printf("%-9s %-26s %-25s %n",electivePeriod.get(0), electiveName.get(9).getClasses(), electiveName.get(9).getTeacher());
									electivePeriod.remove(0);
									break;
								}
							else 
								{
									JOptionPane.showMessageDialog(frame, "I'm sorry, please choose a different elective. You are not old enough.");
									requestElectives();
									break;
								}
						}
				case "Art":
						{
							if (grade.equals("3") || grade.equals("Year 4") || grade.equals("Year 5") || grade.equals("Year 6") || grade.equals("Year 7"))
								{
									userPicks.add(electiveName.get(10));
									System.out.println();
									System.out.printf("%-9s %-26s %-25s %n",electivePeriod.get(0), electiveName.get(10).getClasses(), electiveName.get(10).getTeacher());
									electivePeriod.remove(0);
									break;
								}
							else 
								{
									JOptionPane.showMessageDialog(frame, "I'm sorry, please choose a different elective. You are not old enough.");
									requestElectives();
									break;
								}
						}
				case "Muggle Art":
						{
							if (grade.equals("3") || grade.equals("Year 4") || grade.equals("Year 5") || grade.equals("Year 6") || grade.equals("Year 7"))
								{
									userPicks.add(electiveName.get(11));
									System.out.println();
									System.out.printf("%-9s %-26s %-25s %n",electivePeriod.get(0), electiveName.get(11).getClasses(), electiveName.get(11).getTeacher());
									electivePeriod.remove(0);
									break;
								}
							else 
								{
									JOptionPane.showMessageDialog(frame, "I'm sorry, please choose a different elective. You are not old enough.");
									requestElectives();
									break;
								}
						}
				case "Frog Choir":
						{
							if (grade.equals("3") || grade.equals("Year 4") || grade.equals("Year 5") || grade.equals("Year 6") || grade.equals("Year 7"))
								{
									userPicks.add(electiveName.get(12));
									System.out.println();
									System.out.printf("%-9s %-26s %-25s %n",electivePeriod.get(0), electiveName.get(12).getClasses(), electiveName.get(12).getTeacher());
									electivePeriod.remove(0);
									break;
								}
							else 
								{
									JOptionPane.showMessageDialog(frame, "I'm sorry, please choose a different elective. You are not old enough.");
									requestElectives();
									break;
								}
						}
				case "Ghoul Studies":
						{
							if (grade.equals("3") || grade.equals("Year 4") || grade.equals("Year 5") || grade.equals("Year 6") || grade.equals("Year 7"))
								{
									userPicks.add(electiveName.get(13));
									System.out.println();
									System.out.printf("%-9s %-26s %-25s %n",electivePeriod.get(0), electiveName.get(13).getClasses(), electiveName.get(13).getTeacher());
									electivePeriod.remove(0);
									break;
								}
							else 
								{
									JOptionPane.showMessageDialog(frame, "I'm sorry, please choose a different elective. You are not old enough.");
									requestElectives();
									break;
								}
						}
				case "Music":
						{
							if (grade.equals("3") || grade.equals("Year 4") || grade.equals("Year 5") || grade.equals("Year 6") || grade.equals("Year 7"))
								{
									userPicks.add(electiveName.get(15));
									System.out.println();
									System.out.printf("%-9s %-26s %-25s %n",electivePeriod.get(0), electiveName.get(15).getClasses(), electiveName.get(15).getTeacher());
									electivePeriod.remove(0);
									break;
								}
							else 
								{
									JOptionPane.showMessageDialog(frame, "I'm sorry, please choose a different elective. You are not old enough.");
									requestElectives();
									break;
								}
						}
				case "Muggle Music":
						{
							if (grade.equals("3") || grade.equals("Year 4") || grade.equals("Year 5") || grade.equals("Year 6") || grade.equals("Year 7"))
								{
									userPicks.add(electiveName.get(16));
									System.out.println();
									System.out.printf("%-9s %-26s %-25s %n",electivePeriod.get(0), electiveName.get(16).getClasses(), electiveName.get(16).getTeacher());
									electivePeriod.remove(0);
									break;
								}
							else 
								{
									JOptionPane.showMessageDialog(frame, "I'm sorry, please choose a different elective. You are not old enough.");
									requestElectives();
									break;
								}
						}
				case "Orchestra":
						{
							if (grade.equals("3") || grade.equals("Year 4") || grade.equals("Year 5") || grade.equals("Year 6") || grade.equals("Year 7"))
								{
									userPicks.add(electiveName.get(17));
									System.out.println();
									System.out.printf("%-9s %-26s %-25s %n",electivePeriod.get(0), electiveName.get(17).getClasses(), electiveName.get(17).getTeacher());
									electivePeriod.remove(0);
									break;
								}
							else 
								{
									JOptionPane.showMessageDialog(frame, "I'm sorry, please choose a different elective. You are not old enough.");
									requestElectives();
									break;
								}
						}
				case "Xylomancy":
						{
							if (grade.equals("Year 4") || grade.equals("Year 5") || grade.equals("Year 6") || grade.equals("Year 7"))
								{
									userPicks.add(electiveName.get(18));
									System.out.println();
									System.out.printf("%-9s %-26s %-25s %n", electivePeriod.get(0), electiveName.get(18).getClasses(), electiveName.get(18).getTeacher());
									electivePeriod.remove(0);
									break;
								}
							else 
								{
									JOptionPane.showMessageDialog(frame, "I'm sorry, please choose a different elective. You are not old enough.");
									requestElectives();
									break;
								}
						}
				case "Apparition":
						{
							if (grade.equals("Year 6") || grade.equals("Year 7") || grade.equals("Year 3") || grade.equals("Year 4") || grade.equals("Year 5"))
								{
									userPicks.add(electiveName.get(4));
									System.out.println();
									System.out.printf("%-9s %-26s %-25s %n",electivePeriod.get(0), electiveName.get(4).getClasses(), electiveName.get(4).getTeacher());
									electivePeriod.remove(0);
									break;
								}
							else 
								{
									JOptionPane.showMessageDialog(frame, "I'm sorry, please choose a different elective. You are not old enough.");
									requestElectives();
									break;
								}
						}
				case "Alchemy":
						{
							if (grade.equals("Year 6") || grade.equals("Year 7"))
								{
									userPicks.add(electiveName.get(3));
									System.out.println();
									System.out.printf("%-9s %-26s %-25s %n", electivePeriod.get(0), electiveName.get(3).getClasses(), electiveName.get(3).getTeacher());
									electivePeriod.remove(0);
									break;	
								}
							else 
								{
									JOptionPane.showMessageDialog(frame, "I'm sorry, please choose a different elective. You are not old enough.");
									requestElectives();
									break;
								}
						}
				}
				}
			System.out.println(divider);
			JOptionPane.showMessageDialog(frame, "Your schedule for 1st semester for " + grade + " has been completed.");
			JOptionPane.showMessageDialog(frame, "You can view your schedule on the screen to the right.");
			JOptionPane.showMessageDialog(frame, "We will meet again at the end of this semester to put together Semester 2.");
			JOptionPane.showMessageDialog(frame, "See you then and enjoy your classes.");
			System.exit(0);
		}

	}
