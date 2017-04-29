import java.io.*;

class Initialize
{
	public static void main(String args[]) throws IOException
	{
	    String lockFile = "C:\\Users\\pramod\\Desktop\\CSE UTA\\Distributed Systems\\Project 2\\Project 2 Part 3\\token.txt";
		
		FileWriter fileWriter = new FileWriter(lockFile,false);
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		bufferedWriter.write("1");
		bufferedWriter.close();
		System.out.println("Initialization is COMPLETE");
	}
}