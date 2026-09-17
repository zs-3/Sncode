package org.mp4parser.aspectj.lang;

/* loaded from: classes2.dex */
public class NoAspectBoundException extends java.lang.RuntimeException {
    java.lang.Throwable cause;

    public NoAspectBoundException(java.lang.String r3, java.lang.Throwable r4) {
            r2 = this;
            if (r4 != 0) goto L3
            goto L1c
        L3:
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            java.lang.String r1 = "Exception while initializing "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = ": "
            r0.append(r3)
            r0.append(r4)
            java.lang.String r3 = r0.toString()
        L1c:
            r2.<init>(r3)
            r2.cause = r4
            return
    }

    @Override // java.lang.Throwable
    public java.lang.Throwable getCause() {
            r1 = this;
            java.lang.Throwable r0 = r1.cause
            return r0
    }
}
