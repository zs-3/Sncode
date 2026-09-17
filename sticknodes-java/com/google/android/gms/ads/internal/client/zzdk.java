package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public abstract class zzdk extends com.google.android.gms.internal.ads.zzaym implements com.google.android.gms.ads.internal.client.zzdl {
    public zzdk() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener"
            r1.<init>(r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzaym
    protected final boolean zzdF(int r1, android.os.Parcel r2, android.os.Parcel r3, int r4) throws android.os.RemoteException {
            r0 = this;
            r4 = 1
            if (r1 != r4) goto L15
            android.os.Parcelable$Creator<com.google.android.gms.ads.internal.client.zze> r1 = com.google.android.gms.ads.internal.client.zze.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.zzayn.zza(r2, r1)
            com.google.android.gms.ads.internal.client.zze r1 = (com.google.android.gms.ads.internal.client.zze) r1
            com.google.android.gms.internal.ads.zzayn.zzc(r2)
            r0.zze(r1)
            r3.writeNoException()
            return r4
        L15:
            r1 = 0
            return r1
    }
}
