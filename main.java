class Main{
    public static void main(String[] args){
        
        
        for(int i=0;i<10;i++){
        try{    
           int y = 100/(5-i);
            
        System.out.println(y);
        }
        
        catch(Exception e){
            System.out.println("This is an arthmatic Exception "+e);
        }
        }
    }
}
