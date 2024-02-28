package JavaBasicsintro;

public class Constructor {
	String sec;  //inheritance_class
	int clas;
	public Constructor(String sec,int clas)
	{
		this.sec=sec;    //this use for current class
		this.clas=clas;
	}
	public static void main(String[] args)
	{
	Constructor c1=new Constructor("B",6);    
	Constructor c2=new Constructor("C",5);
	
	System.out.println(c1.sec+" section is "+c1.clas+"th clas");
	System.out.println(c2.sec+" section is "+c2.clas+"th clas");
	
	}

}
