package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* loaded from: classes2.dex */
final class zzad implements java.util.Iterator {
    final /* synthetic */ com.google.android.gms.internal.measurement.zzae zza;
    private int zzb;

    zzad(com.google.android.gms.internal.measurement.zzae r1) {
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
            com.google.android.gms.internal.measurement.zzae r0 = r2.zza
            int r1 = r2.zzb
            int r0 = r0.zzc()
            if (r1 >= r0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ java.lang.Object next() {
            r4 = this;
            com.google.android.gms.internal.measurement.zzae r0 = r4.zza
            int r1 = r4.zzb
            int r2 = r0.zzc()
            if (r1 >= r2) goto L15
            int r1 = r4.zzb
            int r2 = r1 + 1
            r4.zzb = r2
            com.google.android.gms.internal.measurement.zzap r0 = r0.zze(r1)
            return r0
        L15:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            int r1 = r4.zzb
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Out of bounds index: "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
    }
}
