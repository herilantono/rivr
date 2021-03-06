/*
 * Copyright (c) 2012 Nu Echo Inc. All rights reserved.
 */

package com.nuecho.rivr.voicexml.rendering.voicexml;

import static com.nuecho.rivr.core.util.DomUtils.*;

import java.io.*;

import org.w3c.dom.*;

import com.nuecho.rivr.core.servlet.*;

public class XmlDocumentServletResponseContent implements ServletResponseContent {

    private final Document mDocument;
    private final String mContentType;

    public XmlDocumentServletResponseContent(Document document, String contentType) {
        mDocument = document;
        mContentType = contentType;
    }

    @Override
    public String getContentType() {
        return mContentType;
    }

    @Override
    public void writeTo(OutputStream outputStream) throws IOException {
        writeToOutputStream(mDocument, outputStream);
    }
}