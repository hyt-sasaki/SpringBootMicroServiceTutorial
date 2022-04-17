/*
 * This file is generated by jOOQ.
 */
package com.example.generated.jooq.information_schema.tables;


import com.example.generated.jooq.information_schema.InformationSchema;
import com.example.generated.jooq.information_schema.tables.records.KeywordsRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row2;
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
public class Keywords extends TableImpl<KeywordsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>information_schema.KEYWORDS</code>
     */
    public static final Keywords KEYWORDS = new Keywords();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<KeywordsRecord> getRecordType() {
        return KeywordsRecord.class;
    }

    /**
     * The column <code>information_schema.KEYWORDS.WORD</code>.
     */
    public final TableField<KeywordsRecord, String> WORD = createField(DSL.name("WORD"), SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>information_schema.KEYWORDS.RESERVED</code>.
     */
    public final TableField<KeywordsRecord, Integer> RESERVED = createField(DSL.name("RESERVED"), SQLDataType.INTEGER, this, "");

    private Keywords(Name alias, Table<KeywordsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Keywords(Name alias, Table<KeywordsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>information_schema.KEYWORDS</code> table
     * reference
     */
    public Keywords(String alias) {
        this(DSL.name(alias), KEYWORDS);
    }

    /**
     * Create an aliased <code>information_schema.KEYWORDS</code> table
     * reference
     */
    public Keywords(Name alias) {
        this(alias, KEYWORDS);
    }

    /**
     * Create a <code>information_schema.KEYWORDS</code> table reference
     */
    public Keywords() {
        this(DSL.name("KEYWORDS"), null);
    }

    public <O extends Record> Keywords(Table<O> child, ForeignKey<O, KeywordsRecord> key) {
        super(child, key, KEYWORDS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public Keywords as(String alias) {
        return new Keywords(DSL.name(alias), this);
    }

    @Override
    public Keywords as(Name alias) {
        return new Keywords(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Keywords rename(String name) {
        return new Keywords(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Keywords rename(Name name) {
        return new Keywords(name, null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<String, Integer> fieldsRow() {
        return (Row2) super.fieldsRow();
    }
}
