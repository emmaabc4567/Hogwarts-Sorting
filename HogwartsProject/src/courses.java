
public class courses
	{
		private int Year;
		private String Classes, Teacher;
		public courses(int y, String c, String t)
		{
			Year=y;
			Classes=c;
			Teacher=t;
		}
		public int getYear()
			{
				return Year;
			}
		public void setYear(int years)
			{
				this.Year = years;
			}
		public String getClasses()
			{
				return Classes;
			}
		public void setClasses(String classes)
			{
				this.Classes = classes;
			}
		public String getTeacher()
			{
				return Teacher;
			}
		public void setTeacher(String teachers)
			{
				this.Teacher = teachers;
			}
		
	}
