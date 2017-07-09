public class Event
{
  String id;
  int initialTime;
  int requiredTime;
  Customer client;
  Event(int i, Customer c)
  {
    initialTime = i;
    id = "D";
    client = c;
  }
  Event(int i, int r, Customer c)
  {
    initialTime = i;
    requiredTime = r;
    id = "A";
    client = c;
  }
}