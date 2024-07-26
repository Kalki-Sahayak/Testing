import java.util.Scanner;

class LinearQueue
{
    public static int front, rear, max;
    public static int queue[] = new int[100];

    static void push ()
    {
        Scanner sc = new Scanner (System.in);
        front = rear = 0;
        if (rear == max)
        {
            System.out.println ("OVERFLOW");
        }
        else
        {
            queue [rear] = sc.nextInt();
            rear = rear+1;
        }
        System.out.println (rear);
    }

    static void pop()
    {

    }

    static void display()
    {
        for (int i =0; i<max ;i++)
        {
            System.out.print(queue[i] + " ");
        }
    }

    public static void main(String[] args) 
    {
        int ch, wish;
        Scanner sc = new Scanner(System.in);
        System.out.print ("Enter the queue size: ");
        max = sc.nextInt();
        
        do
        {        
            System.out.println ("1. Push");
            System.out.println ("2. Pop");
            System.out.println ("3. Display");
            System.out.print ("Enter your choice: ");
            ch = sc.nextInt();
            switch (ch)
            {
                case 1:
                    push();
                    break;
                case 2:
                    pop();
                    break;
                case 3:
                    display();
                    break;
            }
            System.out.print ("Do you want to continue (1/0)? ");
            wish = sc.nextInt();
        }while (wish!=0);
    }
}
