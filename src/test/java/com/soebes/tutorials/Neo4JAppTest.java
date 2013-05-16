package com.soebes.tutorials;

import static org.testng.Assert.assertTrue;

import java.io.File;

import org.testng.annotations.Test;



public class Neo4JAppTest extends TestBase {

    @Test
    public void firstTest() {
        Neo4JApp.main(new String[] { getTargetDir() + File.separatorChar + "neo4j-example" });
        assertTrue(true);
    }
}
