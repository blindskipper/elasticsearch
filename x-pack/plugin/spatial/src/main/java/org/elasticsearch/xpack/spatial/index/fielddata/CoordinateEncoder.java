/*
 * Copyright Elasticsearch B.V. and/or licensed to Elasticsearch B.V. under one
 * or more contributor license agreements. Licensed under the Elastic License;
 * you may not use this file except in compliance with the Elastic License.
 */

package org.elasticsearch.xpack.spatial.index.fielddata;

/**
 * Interface for classes that help encode double-valued spatial coordinates x/y to
 * their integer-encoded serialized form and decode them back
 */
public interface CoordinateEncoder {

    CoordinateEncoder GEO = new GeoShapeCoordinateEncoder();

    /** encode X value */
    int encodeX(double x);

    /** encode Y value */
    int encodeY(double y);

    /** decode X value */
    double decodeX(int x);

    /** decode Y value */
    double decodeY(int y);
}