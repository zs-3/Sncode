package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzedq {
    private final com.google.android.gms.internal.ads.zzedm zza;
    private final com.google.android.gms.internal.ads.zzgfz zzb;

    public zzedq(com.google.android.gms.internal.ads.zzedm r1, com.google.android.gms.internal.ads.zzgfz r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    public final void zza(com.google.android.gms.internal.ads.zzfkj r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzedm r0 = r2.zza
            java.util.Objects.requireNonNull(r0)
            com.google.android.gms.internal.ads.zzedo r1 = new com.google.android.gms.internal.ads.zzedo
            r1.<init>(r0)
            com.google.android.gms.internal.ads.zzgfz r0 = r2.zzb
            com.google.common.util.concurrent.ListenableFuture r0 = r0.zzb(r1)
            com.google.android.gms.internal.ads.zzedp r1 = new com.google.android.gms.internal.ads.zzedp
            r1.<init>(r2, r3)
            com.google.android.gms.internal.ads.zzgfz r3 = r2.zzb
            com.google.android.gms.internal.ads.zzgfo.zzr(r0, r1, r3)
            return
    }
}
