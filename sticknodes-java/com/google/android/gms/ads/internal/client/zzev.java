package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
final class zzev extends com.google.android.gms.ads.internal.client.zzdk {
    private zzev() {
            r1 = this;
            r0 = 0
            throw r0
    }

    /* synthetic */ zzev(com.google.android.gms.ads.internal.client.zzeu r1) {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzdl
    public final void zze(com.google.android.gms.ads.internal.client.zze r5) {
            r4 = this;
            com.google.android.gms.ads.internal.client.zzey r0 = com.google.android.gms.ads.internal.client.zzey.zzf()
            com.google.android.gms.ads.OnAdInspectorClosedListener r0 = com.google.android.gms.ads.internal.client.zzey.zzb(r0)
            if (r0 == 0) goto L1d
            if (r5 != 0) goto Le
            r5 = 0
            goto L1a
        Le:
            com.google.android.gms.ads.AdInspectorError r1 = new com.google.android.gms.ads.AdInspectorError
            int r2 = r5.zza
            java.lang.String r3 = r5.zzb
            java.lang.String r5 = r5.zzc
            r1.<init>(r2, r3, r5)
            r5 = r1
        L1a:
            r0.onAdInspectorClosed(r5)
        L1d:
            return
    }
}
