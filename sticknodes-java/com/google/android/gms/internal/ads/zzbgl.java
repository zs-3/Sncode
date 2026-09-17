package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public abstract class zzbgl extends com.google.android.gms.internal.ads.zzaym implements com.google.android.gms.internal.ads.zzbgm {
    public zzbgl() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate"
            r1.<init>(r0)
            return
    }

    public static com.google.android.gms.internal.ads.zzbgm zze(android.os.IBinder r2) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            java.lang.String r0 = "com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate"
            android.os.IInterface r0 = r2.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.zzbgm
            if (r1 == 0) goto L11
            com.google.android.gms.internal.ads.zzbgm r0 = (com.google.android.gms.internal.ads.zzbgm) r0
            return r0
        L11:
            com.google.android.gms.internal.ads.zzbgk r0 = new com.google.android.gms.internal.ads.zzbgk
            r0.<init>(r2)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzaym
    protected final boolean zzdF(int r2, android.os.Parcel r3, android.os.Parcel r4, int r5) throws android.os.RemoteException {
            r1 = this;
            r5 = 1
            if (r2 == r5) goto L1e
            r0 = 2
            if (r2 == r0) goto L1a
            r0 = 3
            if (r2 == r0) goto Lb
            r2 = 0
            return r2
        Lb:
            android.os.IBinder r2 = r3.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r2 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r2)
            com.google.android.gms.internal.ads.zzayn.zzc(r3)
            r1.zzb(r2)
            goto L2c
        L1a:
            r1.zzd()
            goto L2c
        L1e:
            android.os.IBinder r2 = r3.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r2 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r2)
            com.google.android.gms.internal.ads.zzayn.zzc(r3)
            r1.zzc(r2)
        L2c:
            r4.writeNoException()
            return r5
    }
}
