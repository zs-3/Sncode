package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbow {
    private final com.google.android.gms.internal.ads.zzbnz zza;
    private com.google.common.util.concurrent.ListenableFuture zzb;

    zzbow(com.google.android.gms.internal.ads.zzbnz r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    private final void zzd() {
            r4 = this;
            com.google.common.util.concurrent.ListenableFuture r0 = r4.zzb
            if (r0 != 0) goto L1f
            com.google.android.gms.internal.ads.zzcas r0 = new com.google.android.gms.internal.ads.zzcas
            r0.<init>()
            r4.zzb = r0
            com.google.android.gms.internal.ads.zzbnz r1 = r4.zza
            r2 = 0
            com.google.android.gms.internal.ads.zzbnt r1 = r1.zzb(r2)
            com.google.android.gms.internal.ads.zzbot r2 = new com.google.android.gms.internal.ads.zzbot
            r2.<init>(r0)
            com.google.android.gms.internal.ads.zzbou r3 = new com.google.android.gms.internal.ads.zzbou
            r3.<init>(r0)
            r1.zzj(r2, r3)
        L1f:
            return
    }

    public final com.google.android.gms.internal.ads.zzboz zza(java.lang.String r3, com.google.android.gms.internal.ads.zzbog r4, com.google.android.gms.internal.ads.zzbof r5) {
            r2 = this;
            r2.zzd()
            com.google.android.gms.internal.ads.zzboz r3 = new com.google.android.gms.internal.ads.zzboz
            com.google.common.util.concurrent.ListenableFuture r0 = r2.zzb
            java.lang.String r1 = "google.afma.activeView.handleUpdate"
            r3.<init>(r0, r1, r4, r5)
            return r3
    }

    public final void zzb(java.lang.String r3, com.google.android.gms.internal.ads.zzbjw r4) {
            r2 = this;
            r2.zzd()
            com.google.common.util.concurrent.ListenableFuture r0 = r2.zzb
            com.google.android.gms.internal.ads.zzbov r1 = new com.google.android.gms.internal.ads.zzbov
            r1.<init>(r3, r4)
            com.google.android.gms.internal.ads.zzgfz r3 = com.google.android.gms.internal.ads.zzcan.zzf
            com.google.common.util.concurrent.ListenableFuture r3 = com.google.android.gms.internal.ads.zzgfo.zzn(r0, r1, r3)
            r2.zzb = r3
            return
    }

    public final void zzc(java.lang.String r3, com.google.android.gms.internal.ads.zzbjw r4) {
            r2 = this;
            com.google.common.util.concurrent.ListenableFuture r0 = r2.zzb
            com.google.android.gms.internal.ads.zzbos r1 = new com.google.android.gms.internal.ads.zzbos
            r1.<init>(r3, r4)
            com.google.android.gms.internal.ads.zzgfz r3 = com.google.android.gms.internal.ads.zzcan.zzf
            com.google.common.util.concurrent.ListenableFuture r3 = com.google.android.gms.internal.ads.zzgfo.zzm(r0, r1, r3)
            r2.zzb = r3
            return
    }
}
