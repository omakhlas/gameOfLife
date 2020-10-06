Feature: calculate the next generation of Conway's game of life
  Scenario: live cell with fewer than two live neighbours
    When : A live cell has less than two neighbours
    Then : She dies

  Scenario: live cell with more than three live neighbours
    When : A live cell has mor than three neighbours
    Then : She dies

  Scenario: live cell with two or three live neighbours
    When : A live cell has two or three neighbours
    Then : She lives on to the next generation

  Scenario: dead cell with exactly three live neighbours
    When : A dead cell has exactly three live neighbours
    Then : She becomes a live cell