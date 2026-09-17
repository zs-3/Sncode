package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzeru implements com.google.android.gms.internal.ads.zzexh {
    private final com.google.android.gms.internal.ads.zzfdf zza;

    zzeru(com.google.android.gms.internal.ads.zzfdf r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final int zza() {
            r1 = this;
            r0 = 15
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final com.google.common.util.concurrent.ListenableFuture zzb() {
            r3 = this;
            com.google.android.gms.internal.ads.zzfdf r0 = r3.zza
            r1 = 0
            if (r0 == 0) goto L1a
            java.lang.String r2 = r0.zza()
            if (r2 == 0) goto L1a
            java.lang.String r0 = r0.zza()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L1a
            com.google.android.gms.internal.ads.zzert r1 = new com.google.android.gms.internal.ads.zzert
            r1.<init>(r3)
        L1a:
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzh(r1)
            return r0
    }

    final /* synthetic */ void zzc(android.os.Bundle r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzfdf r0 = r2.zza
            java.lang.String r0 = r0.zza()
            java.lang.String r1 = "key_schema"
            r3.putString(r1, r0)
            return
    }
}
