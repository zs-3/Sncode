package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public abstract class zzbml extends com.google.android.gms.internal.ads.zzaym implements com.google.android.gms.internal.ads.zzbmm {
    public zzbml() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback"
            r1.<init>(r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzaym
    protected final boolean zzdF(int r2, android.os.Parcel r3, android.os.Parcel r4, int r5) throws android.os.RemoteException {
            r1 = this;
            r5 = 1
            if (r2 == r5) goto Le
            r0 = 2
            if (r2 == r0) goto L8
            r2 = 0
            return r2
        L8:
            r3.readInt()
            com.google.android.gms.internal.ads.zzayn.zzc(r3)
        Le:
            r4.writeNoException()
            return r5
    }
}
