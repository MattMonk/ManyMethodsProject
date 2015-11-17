package manymethodsproject;

public class ManyMethods
{
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
    
    public void runProgram()
    {
        myProcedure();
        System.out.println(myFunction());
        myParameter(27);
    }
    
    public static void main(String[] args)
    {
       ManyMethods mm = new ManyMethods();
       mm.runProgram();
       
    }
    
}//end of class
