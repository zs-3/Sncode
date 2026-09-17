package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public abstract class zzbua extends com.google.android.gms.internal.ads.zzaym implements com.google.android.gms.internal.ads.zzbub {
    public zzbua() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.ads.internal.query.IUpdateUrlsCallback"
            r1.<init>(r0)
            return
    }

    public static com.google.android.gms.internal.ads.zzbub zzb(android.os.IBinder r2) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            java.lang.String r0 = "com.google.android.gms.ads.internal.query.IUpdateUrlsCallback"
            android.os.IInterface r0 = r2.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.zzbub
            if (r1 == 0) goto L11
            com.google.android.gms.internal.ads.zzbub r0 = (com.google.android.gms.internal.ads.zzbub) r0
            return r0
        L11:
            com.google.android.gms.internal.ads.zzbtz r0 = new com.google.android.gms.internal.ads.zzbtz
            r0.<init>(r2)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzaym
    protected final boolean zzdF(int r2, android.os.Parcel r3, android.os.Parcel r4, int r5) throws android.os.RemoteException {
            r1 = this;
            r5 = 1
            if (r2 == r5) goto L13
            r0 = 2
            if (r2 == r0) goto L8
            r2 = 0
            return r2
        L8:
            java.lang.String r2 = r3.readString()
            com.google.android.gms.internal.ads.zzayn.zzc(r3)
            r1.zze(r2)
            goto L1f
        L13:
            android.os.Parcelable$Creator r2 = android.net.Uri.CREATOR
            java.util.ArrayList r2 = r3.createTypedArrayList(r2)
            com.google.android.gms.internal.ads.zzayn.zzc(r3)
            r1.zzf(r2)
        L1f:
            r4.writeNoException()
            return r5
    }
}
