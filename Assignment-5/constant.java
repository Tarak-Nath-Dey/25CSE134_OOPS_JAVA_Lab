class constant {
    public static void main(String[] args) {
        int f;
        float s=0.0f;
        for(int i=1;i<=5;i++){
            f=1;
            for(int j=1;j<=i;j++){
                f*=j;
            }
            s+=1.0/f;
        }
        System.out.println("Value of mathematical constant \'e\' = "+s);
    }    
}
