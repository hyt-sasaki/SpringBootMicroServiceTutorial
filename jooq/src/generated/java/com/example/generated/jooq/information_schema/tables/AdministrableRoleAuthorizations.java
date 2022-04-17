/*
 * This file is generated by jOOQ.
 */
package com.example.generated.jooq.information_schema.tables;


import com.example.generated.jooq.information_schema.InformationSchema;
import com.example.generated.jooq.information_schema.tables.records.AdministrableRoleAuthorizationsRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row9;
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
public class AdministrableRoleAuthorizations extends TableImpl<AdministrableRoleAuthorizationsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>information_schema.ADMINISTRABLE_ROLE_AUTHORIZATIONS</code>
     */
    public static final AdministrableRoleAuthorizations ADMINISTRABLE_ROLE_AUTHORIZATIONS = new AdministrableRoleAuthorizations();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AdministrableRoleAuthorizationsRecord> getRecordType() {
        return AdministrableRoleAuthorizationsRecord.class;
    }

    /**
     * The column
     * <code>information_schema.ADMINISTRABLE_ROLE_AUTHORIZATIONS.USER</code>.
     */
    public final TableField<AdministrableRoleAuthorizationsRecord, String> USER = createField(DSL.name("USER"), SQLDataType.VARCHAR(97), this, "");

    /**
     * The column
     * <code>information_schema.ADMINISTRABLE_ROLE_AUTHORIZATIONS.HOST</code>.
     */
    public final TableField<AdministrableRoleAuthorizationsRecord, String> HOST = createField(DSL.name("HOST"), SQLDataType.VARCHAR(256), this, "");

    /**
     * The column
     * <code>information_schema.ADMINISTRABLE_ROLE_AUTHORIZATIONS.GRANTEE</code>.
     */
    public final TableField<AdministrableRoleAuthorizationsRecord, String> GRANTEE = createField(DSL.name("GRANTEE"), SQLDataType.VARCHAR(97), this, "");

    /**
     * The column
     * <code>information_schema.ADMINISTRABLE_ROLE_AUTHORIZATIONS.GRANTEE_HOST</code>.
     */
    public final TableField<AdministrableRoleAuthorizationsRecord, String> GRANTEE_HOST = createField(DSL.name("GRANTEE_HOST"), SQLDataType.VARCHAR(256), this, "");

    /**
     * The column
     * <code>information_schema.ADMINISTRABLE_ROLE_AUTHORIZATIONS.ROLE_NAME</code>.
     */
    public final TableField<AdministrableRoleAuthorizationsRecord, String> ROLE_NAME = createField(DSL.name("ROLE_NAME"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column
     * <code>information_schema.ADMINISTRABLE_ROLE_AUTHORIZATIONS.ROLE_HOST</code>.
     */
    public final TableField<AdministrableRoleAuthorizationsRecord, String> ROLE_HOST = createField(DSL.name("ROLE_HOST"), SQLDataType.VARCHAR(256), this, "");

    /**
     * The column
     * <code>information_schema.ADMINISTRABLE_ROLE_AUTHORIZATIONS.IS_GRANTABLE</code>.
     */
    public final TableField<AdministrableRoleAuthorizationsRecord, String> IS_GRANTABLE = createField(DSL.name("IS_GRANTABLE"), SQLDataType.VARCHAR(3).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    /**
     * The column
     * <code>information_schema.ADMINISTRABLE_ROLE_AUTHORIZATIONS.IS_DEFAULT</code>.
     */
    public final TableField<AdministrableRoleAuthorizationsRecord, String> IS_DEFAULT = createField(DSL.name("IS_DEFAULT"), SQLDataType.VARCHAR(3), this, "");

    /**
     * The column
     * <code>information_schema.ADMINISTRABLE_ROLE_AUTHORIZATIONS.IS_MANDATORY</code>.
     */
    public final TableField<AdministrableRoleAuthorizationsRecord, String> IS_MANDATORY = createField(DSL.name("IS_MANDATORY"), SQLDataType.VARCHAR(3).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    private AdministrableRoleAuthorizations(Name alias, Table<AdministrableRoleAuthorizationsRecord> aliased) {
        this(alias, aliased, null);
    }

    private AdministrableRoleAuthorizations(Name alias, Table<AdministrableRoleAuthorizationsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased
     * <code>information_schema.ADMINISTRABLE_ROLE_AUTHORIZATIONS</code> table
     * reference
     */
    public AdministrableRoleAuthorizations(String alias) {
        this(DSL.name(alias), ADMINISTRABLE_ROLE_AUTHORIZATIONS);
    }

    /**
     * Create an aliased
     * <code>information_schema.ADMINISTRABLE_ROLE_AUTHORIZATIONS</code> table
     * reference
     */
    public AdministrableRoleAuthorizations(Name alias) {
        this(alias, ADMINISTRABLE_ROLE_AUTHORIZATIONS);
    }

    /**
     * Create a
     * <code>information_schema.ADMINISTRABLE_ROLE_AUTHORIZATIONS</code> table
     * reference
     */
    public AdministrableRoleAuthorizations() {
        this(DSL.name("ADMINISTRABLE_ROLE_AUTHORIZATIONS"), null);
    }

    public <O extends Record> AdministrableRoleAuthorizations(Table<O> child, ForeignKey<O, AdministrableRoleAuthorizationsRecord> key) {
        super(child, key, ADMINISTRABLE_ROLE_AUTHORIZATIONS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public AdministrableRoleAuthorizations as(String alias) {
        return new AdministrableRoleAuthorizations(DSL.name(alias), this);
    }

    @Override
    public AdministrableRoleAuthorizations as(Name alias) {
        return new AdministrableRoleAuthorizations(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public AdministrableRoleAuthorizations rename(String name) {
        return new AdministrableRoleAuthorizations(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public AdministrableRoleAuthorizations rename(Name name) {
        return new AdministrableRoleAuthorizations(name, null);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row9<String, String, String, String, String, String, String, String, String> fieldsRow() {
        return (Row9) super.fieldsRow();
    }
}
