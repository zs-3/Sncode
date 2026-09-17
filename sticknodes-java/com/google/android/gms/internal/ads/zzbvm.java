package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public abstract class zzbvm extends com.google.android.gms.internal.ads.zzaym implements com.google.android.gms.internal.ads.zzbvn {
    public zzbvm() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.ads.internal.request.IAdsService"
            r1.<init>(r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzaym
    protected final boolean zzdF(int r4, android.os.Parcel r5, android.os.Parcel r6, int r7) throws android.os.RemoteException {
            r3 = this;
            r7 = 0
            r0 = 1
            java.lang.String r1 = "com.google.android.gms.ads.internal.request.IAdsServiceResponseListener"
            if (r4 == r0) goto L51
            r2 = 2
            if (r4 == r2) goto L34
            r2 = 3
            if (r4 == r2) goto Le
            r4 = 0
            return r4
        Le:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzbvf> r4 = com.google.android.gms.internal.ads.zzbvf.CREATOR
            android.os.Parcelable r4 = com.google.android.gms.internal.ads.zzayn.zza(r5, r4)
            com.google.android.gms.internal.ads.zzbvf r4 = (com.google.android.gms.internal.ads.zzbvf) r4
            android.os.IBinder r2 = r5.readStrongBinder()
            if (r2 != 0) goto L1d
            goto L2d
        L1d:
            android.os.IInterface r7 = r2.queryLocalInterface(r1)
            boolean r1 = r7 instanceof com.google.android.gms.internal.ads.zzbvq
            if (r1 == 0) goto L28
            com.google.android.gms.internal.ads.zzbvq r7 = (com.google.android.gms.internal.ads.zzbvq) r7
            goto L2d
        L28:
            com.google.android.gms.internal.ads.zzbvo r7 = new com.google.android.gms.internal.ads.zzbvo
            r7.<init>(r2)
        L2d:
            com.google.android.gms.internal.ads.zzayn.zzc(r5)
            r3.zze(r4, r7)
            goto L76
        L34:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzbvb> r4 = com.google.android.gms.internal.ads.zzbvb.CREATOR
            android.os.Parcelable r4 = com.google.android.gms.internal.ads.zzayn.zza(r5, r4)
            com.google.android.gms.internal.ads.zzbvb r4 = (com.google.android.gms.internal.ads.zzbvb) r4
            android.os.IBinder r4 = r5.readStrongBinder()
            if (r4 != 0) goto L43
            goto L4d
        L43:
            android.os.IInterface r4 = r4.queryLocalInterface(r1)
            boolean r7 = r4 instanceof com.google.android.gms.internal.ads.zzbvq
            if (r7 == 0) goto L4d
            com.google.android.gms.internal.ads.zzbvq r4 = (com.google.android.gms.internal.ads.zzbvq) r4
        L4d:
            com.google.android.gms.internal.ads.zzayn.zzc(r5)
            goto L76
        L51:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzbvb> r4 = com.google.android.gms.internal.ads.zzbvb.CREATOR
            android.os.Parcelable r4 = com.google.android.gms.internal.ads.zzayn.zza(r5, r4)
            com.google.android.gms.internal.ads.zzbvb r4 = (com.google.android.gms.internal.ads.zzbvb) r4
            android.os.IBinder r2 = r5.readStrongBinder()
            if (r2 != 0) goto L60
            goto L70
        L60:
            android.os.IInterface r7 = r2.queryLocalInterface(r1)
            boolean r1 = r7 instanceof com.google.android.gms.internal.ads.zzbvq
            if (r1 == 0) goto L6b
            com.google.android.gms.internal.ads.zzbvq r7 = (com.google.android.gms.internal.ads.zzbvq) r7
            goto L70
        L6b:
            com.google.android.gms.internal.ads.zzbvo r7 = new com.google.android.gms.internal.ads.zzbvo
            r7.<init>(r2)
        L70:
            com.google.android.gms.internal.ads.zzayn.zzc(r5)
            r3.zzf(r4, r7)
        L76:
            r6.writeNoException()
            return r0
    }
}
