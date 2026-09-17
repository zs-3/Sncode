package com.badlogic.gdx.utils;

/* loaded from: classes.dex */
public class SerializationException extends java.lang.RuntimeException {
    private com.badlogic.gdx.utils.StringBuilder trace;

    public SerializationException(java.lang.String r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public SerializationException(java.lang.String r1, java.lang.Throwable r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public SerializationException(java.lang.Throwable r2) {
            r1 = this;
            java.lang.String r0 = ""
            r1.<init>(r0, r2)
            return
    }

    public void addTrace(java.lang.String r3) {
            r2 = this;
            if (r3 == 0) goto L1c
            com.badlogic.gdx.utils.StringBuilder r0 = r2.trace
            if (r0 != 0) goto Lf
            com.badlogic.gdx.utils.StringBuilder r0 = new com.badlogic.gdx.utils.StringBuilder
            r1 = 512(0x200, float:7.175E-43)
            r0.<init>(r1)
            r2.trace = r0
        Lf:
            com.badlogic.gdx.utils.StringBuilder r0 = r2.trace
            r1 = 10
            r0.append(r1)
            com.badlogic.gdx.utils.StringBuilder r0 = r2.trace
            r0.append(r3)
            return
        L1c:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "info cannot be null."
            r3.<init>(r0)
            throw r3
    }

    @Override // java.lang.Throwable
    public java.lang.String getMessage() {
            r2 = this;
            com.badlogic.gdx.utils.StringBuilder r0 = r2.trace
            if (r0 != 0) goto L9
            java.lang.String r0 = super.getMessage()
            return r0
        L9:
            com.badlogic.gdx.utils.StringBuilder r0 = new com.badlogic.gdx.utils.StringBuilder
            r1 = 512(0x200, float:7.175E-43)
            r0.<init>(r1)
            java.lang.String r1 = super.getMessage()
            r0.append(r1)
            int r1 = r0.length()
            if (r1 <= 0) goto L22
            r1 = 10
            r0.append(r1)
        L22:
            java.lang.String r1 = "Serialization trace:"
            r0.append(r1)
            com.badlogic.gdx.utils.StringBuilder r1 = r2.trace
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
