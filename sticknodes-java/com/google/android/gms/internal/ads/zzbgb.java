package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public abstract class zzbgb extends com.google.android.gms.internal.ads.zzaym implements com.google.android.gms.internal.ads.zzbgc {
    public zzbgb() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.ads.internal.formats.client.INativeAdImage"
            r1.<init>(r0)
            return
    }

    public static com.google.android.gms.internal.ads.zzbgc zzg(android.os.IBinder r2) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            java.lang.String r0 = "com.google.android.gms.ads.internal.formats.client.INativeAdImage"
            android.os.IInterface r0 = r2.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.zzbgc
            if (r1 == 0) goto L11
            com.google.android.gms.internal.ads.zzbgc r0 = (com.google.android.gms.internal.ads.zzbgc) r0
            return r0
        L11:
            com.google.android.gms.internal.ads.zzbga r0 = new com.google.android.gms.internal.ads.zzbga
            r0.<init>(r2)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzaym
    protected final boolean zzdF(int r3, android.os.Parcel r4, android.os.Parcel r5, int r6) throws android.os.RemoteException {
            r2 = this;
            r4 = 1
            if (r3 == r4) goto L3d
            r6 = 2
            if (r3 == r6) goto L32
            r6 = 3
            if (r3 == r6) goto L27
            r6 = 4
            if (r3 == r6) goto L1c
            r6 = 5
            if (r3 == r6) goto L11
            r3 = 0
            return r3
        L11:
            int r3 = r2.zzc()
            r5.writeNoException()
            r5.writeInt(r3)
            goto L47
        L1c:
            int r3 = r2.zzd()
            r5.writeNoException()
            r5.writeInt(r3)
            goto L47
        L27:
            double r0 = r2.zzb()
            r5.writeNoException()
            r5.writeDouble(r0)
            goto L47
        L32:
            android.net.Uri r3 = r2.zze()
            r5.writeNoException()
            com.google.android.gms.internal.ads.zzayn.zze(r5, r3)
            goto L47
        L3d:
            com.google.android.gms.dynamic.IObjectWrapper r3 = r2.zzf()
            r5.writeNoException()
            com.google.android.gms.internal.ads.zzayn.zzf(r5, r3)
        L47:
            return r4
    }
}
