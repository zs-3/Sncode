package com.coremedia.iso;

/* loaded from: classes.dex */
public final class Utf8 {
    public Utf8() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String convert(byte[] r2) {
            if (r2 == 0) goto L11
            java.lang.String r0 = new java.lang.String     // Catch: java.io.UnsupportedEncodingException -> La
            java.lang.String r1 = "UTF-8"
            r0.<init>(r2, r1)     // Catch: java.io.UnsupportedEncodingException -> La
            return r0
        La:
            r2 = move-exception
            java.lang.Error r0 = new java.lang.Error
            r0.<init>(r2)
            throw r0
        L11:
            r2 = 0
            return r2
    }

    public static byte[] convert(java.lang.String r1) {
            if (r1 == 0) goto L10
            java.lang.String r0 = "UTF-8"
            byte[] r1 = r1.getBytes(r0)     // Catch: java.io.UnsupportedEncodingException -> L9
            return r1
        L9:
            r1 = move-exception
            java.lang.Error r0 = new java.lang.Error
            r0.<init>(r1)
            throw r0
        L10:
            r1 = 0
            return r1
    }

    public static int utf8StringLengthInBytes(java.lang.String r1) {
            if (r1 == 0) goto L10
            java.lang.String r0 = "UTF-8"
            byte[] r1 = r1.getBytes(r0)     // Catch: java.io.UnsupportedEncodingException -> La
            int r1 = r1.length     // Catch: java.io.UnsupportedEncodingException -> La
            return r1
        La:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>()
            throw r1
        L10:
            r1 = 0
            return r1
    }
}
