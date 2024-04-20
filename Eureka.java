class Main{

    void g() throws Exception  //Here in this line if we remove Exception then this will give compilation error
                                //Because we are catching Arithmatic Exception but throwing Exception in function f with contain 
                                //ArithmaticException inside it but in compile time it wont be able to recognize it thus show
                                //unhandled error but if we mention throws Exception it will bypass it and during run time every thing is fine
    {
        try {
            f();
        } catch (ArithmeticException e) {
            System.out.println("Handled in g");
            
        }
    }
    void f() throws Exception
    {
        throw new ArithmeticException("Error in f");
    }
    public static void main(String[] args) {
        Main ob = new Main();
        try{
            ob.g();
        }
        catch(Exception e){
            System.out.println("Handled in main");
        }
    }
        
}