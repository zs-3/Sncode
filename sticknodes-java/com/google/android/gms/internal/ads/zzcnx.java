package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzcnx implements com.google.android.gms.internal.ads.zzcnf {
    private final com.google.android.gms.internal.ads.zzfgg zza;

    public zzcnx(com.google.android.gms.internal.ads.zzfgg r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcnf
    public final void zza(java.util.Map r3) {
            r2 = this;
            java.lang.String r0 = "render_in_browser"
            java.lang.Object r3 = r3.get(r0)
            java.lang.String r3 = (java.lang.String) r3
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L21
            com.google.android.gms.internal.ads.zzfgg r0 = r2.zza     // Catch: java.lang.Exception -> L18
            boolean r3 = java.lang.Boolean.parseBoolean(r3)     // Catch: java.lang.Exception -> L18
            r0.zzb(r3)     // Catch: java.lang.Exception -> L18
            return
        L18:
            r3 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Invalid render_in_browser state"
            r0.<init>(r1, r3)
            throw r0
        L21:
            return
    }
}
