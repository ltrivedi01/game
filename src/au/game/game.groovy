import au.game.helper.helperFunctions

//def listOfPlayerScore = []
//def scoreHighestRank
//def playerScore


def listOfPlayerScore = Eval.me(getUserInput("Enter list of players score [x,x,]:"))

def scoreHighestRank = getUserInput("Enter highest selection of rank based on score:").toInteger()

def playerScore = sortPlayers(listOfPlayerScore, scoreHighestRank)


//Function to get User Input
static getUserInput(def text) {
    println text

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in))
    def UserInput = br.readLine()
    println "You entered: $UserInput"
    return UserInput
}

//Function to sort players
static sortPlayers(listOfPlayerScore, def scoreHighestRank) {
    //Sort the player
    def sortPlayer = listOfPlayerScore.sort()
    println("Sorted player:" + sortPlayer)

    //Rank the player
    def listOfPlayersRank = rankPlayers(sortPlayer)
    println("List of players rank:" + listOfPlayersRank)

    //Count number of selected players based on highest rank
    def numberOfSelectedPlayers = getNumberOfSelectedPlayers(listOfPlayersRank, scoreHighestRank)
    println("Number of selected players based on score highest rank: " + numberOfSelectedPlayers)
}

static rankPlayers(sortPlayer) {
    //Rank the player
    def listOfPlayersRank = []
    def rank = 1
    def previousItem = sortPlayer.get(0)
    for (item in sortPlayer) {
        if (item == previousItem) {
            listOfPlayersRank.add(rank)
        } else {
            listOfPlayersRank.add(rank + 1)
            rank++
        }
        previousItem = item

    }
    return listOfPlayersRank

}

static getNumberOfSelectedPlayers(listOfPlayersRank, scoreHighestRank) {
    def numberOfSelectedPlayer = 0
    for (item in listOfPlayersRank) {
        if (item <= scoreHighestRank) {
            numberOfSelectedPlayer = numberOfSelectedPlayer + 1
        }
    }
    return numberOfSelectedPlayer
}






