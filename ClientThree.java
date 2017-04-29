
import java.io.*;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class ClientThree
 {
	
	private static Scanner sc;

	public static void main(String args[]) throws IOException, InterruptedException
	{
		long a = 2000;
		System.out.println("\nClientThree is Ready!");
		String lockFile = "C:\\Users\\pramod\\Desktop\\CSE UTA\\Distributed Systems\\Project 2\\Project 2 Part 3\\token.txt";
		String resourceFile = "C:\\Users\\pramod\\Desktop\\CSE UTA\\Distributed Systems\\Project 2\\Project 2 Part 3\\resource.txt";
		String line = null;
		String line1 = null;
		sc = new Scanner(System.in);
		
		while(true)
		{
			
			//System.out.println("\nDo You Want to Acquire Lock\nPress '1' for YES\nPress '2' for NO");
			//int choice = sc.nextInt();
		
			//if (choice == 1)
			//{
			
				Thread.sleep(a);
				FileReader fileReaderlock = new FileReader(lockFile);
				BufferedReader bufferedReaderlock = new BufferedReader(fileReaderlock);
				try {
					line = bufferedReaderlock.readLine();
					
				    line1 = String.valueOf(line.charAt(0));
				    
				    } 
				catch (IOException e) 
				    {
					// TODO Auto-generated catch block
					e.printStackTrace();
				    }
				    bufferedReaderlock.close();
				
				if(line1.equals("3"))
				{
					
					
					//set lock to locked
					FileWriter fileWriterlock = new FileWriter(lockFile,false);
					BufferedWriter bufferedWriterlock = new BufferedWriter(fileWriterlock);
					bufferedWriterlock.write("0");
					System.out.println("Lock is acquired by ClientThree!");
					bufferedWriterlock.close();
				
					System.out.println("Enter Your Choice:\n1 : Edit Resource\n2 : Release Lock ");
					int choice1 = sc.nextInt();
				
					switch(choice1)
					{
				
						case 1:
							FileReader fileReaderresource = new FileReader(resourceFile);
							BufferedReader bufferedReaderresource = new BufferedReader(fileReaderresource);
							String res = bufferedReaderresource.readLine();	
						  System.out.println("The current value of the resource is : " +res);
						  System.out.println("\nEnter the INTEGER value you have to assign to resource");
						  String editResource = sc.next(); 
						  FileWriter fileWriterresource = new FileWriter(resourceFile,false);
						  BufferedWriter bufferedWriterresource = new BufferedWriter(fileWriterresource);
						  bufferedWriterresource.write(editResource);
						  bufferedWriterresource.close();
				          
					    case 2: 
				  
						  //set lock to unlocked
						  
						  FileWriter fileWriter = new FileWriter(lockFile,false);
						  BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
						  bufferedWriter.write("4");
						  bufferedWriter.close();
						  System.out.println("Lock is released by ClientThree");
						  System.out.println("\nToken is passed to ClientFour");
				          
				    }
				
				}
			//	else if(line1.equals("0"))
			//	{
			//	 System.out.println("Lock cannot be acquired at the moment, Please try again!");	
			//	}
				
			 //}
				
			 //else
		     //{
			 //    System.out.println("Thank You for your time!");
		     //}			
	 } 
   }
 }


