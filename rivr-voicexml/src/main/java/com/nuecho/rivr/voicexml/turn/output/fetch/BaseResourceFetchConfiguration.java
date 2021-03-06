/*
 * Copyright (c) 2002-2010 Nu Echo Inc. All rights reserved.
 */

package com.nuecho.rivr.voicexml.turn.output.fetch;

import com.nuecho.rivr.core.util.*;

/**
 * @author Nu Echo Inc.
 */
public abstract class BaseResourceFetchConfiguration {

    private final String mName;

    private TimeValue mMaxAge;
    private TimeValue mMaxStale;
    private FetchHint mFetchHint;

    protected BaseResourceFetchConfiguration(String name) {
        mName = name;
    }

    public final String getName() {
        return mName;
    }

    public final TimeValue getMaxAge() {
        return mMaxAge;
    }

    public final void setMaxAge(TimeValue maxAge) {
        mMaxAge = maxAge;
    }

    public final TimeValue getMaxStale() {
        return mMaxStale;
    }

    public final void setMaxStale(TimeValue maxStale) {
        mMaxStale = maxStale;
    }

    public final FetchHint getFetchHint() {
        return mFetchHint;
    }

    public final void setFetchHint(FetchHint fetchHint) {
        mFetchHint = fetchHint;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (mFetchHint == null ? 0 : mFetchHint.hashCode());
        result = prime * result + (mMaxAge == null ? 0 : mMaxAge.hashCode());
        result = prime * result + (mMaxStale == null ? 0 : mMaxStale.hashCode());
        result = prime * result + (mName == null ? 0 : mName.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        BaseResourceFetchConfiguration other = (BaseResourceFetchConfiguration) obj;
        if (mFetchHint == null) {
            if (other.mFetchHint != null) return false;
        } else if (!mFetchHint.equals(other.mFetchHint)) return false;
        if (mMaxAge == null) {
            if (other.mMaxAge != null) return false;
        } else if (!mMaxAge.equals(other.mMaxAge)) return false;
        if (mMaxStale == null) {
            if (other.mMaxStale != null) return false;
        } else if (!mMaxStale.equals(other.mMaxStale)) return false;
        if (mName == null) {
            if (other.mName != null) return false;
        } else if (!mName.equals(other.mName)) return false;
        return true;
    }
}