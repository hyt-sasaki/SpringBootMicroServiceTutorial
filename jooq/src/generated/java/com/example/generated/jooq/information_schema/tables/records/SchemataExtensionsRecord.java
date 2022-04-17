/*
 * This file is generated by jOOQ.
 */
package com.example.generated.jooq.information_schema.tables.records;


import com.example.generated.jooq.information_schema.tables.SchemataExtensions;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SchemataExtensionsRecord extends TableRecordImpl<SchemataExtensionsRecord> implements Record3<String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>information_schema.SCHEMATA_EXTENSIONS.CATALOG_NAME</code>.
     */
    public void setCatalogName(String value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>information_schema.SCHEMATA_EXTENSIONS.CATALOG_NAME</code>.
     */
    public String getCatalogName() {
        return (String) get(0);
    }

    /**
     * Setter for
     * <code>information_schema.SCHEMATA_EXTENSIONS.SCHEMA_NAME</code>.
     */
    public void setSchemaName(String value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>information_schema.SCHEMATA_EXTENSIONS.SCHEMA_NAME</code>.
     */
    public String getSchemaName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>information_schema.SCHEMATA_EXTENSIONS.OPTIONS</code>.
     */
    public void setOptions(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>information_schema.SCHEMATA_EXTENSIONS.OPTIONS</code>.
     */
    public String getOptions() {
        return (String) get(2);
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<String, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<String, String, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return SchemataExtensions.SCHEMATA_EXTENSIONS.CATALOG_NAME;
    }

    @Override
    public Field<String> field2() {
        return SchemataExtensions.SCHEMATA_EXTENSIONS.SCHEMA_NAME;
    }

    @Override
    public Field<String> field3() {
        return SchemataExtensions.SCHEMATA_EXTENSIONS.OPTIONS;
    }

    @Override
    public String component1() {
        return getCatalogName();
    }

    @Override
    public String component2() {
        return getSchemaName();
    }

    @Override
    public String component3() {
        return getOptions();
    }

    @Override
    public String value1() {
        return getCatalogName();
    }

    @Override
    public String value2() {
        return getSchemaName();
    }

    @Override
    public String value3() {
        return getOptions();
    }

    @Override
    public SchemataExtensionsRecord value1(String value) {
        setCatalogName(value);
        return this;
    }

    @Override
    public SchemataExtensionsRecord value2(String value) {
        setSchemaName(value);
        return this;
    }

    @Override
    public SchemataExtensionsRecord value3(String value) {
        setOptions(value);
        return this;
    }

    @Override
    public SchemataExtensionsRecord values(String value1, String value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SchemataExtensionsRecord
     */
    public SchemataExtensionsRecord() {
        super(SchemataExtensions.SCHEMATA_EXTENSIONS);
    }

    /**
     * Create a detached, initialised SchemataExtensionsRecord
     */
    public SchemataExtensionsRecord(String catalogName, String schemaName, String options) {
        super(SchemataExtensions.SCHEMATA_EXTENSIONS);

        setCatalogName(catalogName);
        setSchemaName(schemaName);
        setOptions(options);
    }
}
