//2017.3.10
//是否有乘除法  是否有括号   数值范围   加减有无负数     除法有无余数
import java.util.Scanner;
import java.text.DecimalFormat;  
public class Sizenew {
	public static void main(String[] args) {
		System.out.println("请输入需要的题目数量（最大数目为1000）：");
		Scanner number=new Scanner(System.in);
		int n=number.nextInt();
		System.out.println("运算结果保留两位小数 ！");
		yunsuan(n);
	}
	//生成随机数
	public static int random(int m,int n){     //n为随机数个数
		int v=m+(int)(Math.random()*n);//随机数最小为1
		return v;
	}
	
	//约分
	public static int yf(int a, int b) {
        int gcd = 1;
        if(b >= a) {
            int temp = a;
            a = b;
            b = temp;
        }
        for(int i = b;i>=1;i--) {
            if(a % i == 0 && b % i == 0) {
                gcd = i;
                break;
            }
        }
        return gcd;
    }
	//运算
	public  static void yunsuan(int m){
		System.out.println("请输入运算数字取值范围：");
		Scanner Nu=new Scanner(System.in);
		int M=Nu.nextInt();
		Scanner Num=new Scanner(System.in);
		int N=Num.nextInt();
		double v1,v2,v3,v4;
		String result1="",result2="";
		double result = 0;
		int a,b,c,d,y;
		String ysf=null;
		
		System.out.println("请选择是否有乘除法运算：1.是 2.否");
		Scanner xuanze1=new Scanner(System.in);
		int xz1=xuanze1.nextInt();	
		
		System.out.println("请选择是否有余数：1.是 2.否");
		Scanner xuanze2=new Scanner(System.in);
		int xz2=xuanze1.nextInt();	
		
		System.out.println("请选择是否有负数：1.是 2.否");
		Scanner xuanze3=new Scanner(System.in);
		int xz3=xuanze1.nextInt();	
		
		for(int i=0;i<m;i++)
		{
			//取随机数
		    a=random(M,N);
			b=random(M,N);
			c=random(M,N);
			d=random(M,N);
			v1=(double)a;v2=(double)b;v3=(double)c;v4=(double)d;			 
			y=random(1,4);     //运算符
				
			//真分数运算
		    if((v1%v2!=0&&v1<v2&&v3<v4)||(v1<v2&&v3<v4&&v3%v4!=0))  
			{
		    	if(y==1) {ysf="+";result =(v1*v4+v2*v3)/(v2*v4);}
			    else if(y==2) {ysf="-";result = (v1*v4-v2*v3)/(v2*v4);}
			    else if(y==3) {ysf="*";result = (v1*v3)/(v2*v4);}
			    else if(y==4) {ysf="÷";result = (v1*v4)/(v2*v3);}    
		    	DecimalFormat  dq   = new DecimalFormat("######0"); 
		    	
		    	 if(xz3==1&&xz1==1&&xz2==1&&(xz2==1||xz2==2))//有负数  有乘除   
		      	    {	
		    		 result2=dq.format(v1/yf(a,b))+"/"+dq.format(v2/yf(a,b))+" "+ysf+" "+dq.format(v3/yf(c,d))+"/"+dq.format(v4/yf(c,d))+" ="; 				
				        System.out.print(result2);     		       
     		       }
		      	    
		      	    else if(xz3==1&&xz1==2&&(xz2==1||xz2==2)) //有负数 无乘除
		      	    {
		      	    	if(y==1||y==2)
		      	    	{
		      	    		 result2=dq.format(v1/yf(a,b))+"/"+dq.format(v2/yf(a,b))+" "+ysf+" "+dq.format(v3/yf(c,d))+"/"+dq.format(v4/yf(c,d))+" ="; 				
						        System.out.print(result2);
		      	    	}
		      	    	else {m++;continue;}
		      	    }  
		      	    else if(xz3==2&&xz1==1&&(xz2==1||xz2==2))//无负数 有乘除
		      	    {
		      	    	if(v1/v1>v3/v4)
		      	    	{
		      	    		 result2=dq.format(v1/yf(a,b))+"/"+dq.format(v2/yf(a,b))+" "+ysf+" "+dq.format(v3/yf(c,d))+"/"+dq.format(v4/yf(c,d))+" ="; 				
						        System.out.print(result2);
			      	    	}
			      	    	else {m++;continue;}
		      	    }
		      	    else if(xz3==2&&xz1==2&&(xz2==1||xz2==2))//无负数 无乘除
		      	    {
		      	    	if(v1/v2>v3/v4&&(y==1||y==2))
		      	    	{
		      	    		 result2=dq.format(v1/yf(a,b))+"/"+dq.format(v2/yf(a,b))+" "+ysf+" "+dq.format(v3/yf(c,d))+"/"+dq.format(v4/yf(c,d))+" ="; 				
						        System.out.print(result2);
			      	    }
			      	    	else {m++;continue;}
		      	    }
				Scanner number1=new Scanner(System.in);
			    String n1=number1.nextLine();			   
			    DecimalFormat    df   = new DecimalFormat("######0.00");   //保留两位小数
			    String resultn=df.format(result); 
			    if(!n1.equals(resultn))System.out.println("X!正确答案为："+resultn);
			}	 						
			else
			{			
				
			    	if(y==1) {ysf="+";result=v1+v2;}
				    else if(y==2) {ysf="-";result=v1-v2;}
				    else if(y==3) {ysf="*";result=v1*v2;}
				    else if(y==4) {ysf="÷";result=v1/v2;} 
			    	DecimalFormat dq = new DecimalFormat("######0");   
			    	
		      	    if(xz3==1&&xz1==1&&xz2==1)//有负数  有乘除   有余数
		      	    {	
		      	         result1=dq.format(v1)+" "+ysf+" "+dq.format(v2)+" =";
       		             System.out.print(result1);		      	        		       
        		    }
		      	    else if(xz3==1&&xz1==1&&xz2==2)//有负数 有乘除 无余数
		      	    {
		      	    	if(v1%v2==0)
		      	    	{
		      	    		result1=dq.format(v1)+" "+ysf+" "+dq.format(v2)+" =";
	       		             System.out.print(result1);	
		      	    	}
		      	    	else {m++;continue;}
		      	    }
		      	    else if(xz3==1&&xz1==2&&(xz2==1||xz2==2)) //有负数 无乘除
		      	    {
		      	    	if(y==1||y==2)
		      	    	{
		      	    	   result1=dq.format(v1)+" "+ysf+" "+dq.format(v2)+" =";
		         		   System.out.print(result1);
		      	    	}
		      	    	else {m++;continue;}
		      	    }  
		      	    else if(xz3==2&&xz1==1&&xz2==1)//无负数 有乘除  有余数
		      	    {
		      	    	if(v1>v2)
		      	    	{
			      	    	   result1=dq.format(v1)+" "+ysf+" "+dq.format(v2)+" =";
			         		   System.out.print(result1);
			      	    	}
			      	    	else {m++;continue;}
		      	    }
		      	  else if(xz3==2&&xz1==1&&xz2==1)//无负数 有乘除  无余数
		      	    {
		      	    	if(v1>v2&&v1%v2==0)
		      	    	{
			      	    	   result1=dq.format(v1)+" "+ysf+" "+dq.format(v2)+" =";
			         		   System.out.print(result1);
			      	    	}
			      	    	else {m++;continue;}
		      	    }
		      	    else if(xz3==2&&xz1==2&&(xz2==1||xz2==2))//无负数 无乘除
		      	    {
		      	    	if(v1>v2&&(y==1||y==2))
		      	    	{
		      	    		 result1=dq.format(v1)+" "+ysf+" "+dq.format(v2)+" =";
			         		  System.out.print(result1);
			      	    }
			      	    	else {m++;continue;}
		      	    }
		      	    
		      	  
   			       Scanner number1=new Scanner(System.in);
			       double n1=number1.nextDouble();
			       if(!(n1==result))System.out.println("X!正确答案为："+result);
        		}
        		
			}  	
		
		System.out.println("答题结束。");
	}
}
 