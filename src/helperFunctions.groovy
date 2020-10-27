class helperFunctions {

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
        return sortPlayer
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

}