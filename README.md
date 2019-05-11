# XPRESSPASS
This is an application coded in Java, for solving the Gate Pass Problem of the institutes.
It has various features like LAN(Local Area Network) connectivity, saving pass issue time, exit time, pass is valid only for a limited time period etc. that makes it different from other softwares.
It has 4 views in it-
Student,
Authority,
Admin,
Security.
These all views or systems are connected to each other via LAN.There is a centralized Database which is shared between all systems.
All views have its own features.

Student-> Student can generate the pass from any system in which Student view is present but he will have to verify his pass id only by his respective department. If Student has issued a pass atleast once then he will not have to fill his details again. There is a search button available in the right side of Student ID field. As soon as he will press the search button by entering his ID, the details of his last pass will be filled in the fields and he will be able to edit them. Now taking his pass ID, he will go to his respective Authority office for pass verification.

Authority-> As soon as Head of Department will enter the pass ID of Student in his system, it will get all the details of the Student if Student is of respective department otw it will get a corresponding error pop up. 
