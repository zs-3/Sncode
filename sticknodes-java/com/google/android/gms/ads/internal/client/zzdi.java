package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzdi implements com.google.android.gms.ads.MuteThisAdReason {
    private final java.lang.String zza;
    private final com.google.android.gms.ads.internal.client.zzdh zzb;

    public zzdi(com.google.android.gms.ads.internal.client.zzdh r2) {
            r1 = this;
            r1.<init>()
            r1.zzb = r2
            java.lang.String r2 = r2.zze()     // Catch: android.os.RemoteException -> La
            goto L11
        La:
            r2 = move-exception
            java.lang.String r0 = ""
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r0, r2)
            r2 = 0
        L11:
            r1.zza = r2
            return
    }

    @Override // com.google.android.gms.ads.MuteThisAdReason
    public final java.lang.String getDescription() {
            r1 = this;
            java.lang.String r0 = r1.zza
            return r0
    }

    public final java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.zza
            return r0
    }

    public final com.google.android.gms.ads.internal.client.zzdh zza() {
            r1 = this;
            com.google.android.gms.ads.internal.client.zzdh r0 = r1.zzb
            return r0
    }
}
