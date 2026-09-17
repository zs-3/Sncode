package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzcod implements com.google.android.gms.internal.ads.zzcnf {
    private final com.google.android.gms.internal.ads.zzdxb zza;

    zzcod(com.google.android.gms.internal.ads.zzdxb r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcnf
    public final void zza(java.util.Map r3) {
            r2 = this;
            java.lang.String r0 = "test_mode_enabled"
            java.lang.Object r3 = r3.get(r0)
            java.lang.String r3 = (java.lang.String) r3
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto Lf
            return
        Lf:
            com.google.android.gms.internal.ads.zzdxb r0 = r2.zza
            java.lang.String r1 = "true"
            boolean r3 = r3.equals(r1)
            r0.zzo(r3)
            return
    }
}
