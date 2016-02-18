# BSG_Assignment

It's a Java program using Spring and Maven that is a client/server socket based application that will read the content 
of a file and stream the content of the file to the client. The client must simply output the content of the file to the
console using System.out. The client must be able to run in a standalone mode (non-network mode) or in a remote mode.

Additionally the client must be designed in a way that we can print the output to a console but must be interchangeable
where if requirements change we can persist the response to file or persist the response to a database.

Overall Architecture
 Client sends a request with a path to any file on the server
 Server reads the file and responds back with the content
 Client outputs the content to the console

Major Components
The main architecture of the application must be a traditional client-server system. 
There are three key parts: the server-side, the client-side, and the network connection between the two.

Non-Network Mode
The program must be able to work in a non-networked mode. 
In this mode, the server and client must run in the same VM and must perform no networking, must not use loopback 
networking i.e: no “localhost” or “127.0.0.1”, and must not involve the serialization of any objects when communicating 
between the client and server components.

The operating mode is selected using the single command line argument that is permitted.

Network Communication Approach
You must use a socket connection and define a protocol.
Keep in mind that networking must be entirely bypassed in the non-network mode.
