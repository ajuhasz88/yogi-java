Split and Query: Batching Student Data Within URL Limits 


Scenario: 

You are given a list of classrooms. Each classroom has a list of student names. You need to query an API for each classroom's students, but the API has a maximum query string size limit of 1024 bytes. 

The API endpoint looks like: 

GET https://example.com/students/info?name=John&name=Jane&name=Ali 

But the full URL (including the base URL and query string) must not exceed 1024 bytes. 



Your Task (for the candidate): 

For each classroom, fetch student information using the mock API. 

Each query string must not exceed 1024 bytes. If there are too many students, split the calls into multiple requests. 

Aggregate all results for a classroom and return them together. 

The final method should return a Map<String, List<StudentInfo>> where: 

String is the classroom name. 

List<StudentInfo> is the list of student information returned from the API. 

 

Requirements: 

You must encode names as part of the query string (URLEncoder.encode). 

You should simulate/mock the API call in your code (use a local method that simulates a network call). 

Focus on correctness and efficient splitting logic. 



Example Input: 

Map<String, List<String>> classrooms = Map.of( 

    "A", List.of("John", "Jane", "Alex", "Michael", "Samantha"), 

    "B", List.of("Tom", "Jerry", "Ali", "Eve", "Adam", "Ahmet", ...) 

); 


Expected Output: 

For each classroom, a complete list of StudentInfo instances returned from potentially multiple API calls due to URL size restrictions. 
 

Bonus: 

Can you make the request logic generic to accept any max URL size? 

Can you parallelize API calls per classroom? 
