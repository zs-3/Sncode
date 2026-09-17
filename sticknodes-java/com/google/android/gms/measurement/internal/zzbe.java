package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
final class zzbe implements java.util.Iterator {
    final java.util.Iterator zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzbf zzb;

    zzbe(com.google.android.gms.measurement.internal.zzbf r1) {
            r0 = this;
            r0.zzb = r1
            r0.<init>()
            android.os.Bundle r1 = com.google.android.gms.measurement.internal.zzbf.zzb(r1)
            java.util.Set r1 = r1.keySet()
            java.util.Iterator r1 = r1.iterator()
            r0.zza = r1
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r1 = this;
            java.util.Iterator r0 = r1.zza
            boolean r0 = r0.hasNext()
            return r0
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ java.lang.Object next() {
            r1 = this;
            java.lang.String r0 = r1.zza()
            return r0
    }

    @Override // java.util.Iterator
    public final void remove() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Remove not supported"
            r0.<init>(r1)
            throw r0
    }

    public final java.lang.String zza() {
            r1 = this;
            java.util.Iterator r0 = r1.zza
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }
}
