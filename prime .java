class Main{
    public static void main(String[] args) {
       int n=9;
    for(int x=1;x<=n;x++){
        int flag = 0;
        for(int i=2;i<x;i++){
            if(x%i==0){
                flag = 1;
            }
        }
        if(flag==0){
            System.out.println(x);
        }
    }
    }
}