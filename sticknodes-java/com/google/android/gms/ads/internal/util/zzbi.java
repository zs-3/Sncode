package com.google.android.gms.ads.internal.util;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzbi implements com.google.android.gms.internal.ads.zzaqg {
    final /* synthetic */ java.lang.String zza;
    final /* synthetic */ com.google.android.gms.ads.internal.util.zzbl zzb;

    zzbi(com.google.android.gms.ads.internal.util.zzbo r1, java.lang.String r2, com.google.android.gms.ads.internal.util.zzbl r3) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r3
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzaqg
    public final void zza(com.google.android.gms.internal.ads.zzaql r3) {
            r2 = this;
            java.lang.String r3 = r3.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed to load URL: "
            r0.append(r1)
            java.lang.String r1 = r2.zza
            r0.append(r1)
            java.lang.String r1 = "\n"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r3)
            com.google.android.gms.ads.internal.util.zzbl r3 = r2.zzb
            r0 = 0
            r3.zza(r0)
            return
    }
}
