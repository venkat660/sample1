$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("E:/RELAX/ECLIPSE WORK FOLDER/CUCUMBER/Feature/Amazon.feature");
formatter.feature({
  "line": 2,
  "name": "amazon app add to cart placing",
  "description": "",
  "id": "amazon-app-add-to-cart-placing",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "buying a product in amazon",
  "description": "",
  "id": "amazon-app-add-to-cart-placing;buying-a-product-in-amazon",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "user intialize amazon in chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user search for a mobile phone",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user selects a model",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "switching to a new window",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user add item to the cart",
  "keyword": "And "
});
formatter.match({
  "location": "Amazonstepdefinition.user_intialize_amazon_in_chrome_browser()"
});
formatter.result({
  "duration": 13146278600,
  "status": "passed"
});
formatter.match({
  "location": "Amazonstepdefinition.user_search_for_a_mobile_phone()"
});
formatter.result({
  "duration": 5755963900,
  "status": "passed"
});
formatter.match({
  "location": "Amazonstepdefinition.user_selects_a_model()"
});
formatter.result({
  "duration": 6241739800,
  "status": "passed"
});
formatter.match({
  "location": "Amazonstepdefinition.switching_to_a_new_window()"
});
formatter.result({
  "duration": 2000733800,
  "status": "passed"
});
formatter.match({
  "location": "Amazonstepdefinition.user_add_item_to_the_cart()"
});
formatter.result({
  "duration": 1873384800,
  "status": "passed"
});
});