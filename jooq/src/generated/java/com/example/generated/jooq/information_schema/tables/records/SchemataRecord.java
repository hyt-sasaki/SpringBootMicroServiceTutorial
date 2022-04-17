/*
 * This file is generated by jOOQ.
 */
package com.example.generated.jooq.information_schema.tables.records;


import com.example.generated.jooq.information_schema.enums.SchemataDefaultEncryption;
import com.example.generated.jooq.information_schema.tables.Schemata;

import org.jooq.Field;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SchemataRecord extends TableRecordImpl<SchemataRecord> implements Record6<String, String, String, String, byte[], SchemataDefaultEncryption> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>information_schema.SCHEMATA.CATALOG_NAME</code>.
     */
    public void setCatalogName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.SCHEMATA.CATALOG_NAME</code>.
     */
    public String getCatalogName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>information_schema.SCHEMATA.SCHEMA_NAME</code>.
     */
    public void setSchemaName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>information_schema.SCHEMATA.SCHEMA_NAME</code>.
     */
    public String getSchemaName() {
        return (String) get(1);
    }

    /**
     * Setter for
     * <code>information_schema.SCHEMATA.DEFAULT_CHARACTER_SET_NAME</code>.
     */
    public void setDefaultCharacterSetName(String value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>information_schema.SCHEMATA.DEFAULT_CHARACTER_SET_NAME</code>.
     */
    public String getDefaultCharacterSetName() {
        return (String) get(2);
    }

    /**
     * Setter for
     * <code>information_schema.SCHEMATA.DEFAULT_COLLATION_NAME</code>.
     */
    public void setDefaultCollationName(String value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>information_schema.SCHEMATA.DEFAULT_COLLATION_NAME</code>.
     */
    public String getDefaultCollationName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>information_schema.SCHEMATA.SQL_PATH</code>.
     */
    public void setSqlPath(byte[] value) {
        set(4, value);
    }

    /**
     * Getter for <code>information_schema.SCHEMATA.SQL_PATH</code>.
     */
    public byte[] getSqlPath() {
        return (byte[]) get(4);
    }

    /**
     * Setter for <code>information_schema.SCHEMATA.DEFAULT_ENCRYPTION</code>.
     */
    public void setDefaultEncryption(SchemataDefaultEncryption value) {
        set(5, value);
    }

    /**
     * Getter for <code>information_schema.SCHEMATA.DEFAULT_ENCRYPTION</code>.
     */
    public SchemataDefaultEncryption getDefaultEncryption() {
        return (SchemataDefaultEncryption) get(5);
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row6<String, String, String, String, byte[], SchemataDefaultEncryption> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<String, String, String, String, byte[], SchemataDefaultEncryption> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return Schemata.SCHEMATA.CATALOG_NAME;
    }

    @Override
    public Field<String> field2() {
        return Schemata.SCHEMATA.SCHEMA_NAME;
    }

    @Override
    public Field<String> field3() {
        return Schemata.SCHEMATA.DEFAULT_CHARACTER_SET_NAME;
    }

    @Override
    public Field<String> field4() {
        return Schemata.SCHEMATA.DEFAULT_COLLATION_NAME;
    }

    @Override
    public Field<byte[]> field5() {
        return Schemata.SCHEMATA.SQL_PATH;
    }

    @Override
    public Field<SchemataDefaultEncryption> field6() {
        return Schemata.SCHEMATA.DEFAULT_ENCRYPTION;
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
        return getDefaultCharacterSetName();
    }

    @Override
    public String component4() {
        return getDefaultCollationName();
    }

    @Override
    public byte[] component5() {
        return getSqlPath();
    }

    @Override
    public SchemataDefaultEncryption component6() {
        return getDefaultEncryption();
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
        return getDefaultCharacterSetName();
    }

    @Override
    public String value4() {
        return getDefaultCollationName();
    }

    @Override
    public byte[] value5() {
        return getSqlPath();
    }

    @Override
    public SchemataDefaultEncryption value6() {
        return getDefaultEncryption();
    }

    @Override
    public SchemataRecord value1(String value) {
        setCatalogName(value);
        return this;
    }

    @Override
    public SchemataRecord value2(String value) {
        setSchemaName(value);
        return this;
    }

    @Override
    public SchemataRecord value3(String value) {
        setDefaultCharacterSetName(value);
        return this;
    }

    @Override
    public SchemataRecord value4(String value) {
        setDefaultCollationName(value);
        return this;
    }

    @Override
    public SchemataRecord value5(byte[] value) {
        setSqlPath(value);
        return this;
    }

    @Override
    public SchemataRecord value6(SchemataDefaultEncryption value) {
        setDefaultEncryption(value);
        return this;
    }

    @Override
    public SchemataRecord values(String value1, String value2, String value3, String value4, byte[] value5, SchemataDefaultEncryption value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SchemataRecord
     */
    public SchemataRecord() {
        super(Schemata.SCHEMATA);
    }

    /**
     * Create a detached, initialised SchemataRecord
     */
    public SchemataRecord(String catalogName, String schemaName, String defaultCharacterSetName, String defaultCollationName, byte[] sqlPath, SchemataDefaultEncryption defaultEncryption) {
        super(Schemata.SCHEMATA);

        setCatalogName(catalogName);
        setSchemaName(schemaName);
        setDefaultCharacterSetName(defaultCharacterSetName);
        setDefaultCollationName(defaultCollationName);
        setSqlPath(sqlPath);
        setDefaultEncryption(defaultEncryption);
    }
}
