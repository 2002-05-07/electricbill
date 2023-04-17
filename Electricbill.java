{
    public static void main(String args[])
    {
        double u;
        double bill;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the unit: ");
        u=in.nextDouble();
        if(u<=100)
        {
            bill=(1.20*u);
            System.out.println("The amount is : "+bill);
        }
        else if(u>100 && u<=300)
        {
            bill=((100*1.20)+((u-100)*2));
            System.out.println("The amount is : "+bill);
        }
        else
        {
            bill=((100*1.20)+(200*2)+((u-300)*3));
            System.out.println("The amount is : "+bill);
        }
    }
}