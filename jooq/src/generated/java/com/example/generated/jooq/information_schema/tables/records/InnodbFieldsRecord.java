/*
 * This file is generated by jOOQ.
 */
package com.example.generated.jooq.information_schema.tables.records;


import com.example.generated.jooq.information_schema.tables.InnodbFields;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.TableRecordImpl;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class InnodbFieldsRecord extends TableRecordImpl<InnodbFieldsRecord> implements Record3<byte[], String, ULong> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>information_schema.INNODB_FIELDS.INDEX_ID</code>.
     */
    public void setIndexId(byte[] value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_FIELDS.INDEX_ID</code>.
     */
    public byte[] getIndexId() {
        return (byte[]) get(0);
    }

    /**
     * Setter for <code>information_schema.INNODB_FIELDS.NAME</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_FIELDS.NAME</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>information_schema.INNODB_FIELDS.POS</code>.
     */
    public void setPos(ULong value) {
        set(2, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_FIELDS.POS</code>.
     */
    public ULong getPos() {
        return (ULong) get(2);
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<byte[], String, ULong> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<byte[], String, ULong> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<byte[]> field1() {
        return InnodbFields.INNODB_FIELDS.INDEX_ID;
    }

    @Override
    public Field<String> field2() {
        return InnodbFields.INNODB_FIELDS.NAME;
    }

    @Override
    public Field<ULong> field3() {
        return InnodbFields.INNODB_FIELDS.POS;
    }

    @Override
    public byte[] component1() {
        return getIndexId();
    }

    @Override
    public String component2() {
        return getName();
    }

    @Override
    public ULong component3() {
        return getPos();
    }

    @Override
    public byte[] value1() {
        return getIndexId();
    }

    @Override
    public String value2() {
        return getName();
    }

    @Override
    public ULong value3() {
        return getPos();
    }

    @Override
    public InnodbFieldsRecord value1(byte[] value) {
        setIndexId(value);
        return this;
    }

    @Override
    public InnodbFieldsRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public InnodbFieldsRecord value3(ULong value) {
        setPos(value);
        return this;
    }

    @Override
    public InnodbFieldsRecord values(byte[] value1, String value2, ULong value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached InnodbFieldsRecord
     */
    public InnodbFieldsRecord() {
        super(InnodbFields.INNODB_FIELDS);
    }

    /**
     * Create a detached, initialised InnodbFieldsRecord
     */
    public InnodbFieldsRecord(byte[] indexId, String name, ULong pos) {
        super(InnodbFields.INNODB_FIELDS);

        setIndexId(indexId);
        setName(name);
        setPos(pos);
    }
}
