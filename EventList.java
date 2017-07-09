public class EventList
{
  private Node firstNode;
  int currentTime;
  EventList()
  {
    currentTime = 0;
    firstNode = null;
  }
  public boolean isEmpty()
  {
    if(firstNode == null)
      return true;
    return false;
  }
  private Node find(int index)
  {
    Node curr = firstNode;
    for(int skip = 0;skip<index;skip++)
    {
      curr = curr.next;
    }
    return curr;
  }
  public Event get(int index)
  {
    if(index>=0 && index<this.size())
    {
      Node curr = find(index);
      Event dataItem = (Event)curr.item;
      return dataItem;
    }
    return null;
  }
  public int size()
  {
    int size = 0;
    Node curr = firstNode;
    while(curr!=null)
    {
      size++;
      curr = curr.next;
    }
    return size;
  }
  public void insert(Event anEvent)
  {
    Node n = new Node(anEvent);
    if(isEmpty())
      firstNode = n;
    Node prev = firstNode;
    Node curr = prev.next;
    Event firstEvent = (Event)firstNode.item;
    if(anEvent.initialTime<firstEvent.initialTime)
    {
      n.next = firstNode;
      firstNode = n;
      return;
    }
    else if(anEvent.initialTime == firstEvent.initialTime && firstEvent.id.equals("D") && anEvent.id.equals("A"))
    {
      n.next = firstNode;
      firstNode = n;
      return;
    }
    for(int i = 1;i<this.size();i++)
    {
      if(anEvent.initialTime<this.get(i).initialTime)
      {
        prev.next = n;
        n.next = curr;
        return;
      }
      else if(anEvent.initialTime == this.get(i).initialTime && this.get(i).id.equals("D") && anEvent.id.equals("A"))
      {
        prev.next = n;
        n.next = curr;
        return;
      }
      else if(curr.next == null)
      {
        curr.next = n;
      }
      prev = curr;
      curr = curr.next;
    }
        
    
    
  }
  public void delete()
  {
    if(!this.isEmpty())
      firstNode = firstNode.next;
  }
  public Event retrieve()
  {
    return (Event)firstNode.item;
  }
}

  