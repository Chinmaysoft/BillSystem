![Java](https://i.stack.imgur.com/KSnus.gif)

# Bill System Project
    The bill system is java project to store bill information of customer and it also give subscrition of Netflix, Amazon Prime for one month free.  
---
## Web application 
   > This application create using apache tomcat, jsp, servlets, bootstrap 4 or mysql databases.    

### Table Creation

**User Bill**

>create table userbill(BillNo int primary key
not null Auto_Increment,
BillName varchar(50) not null,
CustomerNo int,
CustomerName varchar(50) not null,
Mobno int,
Amount double,
BillDate datetime default current_timestamp);

**Subscription**

>create table Subscription(BillNo int references userbill,
SubNo int primary key not null Auto_Increment,
Subname varchar(50) not null
);


**Add path in SQLConnection file**
>  for Example Class.forName("oracle.jdbc.driver.OracleDriver"); 

> for Example Connection con=DriverManager.getConnection(  
"jdbc:oracle:thin:@localhost:1521:xe","sys","password");


## **Thank You**