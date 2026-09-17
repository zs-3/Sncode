package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
final class zzkv<K> implements java.util.Map.Entry<K, java.lang.Object> {
    private java.util.Map.Entry<K, com.google.android.gms.internal.drive.zzkt> zztf;

    private zzkv(java.util.Map.Entry<K, com.google.android.gms.internal.drive.zzkt> r1) {
            r0 = this;
            r0.<init>()
            r0.zztf = r1
            return
    }

    /* synthetic */ zzkv(java.util.Map.Entry r1, com.google.android.gms.internal.drive.zzku r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
            r1 = this;
            java.util.Map$Entry<K, com.google.android.gms.internal.drive.zzkt> r0 = r1.zztf
            java.lang.Object r0 = r0.getKey()
            return r0
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getValue() {
            r1 = this;
            java.util.Map$Entry<K, com.google.android.gms.internal.drive.zzkt> r0 = r1.zztf
            java.lang.Object r0 = r0.getValue()
            com.google.android.gms.internal.drive.zzkt r0 = (com.google.android.gms.internal.drive.zzkt) r0
            if (r0 != 0) goto Lc
            r0 = 0
            return r0
        Lc:
            com.google.android.gms.internal.drive.zzlq r0 = com.google.android.gms.internal.drive.zzkt.zzdp()
            return r0
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.google.android.gms.internal.drive.zzlq
            if (r0 == 0) goto L13
            java.util.Map$Entry<K, com.google.android.gms.internal.drive.zzkt> r0 = r1.zztf
            java.lang.Object r0 = r0.getValue()
            com.google.android.gms.internal.drive.zzkt r0 = (com.google.android.gms.internal.drive.zzkt) r0
            com.google.android.gms.internal.drive.zzlq r2 = (com.google.android.gms.internal.drive.zzlq) r2
            com.google.android.gms.internal.drive.zzlq r2 = r0.zzi(r2)
            return r2
        L13:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite"
            r2.<init>(r0)
            throw r2
    }

    public final com.google.android.gms.internal.drive.zzkt zzdq() {
            r1 = this;
            java.util.Map$Entry<K, com.google.android.gms.internal.drive.zzkt> r0 = r1.zztf
            java.lang.Object r0 = r0.getValue()
            com.google.android.gms.internal.drive.zzkt r0 = (com.google.android.gms.internal.drive.zzkt) r0
            return r0
    }
}
