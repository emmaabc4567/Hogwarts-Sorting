import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class hogwartsSorting extends JFrame
	{
		private static final long serialVersionUID = 1L;
		static String name;
		static String house;
		static int Hufflepuff=0;
		static int Ravenclaw=0;
		static int Gryffindor=0;
		static int Slytherin=0;
		static int personality;
		static JFrame frame = new JFrame();
		
		public static void main(String[] args)
		{
			name = JOptionPane.showInputDialog("What is your name?");  
			JOptionPane.showMessageDialog(frame, "Welcome to Hogwarts, " + name);
			
			JOptionPane.showMessageDialog(frame, "You are going to be sorted into your house.");
			
			JOptionPane.showMessageDialog(frame, "I will ask you a seris of questions that will determine your house placement.");
			
			Object[] personalityTraits = {"Kind", "Clever", "Brave", "Ambitious"};
			personality = JOptionPane.showOptionDialog(frame, "What is your best personality trait?",
					"Personality Traits",
					JOptionPane.YES_NO_CANCEL_OPTION,
					JOptionPane.QUESTION_MESSAGE,
					null, personalityTraits, personalityTraits[0]);
			
			switch (personality)
			{
				case 0:
						{
							JOptionPane.showMessageDialog(frame, "Interesting");
							Hufflepuff=Hufflepuff+2;
							Ravenclaw=Ravenclaw+1;
							Gryffindor=Gryffindor+1;
							Slytherin=Slytherin+0;
							break;
						}
				case 1:
						{
							JOptionPane.showMessageDialog(frame, "Wonderful");
							Hufflepuff=Hufflepuff+0;
							Ravenclaw=Ravenclaw+2;
							Gryffindor=Gryffindor+1;
							Slytherin=Slytherin+1;
							break;
						}
				case 2:
						{
							JOptionPane.showMessageDialog(frame, "Thank You");
							Hufflepuff=Hufflepuff+0;
							Ravenclaw=Ravenclaw+0;
							Gryffindor=Gryffindor+2;
							Slytherin=Slytherin+1;;
							break;
						}
				case 3:
						{
							JOptionPane.showMessageDialog(frame, "Lovely");
							Hufflepuff=Hufflepuff+0;
							Ravenclaw=Ravenclaw+1;
							Gryffindor=Gryffindor+0;
							Slytherin=Slytherin+2;
							break;
						}
			}
			
			String[] schoolLife = {"Care for Magical Creatures", "Transfiguration", "Defense Against the Dark Arts", "Potions"};
				{
					JFrame frame = new JFrame();
					String school = (String) JOptionPane.showInputDialog(frame,
							"What is your favorite schoool subject?",
							"Hogwarts Subjects",
							JOptionPane.QUESTION_MESSAGE, 
							null,
							schoolLife,
							schoolLife);
				switch (school)
				{
				case "Care for Magical Creatures":
						{
							JOptionPane.showMessageDialog(frame, "Fun");
							Hufflepuff=Hufflepuff+2;
							Ravenclaw=Ravenclaw+1;
							Gryffindor=Gryffindor+0;
							Slytherin=Slytherin+0;
							break;
						}
				case "Transfiguration":
						{
							JOptionPane.showMessageDialog(frame, "Great");
							Hufflepuff=Hufflepuff+1;
							Ravenclaw=Ravenclaw+2;
							Gryffindor=Gryffindor+0;
							Slytherin=Slytherin+1;
							break;
						}
				case "Defense Against the Dark Arts":
						{
							JOptionPane.showMessageDialog(frame, "Wonderful");
							Hufflepuff=Hufflepuff+0;
							Ravenclaw=Ravenclaw+1;
							Gryffindor=Gryffindor+2;
							Slytherin=Slytherin+1;
							break;
						}
				case "Potions":
						{
							JOptionPane.showMessageDialog(frame, "Interesting");
							Hufflepuff=Hufflepuff+1;
							Ravenclaw=Ravenclaw+1;
							Gryffindor=Gryffindor+1;
							Slytherin=Slytherin+2;
							break;
						}
				}
				
				}
			Object[] schoolSubject = {"English", "Math", "Science", "History"};
			int subject = JOptionPane.showOptionDialog(frame, "What was your favorite muggle school subject?",
					"Muggle School",
					JOptionPane.YES_NO_CANCEL_OPTION,
					JOptionPane.QUESTION_MESSAGE,
					null, schoolSubject, schoolSubject[0]);
			switch (subject)
			{
				case 0:
						{
							JOptionPane.showMessageDialog(frame, "Alright");
							Hufflepuff=Hufflepuff+2;
							Ravenclaw=Ravenclaw+2;
							Gryffindor=Gryffindor+1;
							Slytherin=Slytherin+1;
							break;
						}
				case 1:
						{
							JOptionPane.showMessageDialog(frame, "Wow");
							Hufflepuff=Hufflepuff+1;
							Ravenclaw=Ravenclaw+2;
							Gryffindor=Gryffindor+2;
							Slytherin=Slytherin+1;
							break;
						}
				case 2:
						{
							JOptionPane.showMessageDialog(frame, "Fun");
							Hufflepuff=Hufflepuff+1;
							Ravenclaw=Ravenclaw+2;
							Gryffindor=Gryffindor+3;
							Slytherin=Slytherin+2;
							break;
						}
				case 3:
						{
							JOptionPane.showMessageDialog(frame, "Facsinating");
							Hufflepuff=Hufflepuff+2;
							Ravenclaw=Ravenclaw+2;
							Gryffindor=Gryffindor+1;
							Slytherin=Slytherin+2;
							break;
						}
			}
			String[] question1 = {"Run to help", "Think of a solution", "Charge right in", "Leave them: Not my problem"};
				{
					JFrame frame = new JFrame();
					String question = (String) JOptionPane.showInputDialog(frame,
							"Someone is in danger. What do you do?",
							"Moral question",
							JOptionPane.QUESTION_MESSAGE, 
							null,
							question1,
							question1);
				switch (question)
				{
				case "Run to help":
						{
							JOptionPane.showMessageDialog(frame, "Interesting");
							Hufflepuff=Hufflepuff+2;
							Ravenclaw=Ravenclaw+0;
							Gryffindor=Gryffindor+0;
							Slytherin=Slytherin+0;
							break;
						}
				case "Think of a solution":
						{
							JOptionPane.showMessageDialog(frame, "Well then..");
							Hufflepuff=Hufflepuff+0;
							Ravenclaw=Ravenclaw+2;
							Gryffindor=Gryffindor+0;
							Slytherin=Slytherin+1;
							break;
						}
				case "Charge right in":
						{
							JOptionPane.showMessageDialog(frame, "Hmmm.....");
							Hufflepuff=Hufflepuff+0;
							Ravenclaw=Ravenclaw+0;
							Gryffindor=Gryffindor+2;
							Slytherin=Slytherin+1;
							break;
						}
				case "Leave them: Not my problem":
						{
							JOptionPane.showMessageDialog(frame, "Ok");
							Hufflepuff=Hufflepuff+0;
							Ravenclaw=Ravenclaw+1;
							Gryffindor=Gryffindor+0;
							Slytherin=Slytherin+3;
							break;
						}
				}
				
				}
				Object[] favColor = {"Black", "Bronze", "Gold", "Silver"};
				int color = JOptionPane.showOptionDialog(frame, "Of these colors, which do you prefer",
						"Secondary Colors",
						JOptionPane.YES_NO_CANCEL_OPTION,
						JOptionPane.QUESTION_MESSAGE,
						null, favColor, favColor[0]);
				switch (color)
				{
					case 0:
							{
								JOptionPane.showMessageDialog(frame, "Nice");
								Hufflepuff=Hufflepuff+1;
								Ravenclaw=Ravenclaw+0;
								Gryffindor=Gryffindor+0;
								Slytherin=Slytherin+0;
								break;
							}
					case 1:
							{
								JOptionPane.showMessageDialog(frame, "Beautiful");
								Hufflepuff=Hufflepuff+0;
								Ravenclaw=Ravenclaw+1;
								Gryffindor=Gryffindor+0;
								Slytherin=Slytherin+0;
								break;
							}
					case 2:
							{
								JOptionPane.showMessageDialog(frame, "Lovely");
								Hufflepuff=Hufflepuff+0;
								Ravenclaw=Ravenclaw+0;
								Gryffindor=Gryffindor+1;
								Slytherin=Slytherin+0;
								break;
							}
					case 3:
							{
								JOptionPane.showMessageDialog(frame, "Pretty");
								Hufflepuff=Hufflepuff+0;
								Ravenclaw=Ravenclaw+1;
								Gryffindor=Gryffindor+0;
								Slytherin=Slytherin+2;
								break;
							}
				}
				String[] question2 = {"Hunger", "Death", "Being ignored", "Loneliness"};
					{
						JFrame frame = new JFrame();
						String fears = (String) JOptionPane.showInputDialog(frame,
								"What are you most afraid of?",
								"Fears",
								JOptionPane.QUESTION_MESSAGE, 
								null,
								question2,
								question2);
					switch (fears)
					{
					case "Hunger":
							{
								JOptionPane.showMessageDialog(frame, "Thinking....");
								Hufflepuff=Hufflepuff+3;
								Ravenclaw=Ravenclaw+2;
								Gryffindor=Gryffindor+1;
								Slytherin=Slytherin+1;
								break;
							}
					case "Death":
							{
								JOptionPane.showMessageDialog(frame, "Thinking....");
								Hufflepuff=Hufflepuff+2;
								Ravenclaw=Ravenclaw+1;
								Gryffindor=Gryffindor+0;
								Slytherin=Slytherin+3;
								break;
							}
					case "Being ignored":
							{
								JOptionPane.showMessageDialog(frame, "Thinking....");
								Hufflepuff=Hufflepuff+1;
								Ravenclaw=Ravenclaw+3;
								Gryffindor=Gryffindor+1;
								Slytherin=Slytherin+3;
								break;
							}
					case "Lonelieness":
							{
								JOptionPane.showMessageDialog(frame, "Thinking....");
								Hufflepuff=Hufflepuff+3;
								Ravenclaw=Ravenclaw+2;
								Gryffindor=Gryffindor+3;
								Slytherin=Slytherin+1;
								break;
							}
					}
					
					}
					Object[] creatureMyth = {"Centaurs", "Merpeople", "Ghosts", "Werewolves", "Vampires", "Goblins", "Trolls"};
					int myth = JOptionPane.showOptionDialog(frame, "Which of these creatures would you like to study?",
							"Study of Mythological Creatures",
							JOptionPane.YES_NO_CANCEL_OPTION,
							JOptionPane.QUESTION_MESSAGE,
							null, creatureMyth, creatureMyth[0]);
					switch (myth)
					{
						case 0:
								{
									JOptionPane.showMessageDialog(frame, "Interesting");
									Hufflepuff=Hufflepuff+0;
									Ravenclaw=Ravenclaw+3;
									Gryffindor=Gryffindor+2;
									Slytherin=Slytherin+0;
									break;
								}
						case 1:
								{
									JOptionPane.showMessageDialog(frame, "Interesting");
									Hufflepuff=Hufflepuff+0;
									Ravenclaw=Ravenclaw+0;
									Gryffindor=Gryffindor+0;
									Slytherin=Slytherin+3;
									break;
								}
						case 2:
								{
									JOptionPane.showMessageDialog(frame, "Interesting");
									Hufflepuff=Hufflepuff+0;
									Ravenclaw=Ravenclaw+2;
									Gryffindor=Gryffindor+3;
									Slytherin=Slytherin+0;
									break;
								}
						case 3:
								{
									JOptionPane.showMessageDialog(frame, "Interesting");
									Hufflepuff=Hufflepuff+3;
									Ravenclaw=Ravenclaw+0;
									Gryffindor=Gryffindor+2;
									Slytherin=Slytherin+0;
									break;
								}
						case 4:
								{
									JOptionPane.showMessageDialog(frame, "Interesting");
									Hufflepuff=Hufflepuff+2;
									Ravenclaw=Ravenclaw+0;
									Gryffindor=Gryffindor+0;
									Slytherin=Slytherin+3;
									break;
								}
						case 5:
								{
									JOptionPane.showMessageDialog(frame, "Interesting");
									Hufflepuff=Hufflepuff+0;
									Ravenclaw=Ravenclaw+2;
									Gryffindor=Gryffindor+0;
									Slytherin=Slytherin+3;
									break;
								}
						case 6:
								{
									JOptionPane.showMessageDialog(frame, "Interesting");
									Hufflepuff=Hufflepuff+3;
									Ravenclaw=Ravenclaw+0;
									Gryffindor=Gryffindor+0;
									Slytherin=Slytherin+2;
									break;
								}
					}
			if (Hufflepuff>Ravenclaw && Hufflepuff>Gryffindor && Hufflepuff>Slytherin)
				{
					JOptionPane.showMessageDialog(frame, "Congratulations! You have been sorted into Hufflepuff.");
					JOptionPane.showMessageDialog(frame, "Of dedication, patience, and loyalty you belong.");
				}
			else if (Ravenclaw>Hufflepuff && Ravenclaw>Gryffindor && Ravenclaw>Slytherin)
				{
					JOptionPane.showMessageDialog(frame, "Congratulations! You have been sorted into Ravenclaw.");
					JOptionPane.showMessageDialog(frame, "Of wit, wisdom, and creativity you belong.");
				}
			else if (Gryffindor>Hufflepuff && Gryffindor>Ravenclaw && Gryffindor>Slytherin)
				{
					JOptionPane.showMessageDialog(frame, "Congratulations! You have been sorted into Gryffindor.");
					JOptionPane.showMessageDialog(frame, "Of courage, chivalry, and determination you belong.");
				}
			else if (Slytherin>Hufflepuff && Slytherin>Ravenclaw && Slytherin>Gryffindor)
				{
					JOptionPane.showMessageDialog(frame, "Congratulations! You have been sorted into Slytherin.");
					JOptionPane.showMessageDialog(frame, "Of cunning, resourcefulness, and ambition you belong.");
				}

		}
	}
