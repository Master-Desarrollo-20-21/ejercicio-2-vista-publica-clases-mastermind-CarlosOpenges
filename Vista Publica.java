@startuml

title Mastermind - Public View - Carlos Cusí

class Mastermind {
	+void main(String[] args)
}
Mastermind *--> Player

class Player {
    -Combination[] secretCombination
    +Combination[] proposedCombination
    -int attempts
    +void start()
	+ Combination proposeCombination()
	+ validateCombination(ProposedCombination)
}

Player -> Combination

class Combination {
	+ boolean isValid()
	+ Result obtainResult()
}

Combination *-up-> Result

class Result {

}

Result *-> "0..4" Success
enum Success {
	* Black
	* White
}


Combination <|-down- Red
Combination <|-down- Orange
Combination <|-down- Yellow
Combination <|-down- Green
Combination <|-down- Blue
Combination <|-down- Purple

@enduml