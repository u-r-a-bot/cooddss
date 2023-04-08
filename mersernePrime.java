class merserne{
    boolean prime(int n){
        int i;
        for(i =2;i<Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    void printer(){
        double p=0;
        for(p=2;p<=32;p++){
            if(prime((int)Math.pow(2,p)-1)){
                int z =(int)Math.pow(2,p)-1;
                System.out.println(z+" value of p is: "+ p);
            }
        }

    }

}
class mersernePrime {
    public static void main(){
    merserne a = new merserne();
    a.printer();
    }
}
