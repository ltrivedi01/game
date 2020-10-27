
//Define helperFunction class
hp = new helperFunctions();

def listOfPlayerScore = Eval.me(hp.getUserInput("Enter list of players score [x,x,]:"))

def scoreHighestRank = hp.getUserInput("Enter highest selection of rank based on score:").toInteger()

//sort players
def  sortPlayer = hp.sortPlayers(listOfPlayerScore, scoreHighestRank)
println("Sorted player:" + sortPlayer)

//Rank the player
def listOfPlayersRank = hp.rankPlayers(sortPlayer)
println("List of players rank:" + listOfPlayersRank)

//Count number of selected players based on highest rank
def numberOfSelectedPlayers = hp.getNumberOfSelectedPlayers(listOfPlayersRank, scoreHighestRank)
println("Number of selected players based on score highest rank: " + numberOfSelectedPlayers)









