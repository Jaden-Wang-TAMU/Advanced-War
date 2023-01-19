# Advanced War
One of the simplest games one can play with a deck of cards is the game of War.

In War, each player is dealt half the deck at the beginning. Each turn, the players draw the top card of their deck and play it.

Whoever has the card with the highest value wins that card, with the exception that a 2 beats an Ace.

The winner of a round adds their card and the loser's card to the bottom of their deck. Whoever has all the cards in the end wins.

A Jack has a value of 11, a Queen has a value of 12, a King has a value of 13, and an Ace has a value of 14. No Jokers will be used in this game.

Ex: a 6 would beat a 3. A King would beat a 10.

While this game can be fun, its playstyle is very symplistic. The players have no control over what card they play; it's all luck-dependent.

In my advanced version of War, each player will draw the top 4 cards of their deck per turn.

Each player will be able to play 2 out of 4 cards per turn, making their own combos. The goal of the combos is to create a large total value.

Since number cards (cards 1-9) have smaller values than royal cards (Jack through Joker), a pair of number cards' total value will be the two numbers multiplied together.

Ex. A pair of 2 and 3 played will have a total value of 6 while a pair of 9 and 5 will have a total value of 45.

Because the royal cards have larger values, a pair of royals' total value will be the two cards' values added together then multiplied by 2.

Ex. A pair of a Jack and a Queen's total value would be 23\*2 or 46 while a pair of King and Ace would have a total value of 27\*2 or 54.

Lastly, a royal and a number's total value will be the two card's values multiplied together then divided by 2.

Ex. A pair of 7 and Jack's total value would be 77/2 or 38.5 while a pair of 2 and Queen's total value would be 24/2 or 20.

## Task
Given a hand of 4 cards, determine which 2-card combination will yield the largest total value.

## Input
The first line will contain a single integer indicating the number of data sets that follow. Each data set will have four strings, representing each card in the four card hand. There will be no repeats.
Ex. 2 J 7 9

## Output

Print out the two strings from the data sets whose corresponding cards would result in the largest total value. Print the strings in the order they appeared in the data set.

Ex. J 9

## Example Input File
2  
2 J 7 9  
5 K 3 7  

## Example Output to Screen
7 9  
K 7
