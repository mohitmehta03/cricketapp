import java.util.*;
public class match implements inning
{
    int target,chased;
    
    Scanner s =new Scanner(System.in);
    int over = s.nextInt();
    @Override
    public int inningone() 
    {
        int w=0,i=0,run=0;
        while(i<over)
        {
            int b=6;
            for(int j=0;j<b;j++)
            {
                if(w==10)
            {
                break;
            }
                int r;
                System.out.println("Enter the moment happend on  "+i +"."+(j+1)+" over(press '0' for/out/noball ...)");
                r=s.nextInt();
                if(r==0)
                {
                    String o;
                    System.out.print("Enter the moment happend (out/noball/wide/dotball)");
                    o=s.next();
                    if(o.equals("noball"))
                    {
                        run+=1;
                        b+=1;
                        System.out.println("no ball");
                        System.out.println(run+ "/" +w);
                    }
                    else if (o.equals("out"))
                    {
                        w+=1;
                        System.out.println(run+ "/" +w);
                    }
                    else if(o.equals("wide"))
                    {
                        run+=1;
                        b+=1;
                        System.out.println(run+ "/" +w);
                    }
                    else
                    {System. out.println("dot ball");}
                }
                else
                {
                    run+=r;
                    System.out.println(run+ "/" +w);
                }
            }
            i++;
        }
        target=run+1;
        System.out.println("inning total "+run+"/"+w);
        System.out.println("target is "+target);
        return target;
    }

    public int inningsec() 
    {
        System.out.println("Welcome again now its a chase time.");
        int w=0,i=0,run=0;
        while(run<target && i<over )
        {
            int b=6,j=0;
            while(run<target && j<b)
            {
              
                if(w==10)
            {
                break;
            }
                int r;
                System.out.println("Enter the moment happend on  "+i +"."+(j+1)+" over(press '0' for/out/noball ...)");
                r=s.nextInt();
                if(r==0)
                {
                    String o;
                    System.out.print("Enter the moment happend (out/noball/wide/dotball)");
                    o=s.next();
                    if(o.equals("noball"))
                    {
                        run+=1;
                        b+=1;
                        System.out.println("no ball");
                        System.out.println(run+ "/" +w);
                    }
                    else if (o.equals("out"))
                    {
                        w+=1;
                        System.out.println(run+ "/" +w);
                    }
                    else if(o.equals("wide"))
                    {
                        run+=1;
                        b+=1;
                        System.out.println(run+ "/" +w);
                    }
                    else
                    {System. out.println("dot ball");}
                }
                else
                {
                    run+=r;
                    System.out.println(run+ "/" +w);
                }
            j++;
        }
            i++;
        }
        chased=run;
        
        System.out.println(chased);
        return chased;
    }
}

