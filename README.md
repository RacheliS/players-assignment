# Playesrs-Intuit-Assignment


<b>Introduction:</b><br/>
welcome to my players Application :)   
this application load data from csv resource file after the initialization of bean properties by @PostConstruct annotation & provides 2 endpoint .

<br/>
 <b>Project's technologies:<br/></b>
•	Java 17 <br/>
•	Maven 3.6.0 <br/>
•	Spring Boot, Spring web, Spring Data Jpa <br/>
•	Lombok.<br/>
•	Mockito<br/>
•	Junit <br/>
•	H2database<br/>
•	opencsv<br/>


<br/>
<b>To run the application: </b><br/>
  Run PlayersApplication <br/>
  Run PlayersApplicationTests for run testing<br/>
 <br/>
<b>Player rest controller implements api :</b>

1.	getAllPlayer
	<br/> <b> Get:</b> http://localhost:8080/api/players
 <br/><b> Response: (Status 200.ok) </b>
  ```
   [{"playerID":"aardsda01","birthYear":"1981","birthMonth":"12","birthDay":"27","birthCountry":"USA","birthState":"CO","birthCity":"Denver","deathYear":"","deathMonth":"","deathDay":"","deathCountry":"","deathState":"","deathCity":"","nameFirst":"David","nameLast":"Aardsma","nameGiven":"David Allan","weight":"215","height":"75","bats":"R","throwsType":"R","debut":"2004-04-06","finalGame":"2015-08-23","retroID":"aardd001","bbrefID":"aardsda01"},{"playerID":"aaronha01","birthYear":"1934","birthMonth":"2","birthDay":"5","birthCountry":"USA","birthState":"AL","birthCity":"Mobile","deathYear":"","deathMonth":"","deathDay":"","deathCountry":"","deathState":"","deathCity":"","nameFirst":"Hank","nameLast":"Aaron","nameGiven":"Henry Louis","weight":"180","height":"72","bats":"R","throwsType":"R","debut":"1954-04-13","finalGame":"1976-10-03","retroID":"aaroh101","bbrefID":"aaronha01"}, 
   -- and all players .. 
```
2.	getPlayerById  
	<br/> <b> Get:</b> http://localhost:8080/api/players/aardsda01
 <br/><b> exist player -  Response: (Status 200.ok) </b>
  ``` {"playerID":"aardsda01","birthYear":"1981","birthMonth":"12","birthDay":"27","birthCountry":"USA","birthState":"CO","birthCity":"Denver","deathYear":"",
  "deathMonth":"","deathDay":"","deathCountry":"","deathState":"","deathCity":"","nameFirst":"David","nameLast":"Aardsma","nameGiven":"David Allan","weight":"215","height":"75","bats":"R","throwsType":"R","debut":"2004-04-06","finalGame":"2015-08-23","retroID":"aardd001","bbrefID":"aardsda01"}
  ```
  <br/><b>not exist player -  Response: (Status 400.Not Found) </b>
   ```  {"timestamp":"2023-04-20T07:18:18.087+00:00","status":404,"error":"Not Found","path":"/payments/services/getPayment/12354"} ```
<br/>
<b>What's Next? </b><br/>
• Run the Spring project in a containerized Java & Maven Docker environment.<br/>
• Change db for noSql db like mongoDb .<br/>
• Create Api with pagination option for large data.<br/>


<b>** attach collection file to test api using Post man **</b>


