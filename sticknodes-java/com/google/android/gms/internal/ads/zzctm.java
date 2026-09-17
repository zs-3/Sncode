package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzctm implements com.google.android.gms.internal.ads.zzekf {
    public final java.util.List zza;

    public zzctm(com.google.android.gms.internal.ads.zzcte r1) {
            r0 = this;
            r0.<init>()
            com.google.common.util.concurrent.ListenableFuture r1 = com.google.android.gms.internal.ads.zzgfo.zzh(r1)
            java.util.List r1 = java.util.Collections.singletonList(r1)
            r0.zza = r1
            return
    }

    public zzctm(java.util.List r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzekf
    public final void zzr() {
            r4 = this;
            java.util.List r0 = r4.zza
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1f
            java.lang.Object r1 = r0.next()
            com.google.common.util.concurrent.ListenableFuture r1 = (com.google.common.util.concurrent.ListenableFuture) r1
            com.google.android.gms.internal.ads.zzctl r2 = new com.google.android.gms.internal.ads.zzctl
            r2.<init>(r4)
            java.util.concurrent.Executor r3 = com.google.android.gms.internal.ads.zzggf.zzb()
            com.google.android.gms.internal.ads.zzgfo.zzr(r1, r2, r3)
            goto L6
        L1f:
            return
    }
}
