package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* loaded from: classes2.dex */
final class zzas implements java.util.Iterator {
    final /* synthetic */ com.google.android.gms.internal.measurement.zzat zza;
    private int zzb;

    zzas(com.google.android.gms.internal.measurement.zzat r1) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            r1 = 0
            r0.zzb = r1
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r2 = this;
            com.google.android.gms.internal.measurement.zzat r0 = r2.zza
            int r1 = r2.zzb
            java.lang.String r0 = com.google.android.gms.internal.measurement.zzat.zzb(r0)
            int r0 = r0.length()
            if (r1 >= r0) goto L10
            r0 = 1
            return r0
        L10:
            r0 = 0
            return r0
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ java.lang.Object next() {
            r4 = this;
            com.google.android.gms.internal.measurement.zzat r0 = r4.zza
            int r1 = r4.zzb
            java.lang.String r2 = com.google.android.gms.internal.measurement.zzat.zzb(r0)
            int r2 = r2.length()
            if (r1 >= r2) goto L24
            com.google.android.gms.internal.measurement.zzat r2 = new com.google.android.gms.internal.measurement.zzat
            java.lang.String r0 = com.google.android.gms.internal.measurement.zzat.zzb(r0)
            int r3 = r1 + 1
            r4.zzb = r3
            char r0 = r0.charAt(r1)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r2.<init>(r0)
            return r2
        L24:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }
}
