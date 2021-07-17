Cowin App

COWIN APP - MACHINE CODING COUND

Description
Creating an app to allow people to register for vaccinations. In this app, centres can register themselves with the vaccine details. Users can register and make a booking for vaccination.

Features: 

	1.	Vaccinations take place in a centre
	2.	There can be multiple centres
	3.	Each vaccination center has some number of vaccines available Of these two types: COVAX  and COVISHIELD
	4.	User cannot make more than one booking
	5.	With Every Successful booking reduce the inventory
	6.	Users need to be uniquely identified

Requirements:

	1.	Register a User:
		1. register_user(user_details)
		2. user_details: name, gender, preferred vaccineType
		
	2.	Register a centre:
		1.register_centre(centre_details)
		2.Centre_details: centreId, vaccineInventory
		3.vaccineInventory: vaccine_tye x quantity
		
	3. getCentres(user)
		• Rank and Display the Centres which has user’s preferred vaccine available
		• Higher preference to centre with higher quantity of remaining vaccine
		• If Remaining vaccines are same, higher preference to centre with less number of bookings made so far
		• If this is also same, print the selections in any order
   	4. bookslot(user, centerId)
		• Book a slot and return success if booking can be made
		• If booking cannot be made return failure

        5. getStats()
		• Display names of people who have registered and number of available vaccines for each centre with Centre name

Bonus:

	1. Introduce 3 slots(morning, afternoon, evening), There is a max-capacity per slot for each center which will be followed while booking.

Other Details:

	1.	Do not use any database or NoSQL store, use in-memory store for now.  
	2.	Do not create any UI for the application. 
	3.	Write a driver class for demo purposes. Which will execute all the commands at one place in the code and test cases. 
	4.	Please prioritize code compilation, execution and completion. 
	5.	Please do not access the internet for anything EXCEPT syntax. 
	6.	You are free to use the language of your choice. 
	7.	All work should be your own. If found otherwise, you may be disqualified. 
Expectations:

	1.	Code should be demoable (very important) 
	2.	Complete coding within the duration of 90 minutes. 
	3.	Code should handle edge cases properly and fail gracefully. 
	4.	Code should be readable. Follow good coding practices: 
	5.	Use intuitive variable names, function names, class names etc. 
	6.	Indent code properly. 

Sample Test Case:

	User1 - Covax
	User2 - Covishield
	Center1 - Covishield - 5, Covax - 1
	Center2 - Covax - 10


getCentres(User1)

Center2  Covax-10 Center1  Covax - 1

bookslot(User2, Center2) : false
bookslot(User1, Center1) : true

getStats()

Center1:
	Covax 0 Covishield 5
            User1
Center2: 
Covax 10



Bonus:

User 3 : covax
Center1 - Covishield - 5, Covax - 2, maxcapacityperslot -1
Center2 - Covax - 10, maxcapacityperslot - 4


bookSlot(User1, Center1, Morning) : true
bookslot(User3, Center1, Morning) : false
bookslot(User3, Center1, Evening) : true


