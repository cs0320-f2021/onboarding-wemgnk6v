# README


__Project 0: Onboarding__

To build use:
`mvn package`

To run use:
`./run`

To start the server use:
`./run --gui [--port=<port>]`

__Class Structure__ -- The Main class of the project is where execution begins. Main contains the logic of the REPL.
CsvParser is a class that parses a csv file and generates a StarList. A StarList stores a list of Stars. 
StarNeighborCalculator takes in a StarList, the position from which to find the nearest neighbors, and the number of neighbors to find. It finds and prints the k nearest neighbors.

__Errors/Bugs__ -- I did not handle cases where the input file's header line does not conform to the specified format. I also didn't randomly choose the tied star(s) to be returned.

__Tests__ -- JUnit tests for each class are in the test/java folder. Run `./cs32-test src/test/system/stars/*.test` after building to run system tests in the test/system/stars folder. The test names and system test file names describe what's being tested.
