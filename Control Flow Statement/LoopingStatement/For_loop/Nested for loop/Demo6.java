/*
A B C D E
E D C B A
A B C D E
E D C B A
A B C D E  */

class Demo6
{
    public static void main(String args[])
    {
        for(int i = 1; i <= 5; i++)
        {
            char ch = 'A';

            for(int j = 1; j <= 5; j++)
            {
                if(i % 2 != 0)
                    System.out.print(ch++ + " ");
                else
                    System.out.print((char)('F' - j) + " ");
            }

            System.out.println();
        }
    }
}