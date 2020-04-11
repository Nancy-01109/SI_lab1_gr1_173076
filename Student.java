import java.util.*;


class Student {
	String index;
	String firstName;
	String lastName;
	List<Integer> labPoints = new ArrayList<Integer>();
	
	Student(String index,String firstName,String LastName,ArrayList<Integer> labpoints)
	{
		this.index=index;
		this.firstName=firstName;
		this.lastName=lastName;
		this.labPoints=new ArrayList<Integer>();
	}

	public String getfirstName() {
		return firstName;
	}

	public String getlastName() {
		return lastName;
	}

	public String getIndex(){
		return index;
	}

	public ArrayList<Integer> getlabPoints()
	{
		return labPoints.ElementAt(int x);
	}

	public void setIndex(String index)
	{
		this.index=index;
	}

	public void setfirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setName(String lastName) {
		this.lastName = lastName;
	}

	public void setLabPoints(ArrayList<Integer> labPoints,int x)
	{
		this.labPoints.add(x);
		
	}

	public double getAverage(ArrayList<Integer> labPoints) {
		
		double suma=0;
		for(int i=0;i< labPoints.size();i++)
		{
			suma=suma+i;
		}
		return suma/labPoints.size();
	}

	public boolean hasSignature(ArrayList<Integer> labPoints) {
		if(labPoints.size()>8)
			return true;
		else 
			return false;
		}
}
