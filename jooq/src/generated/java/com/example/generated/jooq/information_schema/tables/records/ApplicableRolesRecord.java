/*
 * This file is generated by jOOQ.
 */
package com.example.generated.jooq.information_schema.tables.records;


import com.example.generated.jooq.information_schema.tables.ApplicableRoles;

import org.jooq.Field;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ApplicableRolesRecord extends TableRecordImpl<ApplicableRolesRecord> implements Record9<String, String, String, String, String, String, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>information_schema.APPLICABLE_ROLES.USER</code>.
     */
    public void setUser(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.APPLICABLE_ROLES.USER</code>.
     */
    public String getUser() {
        return (String) get(0);
    }

    /**
     * Setter for <code>information_schema.APPLICABLE_ROLES.HOST</code>.
     */
    public void setHost(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>information_schema.APPLICABLE_ROLES.HOST</code>.
     */
    public String getHost() {
        return (String) get(1);
    }

    /**
     * Setter for <code>information_schema.APPLICABLE_ROLES.GRANTEE</code>.
     */
    public void setGrantee(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>information_schema.APPLICABLE_ROLES.GRANTEE</code>.
     */
    public String getGrantee() {
        return (String) get(2);
    }

    /**
     * Setter for <code>information_schema.APPLICABLE_ROLES.GRANTEE_HOST</code>.
     */
    public void setGranteeHost(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>information_schema.APPLICABLE_ROLES.GRANTEE_HOST</code>.
     */
    public String getGranteeHost() {
        return (String) get(3);
    }

    /**
     * Setter for <code>information_schema.APPLICABLE_ROLES.ROLE_NAME</code>.
     */
    public void setRoleName(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>information_schema.APPLICABLE_ROLES.ROLE_NAME</code>.
     */
    public String getRoleName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>information_schema.APPLICABLE_ROLES.ROLE_HOST</code>.
     */
    public void setRoleHost(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>information_schema.APPLICABLE_ROLES.ROLE_HOST</code>.
     */
    public String getRoleHost() {
        return (String) get(5);
    }

    /**
     * Setter for <code>information_schema.APPLICABLE_ROLES.IS_GRANTABLE</code>.
     */
    public void setIsGrantable(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>information_schema.APPLICABLE_ROLES.IS_GRANTABLE</code>.
     */
    public String getIsGrantable() {
        return (String) get(6);
    }

    /**
     * Setter for <code>information_schema.APPLICABLE_ROLES.IS_DEFAULT</code>.
     */
    public void setIsDefault(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>information_schema.APPLICABLE_ROLES.IS_DEFAULT</code>.
     */
    public String getIsDefault() {
        return (String) get(7);
    }

    /**
     * Setter for <code>information_schema.APPLICABLE_ROLES.IS_MANDATORY</code>.
     */
    public void setIsMandatory(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>information_schema.APPLICABLE_ROLES.IS_MANDATORY</code>.
     */
    public String getIsMandatory() {
        return (String) get(8);
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row9<String, String, String, String, String, String, String, String, String> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    @Override
    public Row9<String, String, String, String, String, String, String, String, String> valuesRow() {
        return (Row9) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return ApplicableRoles.APPLICABLE_ROLES.USER;
    }

    @Override
    public Field<String> field2() {
        return ApplicableRoles.APPLICABLE_ROLES.HOST;
    }

    @Override
    public Field<String> field3() {
        return ApplicableRoles.APPLICABLE_ROLES.GRANTEE;
    }

    @Override
    public Field<String> field4() {
        return ApplicableRoles.APPLICABLE_ROLES.GRANTEE_HOST;
    }

    @Override
    public Field<String> field5() {
        return ApplicableRoles.APPLICABLE_ROLES.ROLE_NAME;
    }

    @Override
    public Field<String> field6() {
        return ApplicableRoles.APPLICABLE_ROLES.ROLE_HOST;
    }

    @Override
    public Field<String> field7() {
        return ApplicableRoles.APPLICABLE_ROLES.IS_GRANTABLE;
    }

    @Override
    public Field<String> field8() {
        return ApplicableRoles.APPLICABLE_ROLES.IS_DEFAULT;
    }

    @Override
    public Field<String> field9() {
        return ApplicableRoles.APPLICABLE_ROLES.IS_MANDATORY;
    }

    @Override
    public String component1() {
        return getUser();
    }

    @Override
    public String component2() {
        return getHost();
    }

    @Override
    public String component3() {
        return getGrantee();
    }

    @Override
    public String component4() {
        return getGranteeHost();
    }

    @Override
    public String component5() {
        return getRoleName();
    }

    @Override
    public String component6() {
        return getRoleHost();
    }

    @Override
    public String component7() {
        return getIsGrantable();
    }

    @Override
    public String component8() {
        return getIsDefault();
    }

    @Override
    public String component9() {
        return getIsMandatory();
    }

    @Override
    public String value1() {
        return getUser();
    }

    @Override
    public String value2() {
        return getHost();
    }

    @Override
    public String value3() {
        return getGrantee();
    }

    @Override
    public String value4() {
        return getGranteeHost();
    }

    @Override
    public String value5() {
        return getRoleName();
    }

    @Override
    public String value6() {
        return getRoleHost();
    }

    @Override
    public String value7() {
        return getIsGrantable();
    }

    @Override
    public String value8() {
        return getIsDefault();
    }

    @Override
    public String value9() {
        return getIsMandatory();
    }

    @Override
    public ApplicableRolesRecord value1(String value) {
        setUser(value);
        return this;
    }

    @Override
    public ApplicableRolesRecord value2(String value) {
        setHost(value);
        return this;
    }

    @Override
    public ApplicableRolesRecord value3(String value) {
        setGrantee(value);
        return this;
    }

    @Override
    public ApplicableRolesRecord value4(String value) {
        setGranteeHost(value);
        return this;
    }

    @Override
    public ApplicableRolesRecord value5(String value) {
        setRoleName(value);
        return this;
    }

    @Override
    public ApplicableRolesRecord value6(String value) {
        setRoleHost(value);
        return this;
    }

    @Override
    public ApplicableRolesRecord value7(String value) {
        setIsGrantable(value);
        return this;
    }

    @Override
    public ApplicableRolesRecord value8(String value) {
        setIsDefault(value);
        return this;
    }

    @Override
    public ApplicableRolesRecord value9(String value) {
        setIsMandatory(value);
        return this;
    }

    @Override
    public ApplicableRolesRecord values(String value1, String value2, String value3, String value4, String value5, String value6, String value7, String value8, String value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ApplicableRolesRecord
     */
    public ApplicableRolesRecord() {
        super(ApplicableRoles.APPLICABLE_ROLES);
    }

    /**
     * Create a detached, initialised ApplicableRolesRecord
     */
    public ApplicableRolesRecord(String user, String host, String grantee, String granteeHost, String roleName, String roleHost, String isGrantable, String isDefault, String isMandatory) {
        super(ApplicableRoles.APPLICABLE_ROLES);

        setUser(user);
        setHost(host);
        setGrantee(grantee);
        setGranteeHost(granteeHost);
        setRoleName(roleName);
        setRoleHost(roleHost);
        setIsGrantable(isGrantable);
        setIsDefault(isDefault);
        setIsMandatory(isMandatory);
    }
}
