package com.soebes.tutorials.neo4jexample;

import org.neo4j.graphdb.RelationshipType;

public enum RelationTypes implements RelationshipType {
    KNOWS, 
    WHOKNOWS,
}
