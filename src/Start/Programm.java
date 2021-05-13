
package Start;
import unit4.*;

import java.awt.Point;
import java.lang.Math;
import unit4.bucketLib.Bucket;

public class Programm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bucket bucket1 = new Bucket(7, "7");
		Bucket bucket2 = new Bucket(8, "8");
		Bucket bucket3 = new Bucket(6, "6");
		Bucket bucket4 = new Bucket(4, "4");
		Bucket bucket5 = new Bucket(3, "3");
		Bucket bucket6 = new Bucket(5, "5");
		
		bucket1.fill(7);
		bucket2.fill((double)(bucket1.getCapacity()/2));
		bucket3.fill((double)(bucket2.getCapacity()/2));
		bucket4.fill((double)(bucket3.getCapacity()/2));
		bucket5.fill((double)(bucket4.getCapacity()/2));
		bucket6.fill((double)(bucket5.getCapacity()/2));
		
		
		Bucket bucket01 = new Bucket(20, "20");
		Bucket bucket02 = new Bucket(20, "20");
		Bucket bucket03 = new Bucket(20, "20");
		
		bucket01.fill(Random());
		bucket02.fill(Random());
		bucket03.fill(Random());
		
		int i =(int)(Math.max(Math.max(bucket01.getCurrentAmount(), bucket02.getCurrentAmount()),bucket03.getCurrentAmount()));

		bucket01.empty();
		bucket02.empty();
		bucket03.empty();
		
		bucket01.fill(i);
		bucket02.fill(i);
		bucket03.fill(i);
		
		
		bucket02.fill(bucket01.getCapacity()-Random());
		bucket03.fill(bucket01.getCapacity()-bucket02.getCapacity());
//		
		
		///////////////////////////////////////////////////////////////////////
		
		Bucket bucketo1 = new Bucket(Random1(), "1");
		Bucket bucketo2 = new Bucket(Random1(), "2");
		Bucket bucketo3 = new Bucket(Random1(), "3");
		
		bucketo1.fill(functionCHECK(Random1(),bucketo1.getCapacity()));
		bucketo2.fill(functionCHECK(Random1(),bucketo2.getCapacity()));
		bucketo3.fill(functionCHECK(Random1(),bucketo3.getCapacity()));
		
		
		int max =(int)(Math.max(Math.max(bucketo1.getCurrentAmount(), bucketo2.getCurrentAmount()),bucketo3.getCurrentAmount()));
		
		int min =(int)(Math.min(Math.min(bucketo1.getCurrentAmount(), bucketo2.getCurrentAmount()),bucketo3.getCurrentAmount()));
		
		int middle = (int)((bucketo1.getCurrentAmount()+bucketo2.getCurrentAmount()+bucketo3.getCurrentAmount())-(max+min));
		System.out.println("max "+max);
		System.out.println("middle "+middle);
		System.out.println("min "+min);
		
		//
		//////////////////////////////////////////////////////////////////////
		
		////////////////////////////////////////////////////////////////////////
		
		
		Point point1 = new Point(1,1);
		Point point2 = new Point(6,6);
		System.out.println(point1);
		System.out.println(point2);
		
		point1.move(3, 3);
		point2.move(9, 9);
		
		System.out.println(point1);
		System.out.println(point2);	
		
		point1.translate(3, 9);
		point2.translate(9, 3);
		
		
		System.out.println(point1);
		System.out.println(point2);
		
		
//		

		
				
		//translate
		
		////////////////////////////////////////////////////////////////////////
		
		
		///////////////////////////////////////////////////////////////////////
		
		////////////////////////////////////////////////////////////////////////
	}
	
		static int Random() {
		return (int)(Math.random()*20)+1;
	}
	
////////////////////////////////////////////////////////////////////////
			static int Random1() {
			return (int)(Math.random()*10)+1;
}

	static int functionCHECK(int x,int y) {
		
		while(y<x) {
		x--;
	}
		return x;
	}
////////////////////////////////////////////////////////////////////////////////
}
