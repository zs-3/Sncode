package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* loaded from: classes2.dex */
final class zzac implements java.util.Iterator {
    final /* synthetic */ java.util.Iterator zza;
    final /* synthetic */ java.util.Iterator zzb;

    zzac(com.google.android.gms.internal.measurement.zzae r1, java.util.Iterator r2, java.util.Iterator r3) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r3
            r0.<init>()
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r1 = this;
            java.util.Iterator r0 = r1.zza
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto La
            r0 = 1
            return r0
        La:
            java.util.Iterator r0 = r1.zzb
            boolean r0 = r0.hasNext()
            return r0
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ java.lang.Object next() {
            r2 = this;
            java.util.Iterator r0 = r2.zza
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L18
            com.google.android.gms.internal.measurement.zzat r1 = new com.google.android.gms.internal.measurement.zzat
            java.lang.Object r0 = r0.next()
            java.lang.Integer r0 = (java.lang.Integer) r0
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            goto L2b
        L18:
            java.util.Iterator r0 = r2.zzb
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2c
            com.google.android.gms.internal.measurement.zzat r1 = new com.google.android.gms.internal.measurement.zzat
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            r1.<init>(r0)
        L2b:
            return r1
        L2c:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }
}
