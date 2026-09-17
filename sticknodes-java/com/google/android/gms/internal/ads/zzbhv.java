package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public abstract class zzbhv extends com.google.android.gms.internal.ads.zzaym implements com.google.android.gms.internal.ads.zzbhw {
    public zzbhv() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener"
            r1.<init>(r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzaym
    protected final boolean zzdF(int r1, android.os.Parcel r2, android.os.Parcel r3, int r4) throws android.os.RemoteException {
            r0 = this;
            r4 = 1
            if (r1 == r4) goto Lc
            r2 = 2
            if (r1 == r2) goto L8
            r1 = 0
            return r1
        L8:
            r0.zze()
            goto L16
        Lc:
            java.lang.String r1 = r2.readString()
            com.google.android.gms.internal.ads.zzayn.zzc(r2)
            r0.zzf(r1)
        L16:
            r3.writeNoException()
            return r4
    }
}
