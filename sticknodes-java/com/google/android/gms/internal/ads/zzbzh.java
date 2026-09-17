package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public abstract class zzbzh extends com.google.android.gms.internal.ads.zzaym implements com.google.android.gms.internal.ads.zzbzi {
    public zzbzh() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.ads.internal.signals.ISignalCallback"
            r1.<init>(r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzaym
    protected final boolean zzdF(int r3, android.os.Parcel r4, android.os.Parcel r5, int r6) throws android.os.RemoteException {
            r2 = this;
            r6 = 1
            if (r3 == r6) goto L2d
            r0 = 2
            if (r3 == r0) goto L22
            r0 = 3
            if (r3 == r0) goto Lb
            r3 = 0
            return r3
        Lb:
            java.lang.String r3 = r4.readString()
            java.lang.String r0 = r4.readString()
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.zzayn.zza(r4, r1)
            android.os.Bundle r1 = (android.os.Bundle) r1
            com.google.android.gms.internal.ads.zzayn.zzc(r4)
            r2.zzc(r3, r0, r1)
            goto L36
        L22:
            java.lang.String r3 = r4.readString()
            com.google.android.gms.internal.ads.zzayn.zzc(r4)
            r2.zzb(r3)
            goto L36
        L2d:
            r4.readString()
            r4.readString()
            com.google.android.gms.internal.ads.zzayn.zzc(r4)
        L36:
            r5.writeNoException()
            return r6
    }
}
