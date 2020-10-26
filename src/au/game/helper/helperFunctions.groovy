package au.game.helper

class helperFunctions {

    //Function to get User Input
    static getUserInput(def text) {
        println text

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in))
        def UserInput = br.readLine()
        println "You entered: $UserInput"
        return UserInput
    }
}