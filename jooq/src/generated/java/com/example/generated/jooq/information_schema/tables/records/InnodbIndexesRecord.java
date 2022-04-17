/*
 * This file is generated by jOOQ.
 */
package com.example.generated.jooq.information_schema.tables.records;


import com.example.generated.jooq.information_schema.tables.InnodbIndexes;

import org.jooq.Field;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.TableRecordImpl;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class InnodbIndexesRecord extends TableRecordImpl<InnodbIndexesRecord> implements Record8<ULong, String, ULong, Integer, Integer, Integer, Integer, Integer> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>information_schema.INNODB_INDEXES.INDEX_ID</code>.
     */
    public void setIndexId(ULong value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_INDEXES.INDEX_ID</code>.
     */
    public ULong getIndexId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>information_schema.INNODB_INDEXES.NAME</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_INDEXES.NAME</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>information_schema.INNODB_INDEXES.TABLE_ID</code>.
     */
    public void setTableId(ULong value) {
        set(2, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_INDEXES.TABLE_ID</code>.
     */
    public ULong getTableId() {
        return (ULong) get(2);
    }

    /**
     * Setter for <code>information_schema.INNODB_INDEXES.TYPE</code>.
     */
    public void setType(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_INDEXES.TYPE</code>.
     */
    public Integer getType() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>information_schema.INNODB_INDEXES.N_FIELDS</code>.
     */
    public void setNFields(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_INDEXES.N_FIELDS</code>.
     */
    public Integer getNFields() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>information_schema.INNODB_INDEXES.PAGE_NO</code>.
     */
    public void setPageNo(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_INDEXES.PAGE_NO</code>.
     */
    public Integer getPageNo() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>information_schema.INNODB_INDEXES.SPACE</code>.
     */
    public void setSpace(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_INDEXES.SPACE</code>.
     */
    public Integer getSpace() {
        return (Integer) get(6);
    }

    /**
     * Setter for
     * <code>information_schema.INNODB_INDEXES.MERGE_THRESHOLD</code>.
     */
    public void setMergeThreshold(Integer value) {
        set(7, value);
    }

    /**
     * Getter for
     * <code>information_schema.INNODB_INDEXES.MERGE_THRESHOLD</code>.
     */
    public Integer getMergeThreshold() {
        return (Integer) get(7);
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row8<ULong, String, ULong, Integer, Integer, Integer, Integer, Integer> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    @Override
    public Row8<ULong, String, ULong, Integer, Integer, Integer, Integer, Integer> valuesRow() {
        return (Row8) super.valuesRow();
    }

    @Override
    public Field<ULong> field1() {
        return InnodbIndexes.INNODB_INDEXES.INDEX_ID;
    }

    @Override
    public Field<String> field2() {
        return InnodbIndexes.INNODB_INDEXES.NAME;
    }

    @Override
    public Field<ULong> field3() {
        return InnodbIndexes.INNODB_INDEXES.TABLE_ID;
    }

    @Override
    public Field<Integer> field4() {
        return InnodbIndexes.INNODB_INDEXES.TYPE;
    }

    @Override
    public Field<Integer> field5() {
        return InnodbIndexes.INNODB_INDEXES.N_FIELDS;
    }

    @Override
    public Field<Integer> field6() {
        return InnodbIndexes.INNODB_INDEXES.PAGE_NO;
    }

    @Override
    public Field<Integer> field7() {
        return InnodbIndexes.INNODB_INDEXES.SPACE;
    }

    @Override
    public Field<Integer> field8() {
        return InnodbIndexes.INNODB_INDEXES.MERGE_THRESHOLD;
    }

    @Override
    public ULong component1() {
        return getIndexId();
    }

    @Override
    public String component2() {
        return getName();
    }

    @Override
    public ULong component3() {
        return getTableId();
    }

    @Override
    public Integer component4() {
        return getType();
    }

    @Override
    public Integer component5() {
        return getNFields();
    }

    @Override
    public Integer component6() {
        return getPageNo();
    }

    @Override
    public Integer component7() {
        return getSpace();
    }

    @Override
    public Integer component8() {
        return getMergeThreshold();
    }

    @Override
    public ULong value1() {
        return getIndexId();
    }

    @Override
    public String value2() {
        return getName();
    }

    @Override
    public ULong value3() {
        return getTableId();
    }

    @Override
    public Integer value4() {
        return getType();
    }

    @Override
    public Integer value5() {
        return getNFields();
    }

    @Override
    public Integer value6() {
        return getPageNo();
    }

    @Override
    public Integer value7() {
        return getSpace();
    }

    @Override
    public Integer value8() {
        return getMergeThreshold();
    }

    @Override
    public InnodbIndexesRecord value1(ULong value) {
        setIndexId(value);
        return this;
    }

    @Override
    public InnodbIndexesRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public InnodbIndexesRecord value3(ULong value) {
        setTableId(value);
        return this;
    }

    @Override
    public InnodbIndexesRecord value4(Integer value) {
        setType(value);
        return this;
    }

    @Override
    public InnodbIndexesRecord value5(Integer value) {
        setNFields(value);
        return this;
    }

    @Override
    public InnodbIndexesRecord value6(Integer value) {
        setPageNo(value);
        return this;
    }

    @Override
    public InnodbIndexesRecord value7(Integer value) {
        setSpace(value);
        return this;
    }

    @Override
    public InnodbIndexesRecord value8(Integer value) {
        setMergeThreshold(value);
        return this;
    }

    @Override
    public InnodbIndexesRecord values(ULong value1, String value2, ULong value3, Integer value4, Integer value5, Integer value6, Integer value7, Integer value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached InnodbIndexesRecord
     */
    public InnodbIndexesRecord() {
        super(InnodbIndexes.INNODB_INDEXES);
    }

    /**
     * Create a detached, initialised InnodbIndexesRecord
     */
    public InnodbIndexesRecord(ULong indexId, String name, ULong tableId, Integer type, Integer nFields, Integer pageNo, Integer space, Integer mergeThreshold) {
        super(InnodbIndexes.INNODB_INDEXES);

        setIndexId(indexId);
        setName(name);
        setTableId(tableId);
        setType(type);
        setNFields(nFields);
        setPageNo(pageNo);
        setSpace(space);
        setMergeThreshold(mergeThreshold);
    }
}
