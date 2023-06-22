import java.util.*;
public class Stacks
{
public static void main(String[] args)
{
Scanner sc= new Scanner(System.in);
Stack<String>stack=new Stack<String>();
stack.push("a");
stack.push("b");
stack.push("c");
stack.push("d");
stack.push("e");
Iterator<String>itr=stack.iterator();
System.out.print("Contents of stack:");
while(itr.hasNext())
{
System.out.print(itr.next()+" ");
}
System.out.println("\n Enter position of an object to remove:");
int i=sc.nextInt();
stack.removeElementAt(i);
itr=stack.iterator();
System.out.print("\n Stack after an element removed:");
while(itr.hasNext())
{
System.out.print(itr.next()+" ");
}
}
}

