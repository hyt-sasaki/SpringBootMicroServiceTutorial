/*
 * This file is generated by jOOQ.
 */
package com.example.generated.jooq.information_schema.tables.records;


import com.example.generated.jooq.information_schema.tables.StUnitsOfMeasure;

import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class StUnitsOfMeasureRecord extends TableRecordImpl<StUnitsOfMeasureRecord> implements Record4<String, String, Double, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>information_schema.ST_UNITS_OF_MEASURE.UNIT_NAME</code>.
     */
    public void setUnitName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.ST_UNITS_OF_MEASURE.UNIT_NAME</code>.
     */
    public String getUnitName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>information_schema.ST_UNITS_OF_MEASURE.UNIT_TYPE</code>.
     */
    public void setUnitType(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>information_schema.ST_UNITS_OF_MEASURE.UNIT_TYPE</code>.
     */
    public String getUnitType() {
        return (String) get(1);
    }

    /**
     * Setter for
     * <code>information_schema.ST_UNITS_OF_MEASURE.CONVERSION_FACTOR</code>.
     */
    public void setConversionFactor(Double value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>information_schema.ST_UNITS_OF_MEASURE.CONVERSION_FACTOR</code>.
     */
    public Double getConversionFactor() {
        return (Double) get(2);
    }

    /**
     * Setter for
     * <code>information_schema.ST_UNITS_OF_MEASURE.DESCRIPTION</code>.
     */
    public void setDescription(String value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>information_schema.ST_UNITS_OF_MEASURE.DESCRIPTION</code>.
     */
    public String getDescription() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<String, String, Double, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<String, String, Double, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return StUnitsOfMeasure.ST_UNITS_OF_MEASURE.UNIT_NAME;
    }

    @Override
    public Field<String> field2() {
        return StUnitsOfMeasure.ST_UNITS_OF_MEASURE.UNIT_TYPE;
    }

    @Override
    public Field<Double> field3() {
        return StUnitsOfMeasure.ST_UNITS_OF_MEASURE.CONVERSION_FACTOR;
    }

    @Override
    public Field<String> field4() {
        return StUnitsOfMeasure.ST_UNITS_OF_MEASURE.DESCRIPTION;
    }

    @Override
    public String component1() {
        return getUnitName();
    }

    @Override
    public String component2() {
        return getUnitType();
    }

    @Override
    public Double component3() {
        return getConversionFactor();
    }

    @Override
    public String component4() {
        return getDescription();
    }

    @Override
    public String value1() {
        return getUnitName();
    }

    @Override
    public String value2() {
        return getUnitType();
    }

    @Override
    public Double value3() {
        return getConversionFactor();
    }

    @Override
    public String value4() {
        return getDescription();
    }

    @Override
    public StUnitsOfMeasureRecord value1(String value) {
        setUnitName(value);
        return this;
    }

    @Override
    public StUnitsOfMeasureRecord value2(String value) {
        setUnitType(value);
        return this;
    }

    @Override
    public StUnitsOfMeasureRecord value3(Double value) {
        setConversionFactor(value);
        return this;
    }

    @Override
    public StUnitsOfMeasureRecord value4(String value) {
        setDescription(value);
        return this;
    }

    @Override
    public StUnitsOfMeasureRecord values(String value1, String value2, Double value3, String value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached StUnitsOfMeasureRecord
     */
    public StUnitsOfMeasureRecord() {
        super(StUnitsOfMeasure.ST_UNITS_OF_MEASURE);
    }

    /**
     * Create a detached, initialised StUnitsOfMeasureRecord
     */
    public StUnitsOfMeasureRecord(String unitName, String unitType, Double conversionFactor, String description) {
        super(StUnitsOfMeasure.ST_UNITS_OF_MEASURE);

        setUnitName(unitName);
        setUnitType(unitType);
        setConversionFactor(conversionFactor);
        setDescription(description);
    }
}
