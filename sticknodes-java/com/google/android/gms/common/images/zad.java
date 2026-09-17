package com.google.android.gms.common.images;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes.dex */
final class zad {
    public final android.net.Uri zaa;

    public zad(android.net.Uri r1) {
            r0 = this;
            r0.<init>()
            r0.zaa = r1
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof com.google.android.gms.common.images.zad
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            com.google.android.gms.common.images.zad r2 = (com.google.android.gms.common.images.zad) r2
            android.net.Uri r2 = r2.zaa
            android.net.Uri r0 = r1.zaa
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r0)
            return r2
    }

    public final int hashCode() {
            r3 = this;
            android.net.Uri r0 = r3.zaa
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r0
            int r0 = com.google.android.gms.common.internal.Objects.hashCode(r1)
            return r0
    }
}
