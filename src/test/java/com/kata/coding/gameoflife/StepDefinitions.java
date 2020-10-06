package com.kata.coding.gameoflife;

import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.Arrays;

import static junit.framework.TestCase.assertTrue;

public class StepDefinitions {

    GameOfLife game;
    int[][] grid;
    int[][] res = new int[4][8];

    @Before
    public void init() {
        game = new GameOfLife();
        grid = new int[4][8];
        grid[1][4] = 1;
        grid[2][4] = 1;
        grid[2][3] = 1;
        res[1][3] = 1;
        res[1][4] = 1;
        res[2][3] = 1;
        res[2][4] = 1;
    }

    @When("^: A live cell has less than two neighbours$")
    public void a_live_cell_has_less_than_two_neighbours() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        this.game.findNextGen(grid);
    }

    @Then("^: She dies$")
    public void she_dies() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        assertTrue(Arrays.deepEquals(grid, res));
    }

    @When("^: A live cell has more than three neighbours$")
    public void a_live_cell_has_mor_than_three_neighbours() throws Throwable {
    }

    @When("^: A live cell has two or three neighbours$")
    public void a_live_cell_has_two_or_three_neighbours() throws Throwable {
    }

    @Then("^: She lives on to the next generation$")
    public void she_lives_on_to_the_next_generation() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("^: A dead cell has exactly three live neighbours$")
    public void a_dead_cell_has_exactly_three_live_neighbours() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("^: She becomes a live cell$")
    public void she_becomes_a_live_cell() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }
}
