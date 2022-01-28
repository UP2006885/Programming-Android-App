# Testing & Design document

## Testing

**STUDENT NAME:** Harry Seymour  
**STUDENT ID:** UP2006885  
**DATE:** Wednesday 26th January 2022 13:58

Test ID|Test Description|Test Data|Expected Result|Actual Results|
|:-|----|--|--|--|
|1|What happens if the user trys to input a choice unavailable.|Int: 4|The program asks the user to re-input a choice|No error message is outputted but that program due to its exception statements resends the msg asking for the input again.|
|2|What happens if the user trys to input a choice unavailable.|String: "Five"|The program asks the user to re-input a choice|The program crashes due to the unexpected data type.|
|3|What happens if the user trys to chose the 3rd node when its not available.|Int: 3|The program says unavailable choice.|The program outputs an "Invalid choice" msg and asks the user to press enter to start again.|
|4|Can you navigate to node 8 (WIN)|Int: 2, 1, 1, 1, 1, 1|It should be possible to win the application my following this path.|The Program allows the user to follow this path and the result is that a win msg is outputted once the user reaches the winning node.|
|5|What happens if you continuously sleep in and dont wake up| Int: 1 (Looped)|The program should allow the user to sleep for aslong as they like as theres no set limit on choices.|The program allows the user to sleep continously (Tested 32 times)|
|6|What happens when you win the program and press enter? |Enter|The program should restart at node 0 for the user to play again.|The program after outputting the msg "You have obtained milk" allows the user to press enter again and starts again at node 0.|
|7|What happens if like stated in the Decision Map you are unable to repick John? Is it possible to lose. |Int: 2, 1, 2, 1, 2|The program should stop the user from asking John again for milk|The program outputs a failed msg and resets to node 0.|
|8|Can you navigate to node 20 (WIN) by talking to John and then being told to talk to Archey.|Int: 2, 1, 2, 1, 1, 1|It should be possible to win the application my following this path.|The Program allows the user to follow this path and the result is that a win msg is outputted once the user reaches the winning node.|
|9|Can you navigate to node 20 (WIN) by going directly to Archey |Int: 2, 1, 2, 1, 1, 1|It should be possible to win the application my following this path.|The Program allows the user to follow this path and the result is that a win msg is outputted once the user reaches the winning node.|
|10|Can you navigate to node 14 (WIN)|Int: 2, 1, 2,2, 1|It should be possible to win the application my following this path.|The Program allows the user to follow this path and the result is that a win msg is outputted once the user reaches the winning node.|
|11|What happens if the user trys to continuously input enter as the choice.|Enter*10, Int: 2.|The program asks the user to re-input a choice|The program waits for the user to input a valid input without outputting any error msgs or resending a msg.|

### Testing Evidence

*Testing evidence can be found by using the TestID*  

## Design Methodology

After completing my decision map I was able to think in depth about what the front end would require to enable the user to complete the required paths/operations.
I started by designing some Figma design frames for my Splash screen, Objective page & Interaction screen.

**I thought about 3 key statments when designing my frames which would be used for my front end:**
1. The application should be simple to use and easy to understand.
2. The application must be able to handle the back end and have the appropriate events handlers to make that possible.
3. The application should display all the information the user requires to make a informed choice on which path to take.

**I though about what type of colour pallet would be suited towards my application:**
* I decided on a blue and white colour pallet which would be visually appealing as it is soothing to the eyes, and fits the theme of milk, this is because:
    1. Milk is usually white.
    2. One of the most popular choices of milk is "Whole milk" which is usually represented with a blue accent coloured container by most brands.

### High-Quality Figma Frames

|Splash Screen|Objective Page|Interaction Screen|
|:-:|:-:|:-:|
|![SplashScreen](../Images/Figma-Frames/splash/High.svg)|![ObjectiveScreen](../Images/Figma-Frames/objective/High.svg)|![MainInteractionScreen](../Images/Figma-Frames/interaction/High.svg)|

## Considerations
Unfortuantly you cant just import SVGs into android studio and have them interactive, they can only be imported as backgrounds non interactive.  This meant I was required to make more simplistic frames which could be imported and used as the backgrounds for my application Empty Activitys. 

### Simplified Figma Frames

|Splash Screen|Objective Page|Interaction Screen|
|:-:|:-:|:-:|
|![SplashScreen](../Images/Figma-Frames/splash/Low.svg)|![ObjectiveScreen](../Images/Figma-Frames/objective/Low.svg)|![MainInteractionScreen](../Images/Figma-Frames/interaction/Low.svg)|
