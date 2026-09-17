package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
abstract class zzfzr implements java.util.Map.Entry {
    zzfzr() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.Map.Entry
    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof java.util.Map.Entry
            r1 = 0
            if (r0 == 0) goto L25
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r0 = r3.getKey()
            java.lang.Object r2 = r4.getKey()
            boolean r0 = com.google.android.gms.internal.ads.zzfxw.zza(r0, r2)
            if (r0 == 0) goto L25
            java.lang.Object r0 = r3.getValue()
            java.lang.Object r4 = r4.getValue()
            boolean r4 = com.google.android.gms.internal.ads.zzfxw.zza(r0, r4)
            if (r4 == 0) goto L25
            r4 = 1
            return r4
        L25:
            return r1
    }

    @Override // java.util.Map.Entry
    public abstract java.lang.Object getKey();

    @Override // java.util.Map.Entry
    public abstract java.lang.Object getValue();

    @Override // java.util.Map.Entry
    public final int hashCode() {
            r3 = this;
            java.lang.Object r0 = r3.getKey()
            java.lang.Object r1 = r3.getValue()
            r2 = 0
            if (r0 != 0) goto Ld
            r0 = 0
            goto L11
        Ld:
            int r0 = r0.hashCode()
        L11:
            if (r1 != 0) goto L14
            goto L18
        L14:
            int r2 = r1.hashCode()
        L18:
            r0 = r0 ^ r2
            return r0
    }

    @Override // java.util.Map.Entry
    public java.lang.Object setValue(java.lang.Object r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.Object r0 = r3.getKey()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.Object r1 = r3.getValue()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = "="
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            return r0
    }
}
