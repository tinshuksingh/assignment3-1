# Dominos-Pizza-scala
Implementation of the back-end framework of a leading pizza vendor- Dominos. Pure immutability has been taken into consideration
===================================================================================
We are going to build a Dominos online Pizza maker.
Pizza(these are the available pizza and their default toppings).

• Margherita (Rs. 150)
o Toppings = tomato
• Hawaiian Delight (Veg Rs. 200) (Non Veg. Rs. 220)
o Veg Toppings = Baby Corn, Pineapple and Jalapeno
o Non Veg. Toppings = Chicken Salami, Pineapple and Jalapeno
• Veggie Paradise (Rs. 230)
o Toppings = Baby Corn, Olives, Capsicum and Paprika
• Peppy Paneer (Rs. 230)
o Toppings = Paneer, Capsicum and Paprika
• Zesty Chicken (Rs. 280)
o Toppings = Chicken Sausage, Barbeque Chicken, Capsicum and Paprika
• Chicken Maxicana (Rs. 300)
o Toppings = Onion, Tomato, Paprika and Spicy Chicken


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

Crusts
• Pan Pizza (Rs. 100)
• Thin Crust (Rs. 150)
• Regular (Rs. 0)
• Cheese Burst (Rs. 200)

Tax
• VAT: 10%
• Service Tax: 15%
User stories:
• As a user I must be able to select one or more pizza of my choice and the system must give me the total cost of the Order.
• As a User I can select one or more pizza, add toppings and the system must give me the total cost of the Order (The system
doesn’t allow to change the default toppings). • As a User I can select one or more pizza, add toppings and also can change crust and the system must give me the total cost of the order.

Input:
Order #1: I have a party at my place and 1 person is veg for him I may order Veggie paradise and 3 non-veg eaters so probably I’ll< order one zesty chicken and one Chicken Maxicana. 
Order #2: Order with change of some toppings With Veg Hawaiian Delight I want some Olives and extra Cheese and please make the Pan Crust. Add also make one Non Veg Hawaiian delight with added barbeque chicken and cheese Burst.

System Change 1:
• With the user demand we have to change the system, now user is allowed to remove the default toppings on the pizza and add other toppings, select a favorite crust and system must be able to give a provision to make his/her own pizza and give the total cost of the order.
Input:
Order #3: Mega Party order but need some customization. 
• 4 Panner papper two of them not having capsicum instead I want Olives and baby corn and remaining two with just extra cheese. Please make all four thin crust.
• One Margherita and One veg Hawaiian Delight
• One Zesty Chicken cheese burst with no paprika and added baby corn, olives and onion.



System Change 2:
• With the growth of customers there was a rising demand on the size of pizza, people started asking for different size of pizza so they can buy as per their requirement.
• System need changed to accommodate three different sizes small, medium and large plus few more pizzas.
• Apart from small All other pizzas were allowed for customization with respect to toppings and crust with one more exception the cheese burst was only available with and medium size pizza.
Small Medium Large
Margherita 80 150 300
Veg. Hawaiian Delight 100 200 400
Non Veg Hawaiian Delight 110 220 440
Veggie Paradise 115 230 460
Peppy Paneer 115 230 460
Zesty Chicken 140 280 560
Chicken Maxicana 150 300 600
Seventh Heaven (Smoked Chicken, Pepper and Jalapeno) 125 250 500
Cloud 9 (Onion, Tomato, Panner, capsicum and Jalapeno) 120 240 480
Input:
Order #4: Family party, ordering different variety and size of pizza.
• 4 Cloud 9 two of them not having capsicum instead I want Olives and baby corn and remaining two with just extra cheese. Please
make two thin crust medium size, one small and one large.
• One Seventh Heaven with extra smoked chicken and cheese and large please
• One small veg Hawaiian Delight
• One Medium Zesty Chicken cheese burst with no paprika and added baby corn, olives and onion.
