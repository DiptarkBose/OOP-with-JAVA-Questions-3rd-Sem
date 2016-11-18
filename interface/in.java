class in
{
    static int a=15;
    in()
    {
        --a;
    }
    public static void main(String args[])
    {
        a=++a + a-- -a++;
        new in();
        System.out.println(a++ +":");
        a=a>>1;
        new in();
        System.out.println(--a);
    }
    static {
        a--;
    }
}
        