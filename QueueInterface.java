public interface QueueInterface
{
   public boolean isEmpty();
   public void enqueue(Object newItem);
   public Object dequeue();
   public void dequeueAll();
   public Object peek();
}