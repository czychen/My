//�������㣬�Ϊ������������㣬���Ƴ�����������֤�����ȷ��
//û����ɱ�����Ŀ�ظ��Ĳ���
import java.util.Scanner;
public class Yunsuan {
	public static void main(String[] args) {
		System.out.println("��������Ҫ����Ŀ�����������ĿΪ1000����");
		Scanner number=new Scanner(System.in);
		int n=number.nextInt();
		yunsuan(n);
	}
	public static int random(int n){     //nΪ���������
		int value=1+(int)(Math.random()*n);//�������СΪ1
		return value;
	}
	public  static void yunsuan(int m){
		int value1,value2,value3,value4,y;
		String result="",result2="";
		String ysf=null;
		for(int i=0;i<m;i++)
		{
			//ȡ�����
			value1=random(100);
			value2=random(100);
			value3=random(100);
			value4=random(100);
			y=random(4);     //�����
			if(y==1) ysf="+";
			else if(y==2) ysf="-";
			else if(y==3) ysf="*";
			else if(y==4) ysf="/";
				if((value1%value2!=0&&value1<value2&&value3<value4)||(value1<value2&&value3<value4&&value3%value4!=0))  //���������
			{
				/*if(value1<value2&&value3<value4)
				  { */
					result2=value1+"/"+value2+" "+ysf+" "+value3+"/"+value4+" =";
					System.out.println(result2);
				/*  }
				else m++;	*/			
			}	 			
			//if(value1%value2==0&&value3%value4==0)   //��������
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
