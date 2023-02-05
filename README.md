# A1 - Piraten Karpen

  * Author: < Hemraj Bhatt >
  * Email: < bhatth14@mcmaster.ca >

## Build and Execution

  * To clean your working directory:
    * `mvn clean`
  * To compile the project:
    * `mvn compile`
  * To run the project in development mode:
    * `mvn -q exec:java` (here, `-q` tells maven to be _quiet_)
  * To package the project as a turn-key artefact:
    * `mvn package`
  * To run the packaged delivery:
    * `java -jar target/piraten-karpen-jar-with-dependencies.jar args[0] args[1] args[2]`
    * args[0] and args[1] can be "combo" or "random", this denotes the strategies of the two players
    * args[2] can be "trace", "true" or "false"
    * Both "trace" and "true" allow for logging of games in .log file 
    * "false" means logging of games will not occur in .log file

Remark: **We are assuming here you are using a _real_ shell (e.g., anything but PowerShell on Windows)**

## Feature Backlog

 * Status: 
   * Pending (P), Started (S), Blocked (B), Done (D)
 * Definition of Done (DoD):
   * A feature is done when its intended function is complete and performs accurately

### Backlog 

| MVP? | Id  | Feature  | Status  |  Started  | Delivered |
| :-:  |:-:  |---       | :-:     | :-:       | :-:       |
| x   | F01 | Calculating points of 2 players in one game with re-rolling three dice out of eight each becoming skulls thus ending player round |  D | 01/01/20 | 01/01/23  |
| x   | F02 | Simulation of 1 game with fixed 8 dice roll,  fixed points , no re-rolling  |  D |  01/24/23 | 01/26/23  |
| x   | F03 | Simulation of 1 games with fixed 8 dice roll, diamond/gold award points, no re-rolling |  D  | 01/24/23 | 01/26/23 |
| x   | F04 | Simulation of 1 gamee with random 8 dice roll, diamond/gold points , randomly re-rolling dice except "SKULL" dice | D | 01/26/23 | 01/27/23 |
| x   | F05 | Simulation of 42 games with random 8 dice roll, diamond/gold and combo's of faces award points , randomly re-rolling dice except "SKULL" dice | D |01/27/23|01/28/23| 
| x   | F06 | Simulation of 42 games with random 8 dice roll, diamond/gold and combo's of faces award points , re-rolling specific dice except "SKULL" dice to maximize combo's | D |01/28/23|01/29/23|
| x   | F07 | Simulation of 42 games with random 8 dice roll, diamond/gold and combo's of faces award points , re-rolling specific dice except "SKULL" dice to maximize combo's, adding 3 cards drawn each turn (NOP, SEA BATTLE, MONKEY BATTLE) | D|01/30/23|01/31/23|
| x   | F08 | Simulation of 42 games with random 8 dice roll, diamond/gold and combo's of faces award points , re-rolling specific dice except "SKULL" dice to maximize combo's, adding 3 cards drawn each turn (NOP, SEA BATTLE, MONKEY BATTLE), cards have functions | D |02/01/23|02/03/23|








| ... | ... | ... |

