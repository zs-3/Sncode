package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfkx {
    final /* synthetic */ com.google.android.gms.internal.ads.zzfky zza;
    private final java.lang.Object zzb;
    private final java.lang.String zzc;
    private final com.google.common.util.concurrent.ListenableFuture zzd;
    private final java.util.List zze;
    private final com.google.common.util.concurrent.ListenableFuture zzf;

    private zzfkx(com.google.android.gms.internal.ads.zzfky r1, java.lang.Object r2, java.lang.String r3, com.google.common.util.concurrent.ListenableFuture r4, java.util.List r5, com.google.common.util.concurrent.ListenableFuture r6) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            r0.zze = r5
            r0.zzf = r6
            return
    }

    /* synthetic */ zzfkx(com.google.android.gms.internal.ads.zzfky r8, java.lang.Object r9, java.lang.String r10, com.google.common.util.concurrent.ListenableFuture r11, java.util.List r12, com.google.common.util.concurrent.ListenableFuture r13, com.google.android.gms.internal.ads.zzfkw r14) {
            r7 = this;
            r3 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r4 = r11
            r5 = r12
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    public final com.google.android.gms.internal.ads.zzfkl zza() {
            r4 = this;
            com.google.android.gms.internal.ads.zzfkl r0 = new com.google.android.gms.internal.ads.zzfkl
            java.lang.Object r1 = r4.zzb
            java.lang.String r2 = r4.zzc
            if (r2 != 0) goto Le
            com.google.android.gms.internal.ads.zzfky r2 = r4.zza
            java.lang.String r2 = r2.zzf(r1)
        Le:
            com.google.common.util.concurrent.ListenableFuture r3 = r4.zzf
            r0.<init>(r1, r2, r3)
            com.google.android.gms.internal.ads.zzfky r1 = r4.zza
            com.google.android.gms.internal.ads.zzfkz r1 = com.google.android.gms.internal.ads.zzfky.zzc(r1)
            r1.zza(r0)
            com.google.common.util.concurrent.ListenableFuture r1 = r4.zzd
            com.google.android.gms.internal.ads.zzfku r2 = new com.google.android.gms.internal.ads.zzfku
            r2.<init>(r4, r0)
            com.google.android.gms.internal.ads.zzgfz r3 = com.google.android.gms.internal.ads.zzcan.zzf
            r1.addListener(r2, r3)
            com.google.android.gms.internal.ads.zzfkv r1 = new com.google.android.gms.internal.ads.zzfkv
            r1.<init>(r4, r0)
            com.google.android.gms.internal.ads.zzgfo.zzr(r0, r1, r3)
            return r0
    }

    public final com.google.android.gms.internal.ads.zzfkx zzb(java.lang.Object r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzfky r0 = r2.zza
            com.google.android.gms.internal.ads.zzfkl r1 = r2.zza()
            com.google.android.gms.internal.ads.zzfkx r3 = r0.zzb(r3, r1)
            return r3
    }

    public final com.google.android.gms.internal.ads.zzfkx zzc(java.lang.Class r10, com.google.android.gms.internal.ads.zzgev r11) {
            r9 = this;
            com.google.android.gms.internal.ads.zzfky r0 = r9.zza
            com.google.android.gms.internal.ads.zzfkx r8 = new com.google.android.gms.internal.ads.zzfkx
            com.google.android.gms.internal.ads.zzgfz r0 = com.google.android.gms.internal.ads.zzfky.zze(r0)
            com.google.common.util.concurrent.ListenableFuture r1 = r9.zzf
            com.google.common.util.concurrent.ListenableFuture r7 = com.google.android.gms.internal.ads.zzgfo.zzf(r1, r10, r11, r0)
            com.google.android.gms.internal.ads.zzfky r2 = r9.zza
            java.lang.Object r3 = r9.zzb
            java.lang.String r4 = r9.zzc
            com.google.common.util.concurrent.ListenableFuture r5 = r9.zzd
            java.util.List r6 = r9.zze
            r1 = r8
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r8
    }

    public final com.google.android.gms.internal.ads.zzfkx zzd(com.google.common.util.concurrent.ListenableFuture r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzfkt r0 = new com.google.android.gms.internal.ads.zzfkt
            r0.<init>(r2)
            com.google.android.gms.internal.ads.zzgfz r2 = com.google.android.gms.internal.ads.zzcan.zzf
            com.google.android.gms.internal.ads.zzfkx r2 = r1.zzg(r0, r2)
            return r2
    }

    public final com.google.android.gms.internal.ads.zzfkx zze(com.google.android.gms.internal.ads.zzfkj r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzfks r0 = new com.google.android.gms.internal.ads.zzfks
            r0.<init>(r2)
            com.google.android.gms.internal.ads.zzfkx r2 = r1.zzf(r0)
            return r2
    }

    public final com.google.android.gms.internal.ads.zzfkx zzf(com.google.android.gms.internal.ads.zzgev r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzfky r0 = r1.zza
            com.google.android.gms.internal.ads.zzgfz r0 = com.google.android.gms.internal.ads.zzfky.zze(r0)
            com.google.android.gms.internal.ads.zzfkx r2 = r1.zzg(r2, r0)
            return r2
    }

    public final com.google.android.gms.internal.ads.zzfkx zzg(com.google.android.gms.internal.ads.zzgev r9, java.util.concurrent.Executor r10) {
            r8 = this;
            com.google.android.gms.internal.ads.zzfkx r7 = new com.google.android.gms.internal.ads.zzfkx
            com.google.common.util.concurrent.ListenableFuture r0 = r8.zzf
            com.google.android.gms.internal.ads.zzfky r1 = r8.zza
            java.lang.Object r2 = r8.zzb
            java.lang.String r3 = r8.zzc
            com.google.common.util.concurrent.ListenableFuture r4 = r8.zzd
            java.util.List r5 = r8.zze
            com.google.common.util.concurrent.ListenableFuture r6 = com.google.android.gms.internal.ads.zzgfo.zzn(r0, r9, r10)
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r7
    }

    public final com.google.android.gms.internal.ads.zzfkx zzh(java.lang.String r9) {
            r8 = this;
            com.google.common.util.concurrent.ListenableFuture r4 = r8.zzd
            java.util.List r5 = r8.zze
            com.google.common.util.concurrent.ListenableFuture r6 = r8.zzf
            com.google.android.gms.internal.ads.zzfkx r7 = new com.google.android.gms.internal.ads.zzfkx
            com.google.android.gms.internal.ads.zzfky r1 = r8.zza
            java.lang.Object r2 = r8.zzb
            r0 = r7
            r3 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r7
    }

    public final com.google.android.gms.internal.ads.zzfkx zzi(long r10, java.util.concurrent.TimeUnit r12) {
            r9 = this;
            com.google.android.gms.internal.ads.zzfky r0 = r9.zza
            com.google.android.gms.internal.ads.zzfkx r8 = new com.google.android.gms.internal.ads.zzfkx
            java.util.concurrent.ScheduledExecutorService r0 = com.google.android.gms.internal.ads.zzfky.zzg(r0)
            com.google.common.util.concurrent.ListenableFuture r1 = r9.zzf
            com.google.common.util.concurrent.ListenableFuture r7 = com.google.android.gms.internal.ads.zzgfo.zzo(r1, r10, r12, r0)
            com.google.android.gms.internal.ads.zzfky r2 = r9.zza
            java.lang.Object r3 = r9.zzb
            java.lang.String r4 = r9.zzc
            com.google.common.util.concurrent.ListenableFuture r5 = r9.zzd
            java.util.List r6 = r9.zze
            r1 = r8
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r8
    }
}
