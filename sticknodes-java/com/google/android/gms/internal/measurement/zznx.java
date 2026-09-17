package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.4.0 */
/* loaded from: classes2.dex */
final class zznx implements java.util.Iterator {
    final /* synthetic */ com.google.android.gms.internal.measurement.zzoa zza;
    private int zzb;
    private boolean zzc;
    private java.util.Iterator zzd;

    /* synthetic */ zznx(com.google.android.gms.internal.measurement.zzoa r1, com.google.android.gms.internal.measurement.zznz r2) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            r1 = -1
            r0.zzb = r1
            return
    }

    private final java.util.Iterator zza() {
            r1 = this;
            java.util.Iterator r0 = r1.zzd
            if (r0 != 0) goto L14
            com.google.android.gms.internal.measurement.zzoa r0 = r1.zza
            java.util.Map r0 = com.google.android.gms.internal.measurement.zzoa.zzh(r0)
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            r1.zzd = r0
        L14:
            java.util.Iterator r0 = r1.zzd
            return r0
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r5 = this;
            int r0 = r5.zzb
            r1 = 1
            int r0 = r0 + r1
            com.google.android.gms.internal.measurement.zzoa r2 = r5.zza
            int r3 = com.google.android.gms.internal.measurement.zzoa.zzb(r2)
            r4 = 0
            if (r0 < r3) goto L24
            java.util.Map r0 = com.google.android.gms.internal.measurement.zzoa.zzh(r2)
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L23
            java.util.Iterator r0 = r5.zza()
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L22
            goto L24
        L22:
            return r4
        L23:
            r1 = 0
        L24:
            return r1
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ java.lang.Object next() {
            r3 = this;
            r0 = 1
            r3.zzc = r0
            int r1 = r3.zzb
            int r1 = r1 + r0
            r3.zzb = r1
            com.google.android.gms.internal.measurement.zzoa r0 = r3.zza
            int r2 = com.google.android.gms.internal.measurement.zzoa.zzb(r0)
            if (r1 >= r2) goto L19
            java.lang.Object[] r0 = com.google.android.gms.internal.measurement.zzoa.zzk(r0)
            r0 = r0[r1]
            com.google.android.gms.internal.measurement.zznw r0 = (com.google.android.gms.internal.measurement.zznw) r0
            goto L23
        L19:
            java.util.Iterator r0 = r3.zza()
            java.lang.Object r0 = r0.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
        L23:
            return r0
    }

    @Override // java.util.Iterator
    public final void remove() {
            r3 = this;
            boolean r0 = r3.zzc
            if (r0 == 0) goto L24
            r0 = 0
            r3.zzc = r0
            com.google.android.gms.internal.measurement.zzoa r0 = r3.zza
            com.google.android.gms.internal.measurement.zzoa.zzi(r0)
            int r1 = r3.zzb
            int r2 = com.google.android.gms.internal.measurement.zzoa.zzb(r0)
            if (r1 >= r2) goto L1c
            int r2 = r1 + (-1)
            r3.zzb = r2
            com.google.android.gms.internal.measurement.zzoa.zze(r0, r1)
            return
        L1c:
            java.util.Iterator r0 = r3.zza()
            r0.remove()
            return
        L24:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "remove() was called before next()"
            r0.<init>(r1)
            throw r0
    }
}
