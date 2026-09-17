package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public abstract class zzfky {
    private static final com.google.common.util.concurrent.ListenableFuture zza = null;
    private final com.google.android.gms.internal.ads.zzgfz zzb;
    private final java.util.concurrent.ScheduledExecutorService zzc;
    private final com.google.android.gms.internal.ads.zzfkz zzd;

    static {
            r0 = 0
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzh(r0)
            com.google.android.gms.internal.ads.zzfky.zza = r0
            return
    }

    public zzfky(com.google.android.gms.internal.ads.zzgfz r1, java.util.concurrent.ScheduledExecutorService r2, com.google.android.gms.internal.ads.zzfkz r3) {
            r0 = this;
            r0.<init>()
            r0.zzb = r1
            r0.zzc = r2
            r0.zzd = r3
            return
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzfkz zzc(com.google.android.gms.internal.ads.zzfky r0) {
            com.google.android.gms.internal.ads.zzfkz r0 = r0.zzd
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzd() {
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzfky.zza
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzgfz zze(com.google.android.gms.internal.ads.zzfky r0) {
            com.google.android.gms.internal.ads.zzgfz r0 = r0.zzb
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.concurrent.ScheduledExecutorService zzg(com.google.android.gms.internal.ads.zzfky r0) {
            java.util.concurrent.ScheduledExecutorService r0 = r0.zzc
            return r0
    }

    public final com.google.android.gms.internal.ads.zzfko zza(java.lang.Object r3, com.google.common.util.concurrent.ListenableFuture... r4) {
            r2 = this;
            java.util.List r4 = java.util.Arrays.asList(r4)
            com.google.android.gms.internal.ads.zzfko r0 = new com.google.android.gms.internal.ads.zzfko
            r1 = 0
            r0.<init>(r2, r3, r4, r1)
            return r0
    }

    public final com.google.android.gms.internal.ads.zzfkx zzb(java.lang.Object r10, com.google.common.util.concurrent.ListenableFuture r11) {
            r9 = this;
            java.util.List r5 = java.util.Collections.singletonList(r11)
            com.google.android.gms.internal.ads.zzfkx r8 = new com.google.android.gms.internal.ads.zzfkx
            r3 = 0
            r7 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r4 = r11
            r6 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r8
    }

    protected abstract java.lang.String zzf(java.lang.Object r1);
}
