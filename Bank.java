import java.util.Scanner;
class Bank
{
   public static void main(String[]args)
   {
      simulate();
      /*
      System.out.println("Enter name of first customer");
      Scanner input=new Scanner(System.in);
      String name=input.nextLine();
      System.out.println("Enter time of arrival");
      int arrive= input.nextInt();
      System.out.println("Enter time of transaction");
      int trans= input.nextInt();
      input.nextLine();
      Customer c= new Customer(name,arrive,trans);
      aQueue.enqueue(c);

      boolean is=true;
      while (is)
      {
         System.out.println();
         System.out.println("What would you like to do next");
         System.out.println("Enter a to add another customer");
         System.out.println("Enter r to remove the first customer");
         System.out.println("Enter d to display events");   
         System.out.println("Enter q to quit");
         String in=input.nextLine();
         if(in.equals("a"))
         {
            System.out.println("Enter name of customer");
            name=input.nextLine();
            System.out.println("Enter time of arrival");
            arrive= input.nextInt();
            System.out.println("Enter time of transaction");
            trans= input.nextInt();
            input.nextLine();
            //add(name,arrive,trans);
            c= new Customer(name,arrive,trans);
            aQueue.enqueue(c);
         }
         
         else if(in.equals("r")) aQueue.dequeue();
         else if(in.equals("d")) System.out.print(display(aQueue)); 
         else break;
      }*/
   }
   public static void simulate()
   {
     bankQueue aQueue = new bankQueue();
     EventList events = new EventList();
     events.insert(new Event(0,1,new Customer("Raffi")));
     if(events.get(0).id.equals("A"))
     {
       
     }
   }
   public void processArrival(int currentTime, Event arrivalEvent, EventList events, bankQueue aQueue)
   {
     events.currentTime = arrivalEvent.initialTime;
     boolean atFront = aQueue.isEmpty();
     aQueue.enqueue(arrivalEvent);
     if(atFront)
     {
       events.currentTime+=arrivalEvent.requiredTime;
     }
   }
   public void processDeparture(Event departureEvent, EventList events, bankQueue aQueue)
   {
     bankQueue.dequeue();
     if(!bankQueue.isEmpty())
     {
       
   
   
   
   
   
   
   
   
   
   
   
   
}

      
    