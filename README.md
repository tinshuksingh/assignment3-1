<<<<<<< HEAD
# Dominos-Pizza-scala
Implementation of the back-end framework of a leading pizza vendor- Dominos. Pure immutability has been taken into consideration
===================================================================================
We are going to build a Dominos online Pizza maker.<br/>
Pizza<br/>(these are the available pizza and their default toppings).
<table>
• Margherita (Rs. 150)<br/>
o Toppings = tomato<br/>
• Hawaiian Delight (Veg Rs. 200) (Non Veg. Rs. 220)<br/>
o Veg Toppings = Baby Corn, Pineapple and Jalapeno<br/>
o Non Veg. Toppings = Chicken Salami, Pineapple and Jalapeno
• Veggie Paradise (Rs. 230)
o Toppings = Baby Corn, Olives, Capsicum and Paprika
• Peppy Paneer (Rs. 230)
o Toppings = Paneer, Capsicum and Paprika
• Zesty Chicken (Rs. 280)
o Toppings = Chicken Sausage, Barbeque Chicken, Capsicum and Paprika
• Chicken Maxicana (Rs. 300)
o Toppings = Onion, Tomato, Paprika and Spicy Chicken
</table>

<table>
Toppings
• Tomato (Rs. 10)
• Baby Corn (Rs. 10)
• Pineapple (Rs. 20)
• Jalapeno (Rs. 15)
• Chicken Salami (Rs. 95)
• Olives (Rs. 15)
• Capsicum (Rs. 10)
• Paprika (Rs. 30)
• Panner (Rs. 80)
• Chicken Sausage (Rs. 110)
• Barbeque Chicken (Rs. 100)
• Spicy Chicken (Rs. 90)
• Onion (Rs. 10)
• Cheese (Rs. 20)
• Smoked Chicken (Rs. 150)
</table>
Crusts<br/>
• Pan Pizza (Rs. 100)<br/>
• Thin Crust (Rs. 150)<br/>
• Regular (Rs. 0)<br/>
• Cheese Burst (Rs. 200)<br/>

Tax<br/>
• VAT: 10%<br/>
• Service Tax: 15%<br/>
User stories:<br/>
• As a user I must be able to select one or more pizza of my choice and the system must give me the total cost of the Order.<br/>
• As a User I can select one or more pizza, add toppings and the system must give me the total cost of the Order (The system
doesn’t allow to change the default toppings). • As a User I can select one or more pizza, add toppings and also can change crust and the system must give me the total cost of the order.<br/>

Input:<br/>
Order #1: I have a party at my place and 1 person is veg for him I may order Veggie paradise and 3 non-veg eaters so probably I’ll< order one zesty chicken and one Chicken Maxicana. <br/>
Order #2: Order with change of some toppings With Veg Hawaiian Delight I want some Olives and extra Cheese and please make the Pan Crust. Add also make one Non Veg Hawaiian delight with added barbeque chicken and cheese Burst.<br/>

System Change 1:<br/>
• With the user demand we have to change the system, now user is allowed to remove the default toppings on the pizza and add other<br/> toppings, select a favorite crust and system must be able to give a provision to make his/her own pizza and give the total cost of the order.<br/>
Input:
Order #3: Mega Party order but need some customization. <br/>
• 4 Panner papper two of them not having capsicum instead I want Olives and baby corn and remaining two with just extra cheese. Please make all four thin crust.<br/>
• One Margherita and One veg Hawaiian Delight<br/>
• One Zesty Chicken cheese burst with no paprika and added baby corn, olives and onion.<br/>



System Change 2:<br/>
• With the growth of customers there was a rising demand on the size of pizza, people started asking for different size of pizza so<br/> they can buy as per their requirement.<br/>
• System need changed to accommodate three different sizes small, medium and large plus few more pizzas.<br/>
• Apart from small All other pizzas were allowed for customization with respect to toppings and crust with one more exception the<br/> cheese burst was only available with and medium size pizza.<br/>
Small Medium Large<br/>
Margherita 80 150 300<br/>
Veg. Hawaiian Delight 100 200 400<br/>
Non Veg Hawaiian Delight 110 220 440<br/>
Veggie Paradise 115 230 460<br/>
Peppy Paneer 115 230 460<br/>
Zesty Chicken 140 280 560<br/>
Chicken Maxicana 150 300 600<br/>
Seventh Heaven (Smoked Chicken, Pepper and Jalapeno) 125 250 500<br/>
Cloud 9 (Onion, Tomato, Panner, capsicum and Jalapeno) 120 240 480<br/>
Input:<br/>
Order #4: Family party, ordering different variety and size of pizza.<br/>
• 4 Cloud 9 two of them not having capsicum instead I want Olives and baby corn and remaining two with just extra cheese. Please<br/>
make two thin crust medium size, one small and one large.<br/>
• One Seventh Heaven with extra smoked chicken and cheese and large please<br/>
• One small veg Hawaiian Delight<br/>
• One Medium Zesty Chicken cheese burst with no paprika and added baby corn, olives and onion.<br/>
=======
# assignment3
Dominoz Pizza Assignment
>>>>>>> 133d00ce0bffe69ad673dde723c46c47d9661883
