package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzft extends com.google.android.gms.ads.internal.client.zzdq {
    private final com.google.android.gms.ads.OnPaidEventListener zza;

    public zzft(com.google.android.gms.ads.OnPaidEventListener r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzdr
    public final void zze(com.google.android.gms.ads.internal.client.zzu r6) {
            r5 = this;
            com.google.android.gms.ads.OnPaidEventListener r0 = r5.zza
            if (r0 == 0) goto L11
            int r1 = r6.zzb
            java.lang.String r2 = r6.zzc
            long r3 = r6.zzd
            com.google.android.gms.ads.AdValue r6 = com.google.android.gms.ads.AdValue.zza(r1, r2, r3)
            r0.onPaidEvent(r6)
        L11:
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzdr
    public final boolean zzf() {
            r1 = this;
            com.google.android.gms.ads.OnPaidEventListener r0 = r1.zza
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }
}
