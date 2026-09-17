package com.google.android.gms.ads.internal.util;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzav extends com.google.android.gms.ads.internal.client.zzdk {
    final /* synthetic */ android.content.Context zza;
    final /* synthetic */ com.google.android.gms.ads.internal.util.zzay zzb;

    zzav(com.google.android.gms.ads.internal.util.zzay r1, android.content.Context r2) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzdl
    public final void zze(com.google.android.gms.ads.internal.client.zze r4) {
            r3 = this;
            if (r4 != 0) goto L3
            return
        L3:
            com.google.android.gms.ads.internal.util.zzay r0 = r3.zzb
            android.content.Context r1 = r3.zza
            java.lang.String r4 = r4.zzb
            r2 = 1
            r0.zzi(r1, r4, r2, r2)
            return
    }
}
