# Battleship-game_withAI
The updated version of the Battleship-game I made, with a simple AI I build by myself
This game is an updated version of the first Battleship-game I made.
In this game, I build a simple AI, that can behave like a human.

# Set up the map
Firstly, the game will be initialized and a 10*10 grid will be generated.
Both players and the computer cannot see each other's ships directly. They need to try on each blocks and see whether there is a ship in this block or not.

*what the initializing looks like.


As the picture above, players and computer cannot see other's ships locations. They need to try attack blocks and find out whether there are ships or not.

*testing pictures


The picture above is a testing process I made. I generate ships and let the AI I made to try to hit them. At first, when the AI hits nothing, it will randomly
hit the blocks that it does not hit before. Once it hits a ship, it will hit the possible blocks that the rest of the ship might be. If it hits a new ship during this procedure, it will remeber that and after it hits the recent ships all, it will hit that ship and continuing the process, untill all ships are cleared.
