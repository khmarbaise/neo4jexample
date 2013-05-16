package com.soebes.tutorials;

import org.neo4j.graphdb.RelationshipType;

public enum RelationTypes implements RelationshipType {
    KNOWS, 
    WHOKNOWS,
}
