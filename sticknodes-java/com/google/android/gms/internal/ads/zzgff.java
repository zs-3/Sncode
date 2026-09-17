package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public class zzgff extends com.google.android.gms.internal.ads.zzgfp {
    zzgff() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.android.gms.internal.ads.zzgff zzu(com.google.common.util.concurrent.ListenableFuture r1) {
            boolean r0 = r1 instanceof com.google.android.gms.internal.ads.zzgff
            if (r0 == 0) goto L7
            com.google.android.gms.internal.ads.zzgff r1 = (com.google.android.gms.internal.ads.zzgff) r1
            goto Ld
        L7:
            com.google.android.gms.internal.ads.zzgfg r0 = new com.google.android.gms.internal.ads.zzgfg
            r0.<init>(r1)
            r1 = r0
        Ld:
            return r1
    }
}
