
class scorecard
{
	public static void main(String[] args) 
    {
        
        System.out.println("welcome to crickbuzz score menu : ");
        System.out.println("Enter the total no. of overs for an innning : ");
        matchfacade c= new matchfacade();
        c.inningone();
        c.inningsec();
        c.summary();
        c.result();
    }
}