package com.googlecode.mp4parser;

/* loaded from: classes2.dex */
public class Version {
    private static final java.util.logging.Logger LOG = null;
    public static final java.lang.String VERSION = null;

    static {
            java.lang.Class<com.googlecode.mp4parser.Version> r0 = com.googlecode.mp4parser.Version.class
            java.lang.String r1 = r0.getName()
            java.util.logging.Logger r1 = java.util.logging.Logger.getLogger(r1)
            com.googlecode.mp4parser.Version.LOG = r1
            java.io.LineNumberReader r1 = new java.io.LineNumberReader
            java.io.InputStreamReader r2 = new java.io.InputStreamReader
            java.lang.String r3 = "/version.txt"
            java.io.InputStream r0 = r0.getResourceAsStream(r3)
            r2.<init>(r0)
            r1.<init>(r2)
            java.lang.String r0 = r1.readLine()     // Catch: java.io.IOException -> L21
            goto L2d
        L21:
            r0 = move-exception
            java.util.logging.Logger r1 = com.googlecode.mp4parser.Version.LOG
            java.lang.String r0 = r0.getMessage()
            r1.warning(r0)
            java.lang.String r0 = "unknown"
        L2d:
            com.googlecode.mp4parser.Version.VERSION = r0
            return
    }

    public Version() {
            r0 = this;
            r0.<init>()
            return
    }
}
