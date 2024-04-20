class LowBalance extends Exception{
    String message = "You have done some error";
}


class Main{
    public static void main(String[] args) {
        float x=0;
        try{
            float  y = 5/x;     //is y is in float then it stores Infinity as answer but if we 
                                // initialize it with int then it will throw arithmatic  error
            System.out.println(y);
            throw new LowBalance();
        }
        catch(LowBalance e){
            System.out.println(e.message);
        }
    }
}
