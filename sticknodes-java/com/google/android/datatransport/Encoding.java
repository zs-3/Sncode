package com.google.android.datatransport;

/* loaded from: classes.dex */
public final class Encoding {
    private final java.lang.String name;

    private Encoding(java.lang.String r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "name is null"
            java.util.Objects.requireNonNull(r2, r0)
            r1.name = r2
            return
    }

    public static com.google.android.datatransport.Encoding of(java.lang.String r1) {
            com.google.android.datatransport.Encoding r0 = new com.google.android.datatransport.Encoding
            r0.<init>(r1)
            return r0
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof com.google.android.datatransport.Encoding
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            java.lang.String r0 = r1.name
            com.google.android.datatransport.Encoding r2 = (com.google.android.datatransport.Encoding) r2
            java.lang.String r2 = r2.name
            boolean r2 = r0.equals(r2)
            return r2
    }

    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.name
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Encoding{name=\""
            r0.append(r1)
            java.lang.String r1 = r2.name
            r0.append(r1)
            java.lang.String r1 = "\"}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
