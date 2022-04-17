/*
 * This file is generated by jOOQ.
 */
package com.example.generated.jooq.information_schema.tables;


import com.example.generated.jooq.information_schema.InformationSchema;
import com.example.generated.jooq.information_schema.tables.records.TableConstraintsExtensionsRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.JSON;
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
public class TableConstraintsExtensions extends TableImpl<TableConstraintsExtensionsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>information_schema.TABLE_CONSTRAINTS_EXTENSIONS</code>
     */
    public static final TableConstraintsExtensions TABLE_CONSTRAINTS_EXTENSIONS = new TableConstraintsExtensions();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TableConstraintsExtensionsRecord> getRecordType() {
        return TableConstraintsExtensionsRecord.class;
    }

    /**
     * The column
     * <code>information_schema.TABLE_CONSTRAINTS_EXTENSIONS.CONSTRAINT_CATALOG</code>.
     */
    public final TableField<TableConstraintsExtensionsRecord, String> CONSTRAINT_CATALOG = createField(DSL.name("CONSTRAINT_CATALOG"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column
     * <code>information_schema.TABLE_CONSTRAINTS_EXTENSIONS.CONSTRAINT_SCHEMA</code>.
     */
    public final TableField<TableConstraintsExtensionsRecord, String> CONSTRAINT_SCHEMA = createField(DSL.name("CONSTRAINT_SCHEMA"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column
     * <code>information_schema.TABLE_CONSTRAINTS_EXTENSIONS.CONSTRAINT_NAME</code>.
     */
    public final TableField<TableConstraintsExtensionsRecord, String> CONSTRAINT_NAME = createField(DSL.name("CONSTRAINT_NAME"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column
     * <code>information_schema.TABLE_CONSTRAINTS_EXTENSIONS.TABLE_NAME</code>.
     */
    public final TableField<TableConstraintsExtensionsRecord, String> TABLE_NAME = createField(DSL.name("TABLE_NAME"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column
     * <code>information_schema.TABLE_CONSTRAINTS_EXTENSIONS.ENGINE_ATTRIBUTE</code>.
     */
    public final TableField<TableConstraintsExtensionsRecord, JSON> ENGINE_ATTRIBUTE = createField(DSL.name("ENGINE_ATTRIBUTE"), SQLDataType.JSON, this, "");

    /**
     * The column
     * <code>information_schema.TABLE_CONSTRAINTS_EXTENSIONS.SECONDARY_ENGINE_ATTRIBUTE</code>.
     */
    public final TableField<TableConstraintsExtensionsRecord, JSON> SECONDARY_ENGINE_ATTRIBUTE = createField(DSL.name("SECONDARY_ENGINE_ATTRIBUTE"), SQLDataType.JSON, this, "");

    private TableConstraintsExtensions(Name alias, Table<TableConstraintsExtensionsRecord> aliased) {
        this(alias, aliased, null);
    }

    private TableConstraintsExtensions(Name alias, Table<TableConstraintsExtensionsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased
     * <code>information_schema.TABLE_CONSTRAINTS_EXTENSIONS</code> table
     * reference
     */
    public TableConstraintsExtensions(String alias) {
        this(DSL.name(alias), TABLE_CONSTRAINTS_EXTENSIONS);
    }

    /**
     * Create an aliased
     * <code>information_schema.TABLE_CONSTRAINTS_EXTENSIONS</code> table
     * reference
     */
    public TableConstraintsExtensions(Name alias) {
        this(alias, TABLE_CONSTRAINTS_EXTENSIONS);
    }

    /**
     * Create a <code>information_schema.TABLE_CONSTRAINTS_EXTENSIONS</code>
     * table reference
     */
    public TableConstraintsExtensions() {
        this(DSL.name("TABLE_CONSTRAINTS_EXTENSIONS"), null);
    }

    public <O extends Record> TableConstraintsExtensions(Table<O> child, ForeignKey<O, TableConstraintsExtensionsRecord> key) {
        super(child, key, TABLE_CONSTRAINTS_EXTENSIONS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public TableConstraintsExtensions as(String alias) {
        return new TableConstraintsExtensions(DSL.name(alias), this);
    }

    @Override
    public TableConstraintsExtensions as(Name alias) {
        return new TableConstraintsExtensions(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TableConstraintsExtensions rename(String name) {
        return new TableConstraintsExtensions(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TableConstraintsExtensions rename(Name name) {
        return new TableConstraintsExtensions(name, null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<String, String, String, String, JSON, JSON> fieldsRow() {
        return (Row6) super.fieldsRow();
    }
}
