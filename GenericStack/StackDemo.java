import java.util.*;
class StackDemo
{
    public static void main(String args[])
    {
        GenStack <Integer> ob1=new GenStack();
        GenStack <Student> ob2=new GenStack<Student>();
        Student obj=new Student(41, "Diptark");
        int i;
        for(i=0; i<10; i++)
        {
            ob1.push(i);
        }
        ob1.display();
        for(i=0; i<10; i++)
        {
            ob2.push(obj);
        }
        ob2.display();
    }
}
    