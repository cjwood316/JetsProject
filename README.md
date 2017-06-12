# Jets Project
## Second-Week Project
### Jacob Wood, Skill Distillery Student


This is my second weeks project. This JetApp allows the user to add a Jet into its current already current line-up of jets, as well as view what jets are already known in the system. With that information the app can print out which jet is the fastest, and which jet can fly the furthest. For ease of use the app takes in the speed of the aircraft in MPH and converts it to mach when the user prints out the jet(s). The app continues to run unless the user selects to quit out of the program.

I had intended on using a Carrier/Hanger class that stored the array of current jets as well as having the funcionality to add another jet to that array by creating a new array one size larger. I ran into some stumbling blocks along the way getting the apps methods to call that information and itterate through the arrays. Then logically I figured my app has knowledge of whatever jets are already known and it can have knowledge of how to add jets into its memory and moved those methods into the JetAppDriver class. I used String.format to change my speed in mph to mach and found that incredibly useful.