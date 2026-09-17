package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public abstract class zzbku extends com.google.android.gms.internal.ads.zzaym implements com.google.android.gms.internal.ads.zzbkv {
    public zzbku() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener"
            r1.<init>(r0)
            return
    }

    public static com.google.android.gms.internal.ads.zzbkv zzc(android.os.IBinder r2) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            java.lang.String r0 = "com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener"
            android.os.IInterface r0 = r2.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.zzbkv
            if (r1 == 0) goto L11
            com.google.android.gms.internal.ads.zzbkv r0 = (com.google.android.gms.internal.ads.zzbkv) r0
            return r0
        L11:
            com.google.android.gms.internal.ads.zzbkt r0 = new com.google.android.gms.internal.ads.zzbkt
            r0.<init>(r2)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzaym
    protected final boolean zzdF(int r1, android.os.Parcel r2, android.os.Parcel r3, int r4) throws android.os.RemoteException {
            r0 = this;
            r4 = 1
            if (r1 != r4) goto L11
            java.lang.String r1 = r2.readString()
            com.google.android.gms.internal.ads.zzayn.zzc(r2)
            r0.zzb(r1)
            r3.writeNoException()
            return r4
        L11:
            r1 = 0
            return r1
    }
}
