package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzexo implements com.google.android.gms.internal.ads.zzexg {
    private final int zza;
    private final int zzb;

    zzexo(int r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    @Override // com.google.android.gms.internal.ads.zzexg
    public final /* bridge */ /* synthetic */ void zzj(java.lang.Object r3) {
            r2 = this;
            android.os.Bundle r3 = (android.os.Bundle) r3
            int r0 = r2.zza
            java.lang.String r1 = "sessions_without_flags"
            r3.putInt(r1, r0)
            int r0 = r2.zzb
            java.lang.String r1 = "crashes_without_flags"
            r3.putInt(r1, r0)
            int r0 = com.google.android.gms.ads.internal.client.zzbc.zza
            com.google.android.gms.internal.ads.zzbct r0 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            boolean r0 = r0.zze()
            if (r0 == 0) goto L22
            r0 = 1
            java.lang.String r1 = "did_reset"
            r3.putBoolean(r1, r0)
        L22:
            return
    }
}
