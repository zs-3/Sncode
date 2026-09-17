package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes.dex */
final class zzhd implements java.util.Iterator {
    final java.util.Iterator zza;
    final /* synthetic */ com.google.android.gms.internal.auth.zzhe zzb;

    zzhd(com.google.android.gms.internal.auth.zzhe r1) {
            r0 = this;
            r0.zzb = r1
            r0.<init>()
            com.google.android.gms.internal.auth.zzff r1 = com.google.android.gms.internal.auth.zzhe.zza(r1)
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
            java.util.Iterator r0 = r1.zza
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    @Override // java.util.Iterator
    public final void remove() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }
}
