package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public abstract class zzbrm extends com.google.android.gms.internal.ads.zzaym implements com.google.android.gms.internal.ads.zzbrn {
    public zzbrm() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback"
            r1.<init>(r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzaym
    protected final boolean zzdF(int r2, android.os.Parcel r3, android.os.Parcel r4, int r5) throws android.os.RemoteException {
            r1 = this;
            r5 = 1
            if (r2 == r5) goto L25
            r0 = 2
            if (r2 == r0) goto L1a
            r0 = 3
            if (r2 == r0) goto Lb
            r2 = 0
            return r2
        Lb:
            android.os.Parcelable$Creator<com.google.android.gms.ads.internal.client.zze> r2 = com.google.android.gms.ads.internal.client.zze.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.ads.zzayn.zza(r3, r2)
            com.google.android.gms.ads.internal.client.zze r2 = (com.google.android.gms.ads.internal.client.zze) r2
            com.google.android.gms.internal.ads.zzayn.zzc(r3)
            r1.zzg(r2)
            goto L2f
        L1a:
            java.lang.String r2 = r3.readString()
            com.google.android.gms.internal.ads.zzayn.zzc(r3)
            r1.zzf(r2)
            goto L2f
        L25:
            java.lang.String r2 = r3.readString()
            com.google.android.gms.internal.ads.zzayn.zzc(r3)
            r1.zze(r2)
        L2f:
            r4.writeNoException()
            return r5
    }
}
