package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public abstract class zzcl extends com.google.android.gms.internal.ads.zzaym implements com.google.android.gms.ads.internal.client.zzcm {
    public zzcl() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.ads.internal.client.IAppEventListener"
            r1.<init>(r0)
            return
    }

    public static com.google.android.gms.ads.internal.client.zzcm zzd(android.os.IBinder r2) {
            java.lang.String r0 = "com.google.android.gms.ads.internal.client.IAppEventListener"
            android.os.IInterface r0 = r2.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.ads.internal.client.zzcm
            if (r1 == 0) goto Ld
            com.google.android.gms.ads.internal.client.zzcm r0 = (com.google.android.gms.ads.internal.client.zzcm) r0
            return r0
        Ld:
            com.google.android.gms.ads.internal.client.zzck r0 = new com.google.android.gms.ads.internal.client.zzck
            r0.<init>(r2)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzaym
    protected final boolean zzdF(int r2, android.os.Parcel r3, android.os.Parcel r4, int r5) throws android.os.RemoteException {
            r1 = this;
            r5 = 1
            if (r2 != r5) goto L15
            java.lang.String r2 = r3.readString()
            java.lang.String r0 = r3.readString()
            com.google.android.gms.internal.ads.zzayn.zzc(r3)
            r1.zzc(r2, r0)
            r4.writeNoException()
            return r5
        L15:
            r2 = 0
            return r2
    }
}
