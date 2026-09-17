package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzfdq implements com.google.android.gms.internal.ads.zzfxq {
    final /* synthetic */ com.google.android.gms.internal.ads.zzfdu zza;

    zzfdq(com.google.android.gms.internal.ads.zzfdu r1) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzfxq
    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    public final /* bridge */ /* synthetic */ java.lang.Object apply(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r4) {
            r3 = this;
            com.google.android.gms.internal.ads.zzeag r4 = (com.google.android.gms.internal.ads.zzeag) r4
            java.lang.String r0 = ""
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r0, r4)
            java.lang.String r4 = "Failed to get a cache key, reverting to legacy flow."
            com.google.android.gms.ads.internal.util.zze.zza(r4)
            com.google.android.gms.internal.ads.zzfdu r4 = r3.zza
            com.google.android.gms.internal.ads.zzfdt r0 = new com.google.android.gms.internal.ads.zzfdt
            com.google.android.gms.internal.ads.zzfja r1 = com.google.android.gms.internal.ads.zzfdu.zzb(r4)
            r2 = 0
            r0.<init>(r2, r1, r2)
            com.google.android.gms.internal.ads.zzfdu.zzd(r4, r0)
            com.google.android.gms.internal.ads.zzfdu r4 = r3.zza
            com.google.android.gms.internal.ads.zzfdt r4 = com.google.android.gms.internal.ads.zzfdu.zza(r4)
            return r4
    }
}
