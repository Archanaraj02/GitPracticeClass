package org.edu;
//child class
	public class Arts extends Education{
		 @Override
		public void undergraduate() {
			// TODO Auto-generated method stub
			super.undergraduate();}
		 @Override
		 public void postgraduate() {
			// TODO Auto-generated method stub
			super.postgraduate();
		 }
		 public void bsc() {
			 System.out.println("BSc Course");}
		public void bED() {
		System.out.println("BEd Course");
		}
		public void ba() {
			System.out.println("BA Course");
			
		} public static void main(String[]args) {
			 Arts a = new Arts();
			 a.postgraduate();
			 a.undergraduate();
			 a.ba();
			 a.bED();
			 a.bsc();
			 
			 
		 }
		 }
	