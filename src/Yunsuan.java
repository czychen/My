//四则运算，差不为负，真分数运算，定制出题数量，验证结果正确性
//没有完成避免题目重复的部分
import java.util.Scanner;
public class Yunsuan {
	public static void main(String[] args) {
		System.out.println("请输入需要的题目数量（最大数目为1000）：");
		Scanner number=new Scanner(System.in);
		int n=number.nextInt();
		yunsuan(n);
	}
	public static int random(int n){     //n为随机数个数
		int value=1+(int)(Math.random()*n);//随机数最小为1
		return value;
	}
	public  static void yunsuan(int m){
		int value1,value2,value3,value4,y;
		String result="",result2="";
		String ysf=null;
		for(int i=0;i<m;i++)
		{
			//取随机数
			value1=random(100);
			value2=random(100);
			value3=random(100);
			value4=random(100);
			y=random(4);     //运算符
			if(y==1) ysf="+";
			else if(y==2) ysf="-";
			else if(y==3) ysf="*";
			else if(y==4) ysf="/";
				if((value1%value2!=0&&value1<value2&&value3<value4)||(value1<value2&&value3<value4&&value3%value4!=0))  //真分数运算
			{
				/*if(value1<value2&&value3<value4)
				  { */
					result2=value1+"/"+value2+" "+ysf+" "+value3+"/"+value4+" =";
					System.out.println(result2);
				/*  }
				else m++;	*/			
			}	 			
			//if(value1%value2==0&&value3%value4==0)   //整数运算
			else
			{				
			    /*if((y==2&&((value1/value2)>(value3/value4)))||y==1||y==3||y==4)
			      { 
			    	result=(value1/value2)+" "+ysf+" "+(value3/value4)+" =";
			    	System.out.println(result);
			      }
			    else if(y==2&&!(value1/value2>value3/value4))
			    	m++;*/
				if(y==2&&value1>value2)
        		{
        		   result=value1+" "+ysf+" "+value2+" =";
        		   System.out.println(result);
        		}
        		else m++;
			}
			 			
		}	
	}
}
