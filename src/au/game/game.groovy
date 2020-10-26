package au.game

def numberOfPlayer
def listOfPlayerScore = []
def scoreHighestRank
def playerScore

//numberOfPlayer = getUserInput("Enter number of players:")

listOfPlayerScore = Eval.me(getUserInput("Enter list of players score [x,x,]:"))

scoreHighestRank = getUserInput("Enter highest selection of score:").toInteger()

playerScore = sortPlayers(listOfPlayerScore, scoreHighestRank)

static getUserInput(def text) {
    println text

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in))
    def UserInput = br.readLine()
    println "You entered: $UserInput"
    return UserInput
}

static sortPlayers(listOfPlayerScore, def highersScore) {
    def numberOfSelectedPlayer = 0
    for (item in listOfPlayerScore){
        if (item < highersScore){
            numberOfSelectedPlayer = numberOfSelectedPlayer + 1
        }
    }
    println("Number of selected players: " + numberOfSelectedPlayer)

}







