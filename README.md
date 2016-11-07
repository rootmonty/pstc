# PSTAKECARE
Exercises/Tasks

The Project contains the following java class:
1.TestTheUrl

=> TestTheUrl : Gives you the respective Ids for a given type of URL.It segregates the city,country and locality based domains and respectively gives you their city,country and locality ids from the path given

Instructions to run the script::

Compile the TestTheUrl class::
$ javac TestTheUrl.java

build the file
$ java TestTheUrl

After Running it will ask you for an URL:: Press enter after giving the input
Enter the Url to parse(Give the URL)
http://pstakecare.com/surgery/bangalore-3/koramangala-148/cataract-extraction-799

You will get the desired output
Surgery_Id	799
City_Id	  3
Locality_Id	148

Another Example::

Enter the Url to parse
https://pstakecare.com/category-eye-surgeries-in-andheri-west-mumbai/ci-3-3-1

You will get the desired output
Surgery_Id	3
City_Id	3


