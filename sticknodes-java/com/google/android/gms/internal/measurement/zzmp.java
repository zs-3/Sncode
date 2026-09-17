package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.4.0 */
/* loaded from: classes2.dex */
final class zzmp implements java.util.Iterator {
    private final java.util.Iterator zza;

    public zzmp(java.util.Iterator r1) {
            r0 = this;
            r0.<init>()
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
            r3 = this;
            java.util.Iterator r0 = r3.zza
            java.lang.Object r0 = r0.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getValue()
            boolean r1 = r1 instanceof com.google.android.gms.internal.measurement.zzmr
            if (r1 == 0) goto L17
            com.google.android.gms.internal.measurement.zzmo r1 = new com.google.android.gms.internal.measurement.zzmo
            r2 = 0
            r1.<init>(r0, r2)
            return r1
        L17:
            return r0
    }

    @Override // java.util.Iterator
    public final void remove() {
            r1 = this;
            java.util.Iterator r0 = r1.zza
            r0.remove()
            return
    }
}
