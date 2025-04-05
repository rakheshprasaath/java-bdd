Feature:search and place order of the products on amazon

Scenario: Search Experience for product

Given User is on amazon Landing page
When user searched with name "Mutti Parma Pelati Whole Peeled Tomatoes Italian, 14.11 oz ℮ 400 g" and extracted actual name of the product
Then user searched with shortname in offers page to check if product exist