MOCKMVC ADDITION TEST - ECLIPSE IMPORT INSTRUCTIONS

Requirements:
- JDK 17
- Eclipse IDE with Maven support (or Spring Tool Suite)

Import:
1. Extract this ZIP file.
2. Open Eclipse.
3. Select File > Import.
4. Select Maven > Existing Maven Projects, then Next.
5. Browse to the extracted MockMvcTest folder.
6. Select the pom.xml project and click Finish.
7. Wait for Maven dependencies to download.

Run the test:
1. Expand src/test/java.
2. Open com.example.mockmvctest > AdditionControllerTest.java.
3. Right-click the file.
4. Select Run As > JUnit Test.
5. Expected: 1 test, 0 failures, 0 errors (green JUnit bar).

Expected response:
MS 1.1 - Addition = 0

Note:
You do not need to start the main application separately. @WebMvcTest starts the MVC test slice with MockMvc.
