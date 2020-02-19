public static int getFirstSetBitPos(int n){
        
    // Your code here
    int i=0;
    if(n==0)
    {
        return(0);
    }
    while(true)
    {
        if((1&(n>>i))==0)
        {
            ++i;
        }
        else
        {
            return(i+1);
        }
    }
        
}