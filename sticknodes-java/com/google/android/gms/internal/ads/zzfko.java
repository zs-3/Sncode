package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfko {
    final /* synthetic */ com.google.android.gms.internal.ads.zzfky zza;
    private final java.lang.Object zzb;
    private final java.util.List zzc;

    /* synthetic */ zzfko(com.google.android.gms.internal.ads.zzfky r1, java.lang.Object r2, java.util.List r3, com.google.android.gms.internal.ads.zzfkn r4) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            r0.zzb = r2
            r0.zzc = r3
            return
    }

    public final com.google.android.gms.internal.ads.zzfkx zza(java.util.concurrent.Callable r12) {
            r11 = this;
            java.util.List r0 = r11.zzc
            com.google.android.gms.internal.ads.zzgfn r0 = com.google.android.gms.internal.ads.zzgfo.zzb(r0)
            com.google.android.gms.internal.ads.zzfkm r1 = new com.google.android.gms.internal.ads.zzfkm
            r1.<init>()
            com.google.android.gms.internal.ads.zzgfz r2 = com.google.android.gms.internal.ads.zzcan.zzf
            com.google.common.util.concurrent.ListenableFuture r7 = r0.zza(r1, r2)
            com.google.android.gms.internal.ads.zzfky r1 = r11.zza
            com.google.android.gms.internal.ads.zzfkx r2 = new com.google.android.gms.internal.ads.zzfkx
            com.google.android.gms.internal.ads.zzgfz r1 = com.google.android.gms.internal.ads.zzfky.zze(r1)
            com.google.common.util.concurrent.ListenableFuture r9 = r0.zza(r12, r1)
            java.util.List r8 = r11.zzc
            com.google.android.gms.internal.ads.zzfky r4 = r11.zza
            java.lang.Object r5 = r11.zzb
            r6 = 0
            r10 = 0
            r3 = r2
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return r2
    }
}
