package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* loaded from: classes2.dex */
final class zzak implements java.util.Iterator {
    final /* synthetic */ java.util.Iterator zza;

    zzak(java.util.Iterator r1) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
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
            r2 = this;
            java.util.Iterator r0 = r2.zza
            com.google.android.gms.internal.measurement.zzat r1 = new com.google.android.gms.internal.measurement.zzat
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            r1.<init>(r0)
            return r1
    }
}
