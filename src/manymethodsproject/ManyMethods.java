package manymethodsproject;

public class ManyMethods
{

    public ManyMethods()
    {
        System.out.println("******************");
        System.out.println("CREATING AN OBJECT");
        System.out.println("******************");
    }

    public double IterativeSolution(int root, int iterations)
    {
        double solution=root/2;
        for(int i=0;i<iterations+1;i++)
        {
            solution = (solution+(root/solution))/2;
        }
        return solution;
    }
    
    public void myProcedure()
    {
        System.out.println("*****RUNNING THE PROCEDURE*****");
    }
    
    public void myParameter(String theName)
    {
        System.out.println("*****RUNNING THE PARAMETER*****");
        System.out.println("Parameter value is "+theName);
    }
    
    public int addTheseTwo(int num1, int num2)
    {
        System.out.println("*****RUNNING THE ADD*****");
        int addTotal=num1+num2;
        return addTotal;
    }
    
    public int multiplyTheseTwo(int num1, int num2)
    {
        System.out.println("*****RUNNING THE MULTIPLY*****");
        int multiplyTotal=num1*num2;
        return multiplyTotal;
    }
    
    public static void main(String[] args)
    {
       ManyMethods mm = new ManyMethods();
       //double rootOutput=mm.IterativeSolution(2, 10);
       //System.out.println(rootOutput);
       
       mm.myProcedure();
       mm.myParameter("Matt");
       
       int addResult=mm.addTheseTwo(2, 3);
       int multiplyResult=mm.multiplyTheseTwo(2, 5);
       System.out.println("Adding gives "+addResult+" and multiplying gives "+multiplyResult);
       
    }
    
}//end of class
