package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public abstract class zzcv extends com.google.android.gms.internal.ads.zzaym implements com.google.android.gms.ads.internal.client.zzcw {
    public zzcv() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.ads.internal.client.ILiteSdkInfo"
            r1.<init>(r0)
            return
    }

    public static com.google.android.gms.ads.internal.client.zzcw asInterface(android.os.IBinder r2) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            java.lang.String r0 = "com.google.android.gms.ads.internal.client.ILiteSdkInfo"
            android.os.IInterface r0 = r2.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.ads.internal.client.zzcw
            if (r1 == 0) goto L11
            com.google.android.gms.ads.internal.client.zzcw r0 = (com.google.android.gms.ads.internal.client.zzcw) r0
            return r0
        L11:
            com.google.android.gms.ads.internal.client.zzcu r0 = new com.google.android.gms.ads.internal.client.zzcu
            r0.<init>(r2)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzaym
    protected final boolean zzdF(int r1, android.os.Parcel r2, android.os.Parcel r3, int r4) throws android.os.RemoteException {
            r0 = this;
            r2 = 1
            if (r1 == r2) goto L13
            r4 = 2
            if (r1 == r4) goto L8
            r1 = 0
            return r1
        L8:
            com.google.android.gms.internal.ads.zzbpl r1 = r0.getAdapterCreator()
            r3.writeNoException()
            com.google.android.gms.internal.ads.zzayn.zzf(r3, r1)
            goto L1d
        L13:
            com.google.android.gms.ads.internal.client.zzfc r1 = r0.getLiteSdkVersion()
            r3.writeNoException()
            com.google.android.gms.internal.ads.zzayn.zze(r3, r1)
        L1d:
            return r2
    }
}
