package com.lti.assignment3;

public class Data {
	
	String data[][]= {
						{"P101","Nokia Handset","Some Description","2000.0"},
						{"P102","Samsung Handset","Some Description","2000.0"},
						{"P103","Sony Ericsson Handset","Again Some Description","1500.0"},
						{"P104","LG Handset","No Description","1000.0"}
						};
	
	String colNames[]= {"ID","Name","Description","Price"};

		void display()
		{
			for(int i=0;i<4;i++)
			{
				for(int j=0;j<4;j++)
					System.out.print(data[i] [j]+" ");
				
				System.out.println();
			}
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Data d=new Data();
			d.display();
	}

}
