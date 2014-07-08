package com.facebook.rocks.swift;

import com.facebook.swift.codec.*;
import java.util.*;

import static com.google.common.base.Objects.toStringHelper;

@ThriftStruct("TaoAssocGetResult")
public class TaoAssocGetResult
{
    @ThriftConstructor
    public TaoAssocGetResult(
        @ThriftField(value=1, name="retCode") final RetCode retCode,
        @ThriftField(value=2, name="entries") final List<TaoAssocGetEntry> entries
    ) {
        this.retCode = retCode;
        this.entries = entries;
    }

    private final RetCode retCode;

    @ThriftField(value=1, name="retCode")
    public RetCode getRetCode() { return retCode; }

    private final List<TaoAssocGetEntry> entries;

    @ThriftField(value=2, name="entries")
    public List<TaoAssocGetEntry> getEntries() { return entries; }

    @Override
    public String toString()
    {
        return toStringHelper(this)
            .add("retCode", retCode)
            .add("entries", entries)
            .toString();
    }
}
