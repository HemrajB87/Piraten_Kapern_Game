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
    * `java -jar target/piraten-karpen-jar-with-dependencies.jar` 

Remark: **We are assuming here you are using a _real_ shell (e.g., anything but PowerShell on Windows)**

## Feature Backlog

 * Status: 
   * Pending (P), Started (S), Blocked (B), Done (D)
 * Definition of Done (DoD):
   * < Your DoD goes here >

### Backlog 

| MVP? | Id  | Feature  | Status  |  Started  | Delivered |
| :-:  |:-:  |---       | :-:     | :-:       | :-:       |
| x   | F01 | Calculating points of 2 players in one game with re-rolling three dice out of eight each becoming skulls thus ending player round |  S | 01/01/23 |  |
| x   | F02 | Simulation of 1 game with fixed 8 dice roll,  fixed points , no re-rolling  |  B (F01) |   |
| x   | F03 | Simulation of 1 games with fixed 8 dice roll, diamond/gold award points, no re-rolling |  P  |   |
| x   | F04 | Simulation of 1 gamee with random 8 dice roll, diamond/gold points , randomly re-rolling dice except "SKULL" dice | P | |
| x   | F05 | Simulation of 42 games with random 8 dice roll, diamond/gold and combo's of faces award points , randomly re-rolling dice except "SKULL" dice | B (F02) | 
| x   | F06 | Simulation of 42 games with random 8 dice roll, diamond/gold and combo's of faces award points , re-rolling specific dice except "SKULL" dice to maximize combo's | B (F02) |
| x   | F07 | Simulation of 42 games with random 8 dice roll, diamond/gold and combo's of faces award points , re-rolling specific dice except "SKULL" dice to maximize combo's, adding 3 cards drawn each turn (NOP, SEA BATTLE, MONKEY BATTLE) | B (F02) |
| x   | F08 | Simulation of 42 games with random 8 dice roll, diamond/gold and combo's of faces award points , re-rolling specific dice except "SKULL" dice to maximize combo's, adding 3 cards drawn each turn (NOP, SEA BATTLE, MONKEY BATTLE), cards have functions | B (F02) |








| ... | ... | ... |

