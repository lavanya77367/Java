class CallByReference
{
int data=1;
void change(CallByReference obj)
{
obj.data=obj.data+6;
}
public static void main(String args[])
{
CallByReference obj= new CallByReference();
System.out.println("Before change "+obj.data);
obj.change(obj);
System.out.println("After change "+obj.data);
}}

