package com.soebes.tutorials;

import org.testng.annotations.Test;

import com.soebes.tutorials.neo4jexample.Neo4JApp;


public class Neo4JAppTest extends TestBase {

    @Test
    public void FirstLaden() {
        Neo4JApp.main(new String[] { getTargetDir() });
    }
}