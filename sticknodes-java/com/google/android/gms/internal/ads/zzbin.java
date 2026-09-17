package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbin implements com.google.android.gms.internal.ads.zzbjw {
    private final com.google.android.gms.internal.ads.zzbio zza;

    public zzbin(com.google.android.gms.internal.ads.zzbio r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbjw
    public final void zza(java.lang.Object r3, java.util.Map r4) {
            r2 = this;
            java.lang.String r3 = "name"
            java.lang.Object r3 = r4.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L10
            java.lang.String r3 = "App event with no name parameter."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r3)
            return
        L10:
            com.google.android.gms.internal.ads.zzbio r0 = r2.zza
            java.lang.String r1 = "info"
            java.lang.Object r4 = r4.get(r1)
            java.lang.String r4 = (java.lang.String) r4
            r0.zzb(r3, r4)
            return
    }
}
