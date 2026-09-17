package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public abstract class zzcs extends com.google.android.gms.internal.ads.zzaym implements com.google.android.gms.ads.internal.client.zzct {
    public zzcs() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.ads.internal.client.IFullScreenContentCallback"
            r1.<init>(r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzaym
    protected final boolean zzdF(int r1, android.os.Parcel r2, android.os.Parcel r3, int r4) throws android.os.RemoteException {
            r0 = this;
            r4 = 1
            if (r1 == r4) goto L21
            r2 = 2
            if (r1 == r2) goto L1d
            r2 = 3
            if (r1 == r2) goto L19
            r2 = 4
            if (r1 == r2) goto L15
            r2 = 5
            if (r1 == r2) goto L11
            r1 = 0
            return r1
        L11:
            r0.zzb()
            goto L2f
        L15:
            r0.zze()
            goto L2f
        L19:
            r0.zzc()
            goto L2f
        L1d:
            r0.zzf()
            goto L2f
        L21:
            android.os.Parcelable$Creator<com.google.android.gms.ads.internal.client.zze> r1 = com.google.android.gms.ads.internal.client.zze.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.zzayn.zza(r2, r1)
            com.google.android.gms.ads.internal.client.zze r1 = (com.google.android.gms.ads.internal.client.zze) r1
            com.google.android.gms.internal.ads.zzayn.zzc(r2)
            r0.zzd(r1)
        L2f:
            r3.writeNoException()
            return r4
    }
}
