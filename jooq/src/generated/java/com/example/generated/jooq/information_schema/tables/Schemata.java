/*
 * This file is generated by jOOQ.
 */
package com.example.generated.jooq.information_schema.tables;


import com.example.generated.jooq.information_schema.InformationSchema;
import com.example.generated.jooq.information_schema.enums.SchemataDefaultEncryption;
import com.example.generated.jooq.information_schema.tables.records.SchemataRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row6;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Schemata extends TableImpl<SchemataRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>information_schema.SCHEMATA</code>
     */
    public static final Schemata SCHEMATA = new Schemata();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SchemataRecord> getRecordType() {
        return SchemataRecord.class;
    }

    /**
     * The column <code>information_schema.SCHEMATA.CATALOG_NAME</code>.
     */
    public final TableField<SchemataRecord, String> CATALOG_NAME = createField(DSL.name("CATALOG_NAME"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>information_schema.SCHEMATA.SCHEMA_NAME</code>.
     */
    public final TableField<SchemataRecord, String> SCHEMA_NAME = createField(DSL.name("SCHEMA_NAME"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column
     * <code>information_schema.SCHEMATA.DEFAULT_CHARACTER_SET_NAME</code>.
     */
    public final TableField<SchemataRecord, String> DEFAULT_CHARACTER_SET_NAME = createField(DSL.name("DEFAULT_CHARACTER_SET_NAME"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column
     * <code>information_schema.SCHEMATA.DEFAULT_COLLATION_NAME</code>.
     */
    public final TableField<SchemataRecord, String> DEFAULT_COLLATION_NAME = createField(DSL.name("DEFAULT_COLLATION_NAME"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>information_schema.SCHEMATA.SQL_PATH</code>.
     */
    public final TableField<SchemataRecord, byte[]> SQL_PATH = createField(DSL.name("SQL_PATH"), SQLDataType.BINARY, this, "");

    /**
     * The column <code>information_schema.SCHEMATA.DEFAULT_ENCRYPTION</code>.
     */
    public final TableField<SchemataRecord, SchemataDefaultEncryption> DEFAULT_ENCRYPTION = createField(DSL.name("DEFAULT_ENCRYPTION"), SQLDataType.VARCHAR(3).nullable(false).asEnumDataType(com.example.generated.jooq.information_schema.enums.SchemataDefaultEncryption.class), this, "");

    private Schemata(Name alias, Table<SchemataRecord> aliased) {
        this(alias, aliased, null);
    }

    private Schemata(Name alias, Table<SchemataRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>information_schema.SCHEMATA</code> table
     * reference
     */
    public Schemata(String alias) {
        this(DSL.name(alias), SCHEMATA);
    }

    /**
     * Create an aliased <code>information_schema.SCHEMATA</code> table
     * reference
     */
    public Schemata(Name alias) {
        this(alias, SCHEMATA);
    }

    /**
     * Create a <code>information_schema.SCHEMATA</code> table reference
     */
    public Schemata() {
        this(DSL.name("SCHEMATA"), null);
    }

    public <O extends Record> Schemata(Table<O> child, ForeignKey<O, SchemataRecord> key) {
        super(child, key, SCHEMATA);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public Schemata as(String alias) {
        return new Schemata(DSL.name(alias), this);
    }

    @Override
    public Schemata as(Name alias) {
        return new Schemata(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Schemata rename(String name) {
        return new Schemata(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Schemata rename(Name name) {
        return new Schemata(name, null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<String, String, String, String, byte[], SchemataDefaultEncryption> fieldsRow() {
        return (Row6) super.fieldsRow();
    }
}
