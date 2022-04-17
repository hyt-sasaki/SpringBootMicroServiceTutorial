/*
 * This file is generated by jOOQ.
 */
package com.example.generated.jooq.information_schema.tables;


import com.example.generated.jooq.information_schema.InformationSchema;
import com.example.generated.jooq.information_schema.tables.records.InnodbTempTableInfoRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row4;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;
import org.jooq.types.UInteger;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class InnodbTempTableInfo extends TableImpl<InnodbTempTableInfoRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>information_schema.INNODB_TEMP_TABLE_INFO</code>
     */
    public static final InnodbTempTableInfo INNODB_TEMP_TABLE_INFO = new InnodbTempTableInfo();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<InnodbTempTableInfoRecord> getRecordType() {
        return InnodbTempTableInfoRecord.class;
    }

    /**
     * The column
     * <code>information_schema.INNODB_TEMP_TABLE_INFO.TABLE_ID</code>.
     */
    public final TableField<InnodbTempTableInfoRecord, ULong> TABLE_ID = createField(DSL.name("TABLE_ID"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("", SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_TEMP_TABLE_INFO.NAME</code>.
     */
    public final TableField<InnodbTempTableInfoRecord, String> NAME = createField(DSL.name("NAME"), SQLDataType.VARCHAR(21).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.INNODB_TEMP_TABLE_INFO.N_COLS</code>.
     */
    public final TableField<InnodbTempTableInfoRecord, UInteger> N_COLS = createField(DSL.name("N_COLS"), SQLDataType.INTEGERUNSIGNED.nullable(false).defaultValue(DSL.inline("", SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_TEMP_TABLE_INFO.SPACE</code>.
     */
    public final TableField<InnodbTempTableInfoRecord, UInteger> SPACE = createField(DSL.name("SPACE"), SQLDataType.INTEGERUNSIGNED.nullable(false).defaultValue(DSL.inline("", SQLDataType.INTEGERUNSIGNED)), this, "");

    private InnodbTempTableInfo(Name alias, Table<InnodbTempTableInfoRecord> aliased) {
        this(alias, aliased, null);
    }

    private InnodbTempTableInfo(Name alias, Table<InnodbTempTableInfoRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>information_schema.INNODB_TEMP_TABLE_INFO</code>
     * table reference
     */
    public InnodbTempTableInfo(String alias) {
        this(DSL.name(alias), INNODB_TEMP_TABLE_INFO);
    }

    /**
     * Create an aliased <code>information_schema.INNODB_TEMP_TABLE_INFO</code>
     * table reference
     */
    public InnodbTempTableInfo(Name alias) {
        this(alias, INNODB_TEMP_TABLE_INFO);
    }

    /**
     * Create a <code>information_schema.INNODB_TEMP_TABLE_INFO</code> table
     * reference
     */
    public InnodbTempTableInfo() {
        this(DSL.name("INNODB_TEMP_TABLE_INFO"), null);
    }

    public <O extends Record> InnodbTempTableInfo(Table<O> child, ForeignKey<O, InnodbTempTableInfoRecord> key) {
        super(child, key, INNODB_TEMP_TABLE_INFO);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public InnodbTempTableInfo as(String alias) {
        return new InnodbTempTableInfo(DSL.name(alias), this);
    }

    @Override
    public InnodbTempTableInfo as(Name alias) {
        return new InnodbTempTableInfo(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbTempTableInfo rename(String name) {
        return new InnodbTempTableInfo(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbTempTableInfo rename(Name name) {
        return new InnodbTempTableInfo(name, null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<ULong, String, UInteger, UInteger> fieldsRow() {
        return (Row4) super.fieldsRow();
    }
}
