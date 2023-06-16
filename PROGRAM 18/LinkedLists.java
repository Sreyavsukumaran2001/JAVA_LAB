import java.util.*;
class LinkedLists
{
public static void main(String args[])
{
//create a linked list object
LinkedList<String>ll=new LinkedList<String>();
//add elements to be the linked
ll.add("a");
ll.add("b");
ll.add("c");
ll.add("d");
ll.add("e");
System.out.println("Current contents of ll:"+ll);
ll.clear();
System.out.println("Contents of ll after deletion:"+ll);
}
}

