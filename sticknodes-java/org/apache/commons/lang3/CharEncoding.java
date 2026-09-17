package org.apache.commons.lang3;

@java.lang.Deprecated
/* loaded from: classes2.dex */
public class CharEncoding {
    public static final java.lang.String ISO_8859_1 = "ISO-8859-1";
    public static final java.lang.String US_ASCII = "US-ASCII";
    public static final java.lang.String UTF_16 = "UTF-16";
    public static final java.lang.String UTF_16BE = "UTF-16BE";
    public static final java.lang.String UTF_16LE = "UTF-16LE";
    public static final java.lang.String UTF_8 = "UTF-8";

    public CharEncoding() {
            r0 = this;
            r0.<init>()
            return
    }

    @java.lang.Deprecated
    public static boolean isSupported(java.lang.String r1) {
            r0 = 0
            if (r1 != 0) goto L4
            return r0
        L4:
            boolean r1 = java.nio.charset.Charset.isSupported(r1)     // Catch: java.nio.charset.IllegalCharsetNameException -> L9
            return r1
        L9:
            return r0
    }
}
