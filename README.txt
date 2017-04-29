There are four Client programs - ClientOne, ClientTwo, ClientThree and ClientFour respectively.
Steps to Compile and RUN the programs are given below:

Step 1: Please edit the path given in the code (line 13 and line 14) which specifies the path of 'token' file and 'resource' file in all the Client programs and set it          to the path that works on your computer.

Step 2: COMPILE and RUN the Initialize.java program which sets the value of 'lock' file as '0'.

Step 3: COMPILE and RUN the ClientOne.java program.

Step 4: COMPILE and RUN the ClientTwo.java program.

Step 5: COMPILE and RUN the ClientThree.java program.

Step 6: COMPILE and RUN the ClientFour.java program.

After successfully running all the client programs, the functions can be tested.

NOTE : Once the lock is acquired, Every Client will be given only one chance to edit the resource after which the lock will be released. This technique helps in        minimizing the waiting time for other Clients.