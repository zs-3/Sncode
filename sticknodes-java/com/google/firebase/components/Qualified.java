package com.google.firebase.components;

/* loaded from: classes2.dex */
public final class Qualified<T> {
    private final java.lang.Class<? extends java.lang.annotation.Annotation> qualifier;
    private final java.lang.Class<T> type;

    private @interface Unqualified {
    }

    public Qualified(java.lang.Class<? extends java.lang.annotation.Annotation> r1, java.lang.Class<T> r2) {
            r0 = this;
            r0.<init>()
            r0.qualifier = r1
            r0.type = r2
            return
    }

    public static <T> com.google.firebase.components.Qualified<T> qualified(java.lang.Class<? extends java.lang.annotation.Annotation> r1, java.lang.Class<T> r2) {
            com.google.firebase.components.Qualified r0 = new com.google.firebase.components.Qualified
            r0.<init>(r1, r2)
            return r0
    }

    public static <T> com.google.firebase.components.Qualified<T> unqualified(java.lang.Class<T> r2) {
            com.google.firebase.components.Qualified r0 = new com.google.firebase.components.Qualified
            java.lang.Class<com.google.firebase.components.Qualified$Unqualified> r1 = com.google.firebase.components.Qualified.Unqualified.class
            r0.<init>(r1, r2)
            return r0
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            if (r3 != r4) goto L4
            r4 = 1
            return r4
        L4:
            r0 = 0
            if (r4 == 0) goto L26
            java.lang.Class<com.google.firebase.components.Qualified> r1 = com.google.firebase.components.Qualified.class
            java.lang.Class r2 = r4.getClass()
            if (r1 == r2) goto L10
            goto L26
        L10:
            com.google.firebase.components.Qualified r4 = (com.google.firebase.components.Qualified) r4
            java.lang.Class<T> r1 = r3.type
            java.lang.Class<T> r2 = r4.type
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L1d
            return r0
        L1d:
            java.lang.Class<? extends java.lang.annotation.Annotation> r0 = r3.qualifier
            java.lang.Class<? extends java.lang.annotation.Annotation> r4 = r4.qualifier
            boolean r4 = r0.equals(r4)
            return r4
        L26:
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.lang.Class<T> r0 = r2.type
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.Class<? extends java.lang.annotation.Annotation> r1 = r2.qualifier
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.Class<? extends java.lang.annotation.Annotation> r0 = r2.qualifier
            java.lang.Class<com.google.firebase.components.Qualified$Unqualified> r1 = com.google.firebase.components.Qualified.Unqualified.class
            if (r0 != r1) goto Ld
            java.lang.Class<T> r0 = r2.type
            java.lang.String r0 = r0.getName()
            return r0
        Ld:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "@"
            r0.append(r1)
            java.lang.Class<? extends java.lang.annotation.Annotation> r1 = r2.qualifier
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r1 = " "
            r0.append(r1)
            java.lang.Class<T> r1 = r2.type
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
