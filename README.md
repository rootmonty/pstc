# PSTAKECARE
Exercises/Tasks

The Project contains two main java classes :
1.TestTheUrl
2.ParseUrl

=> TestTheUrl : Gives you the respective Ids for a given type of URL.It segregates the city,country and locality based domains and respectively gives you their city,country and locality ids from the path given

=> ParseUrl : This class is contained in a directory named UrlParser.It is a script for specific type of URLs which are needed to be parsed for respective ids but under the context of mentioned Surgeries in the domain itself.(for a developer)

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

Repeat the procedure from 14- 18 for UrlParser as well ::(in its directory)
You will get display as ::(enter the url and press enter)
Enter the Url to parse
https://pstakecare.com/category-eye-surgeries-in-andheri-west-mumbai/ci-3-3-1

You will get the desired output
Surgery_Id	3
City_Id	3


