package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzdjk implements com.google.android.gms.internal.ads.zzbjw {
    private final java.lang.ref.WeakReference zza;

    /* synthetic */ zzdjk(com.google.android.gms.internal.ads.zzdjl r1, com.google.android.gms.internal.ads.zzdjj r2) {
            r0 = this;
            r0.<init>()
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r2.<init>(r1)
            r0.zza = r2
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbjw
    public final void zza(java.lang.Object r1, java.util.Map r2) {
            r0 = this;
            java.lang.ref.WeakReference r1 = r0.zza
            java.lang.Object r1 = r1.get()
            com.google.android.gms.internal.ads.zzdjl r1 = (com.google.android.gms.internal.ads.zzdjl) r1
            if (r1 != 0) goto Lb
            return
        Lb:
            com.google.android.gms.internal.ads.zzcys r1 = com.google.android.gms.internal.ads.zzdjl.zzc(r1)
            r1.zza()
            return
    }
}
