package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public abstract class zzbra extends com.google.android.gms.internal.ads.zzaym implements com.google.android.gms.internal.ads.zzbrb {
    public zzbra() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback"
            r1.<init>(r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzaym
    protected final boolean zzdF(int r1, android.os.Parcel r2, android.os.Parcel r3, int r4) throws android.os.RemoteException {
            r0 = this;
            r4 = 2
            if (r1 == r4) goto L25
            r4 = 3
            if (r1 == r4) goto L1a
            r4 = 4
            if (r1 == r4) goto Lb
            r1 = 0
            return r1
        Lb:
            android.os.Parcelable$Creator<com.google.android.gms.ads.internal.client.zze> r1 = com.google.android.gms.ads.internal.client.zze.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.zzayn.zza(r2, r1)
            com.google.android.gms.ads.internal.client.zze r1 = (com.google.android.gms.ads.internal.client.zze) r1
            com.google.android.gms.internal.ads.zzayn.zzc(r2)
            r0.zzf(r1)
            goto L28
        L1a:
            java.lang.String r1 = r2.readString()
            com.google.android.gms.internal.ads.zzayn.zzc(r2)
            r0.zze(r1)
            goto L28
        L25:
            r0.zzg()
        L28:
            r3.writeNoException()
            r1 = 1
            return r1
    }
}
