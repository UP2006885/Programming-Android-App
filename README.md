# Programming-Android-App
Repository for my Android app for M30235 PAPL

## Overview of Project

### Task 1 - Map and Specification of Project

#### Decision Map

![DecisionMap](DecisionMap/Updated%20Decision%20Map.svg)

#### CSV for the Decision Map

```
0,0,1,-1,You wake up,Do you sleep in?
1,2,16,-1,You try to make breakfast but are out of milk,Do you ask roommate 1 John for some money for milk?
2,3,8,-1,John then asks who last drank the milk,Do you tell John Finley drank the milk last?
3,4,1,-1,John tells you to phone Finley and that if he doesnt pick up to ask Archey instead,Do you phone Finley?
4,5,1,-1,Finley picks up and asks what do you want,Do you tell Finley he last drank the milk?
5,6,7,-1,Finley says he will pick up the milk,50% Chance pick Yes or No
6,32,32,32,Finley arrives home with the milk,-
7,32,32,32,Finley forgets the milk but offers to give you the money for milk,-
8,17,9,-1,-,Do you tell John Archey drank the milk last?
9,10,11,-1,-,Do you tell John You drank the milk last?
10,32,32,32,John offers to buy you the milk,-
11,12,13,-1,-,Do you tell John he drank the milk last?
12,18,33,3,John tells you he is a vegan and does not drink milk He says to ask Archey for money,Do you ask Archey for money?
13,14,15,-1,-,Do you tell John you dont remember who drank the milk last?
14,18,33,-1,John says he brought the milk last time and it is time Archey pays,Do you ask Archey for money?
15,18,33,33,You are out of choices and are sent away by John your only choice is to ask Archey,Do you ask Archey?
16,18,1,-1,You try to make breakfast but are out of milk,Do you ask roommate 2 Archey for some money for milk?
17,18,33,33,You have been told to ask Archey for Milk,Do you ask Archey for money for milk?
18,19,20,-1,You decided to ask Archey for milk he then asks who last drank the milk,Do you tell Archey he last drank the milk?
19,32,32,32,Archey offers to buy some milk,-
20,21,22,-1,-,Do you tell Archey You dont remeber who drank the milk last?
21,1,1,1,Archey tells you to ask someone else for the milk,-
22,23,24,1,-,Do you tell Archey You drank the milk last?
23,1,1,1,Archey says he is busy and to ask someone else,-
24,25,26,-1,-,Do you tell Archey John drank the milk last?
25,1,1,1,Archey tells you to ask John for money,-
26,28,27,-1,-,Do you tell Archey Finley drank the milk last?
27,2,33,33,You are out of choices and are sent away by Archey your only choice is to ask John,Do you ask John?
28,29,30,-1,You ask Finley who just arrived home for money,50% Chance pick Yes or No?
29,32,32,32,Finley says he will give you the money for milk,-
30,31,33,-1,Finley says he has no money,Do you ask him if he is able to transfer you money with his card?
31,32,32,32,Finley says he will transfer the money,-
32,0,0,0,You have obtained the Milk and win the game,-
33,0,0,0,You were unable to obtain the Milk and lost the game,-
```
