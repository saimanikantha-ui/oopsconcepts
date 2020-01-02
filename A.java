package hello;

class A
{
 void bark()
 {
   System.out.println ("barking......");
 }
}
 class B extends A
 {
   void fly()
   {
     System.out.println ("flying.....");
   }
   void bark()
   {
     System.out.println ("wining.....");
   }
   void work()
   {
     super.bark();
    
   }
 }
 class C
 {
   public static void main (String args[])
   {
     B obj = new B();
     obj.work();
 }}

