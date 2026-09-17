package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public abstract class zzbh extends com.google.android.gms.internal.ads.zzaym implements com.google.android.gms.ads.internal.client.zzbi {
    public zzbh() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.ads.internal.client.IAdClickListener"
            r1.<init>(r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzaym
    protected final boolean zzdF(int r1, android.os.Parcel r2, android.os.Parcel r3, int r4) throws android.os.RemoteException {
            r0 = this;
            r2 = 1
            if (r1 != r2) goto La
            r0.zzb()
            r3.writeNoException()
            return r2
        La:
            r1 = 0
            return r1
    }
}
