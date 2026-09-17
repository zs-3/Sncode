package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzazx implements java.util.Comparator {
    zzazx(com.google.android.gms.internal.ads.zzazz r1) {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            com.google.android.gms.internal.ads.zzbad r3 = (com.google.android.gms.internal.ads.zzbad) r3
            com.google.android.gms.internal.ads.zzbad r4 = (com.google.android.gms.internal.ads.zzbad) r4
            int r0 = r3.zzc
            int r1 = r4.zzc
            int r0 = r0 - r1
            if (r0 == 0) goto Lc
            return r0
        Lc:
            long r0 = r3.zza
            long r3 = r4.zza
            int r3 = java.lang.Long.compare(r0, r3)
            return r3
    }
}
