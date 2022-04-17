/*
 * This file is generated by jOOQ.
 */
package com.example.generated.jooq.information_schema.tables;


import com.example.generated.jooq.information_schema.InformationSchema;
import com.example.generated.jooq.information_schema.tables.records.RoleRoutineGrantsRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row12;
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
public class RoleRoutineGrants extends TableImpl<RoleRoutineGrantsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>information_schema.ROLE_ROUTINE_GRANTS</code>
     */
    public static final RoleRoutineGrants ROLE_ROUTINE_GRANTS = new RoleRoutineGrants();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RoleRoutineGrantsRecord> getRecordType() {
        return RoleRoutineGrantsRecord.class;
    }

    /**
     * The column <code>information_schema.ROLE_ROUTINE_GRANTS.GRANTOR</code>.
     */
    public final TableField<RoleRoutineGrantsRecord, String> GRANTOR = createField(DSL.name("GRANTOR"), SQLDataType.VARCHAR(97), this, "");

    /**
     * The column
     * <code>information_schema.ROLE_ROUTINE_GRANTS.GRANTOR_HOST</code>.
     */
    public final TableField<RoleRoutineGrantsRecord, String> GRANTOR_HOST = createField(DSL.name("GRANTOR_HOST"), SQLDataType.VARCHAR(256), this, "");

    /**
     * The column <code>information_schema.ROLE_ROUTINE_GRANTS.GRANTEE</code>.
     */
    public final TableField<RoleRoutineGrantsRecord, String> GRANTEE = createField(DSL.name("GRANTEE"), SQLDataType.CHAR(32).nullable(false).defaultValue(DSL.inline("", SQLDataType.CHAR)), this, "");

    /**
     * The column
     * <code>information_schema.ROLE_ROUTINE_GRANTS.GRANTEE_HOST</code>.
     */
    public final TableField<RoleRoutineGrantsRecord, String> GRANTEE_HOST = createField(DSL.name("GRANTEE_HOST"), SQLDataType.CHAR(255).nullable(false).defaultValue(DSL.inline("", SQLDataType.CHAR)), this, "");

    /**
     * The column
     * <code>information_schema.ROLE_ROUTINE_GRANTS.SPECIFIC_CATALOG</code>.
     */
    public final TableField<RoleRoutineGrantsRecord, String> SPECIFIC_CATALOG = createField(DSL.name("SPECIFIC_CATALOG"), SQLDataType.VARCHAR(3).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    /**
     * The column
     * <code>information_schema.ROLE_ROUTINE_GRANTS.SPECIFIC_SCHEMA</code>.
     */
    public final TableField<RoleRoutineGrantsRecord, String> SPECIFIC_SCHEMA = createField(DSL.name("SPECIFIC_SCHEMA"), SQLDataType.CHAR(64).nullable(false).defaultValue(DSL.inline("", SQLDataType.CHAR)), this, "");

    /**
     * The column
     * <code>information_schema.ROLE_ROUTINE_GRANTS.SPECIFIC_NAME</code>.
     */
    public final TableField<RoleRoutineGrantsRecord, String> SPECIFIC_NAME = createField(DSL.name("SPECIFIC_NAME"), SQLDataType.CHAR(64).nullable(false).defaultValue(DSL.inline("", SQLDataType.CHAR)), this, "");

    /**
     * The column
     * <code>information_schema.ROLE_ROUTINE_GRANTS.ROUTINE_CATALOG</code>.
     */
    public final TableField<RoleRoutineGrantsRecord, String> ROUTINE_CATALOG = createField(DSL.name("ROUTINE_CATALOG"), SQLDataType.VARCHAR(3).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    /**
     * The column
     * <code>information_schema.ROLE_ROUTINE_GRANTS.ROUTINE_SCHEMA</code>.
     */
    public final TableField<RoleRoutineGrantsRecord, String> ROUTINE_SCHEMA = createField(DSL.name("ROUTINE_SCHEMA"), SQLDataType.CHAR(64).nullable(false).defaultValue(DSL.inline("", SQLDataType.CHAR)), this, "");

    /**
     * The column
     * <code>information_schema.ROLE_ROUTINE_GRANTS.ROUTINE_NAME</code>.
     */
    public final TableField<RoleRoutineGrantsRecord, String> ROUTINE_NAME = createField(DSL.name("ROUTINE_NAME"), SQLDataType.CHAR(64).nullable(false).defaultValue(DSL.inline("", SQLDataType.CHAR)), this, "");

    /**
     * The column
     * <code>information_schema.ROLE_ROUTINE_GRANTS.PRIVILEGE_TYPE</code>.
     */
    public final TableField<RoleRoutineGrantsRecord, String> PRIVILEGE_TYPE = createField(DSL.name("PRIVILEGE_TYPE"), SQLDataType.VARCHAR(27).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    /**
     * The column
     * <code>information_schema.ROLE_ROUTINE_GRANTS.IS_GRANTABLE</code>.
     */
    public final TableField<RoleRoutineGrantsRecord, String> IS_GRANTABLE = createField(DSL.name("IS_GRANTABLE"), SQLDataType.VARCHAR(3).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    private RoleRoutineGrants(Name alias, Table<RoleRoutineGrantsRecord> aliased) {
        this(alias, aliased, null);
    }

    private RoleRoutineGrants(Name alias, Table<RoleRoutineGrantsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>information_schema.ROLE_ROUTINE_GRANTS</code>
     * table reference
     */
    public RoleRoutineGrants(String alias) {
        this(DSL.name(alias), ROLE_ROUTINE_GRANTS);
    }

    /**
     * Create an aliased <code>information_schema.ROLE_ROUTINE_GRANTS</code>
     * table reference
     */
    public RoleRoutineGrants(Name alias) {
        this(alias, ROLE_ROUTINE_GRANTS);
    }

    /**
     * Create a <code>information_schema.ROLE_ROUTINE_GRANTS</code> table
     * reference
     */
    public RoleRoutineGrants() {
        this(DSL.name("ROLE_ROUTINE_GRANTS"), null);
    }

    public <O extends Record> RoleRoutineGrants(Table<O> child, ForeignKey<O, RoleRoutineGrantsRecord> key) {
        super(child, key, ROLE_ROUTINE_GRANTS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public RoleRoutineGrants as(String alias) {
        return new RoleRoutineGrants(DSL.name(alias), this);
    }

    @Override
    public RoleRoutineGrants as(Name alias) {
        return new RoleRoutineGrants(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public RoleRoutineGrants rename(String name) {
        return new RoleRoutineGrants(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public RoleRoutineGrants rename(Name name) {
        return new RoleRoutineGrants(name, null);
    }

    // -------------------------------------------------------------------------
    // Row12 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row12<String, String, String, String, String, String, String, String, String, String, String, String> fieldsRow() {
        return (Row12) super.fieldsRow();
    }
}