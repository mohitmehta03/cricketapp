public class matchfacade 
{
	
		private match m;
		public matchresult j;
		  
	
		   public matchfacade() {
			  m = new match();
			  j = new matchresult();
		
		   }
	
		   public int inningone(){
			  return m.inningone();
		   }
		   public int inningsec(){
			return m.inningsec();
		   }
		   public void result(){
			  j.result();
		   }
		   public void summary()
		   {
			j.summary();
		   }
	
}
