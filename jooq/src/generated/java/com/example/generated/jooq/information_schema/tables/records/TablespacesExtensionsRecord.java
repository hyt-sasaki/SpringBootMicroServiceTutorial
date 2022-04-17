/*
 * This file is generated by jOOQ.
 */
package com.example.generated.jooq.information_schema.tables.records;


import com.example.generated.jooq.information_schema.tables.TablespacesExtensions;

import org.jooq.Field;
import org.jooq.JSON;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TablespacesExtensionsRecord extends TableRecordImpl<TablespacesExtensionsRecord> implements Record2<String, JSON> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>information_schema.TABLESPACES_EXTENSIONS.TABLESPACE_NAME</code>.
     */
    public void setTablespaceName(String value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>information_schema.TABLESPACES_EXTENSIONS.TABLESPACE_NAME</code>.
     */
    public String getTablespaceName() {
        return (String) get(0);
    }

    /**
     * Setter for
     * <code>information_schema.TABLESPACES_EXTENSIONS.ENGINE_ATTRIBUTE</code>.
     */
    public void setEngineAttribute(JSON value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>information_schema.TABLESPACES_EXTENSIONS.ENGINE_ATTRIBUTE</code>.
     */
    public JSON getEngineAttribute() {
        return (JSON) get(1);
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row2<String, JSON> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    public Row2<String, JSON> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return TablespacesExtensions.TABLESPACES_EXTENSIONS.TABLESPACE_NAME;
    }

    @Override
    public Field<JSON> field2() {
        return TablespacesExtensions.TABLESPACES_EXTENSIONS.ENGINE_ATTRIBUTE;
    }

    @Override
    public String component1() {
        return getTablespaceName();
    }

    @Override
    public JSON component2() {
        return getEngineAttribute();
    }

    @Override
    public String value1() {
        return getTablespaceName();
    }

    @Override
    public JSON value2() {
        return getEngineAttribute();
    }

    @Override
    public TablespacesExtensionsRecord value1(String value) {
        setTablespaceName(value);
        return this;
    }

    @Override
    public TablespacesExtensionsRecord value2(JSON value) {
        setEngineAttribute(value);
        return this;
    }

    @Override
    public TablespacesExtensionsRecord values(String value1, JSON value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TablespacesExtensionsRecord
     */
    public TablespacesExtensionsRecord() {
        super(TablespacesExtensions.TABLESPACES_EXTENSIONS);
    }

    /**
     * Create a detached, initialised TablespacesExtensionsRecord
     */
    public TablespacesExtensionsRecord(String tablespaceName, JSON engineAttribute) {
        super(TablespacesExtensions.TABLESPACES_EXTENSIONS);

        setTablespaceName(tablespaceName);
        setEngineAttribute(engineAttribute);
    }
}
