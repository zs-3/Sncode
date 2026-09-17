package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzexa implements com.google.android.gms.internal.ads.zzexh {
    private final boolean zza;

    zzexa(com.google.android.gms.internal.ads.zzfec r1) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto L7
            r1 = 1
            goto L8
        L7:
            r1 = 0
        L8:
            r0.zza = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final int zza() {
            r1 = this;
            r0 = 36
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final com.google.common.util.concurrent.ListenableFuture zzb() {
            r1 = this;
            boolean r0 = r1.zza
            if (r0 == 0) goto La
            com.google.android.gms.internal.ads.zzewz r0 = new com.google.android.gms.internal.ads.zzewz
            r0.<init>()
            goto Lb
        La:
            r0 = 0
        Lb:
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzh(r0)
            return r0
    }
}
