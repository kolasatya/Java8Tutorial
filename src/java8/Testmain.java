package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Testmain   {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<Integer> con=new Consumer<Integer>() {
			public void accept(Integer i)
				{System.out.println("this is consumer class"+i);}
			 
		};
		List<Integer> list= Arrays.asList(2,3,4,5,6,8);
		//list.forEach(con);
		int intt=list.stream().filter(i -> {
			if(i%2==0) 
			{
				return false;
			}else{
				return true;
			}}).findFirst().get();
		System.out.println(intt           );
		
		int intrt=list.stream().filter(i -> {
			return true;}).findFirst().get();
		System.out.println(intrt);
		//list.(xc->{System.out.println(""+xc);});
		
		/*Xyz xx=new Xyz();
		xx.call(1);
		i2 ii=new i2() {
			public void call(int i) 
			{	
				System.out.println("this is anonymous class implemented"+i);
			}
		};
		
		ii.call(2);
		//String i="sss";
		//int i=10;
		i2 jj= i->System.out.println("this is lambda impleted"+i);
		jj.call(3);
		
		Mobile m1=(  i)->{ System.out.println("testttttt"+i);System.out.println("testttt"+i);return (Integer) i; };;
		int iii=m1.show(2);
		//System.out.println(iii);
		*/
	}
	
	public void equals1()
	{
		System.out.println(" this is implemented method in class");
	}
	
}
interface Mobile<T>{
	default void equals1() {
		System.out.println("this is interface1 method");
	}
	 int  show(T t);
	// void print();
	
}
interface i2
{
	default void equals1() {
		System.out.println("this is interface2 method");
	}
	void call(int i);
	
}

class Xyz implements i2
{
	public void call(int i)
	{
		System.out.println("this is xyz class implemented"+i);
	}
	
}

 class ABC
{
	int i;
	String name;
	String mobile;
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public ABC(int i, String name, String mobile) {
		super();
		this.i = i;
		this.name = name;
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return  i+"";
	}
	
}
 class Consumber1 implements Consumer<ABC> {

	@Override
	public void accept(ABC t) {
		// TODO Auto-generated method stub
		System.out.print(t.getI());
		
		
	}
	 
	 
 }
