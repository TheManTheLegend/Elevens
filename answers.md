1. deck, cards, selected cards, replacement cards
2. list all pairs of cards that total to eleven, add the that list any group of J Q and K. Select on group and remove it. Replace all cards removed. this list of groups is empty, you lose, if the board is empty you win.
3. yes
4. a. elevensBoard(), newGame(), 
   b. anotherPlayIsPossible() 
   c. J, 6, 2, A, 4
   d. for(int i = 0; i < cIndex.size(); i++){
   		System.out.println(cIndex.get(i).rank() + " of " + cIndex.get(i).suit() + " (point value = " + cIndex.get(i).pointValue());
   }
   e. anotherPlayIsPossible() because the function needs to look at what cards are on the board before deciding which cards can be removed.