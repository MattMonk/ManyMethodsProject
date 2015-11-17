package manymethodsproject;

public class ManyMethods
{

    public ManyMethods()
    {
        System.out.println("******************");
        System.out.println("CREATING AN OBJECT");
        System.out.println("******************");
    }
    
    
    public void myProcedure()
    {
        System.out.println("Non returining procedure");
    }
    public String myFunction()
    {
        return "Returning function";
    }
    
    public void myParameter(int theParam)
    {
        System.out.println("Parameter passed in is "+ theParam);
    }
    
    public double IterativeSolution(int root, int iterations)
    {
        double solution=root/2;
        for(int i=0;i<iterations+1;i++)
        {
            //solution=(1/2) * (solution+(2/solution));
            solution = (solution+(root/solution))/2;
        }
        return solution;
    }
    
    public void runProgram()
    {
        myProcedure();
        System.out.println(myFunction());
        myParameter(27);
        System.out.println(IterativeSolution(25, 100));
    }
    
    public static void main(String[] args)
    {
       ManyMethods mm = new ManyMethods();
       mm.runProgram();
       
    }
    
}//end of class
