package com.epam.new_year_gift;

	import java.util.*;
	class epam_project
	{
	    public static void main(String args[])
	    {
	        Scanner sc=new Scanner(System.in);
	        int i,j,sum=0;
	        System.out.println("enter how many objects you want to make for chocolates=");
	        int n=sc.nextInt();
	        int c[]=new int[n];
	        chocolates ob[]=new chocolates[n];
	        for(i=0;i<n;i++)
	        {
	            System.out.println("hi guest no "+(i+1)+":");
	            ob[i]= new chocolates();
	            ob[i].collect();
	        }
	        for(i=0;i<n;i++)
	        {
	            c[i]=ob[i].get_weight();
	            sum=sum+ob[i].get_weight();
	        }
	        int temp=0;
	        System.out.println("sorted weight of chocolates in gift=");
	        for(i=1;i<n;i++)
	        {
	            temp=c[i];
	            
	            for(j=i-1;j>=0&&c[j]>temp;j--)
	            {
	                c[j+1]=c[j];
	            }
	            c[j+1]=temp;
	        }
	        for(i=0;i<n;i++)
	        {
	            System.out.print(c[i]+" ");
	        }
	        System.out.println();
	        System.out.println("enter how many objects you want to make for sweets=");
	        int m=sc.nextInt();
	        
	        sweets ob1[]=new sweets[m];
	        for(i=0;i<m;i++)
	        {
	            System.out.println("hi guest no "+(i+1)+":");
	            ob1[i]=new sweets();
	            ob1[i].collect();
	            sum=sum+ob1[i].get_w();
	        }
	        candies ob2=new candies();
	        System.out.println("enter the range for checking candies");
	        System.out.println("enter the lower limit=");
	        int l=sc.nextInt();
	        System.out.println("enter the higher limit=");
	        int h=sc.nextInt();
	        ob2.collect();
	         
	        boolean x=ob2.check_range(l,h);
	        if(x==true)
	        {
	            System.out.println("gift category is candies");
	        }
	        else
	        {
	            System.out.println("gift category is not candies");
	        }
	        sum=sum+ob2.total();
	        System.out.println("childrens gift's total weight="+sum);
	    }
	}
	class gift
	{
	    int weight=0;
	    int s=0;
	    public void collect()
	    {
	        
	        System.out.println("enter your gift weight=");
	        Scanner scan=new Scanner(System.in);
	        weight=scan.nextInt();
	        s=s+weight;
	    }
	    public int total()
	    {
	        return s;
	    }
	        
	}
	    class chocolates extends gift
	    {
	        public int get_weight()
	        {
	            return weight;
	        }
	    }
	    class sweets extends gift
	    {
	        public int get_w()
	        {
	            return weight;
	        }
	    }
	    class candies extends gift
	    {
	        boolean check_range(int l,int h)
	        {
	            if(weight>=l && weight<=h)
	            {
	                return true;
	            }
	            else
	            {
	                return false;
	            }
	        }
	        
	    }


