public class matchresult implements resultinterface
{
    public void summary()
    {
        match q =new match();
        System.out.println("team A score :" +(q.target-1));
        System.out.println("team b score :" +q.chased);
    }
   public void result()
    {
        match q =new match();
        if(q.chased<q.target)
        {
            System.out.println("Team played first inning won the game by "+(q.target-q.chased));
        }
        else
        {
            System.out.println("Team played second inning won the game ");
        }
    }    
    
}
