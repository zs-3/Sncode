package com.google.android.gms.ads.internal.util;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
@android.annotation.TargetApi(21)
/* loaded from: classes.dex */
public class zzu extends com.google.android.gms.ads.internal.util.zzab {
    public zzu() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    @Override // com.google.android.gms.ads.internal.util.zzab
    public final android.webkit.CookieManager zza(android.content.Context r4) {
            r3 = this;
            com.google.android.gms.ads.internal.zzu.zzp()
            boolean r4 = com.google.android.gms.ads.internal.util.zzt.zzF()
            r0 = 0
            if (r4 == 0) goto Lb
            return r0
        Lb:
            android.webkit.CookieManager r4 = android.webkit.CookieManager.getInstance()     // Catch: java.lang.Throwable -> L10
            return r4
        L10:
            r4 = move-exception
            java.lang.String r1 = "Failed to obtain CookieManager."
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r1, r4)
            com.google.android.gms.internal.ads.zzcad r1 = com.google.android.gms.ads.internal.zzu.zzo()
            java.lang.String r2 = "ApiLevelUtil.getCookieManager"
            r1.zzv(r4, r2)
            return r0
    }

    @Override // com.google.android.gms.ads.internal.util.zzab
    public final android.webkit.WebResourceResponse zzb(java.lang.String r9, java.lang.String r10, int r11, java.lang.String r12, java.util.Map r13, java.io.InputStream r14) {
            r8 = this;
            android.webkit.WebResourceResponse r7 = new android.webkit.WebResourceResponse
            r0 = r7
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r7
    }

    @Override // com.google.android.gms.ads.internal.util.zzab
    public final com.google.android.gms.internal.ads.zzcfw zzc(com.google.android.gms.internal.ads.zzcfo r2, com.google.android.gms.internal.ads.zzbbu r3, boolean r4, com.google.android.gms.internal.ads.zzefj r5) {
            r1 = this;
            com.google.android.gms.internal.ads.zzcgx r0 = new com.google.android.gms.internal.ads.zzcgx
            r0.<init>(r2, r3, r4, r5)
            return r0
    }
}
